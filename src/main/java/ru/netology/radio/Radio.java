package ru.netology.radio;

public class Radio {
    private int currentVolume;
    private int currentStation;
    private int maxStation = 9;
    private int maxVolume = 100;


   public Radio () {
    }

   public Radio (int maxStation ) {
        this.maxStation = maxStation;
    }

   public int getMaxStation() {
       return maxStation;
    }

   public void setMaxStation(int maxStation) {
       if (maxStation < 0) {
           return;
        }
        this.maxStation = maxStation;
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
        if (currentVolume >= maxVolume) {
            currentVolume = 100;

        }
        else {
            currentVolume = currentVolume + 1;
        }
    }

    public void turnDownVolume() {
        if (currentVolume <= 0) {
            currentVolume = 0;
        }
        else {
            currentVolume = currentVolume - 1;
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
        if (currentStation >= maxStation) {
            currentStation = 0;
        } else {
            currentStation = currentStation + 1;

        }

    }

    public void prevStation() {
        if (currentStation <= 0) {
            currentStation = maxStation;
        } else {
            currentStation = currentStation - 1;
        }

    }
}