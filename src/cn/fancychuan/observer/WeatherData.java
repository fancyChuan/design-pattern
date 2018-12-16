package cn.fancychuan.observer;

import java.util.ArrayList;

public class WeatherData implements Subject { // 继承一个接口需要实现接口中的所有方法
    private ArrayList observers;  // 用来记录注册的观察者
    private float temperature; // TODO: 为什么这里要用private
    private float humidity;
    private float pressure;

    public WeatherData(){ // 构造方法不能加void，这里如果为public void WeatherData就会导致observers没有初始化，报NullPointerException的错误
        observers = new ArrayList(); // 在构造器中初始化
    }

    public void registerObserver(Observer o){
        observers.add(o);
    }

    public void removeObserver(Observer o){
        int i = observers.indexOf(o);
        if (i>=0){
            observers.remove(i);
        }
    }

    public void notifyObservers(){
        for (int i=0; i<observers.size(); i++){
            Observer observer = (Observer) observers.get(i);
            observer.update(temperature, humidity, pressure);
        }
    }

    public void measurementsChanged(){
        notifyObservers();
    }
    public void setMeasurements(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
