package com.example;

import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class CatTest extends TestCase {


    @Mock
    Feline feline;
    Predator predator;

    public CatTest() {
    }

    @Test
    public void getSoundReturnsCorrectValue() {
        Cat cat = new Cat (feline);
        String expectedSound ="Мяу";

        String actualSound = cat.getSound();

        assertEquals(expectedSound, actualSound);

    }
 //   @Test
 //   public void getFoodReturnsCorrectValue() throws Exception {
   //    Cat cat = new Cat (feline);

     //   List<String> expectedEatMeat = ;

     //   List<String> actualEatMeat = cat.getFood();

     //   assertEquals(expectedEatMeat, actualEatMeat);
//
   //   }


}