package ScopeExample;

public class ScopeCheck {
    public int publicVar = 0;
    private int privateVar = 1;

    public ScopeCheck() {
        System.out.println("ScopeCheck created, publicVar = " + publicVar + ": privateVar= " + privateVar);
    }

    public int getPrivateVar() {
        return privateVar;
    }
    public void timesTwo(){
        int privateVar = 2;
        for (int i = 0; i < 10 ; i++) {
            System.out.println(i + " times two is " + i * privateVar);
            System.out.println(i + " times one is " + i * this.privateVar);
        }
    }

    public class InnerClass{
        public int privateVar = 3;

        public InnerClass() {
            this.privateVar = privateVar;
        }

        public int getPrivateVar() {
            return privateVar;
        }
        public void timesTwo(){

            for (int i = 0; i < 10 ; i++) {
                System.out.println(i + " times three is " + i * privateVar);
            }
        }
    }

}
