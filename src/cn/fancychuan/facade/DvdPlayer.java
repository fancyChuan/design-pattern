package cn.fancychuan.facade;

public class DvdPlayer {

    public void on() {
        System.out.println("[DVD] 打开");
    }

    public void play(String movie) {
        System.out.println("[DVD] 开始播放电影： " + movie);
    }

    public void off() {
        System.out.println("[DVD] 关闭");
    }
}
