package cn.fancychuan.observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData){ //这里用到抽象类、接口，目的是能够接受所有实现了Subject的类的对象作为参数，比起用具体类更加通用
        this.weatherData = weatherData;
        // 实例化的时候，把调用的权利转交给WeatherData，把自己传递过去
        weatherData.registerObserver(this); // TODO：这一行好像用到了反射
    }
    public void update(float temperature, float humidity, float pressure){
        // 这个方法不在这里被调用，而是在需要通知的时候，由统一的API WeatherData实例调用
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    public void display(){
        System.out.println("现在的温度条件是：" + temperature +"F degrees\n并且湿度为：" + humidity);
    }
}
