package logic;


import HW.rest.Hello;
import repository.NumbersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class Back {


    @Autowired
    private NumbersRepository numbersRepository;


    public  ResponseEntity write(Long number){

        if (numbersRepository.findByFirstName(number,number-1).isEmpty()){
            Hello hello = new Hello(number,number+1L);
            numbersRepository.save(hello);
            return ResponseEntity.ok(hello.getOutputNumber());
        }
        else
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Wrong number!!!");
    }
}
