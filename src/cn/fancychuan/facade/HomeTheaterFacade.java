package cn.fancychuan.facade;

public class HomeTheaterFacade {
    Amplifier amp;
    DvdPlayer dvd;
    TheaterLight light;
    Screen screen;

    public HomeTheaterFacade(Amplifier amp, DvdPlayer dvd, TheaterLight light, Screen screen) {
        this.amp = amp;
        this.dvd = dvd;
        this.light = light;
        this.screen = screen;
    }

    public void watchMovie(String movie) {
        System.out.println("准备播放电影，请稍候...");
        light.on();
        screen.down();
        amp.on();
        amp.setDvd(dvd);
        dvd.on();
        light.dim();
        dvd.play(movie);
    }
}
