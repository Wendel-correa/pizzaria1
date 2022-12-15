package br.com.tech4pizza.pizzaria.service;

import java.util.List;
import java.util.Optional;

import br.com.tech4pizza.pizzaria.model.Pizza;

public interface PizzaService {
  List<Pizza> obterTodasAsPizzas();
  Optional<Pizza> ObterPizzaPoiId(String id);
  Void excluirPizzaPorId(String id);
  Pizza cadastrarPizza(Pizza pizza);
  Pizza AtualizartPizzaPorId(Strind id),


    
}
