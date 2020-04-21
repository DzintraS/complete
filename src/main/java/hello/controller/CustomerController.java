package hello.controller;


import hello.model.Customer;
import hello.servce.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.Collections;
import java.util.List;

@RestController
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @GetMapping("/")
    public List<Customer> hello() {
        return Collections.emptyList();
    }

    //TODO: All logic has to be implemented in service!

    //TODO: Create GET method that retrieves all customers
    @RequestMapping(value = "/getAllCustomers")
    public List<Customer> findAllCustomers(){
        return CustomerService.getAllCustomers();
    }
    //TODO: Create GET method that gets customer by its ID
    @RequestMapping(value = "/getId")

    public List<Customer> findDyId(int id
    @RequestParam()){
        return CustomerService.
    }
    //TODO: Create GET method that gets customer by search key (name, surname, etc.)

    //TODO: Create POST method to saves new customer

    //TODO: Create PUT method to update existing customer. Note! If user tries to update not existing customer, throw an exception

    //TODO: Create DELETE method that deletes customer by id

    //TODO: Create DELETE method that deletes customer by any other key

}
