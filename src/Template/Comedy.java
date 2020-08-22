package Template;

import DVDs.DVD;

public class Comedy extends Movie{
    private DVD dvd;

    public Comedy(DVD dvd){ this.dvd = dvd;}

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
