package constructorTest;

public class Main {
    public static void main(String[] args){
        Fraction fr = new Fraction(1,2);
        fr.addToNumerator().addToNumerator().addToNumerator().addToNumerator().addToNumerator();

        Person oleg = new Person("Konin", "Oleg", 'm');
        System.out.println(oleg);
        Employe olga = new Employe("Svetova", "Olga", 'f', "buhgalter");

        System.out.println(olga);
        olga.tellMe();

    }
}
class Fraction{
    private int numerator; // Числитель
    private int denumerator; // Знаменатель.
    public Fraction(int numerator, int denumerator){
        if (denumerator == 0){
            System.out.println("denumerator равен нулю.");
            return;
        }
        this.numerator = numerator;
        this.denumerator = denumerator;
    }
    public Fraction addToNumerator(){
        this.numerator = numerator;
        return this;
    }
    public Fraction getObjetCurrent(){
        return this;
    }
}

class Person{
    protected String firstName;
    protected String lastName;
    protected char gendr;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public char getGendr() {
        return gendr;
    }

    public void setGendr(char gendr) {
        this.gendr = gendr;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gendr=" + gendr +
                '}';
    }

    public Person(String lastName){
        this("", "", '-');
    }

    public Person(String lastName, String firstName, char gendr){
        this(lastName, firstName);
        this.gendr = gendr;
    }

    public Person(String lastName, String firstName){
        this.lastName = lastName;
        this.firstName = firstName;
    }

    public Person(){
        this("","",'m');
    }
}

class Employe extends Person{
    protected  String dolzhnost;

    public Employe(String lastName, String firstName, char gendr, String dolzhnost) {
        super(lastName, firstName, gendr);
        this.dolzhnost = dolzhnost;
    }

    @Override
    public String toString() {
        return "Employe{" +

                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gendr=" + gendr +
                ", dolzhnost='" + dolzhnost + '\'' +
                '}';
    }
    public void tellMe(){
        System.out.println("Привет. Меня зовут Employ и мой класс - " + getClass());
    }
}

