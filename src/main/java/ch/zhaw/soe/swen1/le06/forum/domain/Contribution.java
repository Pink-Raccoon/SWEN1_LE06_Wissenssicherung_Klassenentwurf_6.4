package ch.zhaw.soe.swen1.le06.forum.domain;

import java.time.Instant;

/**
 * Contribution of one user with content. 
 *
 */
public class Contribution {
	private String content;
	private User user;
	private Instant creationDateTime;

	public Contribution(String content, User user, Instant creationDateTime) {
		this.content = content;
		this.user = user;
		this.creationDateTime = creationDateTime;
		user.addContribution(this);
	}

	public User getUser() {
		return user;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Instant getCreationDateTime() {
		return creationDateTime;
	}
}
