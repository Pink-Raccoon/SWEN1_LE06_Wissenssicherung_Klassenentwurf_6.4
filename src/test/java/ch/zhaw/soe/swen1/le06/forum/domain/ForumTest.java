package ch.zhaw.soe.swen1.le06.forum.domain;

import java.time.Clock;
import java.time.Instant;
import java.time.ZoneId;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

/**
 * Combined tests for forum domain logic. Because domain classes are quite simple, 
 * only integration tests have been written. 
  *
 */
@ExtendWith(MockitoExtension.class)
public class ForumTest {
    //@Mock
    //private AccessTokenValidatorService service;
    private Forum forum;
    private User user;
    byte[] accessToken;
    private Instant reference;

    @BeforeEach
    public void setUp() throws Exception {
        reference = Instant.ofEpochSecond(1000000);
        // use a clock which returns always the same time, so testing is easy
        //forum = new Forum(Clock.fixed(reference, ZoneId.systemDefault()), service);
        user = new User("User", "email");
        accessToken = new byte[] { 0 };
        //forum.getUsers().add(user);
    }

    @Test
    public void getNbrOfContributionsAndAssertIt() {
        //TODO: Add your test here.
    }  
    @Test
    public void addNewDiscussionToTopicAndAssertIt() {
        //TODO: Add your test here.
    }   
}
