package ru.netology.domain;

public class Radio {

    private int currentStation;
    private int volume;

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation > 9) {
            currentStation = 9;
        }
        if (currentStation < 0) {
            currentStation = 0;
        }
        this.currentStation = currentStation;
    }

    public void nextStation() {
        int currentStation = getCurrentStation();
        currentStation++;
        if (currentStation > 9) {
            currentStation = 0;
        }
        this.currentStation = currentStation;
    }

    public void prevStation() {
        int currentStation = getCurrentStation();
        currentStation--;
        if (currentStation < 0) {
            currentStation = 9;
        }
        this.currentStation = currentStation;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if (volume > 10) {
            volume = 10;
        }
        if (volume < 0) {
            volume = 0;
        }
        this.volume = volume;
    }

    public void nextVolume() {
        int volume = getVolume();
        volume++;
        if (volume > 10) {
            return;
        }
        this.volume = volume;
    }

    public void prevVolume() {
        int volume = getVolume();
        volume--;
        if (volume < 0) {
            return;
        }
        this.volume = volume;
    }
}
