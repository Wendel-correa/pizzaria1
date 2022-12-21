package br.com.tech4pizza.pizzaria.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.tech4pizza.pizzaria.model.Pizza;
import br.com.tech4pizza.pizzaria.service.PizzaService;


@RestController
@RequestMapping("/cardapio")
public class PizzaController {
  @Autowired
  private PizzaService servico;
  
  @PostMapping
  public ResponseEntity<Pizza> cadastrarPizza(@RequestBody Pizza pizza){
    return new ResponseEntity<>(servico.cadastrarPizza(pizza),HttpStatus.CREATED);
  }

  @GetMapping
  public ResponseEntity<List<Pizza>> obterCardapio() {
    return new ResponseEntity<>(servico.obterTodasAsPizzas(), HttpStatus.OK);
    
  }

  @GetMapping(value="/{id}")
  public ResponseEntity<Pizza> o(@PathVariable String id) {
    return new ResponseEntity<>(servico.ObterPizzaPoiId(id);
    
  }

  @DeleteMapping("/{id}")
      public void excluirPizza(@PathVariable String id){
        servico.excluirPizzaPorId(id);
      
      }
  
  @PutMapping ("/{id}")
      public Pizza atualizarPizza(@PathVariable String id, @RequestBody Pizza pizza ){
        return servico.AtualizartPizzaPorId(id, pizza);
        
      
      }    

  }

