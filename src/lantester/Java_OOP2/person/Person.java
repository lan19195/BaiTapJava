package lantester.Java_OOP2.person;

public class Person {
      private String name;
      private int age;
      private String gender;
      private String address;
      private String phone;

      public Person(String name, int age, String gender, String address, String phone) { // 1 class có thể có nhiều hàm contructor
            this.name = name;
            this.age = age;
            this.gender = gender;
            this.address = address;
            this.phone = phone;
      }

      public Person(String name, int age, String gender) { // xây dựng để dùng cho Company class
            this.name = name;
            this.age = age;
            this.gender = gender;
      }

      public String getName() {
            return name;
      }

      public int getAge() {
            return age;
      }

      public String getGender() {
            return gender;
      }

      protected String getAddress() {
            return address;
      }

      protected String getPhone() {
            return phone;
      }
      protected void getNVInfo(){ //  Nhưng thông qua hàm return ở trên để ko cần lấy trực tiếp từ biến
            System.out.println("Name:" + getName());
            System.out.println("Age:" + getAge());
            System.out.println("Gender:" + getGender());
            System.out.println("Address:" + getAddress());
            System.out.println("Phone:" + getPhone());
      }

      public void getInfoForCompanyClass(){ // xây dựng để dùng cho Company class
            System.out.println("Name:" + getName());
            System.out.println("Age:" + getAge());
            System.out.println("Gender:" + getGender());
      }

}
