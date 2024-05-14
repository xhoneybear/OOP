package ex3;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class JokeApiClient {
    public String jokeApiRequest() {
        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder(
                new URI("https://official-joke-api.appspot.com/random_joke")
            ).GET().build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            return response.body();
        } catch (URISyntaxException | IOException | InterruptedException e) {
            System.err.println("Error: " + e.getMessage());
        }
        return null;
    }

    public static void main(String[] args) {
        JokeApiClient jokeApiClient = new JokeApiClient();
        String json = jokeApiClient.jokeApiRequest();

        Gson gson = new GsonBuilder().create();

        Joke joke = gson.fromJson(json, Joke.class);
        System.out.println(joke);
    }
}