
public class Main {

    public static void newfun(Car c1name){
        System.out.println(c1name.name);
        System.out.println(c1name.price);

    }

    public static void main(String[] args) {
    
        Car car1 = new Car();
        car1.name = "Bmw";
        car1.price = 10000;
        newfun(car1);

        // System.out.printf("Hello and welcome!");
        // for(int i = 1; i <= 5; ++i) {
        //     System.out.println(i);
        // }
    }
}


