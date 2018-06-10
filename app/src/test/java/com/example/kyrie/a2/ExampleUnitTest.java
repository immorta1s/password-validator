package com.example.kyrie.a2;

import org.junit.Test;
import org.junit.BeforeClass;



import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {

    static Validator va;
    static int a = 5;

    public static void init(){
        va = new Validator();
    }

    @Test
    public void Validator_isCorrect() {
        assertEquals(a,va.validator("abcdefghi"),5);
    }

}