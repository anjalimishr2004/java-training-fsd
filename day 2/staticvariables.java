public class StaticVariableDemo {
    static int count = 0; // Static variable
    StaticVariableDemo() {
        count++;
     }
    public static void main(String[] args) {
        StaticVariableDemo obj1 = new StaticVariableDemo();
        StaticVariableDemo obj2 = new StaticVariableDemo();
        StaticVariableDemo obj3 = new StaticVariableDemo();
        System.out.println("Total objects created: " + StaticVariableDemo.count);}
    }

