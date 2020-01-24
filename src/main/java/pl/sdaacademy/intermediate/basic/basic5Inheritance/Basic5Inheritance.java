package pl.sdaacademy.intermediate.basic.basic5Inheritance;

public class Basic5Inheritance {
    public static void main(String[] args) {
        Developer d1 = new BackendDeveloper("Piotr", "Ericson", 0.5, "Java");
        Developer d2 = new FrontendDeveloper("Adam", "SDA", 999.99, "Angular");
        Developer d3 = new MobileDeveloper("Ania", "Google", 100000, "Android");
        Developer d4 = new Developer("Jan", "SDA", 9000) {
            @Override
            public void makeCode() {
                System.out.printf("\nMusiałem zaimlementować matodę dla tego obiektu\n%s is coding for %s for %.2f PLN in %s", super.name, super.company, super.salary, "unknownLanguage");
            }
        };


        d1.makeCode();
        d2.makeCode();
        d3.makeCode();
        d4.makeCode();

    }
}
