
// public class Main {

//     public static void newfun(Car c1name){
//         System.out.println(c1name.name);
//         System.out.println(c1name.price);

//     }

//     public static void main(String[] args) {
    
//         Car car1 = new Car();
//         car1.name = "Bmw";
//         car1.price = 10000;
//         newfun(car1);

//         // System.out.printf("Hello and welcome!");
//         // for(int i = 1; i <= 5; ++i) {
//         //     System.out.println(i);
//         // }
//     }
// }



public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("moiz", 20, "A");
        Student s2 = new Student("Aki", 19, "B");
        Student s3 = new Student("Ahmed", 17, "A+");

        s1.displayDetails();
        s2.displayDetails();
        s3.displayDetails();
    }
}

