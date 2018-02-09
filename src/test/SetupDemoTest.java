package test;

import main.SetupDemo;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SetupDemoTest {
    SetupDemo sd;

    @Before
    public void setUp() {
        sd = new SetupDemo();
        System.out.println("Before!");
    }

    @Test
    public void test1() {
        sd.print("test1");
    }

    @Test
    public void test2() {
        sd.print("test2");
    }

    @After
    public void tearDown() {
        System.out.println("After!");
    }
}
