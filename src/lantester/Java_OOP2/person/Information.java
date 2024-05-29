package lantester.Java_OOP2.person;

public class Information {
      public static void main(String[] args) {
            Person person1 = new Person("John",30,"Male","HCM","09272672673");
            Person person2 = new Person("Alex",31,"Male","HCM","0922232673");
            person1.getNVInfo();
            System.out.println("_____________________________________________________________");
            person2.getNVInfo();

      }
}
