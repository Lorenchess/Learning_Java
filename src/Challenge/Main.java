package Challenge;

import java.util.Scanner;


        class Main {
            private static int numberOfCups;
            private static boolean isWeekend;
            private static int A;
            private static int B;
            private static int C;
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
//                numberOfCups = scanner.nextInt();
//                isWeekend = scanner.nextBoolean();
//
//                print(10,true);

                A = scanner.nextInt();
                scanner.nextLine();
                B = scanner.nextInt();
                scanner.nextLine();
                C = scanner.nextInt();

                if(A + B > C && A + C > B && B + C > A){
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
            public static boolean print( int numberOfCups, boolean isWeekend){
                if(!isWeekend && numberOfCups >= 10 && numberOfCups <=20 ){
                    System.out.println("The party was successful");
                    return true;
                } else if (isWeekend && numberOfCups >= 15 && numberOfCups <=25 ){
                    System.out.println("The party was successful");
                    return true;
                } else {
                    System.out.println("The party was not successful");
                    return false;
                }
            }
        }


