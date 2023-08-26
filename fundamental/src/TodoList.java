public class TodoList {

    public static String[] model = new String[10];

    public static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        viewShowTodoList();
    }

    public static void showTodoList() {
        int totalNull = 0;
        System.out.println("Aplikasi Terminal Todo List");
        int numbering = 0;
        for(int i=0;i<model.length;i++){
            String todo = model[i];
            if(todo != null) {
                numbering++;
                System.out.println(numbering + " ." + model[i]);
            } else {
                totalNull++;
            }
        }
        if(totalNull == model.length){
            System.out.println("Belum ada todo untuk saat ini");
        }
    }

    public static void addTodoList(String todo){
        boolean isModelFull = true;

        for(String item: model){
            if(item == null){
                isModelFull = false;
                break;
            }
        }

        if(!isModelFull){
            for(int i=0;i<model.length;i++){
                if(model[i] == null){
                    model[i] = todo;
                    break;
                }
            }
        }
    }

    public static boolean removeTodo(Integer number) {
        if(number > model.length - 1) return false;
        else if(model[number-1] == null) return false;
        else {
            model[number-1] = null;
            return true;
        }
    }

    public static String input() {
        String data = scanner.nextLine();
        return data;
    }

    public static void viewShowTodoList(){
        while(true){
            showTodoList();

            System.out.println("MENU");
            System.out.println("1. Tambah todo");
            System.out.println("2. Hapus todo");
            System.out.println("3. Keluar");
            System.out.print("Silahkan pilih menu di atas: ");

            String data = input();

            switch (data) {
                case "1":
                    viewAddTodoList();
                    break;
                case "2":
                    viewDeleteTodoList();
                    break;
                default:
                    return;

            }
        }
    }

    public static void viewAddTodoList() {
        System.out.println("MENAMBAHKAN TODO");
        System.out.print("Masukan todo : ");

        String todo = input();

        switch (todo){
            case "x":
                break;
            default:
                addTodoList(todo);
        }
    }

    public static void viewDeleteTodoList() {
        System.out.println("MENGHAPUS TODO");
        System.out.print("Masukan nomor berapa yang akan dihapus: ");

        String number = input();

        if(number.equals("x")){

        } else {
            boolean success = removeTodo(Integer.valueOf(number));
            if(!success) {
                System.out.println("Gagal untuk menghapus nomor ke " + number);
            }
        }


    }
}
