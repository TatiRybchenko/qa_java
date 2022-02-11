package com.example;

import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class LionUsesMockTest extends TestCase {

    private final String sexLion;
    private final boolean expectedHasMane;

    @Mock
    Feline feline;

    public LionUsesMockTest(String sexLion, boolean expectedHasMane) {
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
    public void shouldBeDoesHaveMane() throws Exception {
       Lion lion = new Lion(this.sexLion,this.feline);
            boolean actualHasMane = lion.doesHaveMane();

        assertEquals(this.expectedHasMane, actualHasMane);
    }


}
