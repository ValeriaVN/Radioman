package ru.netology.radio;

public class Radio {
    private int currentVolume;

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 10) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void IncreaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
    }

    public void turnDownVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }

    private int currentStation;

    public int getCurrentStation() {

        return currentStation;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < 0) {
            return;
        }
        if (newCurrentStation > 9) {
            return;
        }
        currentStation = newCurrentStation;
    }


    public void nextStation() {
        if (currentStation >= 9) {
            currentStation = 0;
        }
        else   {
            currentStation = currentStation + 1;
        }

    }

    public void prevStation() {
        if (currentStation <= 0) {
            currentStation = 9;
        }
        else  {
            currentStation = currentStation - 1;
        }

    }
}