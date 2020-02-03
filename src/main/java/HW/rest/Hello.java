package HW.rest;

public class Hello {
    private final long id;
    private final String content;
    private final Long number;

    public Hello(long id, String content, Long number) {
        this.id = id;
        this.content = content;
        this.number = number;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public Long getNumber() { return number; }
}
