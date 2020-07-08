package startegypattern.socialmedia.strategy;

public class FacebookStrategy implements SocialMediaStrategy {
    @Override
    public void connectTo(String name) {
        System.out.println("Connect via Facebook : " + name);
    }
}
