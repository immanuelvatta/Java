class Tesla{

    private String model;
    private int year;
    private String color;
    private boolean hasAutoPilot;
    private double mileage = 0;
    private static String CEO = "Elon Musk";
    private static int totalTeslas = 0;

    public void drive(){
        this.mileage += 10;
        System.out.println("woosh");
        System.out.printf("Your tesla now has %.2f miles on it.\n", this.mileage);
    }

    public void drive(double miles){
        this.mileage += miles;
        System.out.println("woosh");
        System.out.printf("Your tesla now has %.2f miles on it.\n", this.mileage);
    }

    public Tesla(String model, int year, String color, boolean hasAutoPilot, double mileage) {
        this.model = model;
        this.year = year;
        this.color = color;
        this.hasAutoPilot = hasAutoPilot;
        this.mileage = mileage;
    }

    public Tesla(){}

    public static void displayCEO(){
        System.out.println(Tesla.CEO);
    }


    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getMileage() {
        return this.mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isHasAutoPilot() {
        return this.hasAutoPilot;
    }

    public boolean getHasAutoPilot() {
        return this.hasAutoPilot;
    }

    public void setHasAutoPilot(boolean hasAutoPilot) {
        this.hasAutoPilot = hasAutoPilot;
    }


    @Override
    public String toString() {
        return "{" +
            " model='" + getModel() + "'" +
            ", year='" + getYear() + "'" +
            ", color='" + getColor() + "'" +
            ", hasAutoPilot='" + isHasAutoPilot() + "'" +
            ", mileage='" + getMileage() + "'" +
            "}";
    }


}