package sample;

import twitter4j.*;

import java.util.ArrayList;
import java.util.List;

public class Tweets {
        private TwitterFactory factory = new TwitterFactory();
        private Twitter twitter = factory.getInstance();
        private int totalCount = 20;
        private Paging paging = new Paging(1, totalCount);
        private List<Status> tweets;
        private ArrayList<String > twats = new ArrayList<>();
        public ArrayList<String> get(){
            try {
                tweets = twitter.getUserTimeline(paging);
            } catch (TwitterException e) {
                e.printStackTrace();
            }
            for(Status status:tweets){
                twats.add(status.getText());
            }
            return twats;
        }
        public void clear(){
            twats.clear();
        }
}
