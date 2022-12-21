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
  public ResponseEntity<Pizza> obterPizza (@PathVariable String id) {
    Optional<Pizza> retorno = obterPizzaPorId(id);

    if (retorno.isPresent()){
      return new ResponseEntity<>(retorno.get(), HttpStatus.FOUND);
    }
    else{
    return new ResponseEntity<>(servico.obterPizzaPorId(id), HttpStatus.FOUND);
  }

  @DeleteMapping(value="/{id}")
      public ResponseEntity<Void> excluirPizza(@PathVariable String id){
        servico.excluirPizzaPorId(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
      
      }
  
  @PutMapping (value="/{id}")
      public ResponseEntity<Pizza> atualizarPizza(@PathVariable String id, @RequestBody Pizza pizza ){
        return new ResponseEntity<>(servico.AtualizartPizzaPorId(id, pizza), HttpStatus.ACCEPTED);
        
      
      }    

  }

