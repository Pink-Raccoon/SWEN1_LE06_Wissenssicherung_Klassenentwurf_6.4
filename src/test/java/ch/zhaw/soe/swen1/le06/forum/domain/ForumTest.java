package ch.zhaw.soe.swen1.le06.forum.domain;

import java.time.Clock;
import java.time.Instant;
import java.time.ZoneId;
import org.junit.jupiter.api.BeforeEach;

/**
 * Combined tests for forum domain logic. Because domain classes are quite simple, 
 * only integration tests have been written. 
 *
*/
public class ForumTest {
	private Forum forum;
	private User user;
	private Instant reference;

	@BeforeEach
	public void setUp() throws Exception {
		reference = Instant.ofEpochSecond(1000000); 
		// use a clock which returns always the same time, so testing is easy
		forum = new Forum(Clock.fixed(reference, ZoneId.systemDefault()));
	}
}