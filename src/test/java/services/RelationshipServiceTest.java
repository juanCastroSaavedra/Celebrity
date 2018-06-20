package services;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RelationshipServiceTest {

    @Test
    public void testFindTheCelebritySuccessFivePersons() throws Exception {
        Boolean [][] relations = {
                {null,true,true,false,false},
                {true,null,true,true,false},
                {false,false,null,false,false},
                {false,false,true,null,false},
                {false,false,true,false,null}};

        int result = RelationshipService.findTheCelebrity(relations);
        System.out.println("Result should be(2): " + result);
        assertEquals(result,2);

    }

    @Test
    public void testFindTheCelebritySuccessSixPersons() throws Exception {
        Boolean [][] relations = {
                {null,true,true,false,false,true},
                {true,null,true,true,false,true},
                {false,false,null,false,false,true},
                {false,false,true,null,true,true},
                {false,true,true,false,null,true},
                {false,false,false,false,false,null}};

        int result = RelationshipService.findTheCelebrity(relations);
        System.out.println("Result should be(5): " + result);
        assertEquals(result,5);

    }

    @Test(expected = Exception.class)
    public void testFindTheCelebrityException() throws Exception {
        Boolean [][] relations = null;
        RelationshipService.findTheCelebrity(relations);
    }

    @Test
    public void testFindTheCelebrityWithoutCelebrity() throws Exception {
        Boolean [][] relations = {
                {null,true,true,false,false},
                {true,null,true,true,false},
                {false,true,null,false,false},
                {false,false,true,null,false},
                {false,false,true,false,null}};

        int result = RelationshipService.findTheCelebrity(relations);
        System.out.println("Result should be(-1): " + result);
        assertEquals(result,-1);

    }

    @Test
    public void testFindTheCelebritySuccessTenPersons() throws Exception {
        Boolean [][] relations = {
                {null,true,true,false,false,true,false,true,true,false},
                {true,null,true,true,false,true,false,true,true,true},
                {false,false,null,false,false,true,false,true,true,false},
                {false,false,true,null,true,true,false,true,true,true},
                {false,true,true,false,null,true,false,true,true,false},
                {false,false,true,false,false,null,false,true,true,true},
                {false,false,false,false,true,false,null,true,true,true},
                {false,false,false,false,true,false,false,null,true,true},
                {false,false,false,false,false,false,false,false,null,false},
                {true,true,false,true,false,false,false,true,true,null}};

        int result = RelationshipService.findTheCelebrity(relations);
        System.out.println("Result should be(8): " + result);
        assertEquals(result,8);

    }
}
