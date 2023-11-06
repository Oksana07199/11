
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.stats.Radio;

public class RadioTest {
    @Test
    public void testVolumeIncrease() {
        Radio radio = new Radio();
        radio.setCurrentVolume(20);
        radio.increaseVolume();
        int expected = 21;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testVolumeDecrease() {
        Radio radio = new Radio();
        radio.setCurrentVolume(35);
        radio.decreaseVolume();
        int expected = 34;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testRadiostationOnIncrease() {
        Radio radio = new Radio();
        radio.setCurrentStation(6);
        radio.increaseStation();
        int expected = 7;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testRadiostationOnDecrease() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        radio.decreaseStation();
        int expected = 4;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testRadiostation() {
        Radio radio = new Radio();
        radio.setCurrentStation(3);
        int expected = 3;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testVolumeOnIncreaseMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testVolumeOnDecreaseMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testRadiostationOnIncreaseMax() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.increaseStation();
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testRadiostationOnDecreaseMin() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.decreaseStation();
        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testRadiostationBoundary() {
        Radio radio = new Radio();
        radio.setCurrentStation(10);
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testVolumeBoundary() {
        Radio radio = new Radio();
        radio.setCurrentVolume(101);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testRadiostationBoundaryNegative() {
        Radio radio = new Radio();
        radio.setCurrentStation(- 1);
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testVolumeBoundaryNegative() {
        Radio radio = new Radio();
        radio.setCurrentVolume(- 1);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testVolumeIncreaseBoundary() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.increaseVolume();
        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testStationIncreaseMaxBoundary() {
        Radio radio = new Radio();
        radio.setCurrentStation(8);
        radio.increaseStation();
        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
}