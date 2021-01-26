package userinterface;


import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

import javax.swing.table.TableRowSorter;

@DefaultUrl("https://www.utest.com/")
public class UtestJoinPage extends PageObject {
public static final Target JOIN_BUTTON = Target.the("Button to begin the register")
        .located(By.xpath("(//*[text()='Join Today'])[1]"));

}
