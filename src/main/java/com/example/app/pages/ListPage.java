package com.example.app.pages;

import com.example.app.base.BasePageObject;
import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.interactions.touch.TouchActions;

public class ListPage extends BasePageObject {

  By recycleView =  MobileBy.id("recycler_view");
  By listRecycleView1 =  MobileBy.xpath("//android.widget.TextView[contains(@text,'List ke-1')]");

  By toastList = MobileBy.xpath("//android.widget.Toast[contains(@text,'List ke-1')]");


  public void swipeList() {
    TouchAction action = new TouchAction(getDriver());
    AndroidElement containerList = find(recycleView);
    Point coordinate = containerList.getCenter();
    PointOption start = PointOption.point(coordinate);
    PointOption end = PointOption.point(coordinate.getX(), coordinate.getY() + -1000);
    //builder
    action
        .press(start)
        .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
        .moveTo(end)
        .release()
        .perform();

//    AndroidElement element = find(MobileBy.AndroidUIAutomator(
//        "new UiScrollable(new UiSelector().scrollable(true))" +
//            ".scrollIntoView(new UiSelector().text(\"List ke-60\"))"));
  }

  public void doubleTap() {
    doubleTap(listRecycleView1);
  }

  public void toastFirstList() {
    toast(toastList);
  }
}
