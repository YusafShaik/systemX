package CreationalDesignPatterns.abstractfactory;

public class WebUiFactory implements UIFactory{


    @Override
    public VideoPlayer getVideoPlayer() {
        return new WebVideoPlayer();
    }

    @Override
    public PlayButton getPlayButton() {
        return new WebPlayButton();
    }

}
