import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void shouldSetStation() {
        Radio radio = new Radio();
        assertEquals(0, radio.getCurrentStation());
        radio.setCurrentStation(5);
        assertEquals(5, radio.getCurrentStation());
        radio.setCurrentStation(9);
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void shouldNextStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.setCurrentStation(radio.getCurrentStation()+1);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldPrevStation() {
        Radio radio = new Radio();
        assertEquals(0, radio.getCurrentStation());
        radio.setCurrentStation(radio.getCurrentStation()-1);
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void shouldSetVolume() {
        Radio radio = new Radio();
        assertEquals(0, radio.getVolume());
        radio.setVolume(5);
        assertEquals(5, radio.getVolume());
        radio.setVolume(10);
        assertEquals(10, radio.getVolume());
    }

    @Test
    public void shouldNextVolume() {
        Radio radio = new Radio();
        radio.setVolume(10);
        radio.setVolume(radio.getVolume()+1);
        assertEquals(10, radio.getVolume());
    }

    @Test
    public void shouldPrevVolume() {
        Radio radio = new Radio();
        radio.setVolume(0);
        radio.setVolume(radio.getVolume()-1);
        assertEquals(0, radio.getVolume());
    }
}


