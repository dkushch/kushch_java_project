import java.util.List;
import java.util.Map;
import java.util.Random;

public class EmployeeActivity<T extends Employee> {

    public String caluclatePay(T employee){
        switch (employee.getIdType()){
            case "socialSecurityNumber":
                return employee.getIdType() + " " + employee.getID() + "\nage " + employee.getAge() + "\n" + calculateSallary(employee.getAge(), employee.getIdType(), 4) + "$";
            case "federalTaxIdmember":
                return employee.getIdType() + " " + employee.getID() + "\nage " + employee.getAge() + "\n" + calculateSallary(employee.getAge(), employee.getIdType(), 6) + "$";
            default:
                break;
        }
        return "Your id length incorrect";
    }
    private int calculateSallary(int age, String type, int length){
        int coefficient;
        int salary = 1000;
        if (length == 4){
            salary*=0.25;
        }
        if (age>=16 && age<=18){
            coefficient = (int)(Math.random() * 5) + 2;
            return salary*coefficient;
        }else if(age > 18){
            coefficient = (int)(Math.random() * 9) + 4;
            return salary*coefficient;
        }
        return salary;
    }
}
