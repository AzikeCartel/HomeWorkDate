package ITscoolMegacom.employeeBirthDate.operations;

import ITscoolMegacom.employeeBirthDate.Employee;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class BaseEmployee {

    Scanner scan = new Scanner(System.in);

    private Employee [] employees = new Employee[10];
    SimpleDateFormat birthDate = new SimpleDateFormat("dd.MM.yyyy");
    SimpleDateFormat todayIsBirthday = new SimpleDateFormat("dd.MM");

    public void startBirthDay() throws ParseException {
        for(int i=0; i<employees.length; i++){
            System.out.println("Enter name: ");
            String name = scan.next();
            System.out.println("Enter birth date (dd.MM.yyyy): ");
            String date = scan.nextLine();
            date = scan.nextLine();
            Employee employee = new Employee(name,birthDate.parse(date));
            employees[i]=employee;
        }
        for (int i=0;i< employees.length; i++){
            System.out.print(employees[i].getName()+" - ");
            System.out.println(birthDate.format(employees[i].getBirthDate()));
        }
    }
    public void todayIsBirthdays(){

        Date today = new Date();
        int j = 0;
        for (int i=0;i<employees.length; i++){
            if(todayIsBirthday.format(employees[i].getBirthDate()).equals(todayIsBirthday.format(today))){
                System.out.println(employees[i].getName());
                j++;
            }
        }
        if(j==0){
            System.out.println("no birthdays today!");
        }
    }
    public void tomorrowBirthday(){
        Date tomorrow = new Date(new Date().getTime()+86400000);
        int k =0;
        for(int i=0;i<employees.length;i++){
            if(todayIsBirthday.format(employees[i].getBirthDate()).equals(todayIsBirthday.format(tomorrow))){
                System.out.println(employees[i].getName());
                k++;
            }
        }
        if(k==0){
            System.out.println("no birthdays tomorrow!");
        }
    }
    public void averageAge(){
        int averageAge=0;
        for(int i=0;i< employees.length;i++){
            Date age1 = new Date();
            employees[i].setAge(age1.getYear()-employees[i].getBirthDate().getYear());
            averageAge = averageAge+employees[i].getAge();
        }
        System.out.println(averageAge/employees.length+" years average age of employees");
    }
    public void oldEstEmployee(){
        Date ageMax=employees[0].getBirthDate();
        for (int i=0;i<employees.length;i++){
            if(ageMax.after(employees[i].getBirthDate())){
                ageMax=employees[i].getBirthDate();
            }
        }
        for (int i=0;i<employees.length;i++){
            if(ageMax.equals(employees[i].getBirthDate())){
                System.out.println("oldest employee: ");
                System.out.println("name: "+employees[i].getName());
                System.out.println(" age: "+employees[i].getAge());
                System.out.println(" birthday: "+birthDate.format(employees[i].getBirthDate()));


            }
        }

    }
    public void peers(){

            for(int i = 0; i<employees.length;i++){
                for(int a=i+1; a<employees.length;a++){
                    if(i==a){
                        continue;
                    }
                    if(employees[i].getAge()==employees[a].getAge()) {
                        System.out.println("employees of the same age: ");
                        System.out.println("name: " + employees[i].getName() + " and " + employees[a].getName());
                        System.out.println("their age: " + employees[i].getAge());
                    }
                }
            }
    }


}

