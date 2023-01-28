import org.springframework.beans.factory.BeanFactory;

public class Main {
    public BeanFactory context;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void show() {
        System.out.println("Hello");
    }
}
