public class Radio {

    private int currentStation;
    private int volume;

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation > 9) {
            currentStation = 0;
        }
        if (currentStation < 0) {
            currentStation = 9;
        }
        this.currentStation = currentStation;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if (volume > 10){
            return;
        }
        if (volume < 0){
            return;
        }
        this.volume = volume;
    }
}
