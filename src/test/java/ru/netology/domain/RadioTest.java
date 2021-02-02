package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioTest {

    @Test
    public void shouldInitSettings() {
        Radio radio = new Radio();
        assertEquals(1, radio.getCurrentStation());
        assertEquals(3, radio.getVolume());
    }

    @Test
    public void shouldSetSettings() {
        Radio radio = new Radio(5,5);
        assertEquals(5, radio.getCurrentStation());
        assertEquals(5, radio.getVolume());
    }

    @Test
    public void shouldSetBelowSettings() {
        Radio radio = new Radio(-1, -1);
        assertEquals(0, radio.getCurrentStation());
        assertEquals(0, radio.getVolume());
    }

    @Test
    public void shouldSetAboveSettings() {
        Radio radio = new Radio(10,11);
        assertEquals(9, radio.getCurrentStation());
        assertEquals(10, radio.getVolume());
    }

    @Test
    public void shouldNextFromMaxSettings() {
        Radio radio = new Radio(9, 10);
        radio.nextStation();
        radio.nextVolume();
        assertEquals(0, radio.getCurrentStation());
        assertEquals(10, radio.getVolume());
    }

    @Test
    public void shouldNextFromMinSettings() {
        Radio radio = new Radio(0,0);
        radio.nextStation();
        radio.nextVolume();
        assertEquals(1, radio.getCurrentStation());
        assertEquals(1, radio.getVolume());
    }

    @Test
    public void shouldPrevFromMaxSettings() {
        Radio radio = new Radio(9, 10);
        radio.prevStation();
        radio.prevVolume();
        assertEquals(8, radio.getCurrentStation());
        assertEquals(9, radio.getVolume());
    }

    @Test
    public void shouldPrevFromMinSettings() {
        Radio radio = new Radio(0, 0);
        radio.prevStation();
        radio.prevVolume();
        assertEquals(9, radio.getCurrentStation());
        assertEquals(0, radio.getVolume());
    }

}