package CreationalDesignPatterns.builder;

public class Main {

    public static void main(String[] args) {
        HttpRequest httpRequest= new HttpRequest.Builder().url("https://google.com").timeout(120).build();

        System.out.println(httpRequest.toString());
    }
}
