package ex2;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class App {

    public static void main(String[] args) {
        GsonBuilder builder = new GsonBuilder();
        builder.setPrettyPrinting();
        Gson gson = builder.create();

        String json = null;
        try {
            json = Files.readString(Paths.get(
                App.class.getResource("/students.json").toURI()
            ));
        } catch (IOException | URISyntaxException e) {
            System.err.println("File not found");
        }

        Student[] students = gson.fromJson(json, Student[].class);
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
