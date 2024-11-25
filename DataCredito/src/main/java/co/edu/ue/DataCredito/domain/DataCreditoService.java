package co.edu.ue.DataCredito.domain;

import java.util.List;

public interface DataCreditoService {
    
    
    List<DataCredito> listar();

    DataCredito listarId(int id);

    DataCredito add(DataCredito p);

    DataCredito edit(DataCredito p);

    DataCredito delete(int id);
    
    
}
