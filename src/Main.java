public class Main {

    public static void main(String[] args) {


        Triangle triangle1 = new Triangle(15, 15, 15);
        Triangle triangle2 = new Triangle(5, 3, 4);

        Calculations calc = new Calculations();
        String info = triangle1.toString() +
                "\nTrójką prostakątny  - " + calc.isRightTriangel(triangle1);
        System.out.println(info);

        info = triangle2.toString() +
                "\nTrójką prostakątny  - " + calc.isRightTriangel(triangle2);

        System.out.println(info);


    }
}
