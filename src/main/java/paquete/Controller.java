package paquete;

import org.springframework.web.bind.annotation.*;
import java.util.*;


@RestController
public class Controller {

    //Añadí una funcionalidad extra de almacenar las personas en un array y poder mostrarla por get para practicar.
    ArrayList<persona> personas = new ArrayList<>();

    @GetMapping("/user")
    public String saludo (@RequestParam(value="name") String name) {
        return "Hola " + name;
    }

    @PostMapping("/useradd" )
    public persona add (@RequestBody persona payload) {
        persona nuevaPersona = payload;
        personas.add(payload);
        payload.edad += 1;
        return  payload;
    }

    @GetMapping("/lista")
    public ArrayList<persona> aaaa()  {
        return personas;
    }
}
