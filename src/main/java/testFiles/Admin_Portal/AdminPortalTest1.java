package testFiles.Admin_Portal;

import org.testng.Assert;
import org.testng.annotations.Test;
import testFiles.CommonTests.CommonTests1;


public class AdminPortalTest1 extends CommonTests1 {

    @Test
    public void Scenario1() {

        String Methodname = new Object() {
        }.getClass().getEnclosingMethod().getName();

        try {

            String Classname = getClass().getSimpleName();
            System.out.println("start of method : " + Classname);
            loginasAdmin();
            TestCase1();
            TestCase3();

        } catch (Throwable e) {
            e.printStackTrace();
            Assert.fail("Error in " + Methodname + " : " + e.getMessage());
        }


    }

}
 