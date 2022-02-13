package com.example;

import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class CatGetSoundTest extends TestCase {

    @Mock
    Feline feline;

    @Test
    public void shouldGetSoundReturnsCorrectValueMau() {
        Cat cat = new Cat (feline);
        String expectedSound ="Мяу";

        String actualSound = cat.getSound();

        assertEquals("Звук отличается от Мяу", expectedSound, actualSound);
    }

 //   @Test
 //  public void shouldGetFoodReturnsCorrectList() {

}