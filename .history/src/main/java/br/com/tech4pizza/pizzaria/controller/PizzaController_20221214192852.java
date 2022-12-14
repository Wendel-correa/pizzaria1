package br.com.tech4pizza.pizzaria.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.tech4pizza.pizzaria.model.Pizza;
import br.com.tech4pizza.pizzaria.repository.PizzaRepository;


@RestController
@RequestMapping("/cardapio")
public class PizzaController {
  @Autowired
  private PizzaRepository repositorio;

  @PostMapping
  public Pizza cadastrarPizza(@RequestBody Pizza pizza){
    return repositorio.save(pizza);
  }

  @GetMapping
  public List<Pizza> obterCardapio() {
    return repositorio.findAll();
  }

  @DeleteMapping
      Public void excluirItem("/id"){
      return repositorio.delete();
      }
  
  /*@PutMapping 
      public Pizza modificarItem(){
      return repositorio.update();
      }
   

      */      

  }

