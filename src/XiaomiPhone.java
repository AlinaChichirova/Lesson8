public class XiaomiPhone extends Phone {


    public XiaomiPhone(String number, String model, String weight) {
        super(number, model, weight);
    }

    @Override
    public void info() {
        System.out.printf("Номер телефона: %s , модель: %s , вес: %s \n", this.getNumber(), this.getModel(), this.getWeight());
    }

    @Override
    public void receiveCall(Object name) {
        System.out.println("Вам звонит: "+ name);
    }
}