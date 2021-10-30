public class ContractEmployee extends Employee {
    private int federalTaxIdmember;

    public ContractEmployee(String name, int age) {
        super(name, age, (int)(Math.random()*999998)+100000, "federalTaxIdmember");
        this.federalTaxIdmember = super.getID();
    }

    public int getFederalTaxIdmember() {
        return federalTaxIdmember;
    }

    @Override
    public int getID() {
        return super.getID();
    }
}
