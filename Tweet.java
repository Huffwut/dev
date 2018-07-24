/*
 * File: Tweet.java
 * Project: dev
 * File Created: Tuesday, 24th July 2018 1:20:27 pm
 * Author: Romas (rssoushi@gmail.com)
 * -----
 * Last Modified: Tuesday, 24th July 2018 1:20:30 pm
 * Modified By: Romas (rssoushi@gmail.com)
 * -----
 * Copyright - 2018 Random student
 */
package sample;

import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;

public class Tweet {
    private Twitter twitter = new TwitterFactory().getInstance();

    public void tweetOnTwitter(String msg) throws TwitterException {
        twitter.updateStatus(msg);
    }
}
