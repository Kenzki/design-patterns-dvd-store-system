package Template;

import DVDs.*;
public class Action extends Movie{
    private DVD dvd;

    public Action(DVD dvd){ this.dvd = dvd;}


    @Override
    public String title() {
        return "\nTitle: " + dvd.getTitle();
    }

    @Override
    String description() {
        return "\nDescription: " + dvd.getDescription();
    }

    @Override
    String review() {
        return "\nReview: " + dvd.getReview();
    }

    @Override
    String releaseYear() {
        return "\nRelease Year: " + dvd.getReleaseYear();
    }
}
