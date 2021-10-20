package strategy;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Employee employee = new Employee("T3423",1000);
        Scanner clavier=new Scanner(System.in);
        while(true){
            System.out.print("Enter Strategy name:");
            String nomStrategy=clavier.next();
            if(nomStrategy.equals("quit")) break;
            try {
                Class c = Class.forName(nomStrategy);
                IEmployeeStrategy strategy = (IEmployeeStrategy) c.newInstance();
                employee.setEmployeeStrategy(strategy);
                System.out.println(employee.calculateIGR());
            } catch (Exception e) {
                System.out.println(e);
            } }
    }
}
