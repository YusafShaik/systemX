package CreationalDesignPatterns.prototype;

import java.util.List;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {

        NetflixProfile p1= new NetflixProfile("Yusaf", List.of("6 underground","gray man"));

        NetflixProfile clone=  p1.clone();

        clone.getRecommendedShows().add("Bullet Train");

        clone.getRecommendedShows().forEach(System.out::println);

        p1.getRecommendedShows().forEach(System.out::println);
    }
}
