package ru.netology.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void shouldSetStation() {
        Radio radio = new Radio();
        Assertions.assertEquals(0, radio.getCurrentStation());
        radio.setCurrentStation(5);
        Assertions.assertEquals(5, radio.getCurrentStation());
        radio.setCurrentStation(9);
        Assertions.assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void shouldNextStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.setCurrentStation(radio.getCurrentStation()+1);
        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldPrevStation() {
        Radio radio = new Radio();
        Assertions.assertEquals(0, radio.getCurrentStation());
        radio.setCurrentStation(radio.getCurrentStation()-1);
        Assertions.assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void shouldSetVolume() {
        Radio radio = new Radio();
        Assertions.assertEquals(0, radio.getVolume());
        radio.setVolume(5);
        Assertions.assertEquals(5, radio.getVolume());
        radio.setVolume(10);
        Assertions.assertEquals(10, radio.getVolume());
    }

    @Test
    public void shouldNextVolume() {
        Radio radio = new Radio();
        radio.setVolume(10);
        radio.setVolume(radio.getVolume()+1);
        Assertions.assertEquals(10, radio.getVolume());
    }

    @Test
    public void shouldPrevVolume() {
        Radio radio = new Radio();
        radio.setVolume(0);
        radio.setVolume(radio.getVolume()-1);
        Assertions.assertEquals(0, radio.getVolume());
    }
}


