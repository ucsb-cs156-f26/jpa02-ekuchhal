package edu.ucsb.cs156.spring.hello;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TeamTest {

    Team team;

    @BeforeEach
    public void setup() {
        team = new Team("f26-02");    
    }

    @Test
    public void getName_returns_correct_name() {
       assert(team.getName().equals("f26-02"));
    }

    @Test
    public void toString_returns_correct_string() {
        assertEquals("Team(name=f26-02, members=[])", team.toString());
    }

    @Test
    public void hashCode_returns_correct_hashcode() {
        Team t1 = new Team();
        t1.setName("f26-02");
        t1.addMember("Eshaan");
        Team t2 = new Team();
        t2.setName("f26-02");
        t2.addMember("Eshaan");
        assertEquals(t1.hashCode(), t2.hashCode());;
    }

    @Test
    public void hashCode_hidden_test(){
        Team t = new Team();
        t.setName("f26-02");
        t.addMember("Eshaan");
        int result = t.hashCode();
        int expectedresult = -51662377;
        assertEquals(result, expectedresult);
    }
    @Test
    public void equals_hidden_test3a(){
        Team t1 = new Team();
        t1.setName("f26-02");
        t1.addMember("Eshaan");
        Team t2 = new Team();
        t2.setName("f26-02");
        t2.addMember("Eshaan");
        assertEquals(t1.equals(t2), true);   
    } 
    @Test
    public void equals_hidden_test3b(){
        Team t1 = new Team();
        t1.setName("f26-02");
        t1.addMember("Eshaan");
        Team t2 = new Team();
        t2.setName("f26-02");
        t2.addMember("Matthew");
        assertEquals(t1.equals(t2), false);
    }
    @Test
    public void equals_hidden_test3c(){
        Team t1 = new Team();
        t1.setName("f26-02");
        t1.addMember("Eshaan");
        Team t2 = new Team();
        t2.setName("f26-03");
        t2.addMember("Eshaan");
        assertEquals(t1.equals(t2), false);
    }
    @Test
    public void equals_hidden_testd(){
        Team t1 = new Team();
        t1.setName("f26-02");
        t1.addMember("Eshaan");
        Team t2 = new Team();
        t2.setName("f26-03");
        t2.addMember("Matthew");
        assertEquals(t1.equals(t2), false);
    }
    @Test
    public void equals_hidden_test1(){
        Team t1 = new Team();
        t1.setName("f26-02");
        t1.addMember("Eshaan");
        assertEquals(t1.equals(t1), true);
    }
    @Test
    public void equals_hidden_test2(){
        Team t1 = new Team();
        t1.setName("f26-02");
        String s = "f26-02";
        assertEquals(t1.equals(s), false);
    }
    // TODO: Add additional tests as needed to get to 100% jacoco line coverage, and
    // 100% mutation coverage (all mutants timed out or killed)
}
