package section10Exercises;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import section10Exercises.entities.Employee;

public class SalaryIncrease {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Employee> employeeList = new ArrayList<Employee>();

        System.out.println("Quantos funcionarios serao cadastrados ?");
        
        while(!sc.hasNextInt()){
            sc.nextLine();
            System.out.println("Voce digitou um numero errado, por favor insira um numero inteiro !");
        }
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++){
            
            System.out.println("Insira o ID do funcionario.");
            while (!sc.hasNextInt()) {
                sc.nextLine();
                System.out.println("ID inválido! Por favor, digite um número inteiro.");
            }
            int id = sc.nextInt();
            sc.nextLine(); 

          
            System.out.println("Insira o nome do usuario");
            String name = sc.nextLine();

       
            System.out.println("Insira o salario do funcionario");
            while (!sc.hasNextDouble()) {
                sc.nextLine();
                System.out.println("Salário inválido! Por favor, digite um salário valido.");
            }
            double salary = sc.nextDouble();
            sc.nextLine(); 
                        
            Employee employee = new Employee(id, name, salary);
            employeeList.add(employee);
        }

        System.out.println("Qual funcionario tera seu salario aumentado [ID]?");
        while(!sc.hasNextInt()){
            sc.nextLine();
            System.out.println("Por favor, digite um ID de funcionario Valido.");
        }

        int employeeId = sc.nextInt();
        sc.nextLine();

        System.out.println("Quanto sera o aumento salario dele?");
        while(!sc.hasNextDouble()){
            sc.nextLine();
            System.out.println("Valor invalido, digite um valor valido [EX: 1.00]");
        }
        double salaryIncrease = sc.nextDouble();
        sc.nextLine();

        for (Employee corpo00 : employeeList){
            if (corpo00.getEmployeeId() == employeeId) {
                corpo00.salaryIncrease(salaryIncrease);
                System.out.println("Operacao Realizada !");
            }
        }

        for (Employee corpo00: employeeList){
            System.out.println(corpo00);
        }
        
        sc.close();
    
    }
}