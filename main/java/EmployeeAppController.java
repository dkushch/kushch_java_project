public class EmployeeAppController {
    public void run(){
        SalariedEmployee salariedEmployee1 = new SalariedEmployee("Salaried employee a", 17);
        SalariedEmployee salariedEmployee2 = new SalariedEmployee("Salaried employee b", 23);
        ContractEmployee contractEmployee1 = new ContractEmployee("Contract employee a", 18);
        ContractEmployee contractEmployee2 = new ContractEmployee("Contract employee b", 33);
        EmployeeActivity<Employee> activity = new EmployeeActivity<>();
        System.out.println(activity.caluclatePay(salariedEmployee1));
        System.out.println(activity.caluclatePay(salariedEmployee2));
        System.out.println(activity.caluclatePay(contractEmployee1));
        System.out.println(activity.caluclatePay(contractEmployee2));
    }
}
