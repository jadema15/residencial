package com.conjunto.conjunto.controller;

import com.conjunto.conjunto.models.DTO.PersonaDTO;
import com.conjunto.conjunto.services.IPersonaService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/persona")
public class PersonaController implements IPersonaService {

    private IPersonaService personaService;

    @Override
    @GetMapping()
    public List<PersonaDTO> getPersonaAll() {
        return personaService.getPersonaAll();
    }

    @Override
    @GetMapping("/by-id")
    public PersonaDTO getPersonaById(@RequestParam Long id) {
        return personaService.getPersonaById(id);
    }
}
