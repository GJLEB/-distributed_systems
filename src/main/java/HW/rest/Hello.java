package HW.rest;

public class Hello {
    private final long id;
    private final Long number;

    public Hello(long id, Long number) {
        this.id = id;
        this.number = number;
    }

    public long getId() {
        return id;
    }

    public Long getNumber() { return number; }
}
