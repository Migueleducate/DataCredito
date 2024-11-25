package co.edu.ue.DataCredito.domain;

import java.util.List; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.stereotype.Service;

@Service 
public class DataCreditoServiceImp implements DataCreditoService {
    @Autowired
    private DataCreditoRepository repositorio;
    
    @Override
    public List<DataCredito> listar(){
        return repositorio.findAll();
    }
    @Override 
    public DataCredito listarId(int id) { 
        return repositorio.findById(id); 
    } 
 
    @Override 
    public DataCredito add(DataCredito p) { 
        return repositorio.save(p); 
    } 
 
    @Override 
    public DataCredito edit(DataCredito p) { 
        return repositorio.save(p); 
    } 
 
    @Override
    public DataCredito delete(int id) {
        DataCredito datacredito = repositorio.findById(id);
        if (datacredito != null) {
            repositorio.delete(datacredito);
        }
        return datacredito;
    }    
    
}
