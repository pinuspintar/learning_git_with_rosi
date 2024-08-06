public class PolymorphmApp {
    public static void main(String[] args) {

        Employee employee= new Employee("Imam");
        employee.sayHello("Dimas");

        employee= new Manager("Imam");
        employee.sayHello("Dimas");

        employee=new VicePresident("Imam");
        employee.sayHello("Dimas");

        sayHello(new Employee("Imam"));
        sayHello(new Manager("Dimas"));
        sayHello(new VicePresident("Batar"));
    }

    static void sayHello(Employee employee){
        System.out.println("Hello" + employee.name);
    }

}
