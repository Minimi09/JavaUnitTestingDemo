package com.howtoprogram.junit5.Services;

public class ElectionMock implements IElection {
    @Override
    public String getCandidateByParty(String party) {
        return "Prueba";
    }

    @Override
    public int getNumberOfVotesByParty(String party) {
        return 56;
    }
}
