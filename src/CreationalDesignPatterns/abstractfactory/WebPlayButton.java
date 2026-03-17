package CreationalDesignPatterns.abstractfactory;

public class WebPlayButton implements PlayButton {


    @Override
    public void onClick() {
        System.out.println("Play or pause the video in web video player");
    }


}
