package ru.netology.radio;

public class Radio {
    private int currentVolume;
    private int currentStation;
    private int maxStation = 9;
    private int maxVolume = 100;


    public Radio() {
    }

    public Radio (int numberOfStations) {
        maxStation = numberOfStations - 1;
    }


    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > maxVolume) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;

        } else {
            currentVolume = 100;
        }
    }

    public void turnDownVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        } else {
            currentVolume = 0;
        }
    }


    public int getCurrentStation() {

        return currentStation;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < 0) {
            return;
        }
        if (newCurrentStation > maxStation) {
            return;
        }
        currentStation = newCurrentStation;
    }


    public void nextStation() {
        if (currentStation < maxStation) {
            currentStation = currentStation + 1;
        } else {
            currentStation = 0;

        }

    }

    public void prevStation() {
        if (currentStation > 0) {
            currentStation = currentStation - 1;
        } else {

            currentStation = maxStation;
        }

    }
}