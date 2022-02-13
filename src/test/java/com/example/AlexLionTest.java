package com.example;

import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import java.util.List;
import org.mockito.junit.MockitoJUnitRunner;


@RunWith(MockitoJUnitRunner.class)
public class AlexLionTest extends TestCase {

  @Mock
  Feline feline;

@Test
     public void shouldGetKittensReturnsCorrectValueNull() throws Exception  {
     AlexLion alexLion = new AlexLion ("Самец", feline,"Алекс");
     int expectedKittensAlex = 0;

    int actualKittensAlex = alexLion.getKittens();

    assertEquals("Некорректное количество котят у Льва Алекса, не равное 0", expectedKittensAlex, actualKittensAlex);
      }

    @Test
    public void shouldGetPlaceOfLivingReturnsCorrectValueZoo() throws Exception {
        AlexLion alexLion = new AlexLion ("Самец", feline,"Алекс");
        String expectedPlaceOfLiving ="Нью-Йоркский зоопарк";

        String actualPlaceOfLiving = alexLion.getPlaceOfLiving();

        assertEquals("Место жительства отличается от Нью-Йоркский зоопарка", expectedPlaceOfLiving, actualPlaceOfLiving);
    }

    @Test
    public void shouldGetNameFriendsAlexReturnsCorrectList() throws Exception {
        AlexLion alexLion = new AlexLion ("Самец", feline,"Алекс" );
        List<String> expectedFriendsNameAlex =List.of("зебра Марти", "бегемотиха Глория", "жираф Мелман");

        List<String> actualFriendsNameAlex = alexLion.getFriends();

        assertEquals("Список имен друзей для Алекса отличается", expectedFriendsNameAlex, actualFriendsNameAlex);
    }
}