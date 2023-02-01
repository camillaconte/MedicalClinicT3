package team3.dati;

/**
 * @author LucaGiorgi
 */
public class Employee extends User{
    private EmployeeBadge employeeBadge;
    private Contract contract;

    //Costruttore
    public Employee() {}

    //Get e Set
    public EmployeeBadge getBadge() {
        return employeeBadge;
    }

    public void setBadge(EmployeeBadge employeeBadge) {
        this.employeeBadge = employeeBadge;
    }

    public Contract getContract() {
        return contract;
    }

    public void setContract(Contract contract) {
        this.contract = contract;
    }

}

