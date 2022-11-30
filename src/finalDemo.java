public class finalDemo {

    public static final String EMAIL = "toanvd@dace.vn";
    public static void main(String[] args) {
        final String name = "Tony";
        final String FIRST_NAME = "Lily";

        final int NUMBER = 10;

        System.out.println(name);
        System.out.println(FIRST_NAME);
        System.out.println(NUMBER);
        System.out.println(EMAIL);
        System.out.println(sumTwonumber(10,20));
        //Không thể thay đổi giá trị hằng số // NUMBER = 20;
    }

    // Method final thì không thể overwrite (ghi đè)
    public static final int sumTwonumber(int a, int b){
        return a +b;
    }
}
