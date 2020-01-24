package pl.sdaacademy.intermediate.basic.basic5Inheritance;

public class MobileDeveloper extends Developer {
    String mobileOs;

    public MobileDeveloper(String name, String company, double salary, String mobileOs) {
        super(name, company, salary);
        this.mobileOs = mobileOs;
    }

    @Override
    public void makeCode() {
        System.out.printf("\n%s is coding for %s for %.2f PLN in %s", super.name, super.company, super.salary, mobileOs);
    }
}
