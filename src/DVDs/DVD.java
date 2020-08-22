package DVDs;

public class DVD {
    private String title;
    private String description;
    private String review;
    private String releaseYear;

    public DVD (String title, String description, String review, String releaseYear){
        this.title = title;
        this.description = description;
        this.review = review;
        this.releaseYear = releaseYear;

    }

    public void setTitle(String title){ this.title = title;}
    public String getTitle(){return title;}

    public void setDescription(String description){ this.description = description;}
    public String getDescription(){return description;}

    public void setReview(String review){ this.review = review;}
    public String getReview(){return review;}

    public void setReleaseYear(String releaseYear){ this.releaseYear = releaseYear;}
    public String getReleaseYear(){return releaseYear;}
}
