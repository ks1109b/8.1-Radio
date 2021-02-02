package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class Radio {

    private int currentStation = 1;
    private int volume = 3;

    public void setStation() {
        int currentStation = getCurrentStation();
        if (currentStation > 9) {
            currentStation = 9;
        }
        if (currentStation < 0) {
            currentStation = 0;
        }
        this.currentStation = currentStation;
    }

    public void setVolume() {
        int volume = getVolume();
        if (volume > 10) {
            volume = 10;
        }
        if (volume < 0) {
            volume = 0;
        }
        this.volume = volume;
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
