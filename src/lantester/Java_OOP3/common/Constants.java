package lantester.Java_OOP3.common;

public class Constants {
      // biến static thì tường để là public (để người ta có thể truy cập thông qua tên class)
      public static String browser = "Chrome";
      public static Boolean report = true;
      public static Boolean headless = false;

      public static void setBrowser(String browser) {
            Constants.browser = browser;
      }
      // hoặc cách 2:
//      public void setBrowser2(String browser) {
//            this.browser = browser;
//      }

      public static String getBrowser() {
            return browser;
      }
}
