package ru.netology.domain;

public class Radio {

    private int minStation = 0;
    private int currentStation = 1;
    private int countStation = 10;
    private int maxStation = countStation;
    private int minVolume = 0;
    private int currentVolume = 3;
    private int maxVolume = 100;

    public Radio() {
    }

    public Radio(int countStation) {
        this.countStation = countStation;
    }

    public int getMinStation() {
        return minStation;
    }

    public void setMinStation(int minStation) {
        this.minStation = minStation;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation > countStation) {
            currentStation = countStation;
        }
        if (currentStation < minStation) {
            currentStation = minStation;
        }
        this.currentStation = currentStation;
    }

    public int getCountStation() {
        return countStation;
    }

    public int getMaxStation() {
        return maxStation;
    }

    public void setMaxStation(int maxStation) {
        this.maxStation = maxStation;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public void setMinVolume(int minVolume) {
        this.minVolume = minVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume) {
            currentVolume = maxVolume;
        }
        if (currentVolume < minVolume) {
            currentVolume = minVolume;
        }
        this.currentVolume = currentVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }

    public void nextStation() {
        int currentStation = getCurrentStation();
        currentStation++;
        if (currentStation > countStation) {
            currentStation = minStation;
        }
        this.currentStation = currentStation;
    }

    public void prevStation() {
        int currentStation = getCurrentStation();
        currentStation--;
        if (currentStation < minStation) {
            currentStation = countStation;
        }
        this.currentStation = currentStation;
    }

    public void nextVolume() {
        int currentVolume = getCurrentVolume();
        currentVolume++;
        if (currentVolume > maxVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void prevVolume() {
        int currentVolume = getCurrentVolume();
        currentVolume--;
        if (currentVolume < minVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }
}
