package edu.ucsb.cs156.spring.hello;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

import org.junit.jupiter.api.Test;

public class DeveloperTest {

    @Test
    public void testPrivateConstructor() throws Exception {
        // this hack is from https://www.timomeinen.de/2013/10/test-for-private-constructor-to-get-full-code-coverage/
        Constructor<Developer> constructor = Developer.class.getDeclaredConstructor();
        assertTrue(Modifier.isPrivate(constructor.getModifiers()),"Constructor is not private");

        constructor.setAccessible(true);
        constructor.newInstance();
    }

    @Test
    public void getName_returns_correct_name() {
        assertEquals("Eshaan", Developer.getName());
    }

    @Test
    public void getGithubId_returns_correct_github_id() {
        assertEquals("ekuchhal", Developer.getGithubId());
    }
    @Test
    public void getTeam_returns_team_with_correct_name() {
        Team  t = Developer.getTeam();
        assertEquals("f26-02", t.getName());
    }
    @Test
    public void getTeam_returns_team_with_Issac() {
        Team  t = Developer.getTeam();
        assertTrue(t.getMembers().contains("Issac H."),"Team should contain Issac H.");
    }
    @Test
    public void getTeam_returns_team_with_Matthew() {
        Team  t = Developer.getTeam();
        assertTrue(t.getMembers().contains("Matthew N."),"Team should contain Matthew N.");
    }
    @Test
    public void getTeam_returns_team_with_Eshaan() {
        Team  t = Developer.getTeam();
        assertTrue(t.getMembers().contains("Eshaan"),"Team should contain Eshaan");
    }
    @Test
    public void getTeam_returns_team_with_Timothy() {
        Team  t = Developer.getTeam();
        assertTrue(t.getMembers().contains("Timothy"),"Team should contain Timothy");
    }
    @Test
    public void getTeam_returns_team_with_Zach() {
        Team  t = Developer.getTeam();
        assertTrue(t.getMembers().contains("Zach"),"Team should contain Zach");
    }
    @Test
    public void getTeam_returns_team_with_Wayne() {
        Team  t = Developer.getTeam();
        assertTrue(t.getMembers().contains("Wayne"),"Team should contain Wayne");
    }
    // TODO: Add additional tests as needed to get to 100% jacoco line coverage, and
    // 100% mutation coverage (all mutants timed out or killed)

}
