package br.com.tech4pizza.pizzaria.service;

import java.util.List;
import java.util.Optional;

import br.com.tech4pizza.pizzaria.model.Pizza;

public class PizzaserviceImpl implements PizzaService{
    @Autowired
  private PizzaRepository repositorio;

    @Override
    public List<Pizza> obterTodasAsPizzas() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Optional<Pizza> ObterPizzaPoiId(String id) {
        // TODO Auto-generated method stub
        return Optional.empty();
    }

    @Override
    public Void excluirPizzaPorId(String id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Pizza cadastrarPizza(Pizza pizza) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Pizza AtualizartPizzaPorId(String id, Pizza pizza) {
        // TODO Auto-generated method stub
        return null;
    }
    
}
