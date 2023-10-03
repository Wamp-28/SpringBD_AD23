package com.example.SpringBD_AD23.Service;

import com.example.SpringBD_AD23.InterfaceService.IPersonaService;
import com.example.SpringBD_AD23.Model.Persona;
import com.example.SpringBD_AD23.Repository.IPersona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonaService implements IPersonaService {

    @Autowired
    private IPersona repositorio;


    @Override
    public List<Persona> listar() {

        return repositorio.findAll();
    }

    @Override
    public void guardar(Persona per) {
        repositorio.save(per);
    }

    @Override
    public Optional<Persona> editar(int id) {
        return repositorio.findById(id);
    }

    @Override
    public void eliminar(int id) {
        repositorio.deleteById(id);
    }
}
