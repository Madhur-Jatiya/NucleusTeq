package generic;

public class Generic<Type> {
    Type temp;

    public Generic(Type temp) {
        this.temp = temp;
    }

    public Type getTemp() {
        return this.temp;
    }
}
