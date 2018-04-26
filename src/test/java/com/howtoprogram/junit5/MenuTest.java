package com.howtoprogram.junit5;

import com.howtoprogram.junit5.Services.Election;
import com.howtoprogram.junit5.Services.ElectionMock;
import com.howtoprogram.junit5.Services.IElection;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class MenuTest {
    @Test
    void testGetNameByParty()
    {
        //Tendria que hacer una variable IElection,
        //pero no esta bien probar con servicios

        IElection election = new ElectionMock();
        String candidateName=election.getCandidateByParty("Axity");
        int numOfVotes = election.getNumberOfVotesByParty("Axity");
        assertEquals("Prueba",candidateName );
        assertEquals(56,numOfVotes );
    }

    @Test
    void testGetNameByPartyMockito()
    {

        IElection election = mock(Election.class);
        when(election.getCandidateByParty("Otra cosa")).thenReturn("Arturo");
        when(election.getNumberOfVotesByParty("")).thenReturn(0);
        //Cuando te invoquen con cualquier otra cosa tu retornas un arturo

        String candidateName=election.getCandidateByParty("Otra cosa");
        int numOfVotes = election.getNumberOfVotesByParty("Axity");

        assertEquals("Arturo",candidateName );
        assertEquals(0,numOfVotes );
    }
}
