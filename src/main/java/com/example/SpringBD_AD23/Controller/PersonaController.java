package com.example.SpringBD_AD23.Controller;


import com.example.SpringBD_AD23.InterfaceService.IPersonaService;
import com.example.SpringBD_AD23.Model.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping
public class PersonaController {

    @Autowired
    private IPersonaService servicio; // se debe inyectar la interface del servicio


    @GetMapping("/listar")
    public String listarPersona(Model modelo){

        modelo.addAttribute("titulo","DATOS ESTUDIANTES");
        modelo.addAttribute("datos",servicio.listar());

        return "index";
    }

    @GetMapping("/nuevo")
    public String agregarPersona(Model modelo){

        modelo.addAttribute("titulo","Nuevo");
        modelo.addAttribute("cuerpo","Usuario Nuevo");
        modelo.addAttribute("persona",new Persona());

        return "nuevo";

    }

    @PostMapping("/guardar")
    public String guardarPersona(@ModelAttribute Persona per){

        servicio.guardar(per);

        return "redirect:/listar";
    }

    @GetMapping("/editar/{id}")
    public String editarPersona(@PathVariable("id") int id, Model modelo){

        modelo.addAttribute("titulo","Editar");
        modelo.addAttribute("persona",servicio.editar(id));

        return "nuevo";

    }

    @GetMapping("/eliminar/{id}")
    public String eliminarPersona(@PathVariable("id") int id, Model modelo){

        servicio.eliminar(id);
        modelo.addAttribute("titulo","Eliminar");

        return "redirect:/listar";


    }











}
