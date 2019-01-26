package csi311;

import static org.junit.Assert.assertEquals;

public class JUnitTest {
    public JUnitTest() {
    }

    public int add(int a, int b) {
    	return a + b; 
    }

    public static void main(String[] args) {
    	JUnitTest theApp = new JUnitTest();
    	assertEquals(theApp.add(1, 1), 2);  // will run silently 
    	assertEquals(theApp.add(1, 1), 3);  // will throw exception 
    }
}
