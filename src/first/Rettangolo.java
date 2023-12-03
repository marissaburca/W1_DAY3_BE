package first;

public class Rettangolo {
    private int height;
    private int width;


    public Rettangolo(int height, int width){
        this.height= height;
        this.width= width;
    }


    //metodi di istanza
    public int perimeter(){

        return (height+width)*2;
    }
    public int area(){

        return height*width;
    }


}
