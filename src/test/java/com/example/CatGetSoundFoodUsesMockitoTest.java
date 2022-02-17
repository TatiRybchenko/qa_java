package com.example;

import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;



@RunWith(MockitoJUnitRunner.class)
public class CatGetSoundFoodUsesMockitoTest extends TestCase {

    @Mock
    Feline feline;

    @Test
    public void shouldGetSoundReturnsCorrectValueMau() {
        Cat cat = new Cat (feline);
        String expectedSound ="Мяу";

        String actualSound = cat.getSound();

        assertEquals("Звук отличается от Мяу", expectedSound, actualSound);
    }
// На вебинаре говорили, что таких тестов лучше избегать, т.к они проверяют исключительно
// то что данный метод вызывается, может поэтому у меня и возникли сложности пр написание его.
    @Test
    public void shouldGetFoodReturnsCorrectList() throws Exception {
        Cat cat = new Cat (feline);
        Mockito.when(cat.getFood()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        List<String> expectedFoodCat = List.of("Животные", "Птицы", "Рыба");

        List<String> actualFoodCat = cat.getFood();

        assertEquals("Список еды для  Кошки отличается", expectedFoodCat, actualFoodCat);
}
}