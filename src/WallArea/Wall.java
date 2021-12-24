package WallArea;

public class Wall {
    private double height;
    private double width;

    public Wall() {
        this(0,0); //here we have a "this()" call used only in the constructor that is going to be overloaded and it
        // has to be the first parameter of the constructor.
    }

    public Wall(double width, double height) {
        if(this.width < 0){
          this.width = 0;
        } else {
        this.width = width;
        }
        if(this.height < 0){
            this.height= 0;
        } else{
        this.height = height;
        }
    }
    public double getWidth(){
        return width;
    }
    public double getHeight(){
        return height;
    }
    public void setWidth(double width){
        if(width < 0){
            this.width = 0;
        } else{
        this.width = width;
        }
    }
    public void setHeight(double height){
        if(height < 0){
            this.height = 0;
        } else{
        this.height = height;
        }
    }
    public double getArea(){
        return height * width; //we do not need the "this" keyword here since we are not having any parameters to
        // distinguish like we do in the setters. Remember that's the main purpose of the "this" keyword here.
    }
}
