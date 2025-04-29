
public class Class {



    public static void main(String[] args) {
        Pen newP = new Pen();
        newP.setColor("green");
        System.out.println(newP.color);
        newP.setTip(8);
        System.out.println(newP.tip);
    }
    
}

class Pen{

    String color ; 
    int tip;

    void setColor(String newColor){
     color = newColor;
    }
    void setTip(int newtip){
    tip = newtip; 
    }
}
