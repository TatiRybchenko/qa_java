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

    // Тест для Cat c методом List<String> getFood() так и не поняла, что он делает и относительно чего его можно проверить.
    // Уже голову сломала, но так и не нашла решение.
    // Т.е получает через интерфейс Predator пустой список  List<String> eatMeat() и зачем?
}