import io.cucumer.java.en.And;
import io.cucumer.java.en.Given;
import io.cucumer.java.en.Then;
import io.cucumer.java.en.When;

public class Zoomin {
  
@When ("User will see earth on page")
public void userWillBeAbleToZoomIn(){
  switch(deviceMode) {
    case GlobalConstant.PHONE:
       switch(language) {
         case GlobalConstant.ENGLISH:
           arcEarthPage.earthGlobe.waitForVisible();
       }
    }
  }
}
