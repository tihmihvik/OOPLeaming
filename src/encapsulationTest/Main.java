/*
package encapsulationTest;

public class Main {
    public static void main(String [] args){
        Person person = new Person(name: "Сергей", args: 28, adress: "ул. Пролетарская 25", phone: "89005555500");
        Fraction fraction = new Fraction(1,10)
    }
}

class Person{
    public String name;
    public int age;
    public String adress;
    private String phone;

    public Person(String name, int age, String adress, String phone) {
        this.name = name;
        this.age = age;
        this.adress = adress;
        this.phone = phone;
    }
    public void displayName(){
        System.out.printf("Name %s \n", name);
    }
    void displayAge(){
        System.out.printf("Age %d \n", age);
    }
    private void displayAdress(){
        System.out.printf("Adress %s \n", adress);
    }
    protected  void displayPhone(){
        System.out.printf("Phone %s \n", phone);
    }

}

class Fraction{
    int numerator;
    int denumerator=1;

    public Fraction(int numerator, int denumerator){
        if (denumerator = 0) {
            System.out.println("denumerator равен нулю.");
            return;
        }
        this.numerator = numerator;
        this.denumerator = denumerator;

    }
    class Person{
        private String firstName;
        private String lastName;
        private char gendr;
public Person(String lastName){
    this(lastName, firstName, gendr);
}

        public Person(String lastName, String firstName, char gendr){
            this.lastName = lastName;
            this.firstName = firstName;
            this.gendr = gendr;
        }

        public Person(String lastName, String firstName){
            this.lastName = lastName;
            this.firstName = firstName;
        }

        public Person(){
            this("","","");
        }
    }
}
*/
