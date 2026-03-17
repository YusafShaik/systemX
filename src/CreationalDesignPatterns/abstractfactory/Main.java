package CreationalDesignPatterns.abstractfactory;

public class Main {

    public static void main(String[] args) {

        UIFactory f= new AppleUiFactory();
        VideoPlayer v=f.getVideoPlayer();
        PlayButton p=f.getPlayButton();

        v.getVideoPlayer();
        p.onClick();

    }
}
