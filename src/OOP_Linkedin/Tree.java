package OOP_Linkedin;

//With the Tree class we are able to define a series of attributes and behaviors that are reusable.

import java.awt.*;

public class Tree {
    private double heightFt;
    private double trunkDiameterInches;
    private TreeType treeType;
    protected static Color TRUNK_COLOR = new Color(102,51,0); //Static attribute

    public Tree(double heightFt, double trunkDiameterInches, TreeType treeType) {
        this.heightFt = heightFt;
        this.trunkDiameterInches = trunkDiameterInches;
        this.treeType = treeType;
    }

    public double getHeightFt() {
        return heightFt;
    }

    public double getTrunkDiameterInches() {
        return trunkDiameterInches;
    }

    public TreeType getTreeType() {
        return treeType;
    }

    public void setTrunkDiameterInches(double trunkDiameterInches) {
        this.trunkDiameterInches = trunkDiameterInches;
    }

    public void grow(){
        this.heightFt = this.heightFt + 10;
        this.trunkDiameterInches = this.trunkDiameterInches + 1;
    }

    public void announceTallTree(){
        if(this.heightFt > 100){
            System.out.println("That's a tall " + this.treeType + " tree...");
        }
    }

    static void announceTree(){
        System.out.println("Look out for that tree!");
    }

}
