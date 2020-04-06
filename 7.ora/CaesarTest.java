// import static org.hamcrest.MatcherAssert.assertThat;
// import static org.hamcrest.Matchers.*;

/* javac -cp 7.ora;junit-4.12.jar;hamcrest-core-1.3.jar 7.ora\Caesar.java 7.ora\CaesarTest.java

   error: cannot find symbol
   import static org.hamcrest.Matchers.*;
                          ^
   symbol:   class Matchers
   location: package org.hamcrest
*/

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class CaesarTest {
    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] { { 1, "a", "b" }, { 2, "Z", "B" }, { 2, "string", "uvtkpi" },
                { 5, "valami", "afqfrn" }, { 25, "lastTest", "kzrsSdrs" } });
    }

    private int n;
    private String input;
    private String expected;

    public CaesarTest(int n, String input, String expected) {
        this.n = n;
        this.input = input;
        this.expected = expected;
    }

    @Test
    public void testEquals() throws NullPointerException {
        // assertThat(expected, equalTo(new Caesar(n).cipher(input)));
        assertEquals(expected, new Caesar(n).cipher(input));
        assertEquals(input, new Caesar(n).decipher(expected));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testThrows() {
        new Caesar(-1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testThrows2() {
        new Caesar(5).cipher("Rossz szöveg.");
    }
}