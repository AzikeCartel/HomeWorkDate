package ITscoolMegacom.employeeBirthDate.operations;

import ITscoolMegacom.MinimumDate;

import java.text.ParseException;
import java.util.Scanner;

public class MainMenu {
    Scanner scan = new Scanner(System.in);
    public void mainMenu() throws ParseException {
        while(true){
            System.out.println("hello, select an action: ");
            System.out.println("1 - search min Dates on array");
            System.out.println("2 - start program <birthdays>");
            System.out.println("0 - exit: ");
            String answer = scan.next();
            if(answer.equals("1")){
                minDateMenu();
            }
            else if(answer.equals("2")){
                birthdayMenu();
            }
            else if(answer.equals("0")){
                System.exit(0);
            }
        }
    }
    void minDateMenu() throws ParseException {
        while (true){
            MinimumDate minimumDate = new MinimumDate();
            minimumDate.startMinDate();
            System.out.println("0 - go to main menu: ");
            String answer = scan.next();
            if(answer.equals("0")){
                mainMenu();
            }
        }
    }
    void birthdayMenu() throws ParseException {
        BaseEmployee baseEmployee = new BaseEmployee();
        baseEmployee.startBirthDay();
        while(true){
        System.out.println("Select an action: ");
        System.out.println("1 - show birthdays today");
        System.out.println("2 - show birthdays tomorrow");
        System.out.println("3 - show average age of employees");
        System.out.println("4 - show old est employee");
        System.out.println("5 - show peers");
        System.out.println("0 - go to main menu: ");
        String answer = scan.next();
        if(answer.equals("1")){
            baseEmployee.todayIsBirthdays();
        }
        else if(answer.equals("2")){
            baseEmployee.tomorrowBirthday();
        }
        else if(answer.equals("3")){
            baseEmployee.averageAge();
        }
        else if(answer.equals("4")){
            baseEmployee.oldEstEmployee();
        }
        else if(answer.equals("5")){
            baseEmployee.peers();
        }
        else if(answer.equals("0")) {
            mainMenu();
        }
        }
    }



}
