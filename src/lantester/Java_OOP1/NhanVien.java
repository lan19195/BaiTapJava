package lantester.Java_OOP1;

public class NhanVien {
      private String name;
      private int age;
      private String gender;
      private String birthday;
      private String address;

      public NhanVien(String name, int age, String gender, String birthday, String address) {
            this.address = address;
            this.name = name;
            this.age = age;
            this.gender = gender;
            this.birthday = birthday;
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

      public String getBirthday() {
            return birthday;
      }

      public String getAddress() {
            return address;
      }

      public void getNhanVienInfo(){ // sử dụng hàm này để lấy in ra thông tin, ko cần hàm return ở trên cũng được.
            System.out.println("Name:" + name);
            System.out.println("Age:" + age);
            System.out.println("Gender:" + gender);
            System.out.println("Birthday:" + birthday);
            System.out.println("Address:" + address);
      }

      public void getNVInfo(){ //  Nhưng thông qua hàm return ở trên để ko cần lấy trực tiếp từ biến
            System.out.println("Name:" + getName());
            System.out.println("Age:" + getAge());
            System.out.println("Gender:" + getGender());
            System.out.println("Birthday:" + getBirthday());
            System.out.println("Address:" + getAddress());
      }
}
