package Template;

public abstract class Movie {

    public String addMovie(){
        StringBuilder movie = new StringBuilder();
        movie.append(header());
        movie.append(title());
        movie.append(description());
        movie.append(review());
        movie.append(releaseYear());

        return  movie.toString();
    }

    protected String header(){return ("----Added a new Movie----\n");}

    abstract String title();

    abstract String description();

    abstract String review();

    abstract String releaseYear();

}
