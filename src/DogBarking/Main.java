package DogBarking;

        public class Main {

            public static void main(String[] args) {
                dogTrouble(true, 10);
                System.out.println("-----");
                dogTrouble(true, 24);
                System.out.println("-----");
                dogTrouble(false, 24);
                System.out.println("-----");
                dogTrouble(true, 6);
                System.out.println("-----");

            }

            public static boolean dogTrouble(boolean barking, int hour) {
                if ((hour < 7 || hour > 20) && barking) {
                    System.out.println("The dog is barking, we are in trouble");
                }
                else {
                    System.out.println("Everything is fine");
                }
                return false;
            }

        }
