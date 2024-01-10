package com.studing.controller;

import com.studing.dto.AlunosDTO;
import com.studing.infra.ResourceNotFoundException;
import com.studing.model.AlunosEntity;
import com.studing.repository.AlunoRepository;
import org.apache.coyote.Response;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.yaml.snakeyaml.events.Event;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping ("/alunos")
public class AlunosController {

    @Autowired
    private AlunoRepository alunoRepository;

    @GetMapping
    public List<AlunosEntity> listarTodos(){
        return alunoRepository.findAll();
    }
    @PostMapping
    public ResponseEntity<AlunosEntity> cadastrarNovo(@RequestBody AlunosDTO aluno){
        var AlunosEntity = new AlunosEntity();
        BeanUtils.copyProperties(aluno, AlunosEntity);
        return ResponseEntity.status(HttpStatus.CREATED).body(alunoRepository.save(AlunosEntity));

    }
    @GetMapping(path ="/{id}")
    public ResponseEntity<?> buscarPorId(@PathVariable("id") Long id){
        verificaSeAlunoExiste(id);
        Optional<AlunosEntity> alunosEntity = alunoRepository.findById(id);
        return new ResponseEntity<>(alunosEntity, HttpStatus.OK);
    }
    private void verificaSeAlunoExiste(Long id){
        if (!alunoRepository.findById(id).isPresent())
            throw new ResourceNotFoundException("Aluno não encontrado pelo id informado");

    }
}
