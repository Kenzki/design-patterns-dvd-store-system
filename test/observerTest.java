import Members.Member;
import Observer.Newsletter;

import static org.junit.Assert.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class observerTest {
    private Newsletter newsletter;
    private Member member;

    @BeforeEach
    void setUp(){
        newsletter = new Newsletter();
        member = new Member("David", "david@gmail.com", "Tralee");

        newsletter.registerObserver(member);
    }

    @org.junit.jupiter.api.Test
    void testRegisterObserver() {
        assertTrue(newsletter.getObservers().contains(member));
    }

    @Test
    void testRemoveObserver() {
        newsletter.removeObserver(member);
        assertFalse(newsletter.getObservers().contains(member));
    }

    @Test
    void testSetNews(){
        newsletter.setNews("The Avengers for only €1.99, etc..\n" + "\nThank you for subscribing to out Newsletter");
    }

}