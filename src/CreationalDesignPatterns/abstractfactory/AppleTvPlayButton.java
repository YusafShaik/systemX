package CreationalDesignPatterns.abstractfactory;

public class AppleTvPlayButton implements PlayButton {


    @Override
    public void onClick() {
        System.out.println("Play or Pause the video in Apple Video Player");
    }

}
