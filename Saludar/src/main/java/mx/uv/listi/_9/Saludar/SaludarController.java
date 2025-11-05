package mx.uv.listi._9.Saludar;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "*")
@RestController
public class SaludarController {

    Saludador s;

    @RequestMapping(value = "/obtener", method = RequestMethod.GET)
    public String obtener() {
        return "Método GET: obtener saludo";
    }

    @RequestMapping(value = "/crear", method = RequestMethod.POST)
    public String crear() {
        return "Método POST: crear saludo";
    }

    @RequestMapping(value = "/actualizar", method = RequestMethod.PUT)
    public String actualizar() {
        return "Método PUT: actualizar saludo";
    }

    @RequestMapping(value = "/eliminar", method = RequestMethod.DELETE)
    public String eliminar() {
        return "Método DELETE: eliminar saludo";
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home() {
        return "Bienvenido al controlador REST de saludos";
    }

    @RequestMapping(value = "/Saludar2/{nombre}", method = RequestMethod.GET)
    public Saludador saludarPath2(@PathVariable String nombre) {
        return new Saludador(nombre);
    }
    
    @GetMapping(value = {"/saludar1","/saludar1/{nombre}"})
    public Saludador saludar1(@PathVariable(required = false) String nombre) {
        if (nombre == null) {
            nombre = "Mundo";
        }
        return new Saludador("Hola " + nombre);
    }

    @PostMapping("/crearSaludo")
    public String saludoCreaer(@RequestBody Saludador parametro){
        System.out.println(parametro.getContenido());
        s = parametro;
        System.out.println(parametro.getContenido());
        return "exito";
    }
    @GetMapping("/obtenerSaludo")
    public Saludador saludadorObtener(){
        return s; 
    }

    // --recepción de parámetros por query string--
    @GetMapping("/query")
    public void saludarQuery(@RequestParam String nombre) {
        System.out.println(nombre);     
    }

    

    
}
