public class SalariedEmployee extends Employee {
    int socialSecurityNumber;

    public SalariedEmployee(String name, int age) {
        super(name, age, (int)(Math.random()*9998)+1000, "socialSecurityNumber");
        this.socialSecurityNumber = super.getID();
    }

    public int getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    @Override
    public int getID() {
        return super.getID();
    }
}
