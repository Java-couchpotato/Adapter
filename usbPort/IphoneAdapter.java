package usbPort;

public class IphoneAdapter implements USB{

    private Iphone iphone;

    public IphoneAdapter(Iphone iphone) {
        this.iphone = iphone;
    }

    @Override
    public void connect() {
        iphone.Itunes();
        iphone.appleID();
    }
}
