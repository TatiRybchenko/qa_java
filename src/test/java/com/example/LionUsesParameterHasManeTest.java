package com.example;

import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;


@RunWith(Parameterized.class)
public class LionUsesParameterHasManeTest extends TestCase {

    private Feline feline;
    private final String sexLion;
    private final boolean expectedHasMane;

    public LionUsesParameterHasManeTest(String sexLion, boolean expectedHasMane) {
        this.sexLion = sexLion;
        this.expectedHasMane = expectedHasMane;
    }

    @Parameterized.Parameters
    public static Object[][] getSex() {
        return new Object[][] {
                { "Самец", true},
                { "Самка", false},
        };
    }

    @Test
    public void shouldDoesHaveMane() throws Exception {
       Lion lion = new Lion(this.sexLion,this.feline);

       boolean actualHasMane = lion.doesHaveMane();

       assertEquals("Некорректное соотношение гривы и пола животного", this.expectedHasMane, actualHasMane);
    }


}