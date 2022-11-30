public class stringDemo {
    public static void main(String[] args) {
        //Khai báo kiểu litteral
        String name= "Đức Toàn";
        String name1 = "Đức Toàn";

        //Khai báo kiểu object (new)
        String email = new String("toanvd@techmaster.vn");
        String email1 = new String("toanvd@techmaster.vn");

        System.out.println("name : " + name);
        System.out.println("email : " + email);

        //So sánh chuỗi
        //== áp dụng so sánh địa chỉ ô nhớ, thường được áp dụng với primative
        System.out.println(name == name1);
        System.out.println(email == email1);

        //Phương thức String
        String text = "Xin chào các bạn";
        String text1 = "Xin chào các bạn";
        String text2 = "xin CHào cáC Bạn";

        System.out.println("In hoa : " + text.toUpperCase());
        System.out.println("In thường : " + text.toLowerCase());
        System.out.println("Độ dài : " + text.length());
        System.out.println("Cắt chuỗi : " + text.substring(0,8));
        System.out.println("Vị trí thứ 10 là ký tự : " + text.charAt(9) );
        System.out.println("So sánh : " + text.equals(text1));
        System.out.println("So sánh không phân biệt hoa thường: " + text.equalsIgnoreCase(text2));

    }
}
