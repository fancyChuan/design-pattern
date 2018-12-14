package cn.fancychuan.observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this); // TODO：这一行好像用到了反射
    }
    public void update(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    public void display(){
        System.out.println("现在的温度条件是：" + temperature +"F degrees\n并且湿度为：" + humidity);
    }
}
