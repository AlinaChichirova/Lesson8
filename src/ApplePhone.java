public class ApplePhone extends Phone {

    public ApplePhone (String name){
        super(name);
    }

    public ApplePhone(String number, String model, String weight) {
        super(number, model, weight);
    }

    @Override
    public void info() {
        System.out.printf("Номер телефона: %s , модель: %s , вес: %s \n", this.getNumber(), this.getModel(), this.getWeight());
    }


    @Override
    public void receiveCall() {
        System.out.printf("Звонит: %s \n", this.getName());
    }
}
