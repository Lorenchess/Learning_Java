package OOP_Mosh;

//Encapsulation: Bundle the data/state and related methods/behavior that operate on the data in a single unit.

public class TextBox {
    private String text;

    public TextBox(String text) {
        this.text = text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void clear(){
        text = "";
    }

    @Override
    public String toString() {
        return "TextBox{" +
                "text='" + text + '\'' +
                '}';
    }
}
