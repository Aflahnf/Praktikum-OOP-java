package UTS_PBO;

public class Circle {
    private  static int radius;
    private static int jml=0;

    public Circle(int r){
        radius = r;
        jml++; }

    public int getRadius(){
        return radius; }

    public int getJml(){
        return jml;}
}

class Test  {
    public static void main(String args[]) {
        Circle c1 = new Circle(5);
        Circle c2 = new Circle(10);
        System.out.print(c1.getRadius()+" ");
        System.out.print(c2.getRadius()+" ");
        System.out.print(c1.getJml()+" ");
        System.out.print(c2.getJml()+" ");}
}