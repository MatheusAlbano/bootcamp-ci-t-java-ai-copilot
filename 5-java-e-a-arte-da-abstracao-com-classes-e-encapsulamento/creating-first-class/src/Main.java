
public class Main {

    public static void main(String[] args) {
        var male = new Person("João", 20);
        var female = new Person("Maria", 25);
        male.setName("Matheus");
        male.setAge(16);
        female.setName("Ana");
        female.setAge(22);
        System.out.println("Male name: " + male.getName() + " age: " + male.getAge());
        System.out.println("Female name: " + female.getName() + " age: " + female.getAge());

    }
}
