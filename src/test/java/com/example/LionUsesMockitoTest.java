package com.example;

import junit.framework.TestCase;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.Collections;
import java.util.List;
import org.junit.Rule;

@RunWith(MockitoJUnitRunner.class)
public class LionUsesMockitoTest extends TestCase {

    @Mock
    private Feline feline;

    @Test
    public void shouldGetKittensReturnCorrectValueOne () throws Exception {
        Lion lion = new Lion("Самец", feline);
        Mockito.when(feline.getKittens()).thenReturn(1);
        int expectedKittens = 1;

        int actualKittens = lion.getKittens();

        assertEquals("Некорректное количество котят у Льва, не равное 1", expectedKittens, actualKittens);
    }

    @Test
    public void  shouldGetFoodReturnCorrectValue() throws Exception {
        Lion lion = new Lion("Самец", feline);
        Mockito.when(feline.getFood("Хищник")).thenReturn(Collections.singletonList("Хищник"));
        List<String> expectedFood = Collections.singletonList("Хищник");

        List<String> actualFood = lion.getFood();

        assertEquals("Некорректный вид животного, не Хищник", expectedFood, actualFood);
    }

    @Rule
    public ExpectedException exceptionRule = ExpectedException.none();

    @Test
    public void  incorrectSexOfTheLionException() throws Exception {
        exceptionRule.expect(Exception.class);
        exceptionRule.expectMessage("Используйте допустимые значения пола животного - самец или самка");
        Lion lion = new Lion("Мужской", feline);
     }
}