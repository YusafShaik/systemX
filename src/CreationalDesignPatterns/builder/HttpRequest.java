package CreationalDesignPatterns.builder;

public class HttpRequest {

    private final String url;

    private final int timeout;

    private HttpRequest(Builder builder){
        this.url=builder.url;
        this.timeout=builder.timeout;
    }

    public static class Builder{
        String url;

        int timeout;

       Builder url(String url){
            this.url=url;
            return this;
        }

        Builder timeout(int timeout){
           this.timeout=timeout;
           return this;
        }

        HttpRequest build(){
         return new  HttpRequest(this);
        }
    }
}
