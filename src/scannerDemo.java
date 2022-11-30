import java.util.Scanner;

public class scannerDemo {
    public static void main(String[] args) {
        //Khởi tạo đối tượng scanner
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập tên : ");
        String name = sc.nextLine();

        System.out.println("Nhập địa chỉ : ");
        String address = sc.nextLine();

        System.out.println("Nhập tuổi ");
//        int age = sc.nextInt();
        //Cách 1: Sử dụng Interger
//        int age = Integer.parseInt(sc.nextLine());

        //Cách 2: Sử dụng ép kiểu
        int age = sc.nextInt();
        sc.nextLine();

        System.out.println("Nhập email : ");
        String email = sc.nextLine();

        System.out.println("Tên tôi là : " + name + " Địa chỉ là " + address + ". Năm nay tôi" + age + "tuổi." + "Email của tôi là: "+ email );
    }
}
