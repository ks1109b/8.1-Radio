package ru.netology.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void shouldSetStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        assertEquals(5, radio.getCurrentStation());
    }

    @Test
    public void shouldSetBelowStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(-1);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldSetAboveStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(10);
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void shouldNextFromMaxStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.nextStation();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldNextFromMinStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.nextStation();
        assertEquals(1, radio.getCurrentStation());
    }

    @Test
    public void shouldPrevFromMaxStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.prevStation();
        assertEquals(8, radio.getCurrentStation());
    }

    @Test
    public void shouldPrevFromMinStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.prevStation();
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void shouldSetVolume() {
        Radio radio = new Radio();
        radio.setVolume(5);
        Assertions.assertEquals(5, radio.getVolume());
    }

    @Test
    public void shouldSetBelowVolume() {
        Radio radio = new Radio();
        radio.setVolume(-1);
        Assertions.assertEquals(0, radio.getVolume());
    }

    @Test
    public void shouldSetAboveVolume() {
        Radio radio = new Radio();
        radio.setVolume(11);
        Assertions.assertEquals(10, radio.getVolume());
    }

    @Test
    public void shouldNextFromMaxVolume() {
        Radio radio = new Radio();
        radio.setVolume(10);
        radio.nextVolume();
        Assertions.assertEquals(10, radio.getVolume());
    }

    @Test
    public void shouldNextFromMinVolume() {
        Radio radio = new Radio();
        radio.setVolume(0);
        radio.nextVolume();
        Assertions.assertEquals(1, radio.getVolume());
    }

    @Test
    public void shouldPrevFromMaxVolume() {
        Radio radio = new Radio();
        radio.setVolume(10);
        radio.prevVolume();
        Assertions.assertEquals(9, radio.getVolume());
    }

    @Test
    public void shouldPrevFromMinVolume() {
        Radio radio = new Radio();
        radio.setVolume(0);
        radio.prevVolume();
        Assertions.assertEquals(0, radio.getVolume());
    }
}