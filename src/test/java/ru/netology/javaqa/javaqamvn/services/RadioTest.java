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
    public void shouldSetNextStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(1);
        radio.nextStation();

        int expectedStation = 2;
        int actualStation = radio.getCurrentStation();

        Assertions.assertEquals(expectedStation, actualStation);
    }

    @Test
    public void shouldSetPrevStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(1);
        radio.prevStation();

        int expectedStation = 0;
        int actualStation = radio.getCurrentStation();

        Assertions.assertEquals(expectedStation, actualStation);
    }

    @Test
    public void shouldSetNextStationTo0() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.nextStation();

        int expectedStation = 0;
        int actualStation = radio.getCurrentStation();

        Assertions.assertEquals(expectedStation, actualStation);
    }

    @Test
    public void shouldSetPrevStationTo9() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.prevStation();

        int expectedStation = 9;
        int actualStation = radio.getCurrentStation();

        Assertions.assertEquals(expectedStation, actualStation);
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
}
