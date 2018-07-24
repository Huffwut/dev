package sample;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;

import javafx.event.ActionEvent;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import twitter4j.TwitterException;

public class Controller {
    String text;
    private Tweet tweet = new Tweet();
    private Tweets getweets = new Tweets();
    @FXML
    TextField tweetField;
    @FXML
    ListView < String > tweetList = new ListView<>();

    @FXML protected void onButtonPressed(ActionEvent event){
        text = tweetField.getText();
        try {
            tweet.tweetOnTwitter(text);
        } catch (TwitterException e) {
            e.printStackTrace();
        }
        tweetField.setText("");
    }
    @FXML protected void onRefresh(ActionEvent event){
        ObservableList<String> items =FXCollections.observableArrayList (getweets.get());
        tweetList.setItems(items);
        getweets.clear();
        //display tweets
    }

}
