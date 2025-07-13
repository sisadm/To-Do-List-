public class Main {

    public static void main(String[] args) {
        Task task = new Task();
        String[] list = task.tasksList();
        for(String l: list) {
            System.out.println(l);
        }
    }
}
