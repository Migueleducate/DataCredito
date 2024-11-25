package co.edu.ue.DataCredito.domain;

import java.util.List; 
import org.springframework.data.repository.Repository; 


public interface DataCreditoRepository extends Repository<DataCredito, Integer> {
    
        List<DataCredito> findAll();

    DataCredito findById(int id);

    DataCredito save(DataCredito p);

    void delete(DataCredito p);
}
