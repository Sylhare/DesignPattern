package main.color;

/**
 * Created by sylhare in 2017.
 */
public class Blue extends Color implements Paint {

    @Override
    public void fill() {
        System.out.println("Inside Blue::fill() method.");
    }

    @Override
    public String name() {
        return "Blue";
    }

    @Override
    public float price() {
        return 10.5f;
    }
}