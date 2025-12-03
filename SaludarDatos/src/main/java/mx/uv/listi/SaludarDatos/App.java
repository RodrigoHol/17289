package mx.uv.listi.SaludarDatos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
public class App {
    @Autowired
    Isaludadores isaludadores;

    @RequestMapping(value = "/saludar", method = RequestMethod.GET)
    public Iterable dameSaludo(){
        return isaludadores.findAll();
    }

    @RequestMapping(value = "/crearSaludo", method = RequestMethod.POST)
    public void crearSaludo(@RequestBody Saludadores saludadores){
        isaludadores.save(saludadores);
        
    }

    

}
