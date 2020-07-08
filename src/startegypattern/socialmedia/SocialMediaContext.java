package startegypattern.socialmedia;

import startegypattern.socialmedia.strategy.SocialMediaStrategy;

public class SocialMediaContext {

    SocialMediaStrategy socialMediaStrategy;

    public void setSocialMediaStrategy(SocialMediaStrategy socialMediaStrategy) {
        this.socialMediaStrategy = socialMediaStrategy;
    }

    public void connect(String name) {
        socialMediaStrategy.connectTo(name);
    }
}
