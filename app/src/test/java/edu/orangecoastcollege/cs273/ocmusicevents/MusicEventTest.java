package edu.orangecoastcollege.cs273.ocmusicevents;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;


/**
 * Created by jkim428 on 11/30/2017.
 */
public class MusicEventTest {

    private MusicEvent testEvent;

    @Before
    public void setUp() throws Exception {
        testEvent = new MusicEvent();

    }

    @Test
    public void getSetTitle() throws Exception {

        // Assertions = guarantees that something matches an expected value
        assertNull("Testing title is null", testEvent.getTitle());

        testEvent.setTitle("Led Zeppelin");
        // Assert that the title equals Led Zeppelin
        assertEquals("Testing title is now Led Zeppelin", "Led Zeppelin", testEvent.getTitle());

    }

    @Test
    public void getSetDate() throws Exception {
        assertNull("Testing date is null", testEvent.getDate());
        testEvent.setDate("11/30/2017");
        assertEquals("Testing date is now 11/30/2017", "11/30/2017", testEvent.getDate());
    }

    @Test
    public void getSetDay() throws Exception {
        assertNull("Testing day is null", testEvent.getDay());
        testEvent.setDay("Thursday");
        assertEquals("Testing day is now Thursday", "Thursday", testEvent.getDay());
    }

    @Test
    public void getSetTime() throws Exception {
        assertNull("Testing time is null", testEvent.getTime());
        testEvent.setTime("3:54 PM");
        assertEquals("Testing time is now 3:54 PM", "3:54 PM", testEvent.getTime());
    }

    @Test
    public void getSetLocation() throws Exception {
        assertNull("Testing location is null", testEvent.getLocation());
        testEvent.setLocation("Irvine Meadows (formerly Verizon Wireless)");
        assertEquals("Testing location is now Irvine Meadows (formerly Verizon Wireless)", "Irvine Meadows (formerly Verizon Wireless)", testEvent.getLocation());
    }

    @Test
    public void getSetAddress1() throws Exception {
        assertNull("Testing address 1 is null", testEvent.getAddress1());
        testEvent.setAddress1("8808 Irvine Center Drive");
        assertEquals("Testing time is now 8808 Irvine Center Drive", "8808 Irvine Center Drive", testEvent.getAddress1());
    }

    @Test
    public void getSetAddress2() throws Exception {
        assertNull("Testing address 2 is null", testEvent.getAddress2());
        testEvent.setAddress2("Irvine, California 92618");
        assertEquals("Testing time is now Irvine, California 92618", "Irvine, California 92618", testEvent.getAddress2());
    }

    @Test
    public void getSetImageName() throws Exception {
        assertNull("Testing image name is null", testEvent.getImageName());
        testEvent.setImageName("Blink182.jpeg");
        assertEquals("Testing time is now Blink182.jpeg", "Blink182.jpeg", testEvent.getImageName());
    }

}
