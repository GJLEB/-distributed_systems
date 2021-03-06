package HW.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import repository.NumbersRepository;
import logic.Back;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class GreetingController {

    @Autowired
    private NumbersRepository numbersRepository;

    @PostMapping(path="/add")
    public ResponseEntity addValue (@RequestBody Long number){

        if (numbersRepository.findByFirstName(number,number-1).isEmpty()){
            Hello hello = new Hello(number,number+1L);
            numbersRepository.save(hello);
            return ResponseEntity.ok(hello.getOutputNumber());
        }
        else
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Wrong number!!!");
    }

}

//    @GetMapping(params = "/get")
//    public String a (){
//        return numbersRepository.findById(1).toString();
//    }


