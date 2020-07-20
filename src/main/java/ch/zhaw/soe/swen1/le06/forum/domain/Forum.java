package ch.zhaw.soe.swen1.le06.forum.domain;

import java.time.Clock;
import java.util.ArrayList;
import java.util.List;

/**
 * Represents the whole forum with its list of topics and users
 *
 */
public class Forum {
	private Clock clock;
	private List<User> users = new ArrayList<>();
	private List<Topic> topics = new ArrayList<>();

	public Forum(Clock clock) {
		this.clock = clock;
	}

	/**
	 * Returns the list of users. Just for tests. 
	 * @return
	 */
	protected List<User> getUsers() {
		return users;
	}
	
	/**
	 * Returns the list of topics. Just for tests. 
	 * @return
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
}
