public class Calculations {

    public boolean isRightTriangel(Triangle triangle) {

        double a = Math.pow(2, triangle.getBokA());
        double b = Math.pow(2, triangle.getBokB());
        double c = Math.pow(2, triangle.getBokC());
        boolean isRightTriangel  = false;



        if (a == b + c || b == a + c || c == a + b) {
            isRightTriangel = true;
        }
        return isRightTriangel;
    }


}
