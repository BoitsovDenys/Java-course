public class Main {

    public static void main(String[] args) {
        int x = 1/0;
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(model, view);
        controller.processUser();
    }
}
