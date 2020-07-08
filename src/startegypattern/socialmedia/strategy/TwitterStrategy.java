package startegypattern.socialmedia.strategy;

public class TwitterStrategy implements SocialMediaStrategy {
    @Override
    public void connectTo(String name) {
        System.out.println("Connect via twitter : " + name);
    }
}
