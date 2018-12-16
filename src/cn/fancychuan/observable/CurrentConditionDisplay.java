package cn.fancychuan.observable;

import cn.fancychuan.observer.DisplayElement;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionDisplay implements Observer, DisplayElement {
    Observable observable;
    private float temperature;
    private float humidity;

    public CurrentConditionDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable obs, Object arg) {
        if (obs instanceof WeatherData) { // 向下转型的时候要习惯性检查下父类是否是子类对象的实例
            WeatherData weatherData = (WeatherData) obs;  // 如果不是子类的实例，这里的转换会报错
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }

    public void display() {
        System.out.println("现在的温度条件是：" + temperature +"F degrees\n并且湿度为：" + humidity);
    }

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionDisplay curDisplay = new CurrentConditionDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 20.4f);
        weatherData.setMeasurements(60, 90, 35.4f);
    }
}
