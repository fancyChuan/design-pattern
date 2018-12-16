package cn.fancychuan.observer;

public class WeatherStation {
    public static void main(String[] args){
        WeatherData weatherData = new WeatherData();

        // 这里实例化的时候，就向主题注册一个对象，注册的时候就是把自己注册到WeatherData里面去
        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 20.4f);
        weatherData.setMeasurements(60, 90, 35.4f);
    }
}
