//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Suv first = new Suv("first","firstModel:",2022,0);
        Hybrid second = new Hybrid("second", "secondModel",2025,0);
        second.foward();
        first.foward();
        System.out.println("Suv:"+first.getSpeed());
        System.out.println("Hybrid:"+second.getSpeed());
    }
}