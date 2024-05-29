package lantester.Java_OOP3.common;

public class BaseTest {

      public void creatDriver(){
//            System.out.println("Open Browser:" + Constants.browser);
            //c2:
            System.out.println("Open Browser:" + Constants.getBrowser());
            System.out.println("Open Report:" + Constants.headless);
            System.out.println("Headless Mode:" + Constants.report);
      }

      public void closeDriver(){
//            System.out.println("Closed Browser:" + Constants.browser);
            // c2:
            System.out.println("Closed Browser:" + Constants.getBrowser());
      }

//      public void closeDriver(String browser){
//            System.out.println("Closed Browser:" + browser);
//      }

//      public void setBrowser(String browser){
//            Constants.browser = browser;
//      }
}
