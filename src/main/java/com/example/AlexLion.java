package com.example;
import java.util.List;


public class AlexLion extends Lion {

    private  Lion lion;
    private  Feline feline;
    private String alexName = "Алекс";

    public AlexLion(String sex, Feline feline, String alexName) throws Exception {
        super(sex, feline);
        this.alexName = alexName;
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
