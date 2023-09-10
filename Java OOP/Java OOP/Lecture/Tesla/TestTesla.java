public class TestTesla {
    public static void main(String[] args) {
        
        Tesla tesla = new Tesla();
        System.out.println(tesla.getModel());
        Tesla immanuelsTesla = new Tesla();
        System.out.println(tesla == immanuelsTesla);
        // we dont want other parts of the program/parts of program to change thee values.
        immanuelsTesla.setYear(2023);

        System.out.println(immanuelsTesla.getYear());
        immanuelsTesla.drive();
        System.out.println(immanuelsTesla.getMileage());
        Tesla tomsTesla = new Tesla("S", 2023, "White", true, 0);
        System.out.println(tomsTesla);
        tomsTesla.drive(20.2);
        System.out.println(tomsTesla);
        Tesla.displayCEO();
    }
}
