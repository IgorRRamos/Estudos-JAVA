package com.example.agendaTelefonica.controller;

import com.example.agendaTelefonica.dtos.ContatosRequestsDTO;
import com.example.agendaTelefonica.dtos.ContatosResponseDTO;
import com.example.agendaTelefonica.repository.ContatoRepository;
import com.example.agendaTelefonica.service.ContatoService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/Contato")

public class ContatoController {
    private final ContatoService service;
    public ContatoController(ContatoService service){
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<ContatosResponseDTO> create(@RequestBody @Valid ContatosRequestsDTO dto){
        ContatosResponseDTO response = service.create(dto);

        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @GetMapping("/all")
    public List<Map<String, Object>> getContato(){
        return List.of(
               Map.of("id", 1, "nome", "Igor", "numero", "29874329843247"),
               Map.of("id", 2, "nome", "Rafaela", "numero", "32492389402389" )
        );
    }


}
