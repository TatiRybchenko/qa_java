package com.example;

import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class LionUsesParameterHasManeTest extends TestCase {

    private Feline feline;
    private final String sexLion;
    private final boolean HasMane;

    public LionUsesParameterHasManeTest(String sexLion, boolean HasMane) {
        this.sexLion = sexLion;
        this.HasMane = HasMane;
    }

    @Parameterized.Parameters
    public static Object[][] getSex() {
        return new Object[][] {
                {"Самец", true},
                {"Самка", false},

                 };
    }

    @Test
    public void shouldDoesHaveMane() throws Exception {
        Lion lion = new Lion(this.sexLion,this.feline);
        boolean expectedHasMane =this.HasMane;

        boolean actualHasMane = lion.doesHaveMane();

        assertEquals("Некорректное соотношение гривы и пола животного", expectedHasMane, actualHasMane);
    }


}