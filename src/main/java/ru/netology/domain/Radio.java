package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class Radio {

    private int minStation = 0;
    private int currentStation = 1;
    private int countStation = 10;
    private int maxStation = countStation;
    private int minVolume = 0;
    private int currentVolume = 3;
    private int maxVolume = 100;

    public Radio(int countStation) {
        this.countStation = countStation;
    }

    public void setStation(int currentStation) {
        if (currentStation > maxStation) {
            currentStation = maxStation;
        }
        if (currentStation < minStation) {
            currentStation = minStation;
        }
        this.currentStation = currentStation;
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