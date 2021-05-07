package chapter12.deprecated;

// Анотацията отбелязва класът, като не препоръчван за използване
@Deprecated
public class MyClass {
    private String message;

    MyClass(String message) {
        this.message = message;
    }

    // Анотацията указва остарял метод, който не се препоръчва за използване
    @Deprecated
    String getMessage() {
        return message;
    }
}
