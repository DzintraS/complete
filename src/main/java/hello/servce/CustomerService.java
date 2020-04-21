package hello.servce;

import hello.model.Customer;
import hello.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CustomerService {

    @Autowired
    CustomerRepository customerRepository;



    @Transactional
    public  List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    public  List<Customer> getById(){
        return customerRepository.findById();
    }
    //TODO: Implement methods for each controller method. Note that each of them has to call different method from Service.
}
