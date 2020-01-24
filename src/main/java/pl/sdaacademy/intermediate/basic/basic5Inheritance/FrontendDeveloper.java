package pl.sdaacademy.intermediate.basic.basic5Inheritance;

public class FrontendDeveloper extends Developer {
    String javaScriptFramework;

    public FrontendDeveloper(String name, String company, double salary, String javaScriptFramework) {
        super(name, company, salary);
        this.javaScriptFramework = javaScriptFramework;
    }

    @Override
    public void makeCode() {
        System.out.printf("\n%s is coding for %s for %.2f PLN in %s", super.name, super.company, super.salary, javaScriptFramework);
    }
}
