package ch.zhaw.soe.swen1.le06.forum.domain;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

import java.time.Clock;
import java.time.Instant;
import java.time.ZoneId;

import org.junit.Before;
import org.junit.Test;

/**
 * Combined tests for forum domain logic. Because domain classes are quite simple, 
 * only integration tests have been written. 
  *
 */
public class ForumTest {
	private Forum forum;
	private User user;
	private Instant reference;

	@Before
	public void setUp() throws Exception {
		reference = Instant.ofEpochSecond(1000000); 
		// use a clock which returns always the same time, so testing is easy
		forum = new Forum(Clock.fixed(reference, ZoneId.systemDefault()));
		user = new User("User", new byte[]{0});
		forum.getUsers().add(user);
	}

	 

}