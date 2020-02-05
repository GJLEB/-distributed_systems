package HW.rest;

import javax.persistence.*;

@Entity
@Table(name = "Numbers")
public class Hello {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    @Column
    private Long inputNumber;
    @Column
    private Long outputNumber;

    protected Hello() {}

    public Hello(Long inputNumber, Long outputNumber) {
        this.inputNumber = inputNumber;
        this.outputNumber = outputNumber;
    }

    @Override
    public String toString() {
        return String.format(
                "Hello[id=%d, inputNumber='%s', outputNumber='%s']",
                id, inputNumber, outputNumber);
    }

    public Long getId() {
        return id;
    }

    public Long getInputNumber() {
        return inputNumber;
    }

    public Long getOutputNumber() {
        return outputNumber;
    }
}