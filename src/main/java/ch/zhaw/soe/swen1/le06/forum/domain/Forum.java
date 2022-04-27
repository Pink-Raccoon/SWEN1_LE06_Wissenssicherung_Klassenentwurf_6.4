package ch.zhaw.soe.swen1.le06.forum.domain;

import java.util.ArrayList;
import java.util.List;
import java.time.Clock;
import java.util.Objects;

/**
 * Represents the whole forum with its list of topics and users.
 */
public class Forum implements AcessTokenValidationService{
    private Clock clock;
    private List<User> users = new ArrayList<>();
    private List<Topic> topics = new ArrayList<>();

    public Forum(Clock clock) {
        this.clock = clock;
    }

    /**
     * Returns the list of users. Just for tests.  
     */
    protected List<User> getUsers() {
        return users;
    }
    
    /**
     * Returns the list of topics. Just for tests.  
     */
    protected List<Topic> getTopics() {
        return topics;
    }

    /**
     * Returns the topic with the specified name or null if there is no such topic. 
     */
    protected Topic getTopicForName(String name){
        for(Topic topic : topics){
            if (topic.getName().equals(name)){
                return topic;
            }
        }
        return null;
    }
    
    /**
     * Returns the user with the specified name or null if there is no such user. 
     */
    protected User getUserForName(String name){
        for(User user : users){
            if (user.getName().equals(name)){
                return user;
            }
        }
        return null;
    }
    public int getNbrOfContributions(){
        int result = 0;
        for(Topic topic:topics){
            result += topic.getNbrOfContributions();
        }
        return result;
    }

    public void addNewDiscussion(byte[] accessToken, String topicName, String discussionName){
        Objects.requireNonNull(accessToken);
        Objects.requireNonNull(topicName);
        Objects.requireNonNull(discussionName);
        if(isValidToken(accessToken)){
            throw new RuntimeException("Access Token is not valid.");
        }
    }


    @Override
    public boolean isValidToken(byte[] acessToken) {
        return false;
    }
}
