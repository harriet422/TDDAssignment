package com.qa;
import java.math.BigDecimal;

public class SolarSystemInformation {
    private String astronomicalObjectClassificationCode;
    private String objectType;
    private String objectName;
    private Boolean exists;
    private int orbitalPeriod;
    private BigDecimal radius;
    private BigDecimal semiMajorAxis;
    private BigDecimal mass;
    private String userID;
    private IAstroService as;
    //private String password;

    public SolarSystemInformation(String userID, String password, IAstroService as){
        //this.userID = userID;
        //this.password = password;
        this.as = as;

        if (!isValidPassword(password)){
            this.objectName = "Not Allowed";
            this.objectType = "Not Allowed";
            return;
        }
        if (!isValidUserID(userID)){
            this.objectName = "Not Allowed";
            this.objectType = "Not Allowed";
            return;
        }

        if (!as.authenticate(userID, password)){
            this.objectName = "Not Allowed";
            this.objectType = "Not Allowed";
            return;
        }


    }

    public void initilaiseAOCDetails(String astronomicalObjectClassificationCode) throws Exception{
        //validagte code if invalid throw exception
        //if(astronomicalObjectClassificationCode.matches("(S|P|(A[0-9]{0,8})|M|D|C)[A-Z][a-z]{2}[0-9]{1,3}(T|M|B|L|TL)")){
        //^[S|P|A|M|D|C][1,9]{0,8}[A-Z][a-z]{2}[1,9]{1,3}[T|M|B|L]{1,2}$
                throw new Exception("sfdghjn");
        //}

        //if all is well
        //String astroObjectDetails = as.getStatusInfo(astronomicalObjectClassificationCode);
        //if (astroObjectDetails.equals("No such classification or SMA code")){
        //    setExists(false);
        //}
    }

    public String getUserID(){
        return userID;
    }

    private boolean isValidPassword(String password) {
        return password.matches("((?=.*[a-z])(?=.*\\d)(?=.*[A-Z])(?=.*[@#$%!]).{10,40})");
    }

    public boolean isValidUserID(String userID){
        return userID.matches("([A-Za-z]{2}(?<!\\d)(?!0000)\\d{4}(?!\\d))");
    }

 /*   public boolean checkLengthTooShort(String input){
        if (input.length() < 6)
            return true;
        userID = "Not Allowed";
        return false;
    }

    public boolean checkLengthTooLong(String input){
        if (input.length() > 10)
            return true;
        userID = "Not Allowed";
        return false;
    }*/

    public void Combination(String astronomicalObjectClassificationCode, String objectType, String objectName,
                            Boolean exists, int orbitalPeriod, BigDecimal radius, BigDecimal semiMajorAxis, BigDecimal mass){
        this.astronomicalObjectClassificationCode = astronomicalObjectClassificationCode;
        this.objectType = objectType;
        this.objectName = objectName;
        this.exists = exists;
        this.orbitalPeriod = orbitalPeriod;
        this.radius = radius;
        this.semiMajorAxis = semiMajorAxis;
        this.mass = mass;
    }

    public String getAstronomicalObjectClassificationCode() {
        return astronomicalObjectClassificationCode;
    }

    private void setAstronomicalObjectClassificationCode(String astronomicalObjectClassificationCode) {
        this.astronomicalObjectClassificationCode = astronomicalObjectClassificationCode;
    }

    public String getObjectType() {
        return objectType;
    }

    private void setObjectType(String objectType) {
        this.objectType = objectType;
    }

    public String getObjectName() {
        return objectName;
    }

    private void setObjectName(String objectName) {
        this.objectName = objectName;
    }

    public Boolean getExists() {
        return exists;
    }

    private void setExists(Boolean exists) {
        this.exists = exists;
    }

    public int getOrbitalPeriod() {
        return orbitalPeriod;
    }

    private void setOrbitalPeriod(int orbitalPeriod) {
        this.orbitalPeriod = orbitalPeriod;
    }

    public BigDecimal getRadius() {
        return radius;
    }

    private void setRadius(BigDecimal radius) {
        this.radius = radius;
    }

    public BigDecimal getSemiMajorAxis() {
        return semiMajorAxis;
    }

    private void setSemiMajorAxis(BigDecimal semiMajorAxis) {
        this.semiMajorAxis = semiMajorAxis;
    }

    public BigDecimal getMass() {
        return mass;
    }

    private void setMass(BigDecimal mass) {
        this.mass = mass;
    }




}



/*
constructor receiving parameters, userID and password
getters and setters for the following:
        astronomicalObjectClassificationCode -String
        objectType -String
        objectName -String
        exists -Boolean
        orbitalPeriod -Int
        radius -BigDecimal
        semiMajorAxis - BigDecimal
        mass -BigDecimal

method initialiseAOCDetails() that takes astronomicalObjectClassificationCode as a parameter
method toString()*/