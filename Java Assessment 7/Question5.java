class Driver{
    int vehicleNo,age;
    String name;
    Driver(int vehicleNo, int age, String name){
        this.vehicleNo = vehicleNo;
        this.age = age;
        this.name = name;
    }
}

class AgeNotWithinTheRange extends Exception{

}

public class Question5 {
    public static void main(String[] args){
        Driver d = new Driver(7890,10,"Kanthi");
        try {
            if (d.age <=18){
                throw new AgeNotWithinTheRange();
            }
            else {
                System.out.println("The age given is not within the range & the age is: " + d.age);
            }
        } catch (AgeNotWithinTheRange e){
            System.out.println("The age given "+ d.age +" is not within the range ");
        }
    }
}
