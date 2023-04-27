import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        boolean r1 = false;
        int numDay = 0;
        double costDay = 0;
        System.out.print("Enter number of Days and  single Day Cost: ");
        while (!r1) {
            String temp = user.nextLine();
            if (temp.matches("\\d+\\s+\\d+(\\.\\d+)?")) {
                String[] templist = temp.split(" ");
                numDay = Integer.parseInt(templist[0]);
                costDay = Double.parseDouble(templist[1]);
                r1 = true;
            } else {
                System.out.println("Invalid Input");
                System.out.print("Enter number of Days and  single Day Cost: ");
            }
        }
        System.out.println(numDay+"\n"+costDay);
    }
}
