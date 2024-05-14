package ex3;

public class Joke {
    public String type;
    public String setup;
    public String punchline;
    public int id;

    @Override
    public String toString() {
        return "Joke type: %s\nID: %d\n\n%s\n%s".formatted(type, id, setup, punchline);
    }
}
