package com.Hosptial_Syneffo.Hospital.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Hosptial_Syneffo.Hospital.model.Paciente;
import com.Hosptial_Syneffo.Hospital.repository.PacienteRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/api/v1/pacientes")
public class PacienteController {

    @Autowired
    private PacienteRepository pacienteRespository;
    
    @GetMapping
    public List<Paciente> obtenerPaciente() {
        return pacienteRespository.obtenerPacientes();
    }
    
    @GetMapping("{rut}")
    public Paciente buscarPorRut(@RequestParam int rut) {
        return pacienteRespository.buscarPorRut(rut);
    }
    


}
