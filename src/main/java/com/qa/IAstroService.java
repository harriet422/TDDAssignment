package com.qa;

public interface IAstroService {
    boolean authenticate(String userID, String password);
    String getStatusInfo(String astrObjectClassificationCode);
}
