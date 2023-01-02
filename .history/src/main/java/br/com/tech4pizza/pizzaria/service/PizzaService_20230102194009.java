package br.com.tech4pizza.pizzaria.service;

import java.util.List;
import java.util.Optional;

import br.com.tech4pizza.pizzaria.model.Pizza;
import br.com.tech4pizza.pizzaria.shared.PizzaDto;


public interface PizzaService {
  List<Pizza> obterTodasAsPizzas();
  Optional<PizzaDto> ObterPizzaPorId(String id);
  void excluirPizzaPorId(String id);
  Pizza cadastrarPizza(Pizza pizza);
  Optional<Pizza> atualizarPizzaPorId(String id, Pizza pizza);  
}
