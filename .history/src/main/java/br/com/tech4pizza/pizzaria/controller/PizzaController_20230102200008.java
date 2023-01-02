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
import br.com.tech4pizza.pizzaria.shared.PizzaDto;


@RestController
@RequestMapping("/cardapio")
public class PizzaController {
  @Autowired
  private PizzaService servico;
  
  @PostMapping
  public ResponseEntity<PizzaCompletoDto> cadastrarPizza(@RequestBody Pizza pizza){
    return new ResponseEntity<>(servico.cadastrarPizza(pizza),HttpStatus.CREATED);
  }

  @GetMapping
  public ResponseEntity<List<Pizza>> obterCardapio() {
    return new ResponseEntity<>(servico.obterTodasAsPizzas(), HttpStatus.OK);
    
  }

  @GetMapping(value="/{id}")
  public ResponseEntity<PizzaDto> obterPizza (@PathVariable String id) {
    Optional<PizzaDto> retorno = servico.ObterPizzaPorId(id);

    if (retorno.isPresent()){
      return new ResponseEntity<>(retorno.get(), HttpStatus.FOUND);
    }
    else{
    return new ResponseEntity<>(HttpStatus.NOT_FOUND);
     }
  }

  @DeleteMapping(value="/{id}")
      public ResponseEntity<Void> excluirPizza(@PathVariable String id){
        servico.excluirPizzaPorId(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
      
      }
  
      @PutMapping("/{id}")
      public ResponseEntity<Pizza> atualizarPizza(@PathVariable String id, @RequestBody Pizza pizza){
        Optional<Pizza> retorno = servico.atualizarPizzaPorId(id, pizza); 
    
        if (retorno.isPresent()) {
          return new ResponseEntity<>(retorno.get(), HttpStatus.ACCEPTED);
        } else {
          return new ResponseEntity<>(HttpStatus.NOT_ACCEPTABLE);
        }
        
      
      }    

  }

