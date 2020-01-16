package com.qa;

public class WebServiceInvalidCredentials implements IAstroService {
    public boolean authenticate (String userID, String password){
       return false;

    }

    public String getStatusInfo(String astronomicalObjectClassificationCode){
       return "";
    }
}


/*
method -authenticate ( String userID, String password )
method -getStatusInfo ( String astronomicalObjectClassificationCode)
*/
