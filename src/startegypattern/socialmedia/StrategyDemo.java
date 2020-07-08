package startegypattern.socialmedia;

import startegypattern.socialmedia.strategy.TwitterStrategy;

public class StrategyDemo {

    public static void main(String[] args) {
        SocialMediaContext socialMediaContext = new SocialMediaContext();
        socialMediaContext.setSocialMediaStrategy(new TwitterStrategy());
        socialMediaContext.connect("Poorvank");
    }

}
