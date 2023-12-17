package Lab1.Foot;

import java.util.Scanner;

public class Foot {
    private FootShape fs ;
    Foot(FootShape fShape){
        this.fs = fShape;
    }
    public static String getShape() {
        String ShapeType = null;
        Scanner inp = new Scanner(System.in);
        System.out.print("What to draw? 1. Eclipse, 2. Rectangle  >>>>>>>> ");
        int type = inp.nextInt();
        switch(type) {
            case 1:
                ShapeType = "Eclipse";
                break;
            case 2:
                ShapeType = "Rectangle";
                break;
        }
        inp.close();
        return ShapeType;
    }
    public String drawShape() {
        return fs.draw();
    }
    public static void main(String[] args) {
        String footType = getShape();
        FootShape footShape  = null;
        switch(footType) {
            case "Rectangle":
                footShape = new Rectangle();
                break;
            case "Eclipse":
                footShape = new Eclipse();
                break;
        }
        Foot app = new Foot(footShape);
        System.out.println(app.drawShape());   
    }
}
