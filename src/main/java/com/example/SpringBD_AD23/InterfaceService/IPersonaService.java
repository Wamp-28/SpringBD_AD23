package com.example.SpringBD_AD23.InterfaceService;

import com.example.SpringBD_AD23.Model.Persona;

import java.util.List;
import java.util.Optional;

public interface IPersonaService {

    // AQUI SE VAN A CREAR TODOS LOS METODOS QUE VOY A UTILIZAR


    public List<Persona> listar();

    public void guardar(Persona per);

    public Optional<Persona> editar(int id);

    public void eliminar(int id);
}
