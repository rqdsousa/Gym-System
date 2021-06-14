package com.gymSystem.apirestt.resources;


import com.gymSystem.apirestt.models.Informacoes;
import com.gymSystem.apirestt.repository.InformacoesRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@Api(value = "API REST informacoes")
@RestController
@RequestMapping(value= "/api*")
public class InformacoesResource {

    @Autowired
    InformacoesRepository informacoesRepository;

    @GetMapping("/informacoes")
    @ApiOperation(value="Retorna uma lista de Informacoes")
    public List<Informacoes> listInformacoes(){
        return informacoesRepository.Findall();
    }

    @GetMapping("/informacoes/{Id}")
    @ApiOperation(value="Retorna uma unica informacao")
    public Informacoes listaInformacoesUnica(@PathVariable(value = "id")long id){
        return informacoesRepository.FindById(id);
    }

    @PostMapping("/informacoes")
    @ApiOperation(value="Salva uma informacao")
    public Informacoes salvaInformacoes(@RequestBody Informacoes informacoes){
        return  informacoesRepository.save(informacoes);
    }

    @DeleteMapping("/informacoes")
    @ApiOperation(value="Deleta uma informacao")
    public void deleteInformacoes(@RequestBody Informacoes informacoes){
        informacoesRepository.delete(informacoes);
    }

    @PutMapping("/informacoes")
    @ApiOperation(value="Atualiza uma informacao")
    public Informacoes atualizaInformacoes(@RequestBody Informacoes informacoes){
        return informacoesRepository.save(informacoes);
    }

}

