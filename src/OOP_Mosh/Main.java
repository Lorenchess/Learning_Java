package OOP_Mosh;

public class Main {
    public static void main(String[] args) {
      /*  var textBox1 = new TextBox("");
        textBox1.setText("Box-1");
        System.out.println(textBox1);

        var textBox2 = new TextBox("");
        textBox2.setText("Box-2");

        textBox2 = textBox1;
        textBox2.setText("Our value is the same because we are reference types");

        System.out.println(textBox1);
        System.out.println(textBox2); */

        Employee employee1 = new Employee(50_000, 20);
        int wage = employee1.calculateWage(10);
        System.out.println(wage); //50200



    }
}
