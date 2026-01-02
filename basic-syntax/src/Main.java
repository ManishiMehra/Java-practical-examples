
import java.util.Scanner;
//RIGHT-HALF PYRAMID
//        *
//        **
//        ***
//        ****
//        *****
//        ******

/*

public class Main{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Please enter the number of rows: ");
        int n = scn.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        scn.close();
    }
}

 */



//NUMBER PRINTING IN HALF PYRAMID
//        1
//        12
//        123
//        1234
//        12345
//        123456

/*
public class Main{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Please enter the number of rows: ");
        int n = scn.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
        scn.close();
    }
}

 */



//number printing like 1 23 456 789
//        1
//        2 3
//        4 5 6
//        7 8 9 10
//        11 12 13 14 15
//        16 17 18 19 20 21

/*public class Main{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Please enter the number of rows: ");
        int n = scn.nextInt();
        int num = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++){
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
        scn.close();
    }
}

 */



// triangular pyramid
//                        1
//                       2 2
//                      3 3 3
//                     4 4 4 4
//                    5 5 5 5 5


/* public class Main{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("please enter the number of rows: ");
        int n = scn.nextInt();
        int i, j, s;
        for (i = 1; i <= n; i++){
            for (s = 1; s <= (n - i); s++){
                System.out.print(" ");
            }
            for (j = 1; j <= i; j++){
                System.out.print(i);
                if (j < i){
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }

}

 */





