package repository;

import HW.rest.Hello;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;



public interface NumbersRepository extends JpaRepository<Hello, Long> {

    @Query(value =  "select * FROM public.Numbers n where input_number=?1 or input_number=?2", nativeQuery = true)
    List<Hello> findByFirstName(Long number1, Long number2);



}