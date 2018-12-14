package cn.fancychuan.observer;

public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers(); // 主题状态改变时，调用该方法，以通知所有观察者
}
