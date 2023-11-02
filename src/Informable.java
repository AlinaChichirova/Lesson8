public interface Informable<T>{
    default <T>void infoo(){
        System.out.println("Default info");
    }
}
