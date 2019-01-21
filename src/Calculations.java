public class Calculations {

    public boolean isRightTriangel(Triangle triangle) {
        double a = Math.pow(triangle.getBokA(), 2);
        double b = Math.pow(triangle.getBokB(), 2);
        double c = Math.pow(triangle.getBokC(), 2);
        return a == b + c || b == a + c || c == a + b;
    }


}
