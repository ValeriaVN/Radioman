package ru.netology.radio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void limitMaxVolume() {
        Radio volume = new Radio();

        volume.setCurrentVolume(101);

        int expected = 0;
        int actual = volume.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void limitMaxNormVolume() {
        Radio volume = new Radio();

        volume.setCurrentVolume(100);

        int expected = 100;
        int actual = volume.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void limitMinVolume() {
        Radio volume = new Radio();

        volume.setCurrentVolume(-1);

        int expected = 0;
        int actual = volume.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void limitMinNormVolume() {
        Radio volume = new Radio();

        volume.setCurrentVolume(2);

        int expected = 2;
        int actual = volume.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void limitNormIncreaseVolume() {
        Radio volume = new Radio();
        volume.setCurrentVolume(1);

        volume.increaseVolume();

        int expected = 2;
        int actual = volume.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void limitMaxIncreaseVolume() {
        Radio volume = new Radio();
        volume.setCurrentVolume(100);

        volume.increaseVolume();

        int expected = 100;
        int actual = volume.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void limitNormTurnDownVolume() {
        Radio volume = new Radio();
        volume.setCurrentVolume(10);

        volume.turnDownVolume();

        int expected = 9;
        int actual = volume.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void limitMinTurnDownVolume() {
        Radio volume = new Radio();
        volume.setCurrentVolume(0);

        volume.turnDownVolume();

        int expected = 0;
        int actual = volume.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void limitMaxStation() {
        Radio station = new Radio();

        station.setCurrentStation(10);

        int expected = 0;
        int actual = station.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void limitNormStation() {
        Radio station = new Radio();

        station.setCurrentStation(9);

        int expected = 9;
        int actual = station.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void limitMinStation() {
        Radio station = new Radio();

        station.setCurrentStation(-1);

        int expected = 0;
        int actual = station.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void limitNextStation() {
        Radio station = new Radio();
        station.setCurrentStation(8);

        station.nextStation();

        int expected = 9;
        int actual = station.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void limitMaxNextStation() {
        Radio station = new Radio();
        station.setCurrentStation(9);

        station.nextStation();

        int expected = 0;
        int actual = station.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void limitPrevStation() {
        Radio station = new Radio();
        station.setCurrentStation(8);

        station.prevStation();

        int expected = 7;
        int actual = station.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void limitMinPrevStation() {
        Radio station = new Radio();
        station.setCurrentStation(0);

        station.prevStation();

        int expected = 9;
        int actual = station.getCurrentStation();

        assertEquals(expected, actual);
    }


    @Test
    public void setStationMaxLimit() {

        Radio station = new Radio(20);
        station.setCurrentStation(19);

        station.nextStation();

        int expected = 0;
        int actual = station.getCurrentStation();

        assertEquals(expected, actual);

    }

    @Test
    public void setStationNewMax() {

        Radio station = new Radio(18);
        station.setCurrentStation(13);

        station.nextStation();

        int expected = 14;
        int actual = station.getCurrentStation();

        assertEquals(expected, actual);

    }



}