package br.com.tech4pizza.pizzaria.service;

import java.util.List;
import java.util.Optional;
import br.com.tech4pizza.pizzaria.shared.PizzaCompletoDto;
import br.com.tech4pizza.pizzaria.shared.PizzaDto;


public interface PizzaService {
  List<PizzaCompletoDto> obterTodasAsPizzas();
  Optional<PizzaDto> ObterPizzaPorId(String id);
  void excluirPizzaPorId(String id);
  PizzaCompletoDto cadastrarPizza(PizzaCompletoDto pizza);
  Optional<PizzaCompletoDto> atualizarPizzaPorId(String id, PizzaCompletoDto pizza);  
}
