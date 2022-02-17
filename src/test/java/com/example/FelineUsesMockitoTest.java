package com.example;

import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class FelineUsesMockitoTest extends TestCase {

   @Mock
   private Feline feline;

    @Test
    public void shouldGetFamilyReturnsCorrectValueKittens() {
        Feline feline = new Feline();
        String expectedFamily ="Кошачьи";

        String actualFamily = feline.getFamily();

        assertEquals(  "Семейство не кошачьи", expectedFamily, actualFamily);
    }

     @Test
    public void shouldEatMeatReturnsCorrectListPredator() throws Exception {
         Feline feline = new Feline ();
         List<String> expectedMeat = List.of("Животные", "Птицы", "Рыба");

         List<String> actualMeat = feline.eatMeat();

         assertEquals("Список видов для Хищника отличается", expectedMeat, actualMeat);
     }

    @Test
    public void shouldGetKittensReturnsCorrectValueOne() {
        Feline feline = new Feline ();
        int expectedKittens = 1;

        int actualKittens = feline.getKittens();

        assertEquals("Количество котят не соответствует 1",expectedKittens, actualKittens);

    }

 }