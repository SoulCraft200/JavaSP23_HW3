import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        boolean r2 = false;
        double rate;
        while(!r2) {
            System.out.print("Enter number of Days and  single Day Cost: ");
            String temp = user.next();
            if(temp.matches("\\d+(\\.\\d+)?")){
                rate = user.nextDouble();
                r2 = true;
            }else {
                System.out.println("Invalid Input");
            }
        }
        System.out.println(rate);
    }
}
