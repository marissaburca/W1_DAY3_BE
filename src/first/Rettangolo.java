package first;

public class Rettangolo {
    private int height;
    private int width;
    private int secondHeight;
    private int secondWidth;


    public Rettangolo(int height, int width){
        this.height= height;
        this.width= width;
    }
    public Rettangolo(int height1, int width1, int height2, int width2) {
        this.height = height1 ;
        this.width = width1 ;
        this.secondHeight = height2 ;
        this.secondWidth = width2 ;
    }
    public int perimeter(){
        return (height+width)*2;
    }
    public int area(){
        return height*width;
    }
    public int perimeter1(){
        return (secondHeight+secondWidth)*2;
    }
    public int area1(){
        return secondHeight*secondWidth;
    }
    public int perimeterTotal(){
        return (height+width)*2+(secondHeight+secondWidth)*2;
    }
    public int areaTotal(){
        return ((height*width)+(secondHeight*secondWidth));
    }
}
