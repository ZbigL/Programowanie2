package pl.sdaacademy.intermediate.basic.basic5Inheritance;

public class BackendDeveloper extends Developer {
    private String backendLanguage;

    public BackendDeveloper(String name, String company, double salary, String backendLanguage) {
        super(name, company, salary);
        this.backendLanguage = backendLanguage;
    }

    @Override
    public void makeCode() {
        System.out.printf("\n%s is coding for %s for %.2f PLN in %s", super.name, super.company, super.salary, backendLanguage);
    }
}
