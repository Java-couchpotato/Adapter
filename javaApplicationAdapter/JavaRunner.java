package javaApplicationAdapter;

public class JavaRunner {
    public static void main(String[] args) {

        Database database = new JavaApplicationAdapter();

        database.insertData();
        database.selectData();
        database.updateData();
        database.deleteData();
    }
}
