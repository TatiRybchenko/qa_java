package com.example;
import java.util.List;


public class AlexLion extends Lion {


    public AlexLion(String sex, Feline feline) throws Exception {
        super(sex, feline);
         }

    @Override
    public int getKittens() {
        return 0;
    }

    public String getPlaceOfLiving() {
        return "Нью-Йоркский зоопарк";
    }

    public List<String> getFriends() {
        return List.of("зебра Марти", "бегемотиха Глория", "жираф Мелман");
        }

}
