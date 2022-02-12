package com.example;

import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.junit.runners.Parameterized;



@RunWith(Parameterized.class)
public class LionUsesMockHasManeTest extends TestCase {
   @Mock
    private Feline feline;

    private final String sexLion;
    private final boolean expectedHasMane;

    public LionUsesMockHasManeTest(String sexLion, boolean expectedHasMane) {
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
    public void shouldDoesHaveManeTest() throws Exception {
       Lion lion = new Lion(this.sexLion,this.feline);

       boolean actualHasMane = lion.doesHaveMane();

       assertEquals(this.expectedHasMane, actualHasMane);
    }

}