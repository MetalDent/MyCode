import java.util.Scanner;

class calendar {

    public static void main(String[] args) {

    	Scanner in = new Scanner(System.in);

    	int yyyy = in.nextInt();
    	int mm = in.nextInt();
        int startDay = in.nextInt();
        int spaces = startDay-1;

        String[] months = {
                "",                               
                "January", "February", "March",
                "April", "May", "June",
                "July", "August", "September",
                "October", "November", "December"
            };

        int[] days = {
                0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
            };

        if((((yyyy % 4 == 0) && (yyyy % 100 != 0)) ||  (yyyy % 400 == 0)) && mm == 2)
        	days[mm] = 29;

        System.out.println("          "+ months[mm] + " " + yyyy);

        System.out.println("_____________________________________");
        System.out.println("   Sun  Mon Tue   Wed Thu   Fri  Sat");

        for(int i = 0; i < spaces; i++)
        	System.out.print("     ");
        
        for(int i = 1; i <= days[mm]; i++) {
            System.out.printf(" %3d ", i);
            if (((i + spaces) % 7 == 0) || (i == days[mm])) System.out.println();
        }

        System.out.println();
    }
}