package Shape;

public class Rectangle {

    //state
        private int length;
        private  int width;

    //creation
    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    //operations
    public int areaCalculation(){
        return length*width;
    }

    public int perimeter(){
        return 2*(length+width);
    }

    public  String toString(){
        return String.format("%d %d %d %d", length,width,areaCalculation(),perimeter());
    }



}
