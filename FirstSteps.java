import io.cucumer.java.en.And;
import io.cucumer.java.en.Given;
import io.cucumer.java.en.Then;
import io.cucumer.java.en.When;

public class Zoomin {
  
  
@Given("{string} is logged in")
  public void loginProfileIdIsLoggedIn(String loginProfileId) throws Exception{
   baseUtil.userInformation = TestUserUtil.getTestUserByProfileId(loginProfileId);
   realData = baseutil.userInformation;
   name = realData.getUserName();
   switch(deviceMode.toUpperCase()) {
     case GlobalConstant.PHONE:
       if ( expectedLanguage.equals("English"){
         mobileEarthGISArc.invoke(username);
         mobileEarthGISArc.waitForPageToLoad();
       }
   }
 }           
@When ("User sees earth on page")
  public void userSeesEarthOnPage(){
  switch(deviceMode) {
    case GlobalConstant.PHONE:
       switch(language) {
         case GlobalConstant.ENGLISH:
           arcEarthPage.earthGlobe.waitForVisible();
       }
    }
  }
}
           
@And ("User is registered with {string}")
     public void userIsRegisteredWithLanguage(String language) throws Exception{
  if(userLanguage. equalsIgnoreCase (GlobalConstant.ENGLISH)) {
baseutil.deviceProp.setPreferredLanguage(GlobalConstant.ENGLISH);
if(!dataType.toUpperCase().contains (GlobalConstant.DATA_TYPE_VIRTUAL)) {
changeUserPreferredLanguage(GlobalConstant.ENGLISH_PREFFERED_LANG_CODE)
  }
  }
     }
           
           
