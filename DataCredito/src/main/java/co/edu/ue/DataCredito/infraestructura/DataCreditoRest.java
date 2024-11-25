package co.edu.ue.DataCredito.infraestructura;

import co.edu.ue.DataCredito.domain.DataCredito; 
import co.edu.ue.DataCredito.domain.DataCreditoService; 
import java.util.List; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.CrossOrigin; 
import org.springframework.web.bind.annotation.GetMapping; 
import org.springframework.web.bind.annotation.PathVariable; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody; 
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.RestController; 

@CrossOrigin(origins = "*", maxAge = 3600) 
@RestController 
@RequestMapping({"/datacredito"}) 

public class DataCreditoRest {
    
     @Autowired 
    DataCreditoService service; 
 
        @GetMapping("/datacredito")
    public List<DataCredito> listar() {
        return service.listar();
    }

    @PostMapping("/datacredito/add")
    public DataCredito agregar(@RequestBody DataCredito p) {
        return service.add(p);
    }

    @GetMapping("/datacredito/{id}")
    public DataCredito listarId(@PathVariable("id") int id) {
        return service.listarId(id);
    }

    @PutMapping("/datacredito/{id}")
    public DataCredito editar(@RequestBody DataCredito p, @PathVariable("id") int id) {
        p.setId_datacredito(id);
        return service.edit(p);
    }
    
    @DeleteMapping("/datacredito/{id}")
    public DataCredito delete(@PathVariable("id") int id) {
        return service.delete(id);
    }
    
    
}
