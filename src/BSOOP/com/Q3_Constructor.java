package BSOOP.com;

class Cylinder {
    private int radius;
    private int height;

    public Cylinder(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    public int getRadius() {
        return radius;
    }

    public int getHeight() {
        return height;
    }

}

public class Q3_Constructor {
    public static void main(String[] args) {
        Cylinder obj = new Cylinder(9, 12);
        System.out.println(obj.getHeight());
        System.out.println(obj.getRadius());
    }
}