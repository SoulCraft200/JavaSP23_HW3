import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BookingManager bookings = new BookingManager();
        System.out.println("**** Welcome to OIEC booking system  ****");
        boolean exit = false;
        while(!exit) {
            System.out.println("""
                        1  to make a booking
                        2  to check a specific booking  \s
                        3  to cancel a booking \s
                        4  to display all bookings\s
                        5  to exit\
                    """);
            Scanner user = new Scanner(System.in);
            System.out.print("Input your choice : ");
            if(user.next().equals("1")){
                boolean correct = false;
                while(!correct) {
                    System.out.print("Input the type of booking (H)alls or (P)avilions : ");
                    if(user.next().equalsIgnoreCase("h")){
                        boolean r1 = false;
                        int numDay;
                        double costDay;
                        while(!r1) {
                            System.out.println("Enter number of Days and  single Day Cost: ");
                            String temp = user.nextLine();
                            if(temp.matches("\\d+\\s+\\d+(\\.\\d+)?")){
                                String[] templist = temp.split(" ");
                                numDay = Integer.parseInt(templist[0]);
                                costDay = Double.parseDouble(templist[1]);

                                r1 = true;
                            }else {
                                System.out.println("Invalid Input");
                            }
                        }
                        boolean r2 = false;
                        double rate;
                        while(!r2) {
                            System.out.println("Enter number of Days and  single Day Cost: ");
                            String temp = user.nextLine();
                            if(temp.matches("\\d+(\\.\\d+)?")){
                                rate = Double.parseDouble(temp);
                                r2 = true;
                            }else {
                                System.out.println("Invalid Input");
                            }
                        }

                    }
                }
            }
        }
    }
}