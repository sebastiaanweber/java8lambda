package nl.weber.defaults;

public interface Interface3 extends Interface2 {

    default void methodC() {
        System.out.println("Method C");
    }
}
