package cn.fancychuan.observable;

import java.util.Observable;

public class WeatherData extends Observable { // 内置的Observable Observer都是超类，并不是接口，不能和其他超类一起被继承
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData(){}

    public void measurementsChanged() {
        setChanged(); // 这个函数能更自由的控制什么情况加通知观察者。同时还有 hasChanged() 来获得数据变化情况
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
