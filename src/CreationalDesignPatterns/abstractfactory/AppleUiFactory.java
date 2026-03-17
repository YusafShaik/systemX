package CreationalDesignPatterns.abstractfactory;

public class AppleUiFactory implements UIFactory{


    @Override
    public VideoPlayer getVideoPlayer() {
        return new AppleVideoPlayer();
    }

    @Override
    public PlayButton getPlayButton() {
        return new AppleTvPlayButton();
    }

}
