package com.qa;

public class AstroServiceValidCredentials implements  IAstroService {

    @Override
    public boolean authenticate(String userID, String password) {
        return true;
    }

    @Override
    public String getStatusInfo(String astrObjectClassificationCode) {
        return "PEar150M,Planet,Earth,365,23409,656655,43543";
    }
}
