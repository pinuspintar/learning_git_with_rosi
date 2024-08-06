public class PersonApp {
    public static void main(String[] args) {
        var person1= new Person("Imam","Kendal");

        System.out.println(person1.name);
        System.out.println(person1.addres);
        System.out.println(person1.country);

        person1.sayHello("Dimas");

        Person person2= new Person("Dimas");

        Person person3;
        person3=new Person();
        person3.name ="Batar";
        person3.sayHello("Jali");









    }
}
