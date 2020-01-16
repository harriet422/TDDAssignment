package com.qa;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolarSystemInformationTest {
    /*@Test
    public void test_number_is_too_short(){
        String userId = "u";
        String password = "p";
        String expResult = "Not allowed";
        SolarSystemInformation solarSystemInformation = new SolarSystemInformation(userId, password);
        assertEquals(expResult, solarSystemInformation.getObjectName());
    }
    @Test
    public void test_userid_is_correct_length(){
    @Test
    public void test_number_is_too_long(){
    @Test
    public void test_password_is_correct_length(){*/

   //ALL PASS FROM HERE
   ///////////////////////////////
    @Test
    public void test_is_password_valid() {
        //Arrange
        String validUserID = "AB1234";
        String validPassword = "S0lar$ystem";
        IAstroService as = new AstroServiceValidCredentials();

        SolarSystemInformation cut = new SolarSystemInformation(validUserID, validPassword, as);
        //Act
        String objectName = cut.getObjectName();
        //Assert
        assertNotEquals("Not Allowed", objectName);
    }

    @Test
    public void test_is_password_invalid_missing_symbol() {
        //Arrange
        String validUserID = "AB1234";
        String validPassword = "S0larSystem";

        IAstroService as = new WebServiceInvalidCredentials();

        SolarSystemInformation cut = new SolarSystemInformation(validUserID, validPassword, as);
        //Act
        String objectName = cut.getObjectName();
        //Assert
        assertEquals("Not Allowed", objectName);
    }

    @Test
    public void test_is_password_invalid_missing_number() {
        //Arrange
        String validUserID = "AB1234";
        String validPassword = "Solar$ystem";

        IAstroService as = new WebServiceInvalidCredentials();

        SolarSystemInformation cut = new SolarSystemInformation(validUserID, validPassword, as);
        //Act
        String objectName = cut.getObjectName();
        //Assert
        assertEquals("Not Allowed", objectName);
    }

    @Test
    public void test_is_password_invalid_missing_lowercase() {
        //Arrange
        String validUserID = "AB1234";
        String validPassword = "s0lar$ystem";

        IAstroService as = new WebServiceInvalidCredentials();

        SolarSystemInformation cut = new SolarSystemInformation(validUserID, validPassword, as);
        //Act
        String objectName = cut.getObjectName();
        //Assert
        assertEquals("Not Allowed", objectName);
    }

    @Test
    public void test_is_password_invalid_missing_uppercase() {
        //Arrange
        String validUserID = "AB1234";
        String validPassword = "S0LAR$YSTEM";

        IAstroService as = new WebServiceInvalidCredentials();

        SolarSystemInformation cut = new SolarSystemInformation(validUserID, validPassword, as);
        //Act
        String objectName = cut.getObjectName();
        //Assert
        assertEquals("Not Allowed", objectName);
    }

    @Test
    public void test_is_password_invalid_too_short() {
        //Arrange
        String validUserID = "AB1234";
        String validPassword = "S0lar$";

        IAstroService as = new WebServiceInvalidCredentials();

        SolarSystemInformation cut = new SolarSystemInformation(validUserID, validPassword, as);
        //Act
        String objectName = cut.getObjectName();
        //Assert
        assertEquals("Not Allowed", objectName);
    }

    @Test
    public void test_is_valid_credential_format() {
        //Arrange
        String validUserID = "AB1234";
        String validPassword = "S0lar$ystem";

        IAstroService as = new AstroServiceValidCredentials();

        SolarSystemInformation cut = new SolarSystemInformation(validUserID, validPassword, as);
        //Act
        String objectName = cut.getObjectName();
        //Assert
        assertNotEquals("Not Allowed", objectName);
    }

    @Test
    public void test_is_valid_credentials_but_invalid_astocode() {
        //Arrange
        String validUserID = "AB1234";
        String validPassword = "S0lar$ystem";
        String code = "PVen5656t";

        IAstroService as = new AstroServiceValidCredentials();

        SolarSystemInformation cut = new SolarSystemInformation(validUserID, validPassword, as);
        //Act
        assertThrows(Exception.class, () -> {
            cut.initilaiseAOCDetails(code);
        });
    }


    ////////////////////////////
    //dont uncomment this
    ////////////////////////////
    /*public class PasswordValidator {

        private Pattern pattern;
        private Matcher matcher;

        private static final String password = "((?=.*[a-z])(?=.*\\d)(?=.*[A-Z])(?=.*[@#$%!]).{8,40})";

        public PasswordValidator() {
            pattern = Pattern.compile(password);
        }

        public boolean validate(final String password) {

            matcher = pattern.matcher(password);
            return matcher.matches();
        }
    }*/
}