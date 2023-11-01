public class Main {
    public static void main(String[] args) {
        ApplePhone applePhone=new ApplePhone("8-999-99-99","iPhone 14", "1,2");
        SamsungPhone samsungPhone=new SamsungPhone("8-000-00-00", "Samsung Note", "2");
        XiaomiPhone xiaomiPhone=new XiaomiPhone("8-555-55-55","Xiaomi 12", "0,8");
        ApplePhone applePhone1=new ApplePhone("Ivan");
        SamsungPhone samsungPhone1=new SamsungPhone("Alina");
        XiaomiPhone xiaomiPhone1=new XiaomiPhone("Petr");
        applePhone.info();
        samsungPhone.info();
        xiaomiPhone.info();
        applePhone1.receiveCall();
        samsungPhone1.receiveCall();
        xiaomiPhone1.receiveCall();
        applePhone1.infoo();
        samsungPhone1.infoo();
        xiaomiPhone1.infoo();

    }
}