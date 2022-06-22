package javaApplicationAdapter;

public class JavaApplicationAdapter extends JavaApplication implements Database {
//class adaptor dont need nestet object

    @Override
    public void updateData() {
        updateJavaObject();
    }

    @Override
    public void insertData() {
       saveJavaObject();
    }

    @Override
    public void deleteData() {
        removeJavaObject();
    }

    @Override
    public void selectData() {
        loadJavaObject();
    }
}
