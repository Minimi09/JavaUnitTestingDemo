package com.howtoprogram.junit5.Services;

public interface IElection {
    String getCandidateByParty(String party);
    int getNumberOfVotesByParty(String party);
}
