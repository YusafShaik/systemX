package CreationalDesignPatterns.prototype;

import java.util.ArrayList;
import java.util.List;

public class NetflixProfile implements Cloneable{

    private String profileName;

    private List<String> recommendedShows;

    public NetflixProfile(String profileName, List<String> recommendedShows) {
        this.profileName = profileName;
        this.recommendedShows = recommendedShows;
    }

    @Override
    public NetflixProfile clone() throws CloneNotSupportedException {
        NetflixProfile profile=(NetflixProfile) super.clone();

        profile.recommendedShows= new ArrayList<>();

        profile.recommendedShows.addAll(this.recommendedShows);

        return profile;
    }

    public String getProfileName() {
        return profileName;
    }

    public void setProfileName(String profileName) {
        this.profileName = profileName;
    }

    public List<String> getRecommendedShows() {
        return recommendedShows;
    }

    public void setRecommendedShows(List<String> recommendedShows) {
        this.recommendedShows = recommendedShows;
    }
}
