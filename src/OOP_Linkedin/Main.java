package OOP_Linkedin;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Tree myFavoriteOakTree = new Tree(125,5,TreeType.OAK);
        var myFavoriteMapleTree = new Tree(90,30,TreeType.MAPLE);

        System.out.println(myFavoriteMapleTree.getTreeType()); //MAPLE
        System.out.println(myFavoriteMapleTree.getHeightFt()); //90.0
        System.out.println(myFavoriteMapleTree.getTrunkDiameterInches()); //30.0

        myFavoriteMapleTree.grow();
        System.out.println(myFavoriteMapleTree.getHeightFt()); //100.0

        myFavoriteOakTree.announceTallTree();
        myFavoriteMapleTree.announceTallTree();
        //With the tree instances we are able to keep track of the current state of the instances.

        System.out.println(Tree.TRUNK_COLOR);

        Tree.announceTree();

        Color myTrunkColor = Tree.TRUNK_COLOR;
        Color myDefaultWhite = Color.WHITE; //using the static attribute to generate a default white color
        Color myDefaultBlue = Color.BLUE;

        Color brighterBlue = myDefaultBlue.brighter();

        ///Employee challenge
        Employee employee1 = new Employee("Ramon", 36,45500,Profession.CHESS_TEACHER,Location.FRANKLIN_ACADEMY);
        Double annualRaise = employee1.raiseSalary(1000);
        System.out.println(annualRaise);

    }
}
