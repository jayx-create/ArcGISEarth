import io.cucumer.java.en.And;
import io.cucumer.java.en.Given;
import io.cucumer.java.en.Then;
import io.cucumer.java.en.When;

public class Zoomout {
  
@Then("User will be able to zoom in")
  public void userWillBeAbleToZoomIn(){
    MobileElement elementToZoom = driver.findElement(MobileBy.id("elementId"));
        Dimension size = elementToZoom.getSize();
        int aStart = elementToZoom.getLocation().getX() + size.getWidth() / 2;
        int bStart = elementToZoom.getLocation().getY() + size.getHeight() / 2;
        int finishA = aStart + 100;
        int finishB = bStart + 100;
        MultiTouchAction multiTouch = new MultiTouchAction(driver);
        multiTouch.add(new TouchAction<>(driver)
                .press(elementToZoom, aStart, bStart)
                .moveTo(elementToZoom, finishA, finishB)
                .release())
                .add(new TouchAction<>(driver)
                        .press(elementToZoom, aStart, bStart)
                        .moveTo(elementToZoom, finishA, finishB)
                        .release());

        multiTouch.perform();
        driver.quit();
  }

}
