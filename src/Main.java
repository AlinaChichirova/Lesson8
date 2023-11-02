public class Main {
    public static void main(String[] args) {
        ApplePhone applePhone=new ApplePhone("8-999-99-99","iPhone 14", "1,2");
        SamsungPhone samsungPhone=new SamsungPhone("8-000-00-00", "Samsung Note", "2");
        XiaomiPhone xiaomiPhone=new XiaomiPhone("8-555-55-55","Xiaomi 12", "0,8");
        applePhone.info();
        samsungPhone.info();
        xiaomiPhone.info();
        applePhone.receiveCall("Алина");
        samsungPhone.receiveCall(123456789);
        xiaomiPhone.receiveCall(5454);
        applePhone.infoo();
        samsungPhone.infoo();
        xiaomiPhone.infoo();

    }
}