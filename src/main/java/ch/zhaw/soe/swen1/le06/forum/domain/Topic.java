package ch.zhaw.soe.swen1.le06.forum.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a topic for discussions.  
 */
public class Topic {
    private String name;
    private String description;
    private List<Discussion> discussions = new ArrayList<Discussion>();
    
    public Topic(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getDescription(){
        return description;
    }
    
    public void setDescription(String description){
        this.description = description;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Discussion> getDiscussions() {
        return discussions;
    }
    
    /**
     * Returns the topic with the specified name or null if there is no such topic. 	 * 
     */
    protected Discussion getDiscussionForName(String name){
        for(Discussion discussion : discussions){
            if (discussion.getName().equals(name)){
                return discussion;
            }
        }
        return null;
    }
}
