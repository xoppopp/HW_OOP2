package ru.netology.javaqa.javaqamvn.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldIncreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(50);
        radio.increaseVolume();

        int expectedVolume = 51;
        int actualVolume = radio.getCurrentVolume();

        Assertions.assertEquals(expectedVolume, actualVolume);
    }

    @Test
    public void shouldDecreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.decreaseVolume();

        int expectedVolume = 99;
        int actualVolume = radio.getCurrentVolume();

        Assertions.assertEquals(expectedVolume, actualVolume);
    }

    @Test
    public void shouldNotIncreaseVolumeAboveMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.increaseVolume();

        int expectedVolume = 100;
        int actualVolume = radio.getCurrentVolume();

        Assertions.assertEquals(expectedVolume, actualVolume);
    }

    @Test
    public void shouldNotDecreaseVolumeBelowMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.decreaseVolume();

        int expectedVolume = 0;
        int actualVolume = radio.getCurrentStation();

        Assertions.assertEquals(expectedVolume, actualVolume);
    }

    @Test
    public void shouldNotSetVolumeAboveMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(101);

        int expectedVolume = 0;
        int actualVolume = radio.getCurrentVolume();

        Assertions.assertEquals(expectedVolume, actualVolume);
    }

    @Test
    public void shouldNotSetVolumeBelowMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);

        int expectedVolume = 0;
        int actualVolume = radio.getCurrentVolume();

        Assertions.assertEquals(expectedVolume, actualVolume);
    }

    @Test
    public void shouldSetNextStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(8);
        radio.nextStation();

        int expectedStation = 9;
        int actualStation = radio.getCurrentStation();

        Assertions.assertEquals(expectedStation, actualStation);
    }

    @Test
    public void shouldSetPrevStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(2);
        radio.prevStation();

        int expectedStation = 1;
        int actualStation = radio.getCurrentStation();

        Assertions.assertEquals(expectedStation, actualStation);
    }

    @Test
    public void shouldSetNextStationToMin() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.nextStation();

        int expectedStation = 0;
        int actualStation = radio.getCurrentStation();

        Assertions.assertEquals(expectedStation, actualStation);
    }

    @Test
    public void shouldSetPrevStationToMax() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.prevStation();

        int expectedStation = 9;
        int actualStation = radio.getCurrentStation();

        Assertions.assertEquals(expectedStation, actualStation);
    }


    @Test
    public void shouldSetStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(5);

        Assertions.assertEquals(5, radio.getCurrentStation());

    }

    @Test
    public void shouldNotSetStationAboveMax() {
        Radio radio = new Radio();
        radio.setCurrentStation(10);

        int expectedStation = 0;
        int actualStation = radio.getCurrentStation();

        Assertions.assertEquals(expectedStation, actualStation);
    }

    @Test
    public void shouldNotSetStationBelowMin() {
        Radio radio = new Radio();
        radio.setCurrentStation(-1);

        int expectedStation = 0;
        int actualStation = radio.getCurrentStation();

        Assertions.assertEquals(expectedStation, actualStation);
    }


    // Количество станций изменено


    @Test
    public void shouldSetNextStationWithDifferentStationsCount() {
        Radio radio = new Radio(20);
        radio.setCurrentStation(18);
        radio.nextStation();

        int expectedStation = 19;
        int actualStation = radio.getCurrentStation();

        Assertions.assertEquals(expectedStation, actualStation);
    }

    @Test
    public void shouldSetPrevStationWithDifferentStationsCount() {
        Radio radio = new Radio(20);
        radio.setCurrentStation(12);
        radio.prevStation();

        int expectedStation = 11;
        int actualStation = radio.getCurrentStation();

        Assertions.assertEquals(expectedStation, actualStation);
    }

    @Test
    public void shouldSetNextStationToMinWithDifferentStationsCount() {
        Radio radio = new Radio(20);
        radio.setCurrentStation(19);
        radio.nextStation();

        int expectedStation = 0;
        int actualStation = radio.getCurrentStation();

        Assertions.assertEquals(expectedStation, actualStation);
    }

    @Test
    public void shouldSetPrevStationToMaxWithDifferentStationsCount() {
        Radio radio = new Radio(20);
        radio.setCurrentStation(0);
        radio.prevStation();

        int expectedStation = 19;
        int actualStation = radio.getCurrentStation();

        Assertions.assertEquals(expectedStation, actualStation);
    }


    @Test
    public void shouldSetStationWithDifferentStationsCount() {
        Radio radio = new Radio(20);

        radio.setCurrentStation(15);

        Assertions.assertEquals(15, radio.getCurrentStation());

    }

    @Test
    public void shouldNotSetStationAboveMaxWithDifferentStationsCount() {
        Radio radio = new Radio(20);
        radio.setCurrentStation(20);

        int expectedStation = 0;
        int actualStation = radio.getCurrentStation();

        Assertions.assertEquals(expectedStation, actualStation);
    }

    @Test
    public void shouldNotSetStationBelowMinWithDifferentStationsCount() {
        Radio radio = new Radio(20);
        radio.setCurrentStation(-1);

        int expectedStation = 0;
        int actualStation = radio.getCurrentStation();

        Assertions.assertEquals(expectedStation, actualStation);
    }


}
