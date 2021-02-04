package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioTest {

    @Test
    public void shouldInitSettings() {
        Radio radio = new Radio();
        assertEquals(0, radio.getMinStation());
        assertEquals(1, radio.getCurrentStation());
        assertEquals(10, radio.getCountStation());
        assertEquals(3, radio.getCurrentVolume());
        assertEquals(10, radio.getMaxStation());
        assertEquals(0, radio.getMinVolume());
        assertEquals(100, radio.getMaxVolume());
    }

    @Test
    public void shouldSetStation() {
        Radio radio = new Radio(10);
        radio.setCurrentStation(5);
        assertEquals(5, radio.getCurrentStation());
    }

    @Test
    public void shouldSetBelowStation() {
        Radio radio = new Radio(10);
        radio.setCurrentStation(-1);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldSetAboveStation() {
        Radio radio = new Radio(10);
        radio.setCurrentStation(11);
        assertEquals(10, radio.getCurrentStation());
    }

    @Test
    public void shouldNextFromMaxStation() {
        Radio radio = new Radio(10);
        radio.setMaxStation(radio.getCountStation());
        radio.setCurrentStation(radio.getMaxStation());
        radio.nextStation();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldNextFromMinStation() {
        Radio radio = new Radio(10);
        radio.setMinStation(0);
        radio.setCurrentStation(radio.getMinStation());
        radio.nextStation();
        assertEquals(1, radio.getCurrentStation());
    }

    @Test
    public void shouldPrevFromMaxStation() {
        Radio radio = new Radio(10);
        radio.setMaxStation(radio.getCountStation());
        radio.setCurrentStation(radio.getMaxStation());
        radio.prevStation();
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void shouldPrevFromMinStation() {
        Radio radio = new Radio(10);
        radio.setMinStation(0);
        radio.setCurrentStation(radio.getMinStation());
        radio.prevStation();
        assertEquals(10, radio.getCurrentStation());
    }

    @Test
    public void shouldSetVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);
        assertEquals(5, radio.getCurrentVolume());
    }

    @Test
    public void shouldSetBelowVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldSetAboveVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(101);
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void shouldNextFromMaxVolume() {
        Radio radio = new Radio();
        radio.setMaxVolume(100);
        radio.setCurrentVolume(radio.getMaxVolume());
        radio.nextVolume();
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void shouldNextFromMinVolume() {
        Radio radio = new Radio();
        radio.setMinVolume(0);
        radio.setCurrentVolume(radio.getMinVolume());
        radio.nextVolume();
        assertEquals(1, radio.getCurrentVolume());
    }

    @Test
    public void shouldPrevFromMaxVolume() {
        Radio radio = new Radio();
        radio.setMaxVolume(100);
        radio.setCurrentVolume(radio.getMaxVolume());
        radio.prevVolume();
        assertEquals(99, radio.getCurrentVolume());
    }

    @Test
    public void shouldPrevFromMinVolume() {
        Radio radio = new Radio();
        radio.setMinVolume(0);
        radio.setCurrentVolume(radio.getMinVolume());
        radio.prevVolume();
        assertEquals(0, radio.getCurrentVolume());
    }
}