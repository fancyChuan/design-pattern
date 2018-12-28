package cn.fancychuan.facade;

public class Amplifier {
    DvdPlayer dvd;
    CDplayer cd;

    public void on() {
        System.out.println("== 正在打开投影仪...");
    }

    public void setDvd(DvdPlayer dvd) {
        this.dvd = dvd;
        System.out.println("== 切换到DVD模式");
    }

    public void setCd(CDplayer cd) {
        this.cd = cd;
        System.out.println("== 切换到CD模式");
    }
}
