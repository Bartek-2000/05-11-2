public class Main {
    public static void main(String[] args) {
        Car car1 = new Car(3400, "Sedan");
        Car car2 = new Car(3400, "Combi");
        Car car3 = car2;

        System.out.println(car2.equals(car1));
    }


}
