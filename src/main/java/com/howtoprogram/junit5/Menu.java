package com.howtoprogram.junit5;

import com.howtoprogram.junit5.Services.Election;
import com.howtoprogram.junit5.Services.IElection;

public class Menu {

    public static void main(String[] args)
    {
        IElection election = new Election();
        String candidateName=election.getCandidateByParty("Axity");
        int numOfVotes = election.getNumberOfVotesByParty("Axity");
        System.out.println(String.format("Name %s - Votes %d", candidateName, numOfVotes));

    }
}
