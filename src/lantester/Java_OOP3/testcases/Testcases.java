package lantester.Java_OOP3.testcases;

import lantester.Java_OOP3.common.BaseTest;
import lantester.Java_OOP3.common.Constants;

public class Testcases extends BaseTest {
      public void LoginCMS(){
            Constants.setBrowser("Edge");
            creatDriver();
            System.out.println("Navigate to url https://cms.anhtester.com/login");
            System.out.println("Enter email and password");
            System.out.println("Click Login button");
            System.out.println("Verify redirect to Admin page");
            closeDriver();
      }

      public void addCategoryCMS(){
            Constants.setBrowser("Firefox");
            creatDriver();
            System.out.println("Navigate to url https://cms.anhtester.com/login");
            System.out.println("Enter email and password");
            System.out.println("Click Login button");
            System.out.println("Verify redirect to Admin page");

            System.out.println("Clicks on the Products menu");
            System.out.println("Clicks on the Category menu");
            System.out.println("Clicks on the Add New category menu");
            System.out.println("Enter all fields on the corm create new category");
            System.out.println("Clicks on the Save button");
            System.out.println("Verify add New Category successfully");
            closeDriver();
      }

      public static void main(String[] args) {
            Testcases testcases = new Testcases();
            testcases.LoginCMS();
            System.out.println("------------------------------------------------");
            testcases.addCategoryCMS();

      }
}
