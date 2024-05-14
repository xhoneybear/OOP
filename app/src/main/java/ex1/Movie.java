package ex1;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Movie {
    public String title;
    public String directorName;
    public int duration;
    public CastMember[] cast;

    public Movie(String title, String directorName, int duration, CastMember[] cast) {
        this.title = title;
        this.directorName = directorName;
        this.duration = duration;
        this.cast = cast;
    }

    public static void main(String[] args) {
        CastMember[] cast = new CastMember[] {
            new CastMember("Ella Purnell", "Lucy MacLean"),
            new CastMember("Aaron Moten", "Maximus"),
            new CastMember("Walton Goggins", "The Ghoul")
        };

        Movie movie = new Movie("Fallout", "Graham Wagner", 473, cast);

        GsonBuilder builder = new GsonBuilder();
        builder.setPrettyPrinting();
        Gson gson = builder.create();

        String json = gson.toJson(movie);

        System.out.println(json);
    }
}
