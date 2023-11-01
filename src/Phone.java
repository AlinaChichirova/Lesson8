public abstract class Phone implements Callable, Informable{
    private String number;
    private String model;
    private String weight;
    private String name;

    public String getNumber() {
        return number;
    }
    public String getName() {
        return name;
    }
    public String getModel() {
        return model;
    }
    public String getWeight() {
        return weight;
    }


    public void Phone(){
        System.out.println("Iphone создан");
    }

    public Phone(String number, String model){
        this.number=number;
        this.model=model;
    }
    public Phone(String name){
        this.name=name;
    }

    public Phone(String number, String model, String weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }


    public void getNumber(String number){
        this.number=number;
        System.out.println("Номер телефона: " + number);
    }

    public abstract void info();
}
