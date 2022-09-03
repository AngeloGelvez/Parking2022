package com.turboparking.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller //Indico que esta clase va actuar como Controlador, Es decir una clase Controlador
public class ControladorPrincipal {
    
    // URL http://localhost:8080/
    @GetMapping("/") 
    /*
    *Esto hace que la pagina web arranque con el archivo index.html, es decir
    que con la URL que indicamos en GetMapping ("/") arranca mi archivo index
    */
    public String cargarIndex() {
        return "index";
    }
    
    // URL http://localhost:8080/login
    @GetMapping("/inicio-sesion")
    public String cargarInicioSesion() {
        return "iniciosesion";
    }
}
