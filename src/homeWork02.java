import java.util.Scanner;

public class homeWork02 {
    public static void main(String[] args) {
        //Bài 1; Tính chu vi diện tích hình chữ nhật với dài rộng nhập từ bàn phím
        Scanner perimeter = new Scanner(System.in);

        System.out.print("Chiều dài là: ");
        double length = perimeter.nextDouble();

        System.out.print("Chiều rộng là: ");
        double width = perimeter.nextDouble();

        System.out.println("Chu vi hình chữ nhật là: " + (width + length) * 2);
        System.out.println("Diện tích hình chữ nhật là: " + width * length);

        //Bài 2: Viết chương trình giới thiệu bản thân gồm
        // các thông tin họ tên, tuổi, giới tính, địa chỉ, với các thông tin cá nhân được nhập vào từ bàn phím
        System.out.println();

        Scanner introduce = new Scanner(System.in);

        System.out.print("Họ tên: ");
        String name = introduce.nextLine();

        System.out.print("Tuổi: ");
        int age = introduce.nextInt();
        introduce.nextLine();

        System.out.print("Giới tính: ");
        String gender = introduce.nextLine();

        System.out.print("Địa chỉ: ");
        String address = introduce.nextLine();

        System.out.println("Xin chào các bạn, mình tên là " + name + ", năm nay mình " + age + " tuổi, giới tính " + gender + ". Hiện tại mình đang sống và làm việc tại " + address);
    }
}