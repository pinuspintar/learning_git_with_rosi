public class ManagerApp {
    public static void main(String[] args) {

     var manager = new Manager("Imam");
     manager.sayHello("Dimas");

     var vp =new VicePresident("Batar");
     vp.sayHello("Dimas");

        System.out.println(manager);
        System.out.println(vp);
    }
}
