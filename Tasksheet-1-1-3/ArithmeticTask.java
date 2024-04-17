public class Main {
    public static void main(String[] args) {
        int check_number=10;
        String message;

        for (int i = 1; i <= 10; i++) {
            System.out.println(message = (i%2==0) ? i+" is even number" : i+" is odd number");
        }
    }
}