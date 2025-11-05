package mx.uv.listi._9.Saludar;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class SaludadorPlantilla {
    
    @GetMapping("/plantilla")
    public String plantilla(Model m){
        m.addAttribute("Persona", "Default Name ");
        return "Plantilla.html";
    }

    @GetMapping("/plantilla/{nombre}")
    public String plantilla2(@PathVariable String nombre, Model m){

        m.addAttribute("Persona", nombre);
        return "Plantilla.html";
    }

}
