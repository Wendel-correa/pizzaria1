package br.com.tech4pizza.pizzaria.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.tech4pizza.pizzaria.model.Pizza;
//import br.com.tech4pizza.pizzaria.repository.PizzaRepository;


@RestController
@RequestMapping("/cardapio")
public class PizzaController {
  @Autowired
  privete Pizza 
  
  @PostMapping
  public Pizza cadastrarPizza(@RequestBody Pizza pizza){
    
  }

  @GetMapping
  public List<Pizza> obterCardapio() {
    
  }

  @GetMapping("/{id}")
  public Optional<Pizza> obterPizza(@PathVariable String id) {
    
  }

  @DeleteMapping("/{id}")
      public void excluirPizza(@PathVariable String id){
      
      }
  
  @PutMapping ("/{id}")
      public Pizza atualizarPizza(@PathVariable String id, @RequestBody Pizza pizza ){
        
      
      }    

  }

