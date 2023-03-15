package inheritance;

public class ParentClass extends Object {
    private String privateString;

    public ParentClass (String privateString) {
        super();
        this.privateString = privateString;
    }

    public String method1() {
        return privateString;
    }
}
