package br.com.tech4pizza.pizzaria.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.tech4pizza.pizzaria.model.Pizza;
import br.com.tech4pizza.pizzaria.repository.PizzaRepository;

@Service
public class PizzaserviceImpl implements PizzaService{
     @Autowired
       private PizzaRepository repositorio;

    @Override
    public List<Pizza> obterTodasAsPizzas() {
        return repositorio.findAll();
    }

    @Override
    public Optional<Pizza> ObterPizzaPoiId(String id) {
        return repositorio.findById(id);
    }

    @Override
    public void excluirPizzaPorId(String id) {
        repositorio.deleteById(id);
    }

    @Override
    public Pizza cadastrarPizza(Pizza pizza) {
        return repositorio.save(pizza);
    }

    @Override
    public Pizza AtualizartPizzaPorId(String id, Pizza pizza) {
        pizza.setId(id);
        return repositorio.save(pizza);
    }
    
}
