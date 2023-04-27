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
            String temp2 = user.nextLine();
            switch (temp2) {
                case "1" -> choiceOne(user, bookings);
                case "2" -> choiceTwo(user, bookings);
                case "3" -> choiceThree(user, bookings);
                case "4" -> choiceFour(user, bookings);
                case "5" -> exit = true;
                default -> System.out.println("Invalid choice....");
            }
            System.out.println("Thank you for using  OIEC booking system.");
        }
    }
    public static void choiceOne(Scanner user, BookingManager bookings){
        boolean correct = false;
        while(!correct) {
            System.out.print("Input the type of booking (H)alls or (P)avilions : ");
            String temp1 = user.nextLine().trim();
            if(temp1.equalsIgnoreCase("h")){
                boolean r1 = false;
                int numDay = 0;
                double costDay = 0;
                System.out.print("Enter number of Days and  single Day Cost: ");
                while(!r1){
                    String temp = user.nextLine().trim();
                    if(temp.matches("\\d+\\s+\\d+(\\.\\d+)?")){
                        String[] templist = temp.split(" ");
                        numDay = Integer.parseInt(templist[0]);
                        costDay = Double.parseDouble(templist[1]);
                        r1 = true;
                    }else {
                        System.out.println("Invalid Input");
                        System.out.print("Enter number of Days and  single Day Cost: ");
                    }
                }
                boolean r2 = false;
                double rate = 0;
                System.out.print("Enter discount rate: ");
                while(!r2) {
                    String temp = user.nextLine().trim();
                    if(temp.matches("\\d+(\\.\\d+)?")){
                        rate = Double.parseDouble(temp);
                        r2 = true;
                    }else {
                        System.out.println("Invalid Input");
                        System.out.print("Enter discount rate: ");
                    }
                }
                bookings.addBooking("h",numDay,costDay,rate);
                System.out.println(bookings.getLast());
                correct = true;
            }else if(temp1.equalsIgnoreCase("p")){
                boolean r1 = false;
                int numDay = 0;
                double costDay = 0;
                System.out.print("Enter number of Days and  single Day Cost: ");
                while(!r1){
                    String temp = user.nextLine().trim();
                    if(temp.matches("\\d+\\s+\\d+(\\.\\d+)?")){
                        String[] templist = temp.split(" ");
                        numDay = Integer.parseInt(templist[0]);
                        costDay = Double.parseDouble(templist[1]);
                        r1 = true;
                    }else {
                        System.out.println("Invalid Input");
                        System.out.print("Enter number of Days and  single Day Cost: ");
                    }
                }
                boolean r2 = false;
                int sec = 0;
                System.out.print("Enter number of sections: ");
                while(!r2) {
                    String temp = user.nextLine().trim();
                    if(temp.matches("\\d")){
                        sec = Integer.parseInt(temp);
                        r2 = true;
                    }else {
                        System.out.println("Invalid Input");
                        System.out.print("Enter number of sections: ");
                    }
                }
                bookings.addBooking("p",numDay,costDay,sec);
                System.out.println(bookings.getLast());
                correct = true;
            } else {
                System.out.println("Booking not recognized. Try again.");
            }
        }
    }

    public static void choiceTwo(Scanner user,BookingManager bookings){
        boolean r1 = false;
        int id = 0;
        System.out.print("input reservationID: ");
        while(!r1) {
            String temp = user.nextLine().trim();
            if(temp.matches("\\d")){
                id = Integer.parseInt(temp);
                r1 = true;
            }else {
                System.out.println("Invalid Input");
                System.out.print("input reservationID : ");
            }
        }
        System.out.println(bookings.specBooking(id));
    }
    public static void choiceThree(Scanner user,BookingManager bookings){
        boolean r1 = false;
        int id = 0;
        System.out.print("input reservationID: ");
        while(!r1) {
            String temp = user.nextLine().trim();
            if(temp.matches("\\d")){
                id = Integer.parseInt(temp);
                r1 = true;
            }else {
                System.out.println("Invalid Input");
                System.out.print("input reservationID : ");
            }
        }
        System.out.println(bookings.cancelBooking(id));
    }
    public static void choiceFour(Scanner user,BookingManager bookings){
        System.out.println(bookings.displayBooking());
    }
}