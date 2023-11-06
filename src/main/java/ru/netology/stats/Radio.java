package ru.netology.stats;

public class Radio {
    private int maxVolume = 100;
    private int minVolume = 0;
    private int currentVolume;
    private int quantityStation = 10;
    private int maxNumberStation = 9;
    private int minNumberStation = 0;
    private int currentStation = minNumberStation;

    public Radio(int quantityStation) {
        this.quantityStation = quantityStation;
    }

    public Radio() {

    }

    public int getMaxNumberStation() {

        return maxNumberStation;
    }

    public int getMinNumberStation() {

        return minNumberStation;
    }

    public int getQuantityStation() {
        return quantityStation;
    }

    public int getMaxVolume() {

        return maxVolume;
    }

    public int getMinVolume() {

        return minVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation > quantityStation - 1) {
            return;
        }
        if (newCurrentStation < minNumberStation) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume > maxVolume) {
            return;
        }
        if (newCurrentVolume < minVolume) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        }
    }

    public void increaseStation() {
        if (currentStation < quantityStation - 1) {
            currentStation = currentStation + 1;
        } else {
            currentStation = 0;
        }
    }

    public void decreaseStation() {
        if (currentStation > minNumberStation) {
            currentStation = currentStation - 1;
        }
        if (currentStation == minNumberStation) {
            currentStation = 9;
        }
    }

}
