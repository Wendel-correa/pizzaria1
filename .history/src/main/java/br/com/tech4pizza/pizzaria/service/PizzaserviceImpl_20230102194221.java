package br.com.tech4pizza.pizzaria.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.tech4pizza.pizzaria.model.Pizza;
import br.com.tech4pizza.pizzaria.repository.PizzaRepository;
import br.com.tech4pizza.pizzaria.shared.PizzaDto;

@Service
public class PizzaserviceImpl implements PizzaService{
     @Autowired
       private PizzaRepository repositorio;

    @Override
    public List<Pizza> obterTodasAsPizzas() {
        return repositorio.findAll();
    }

    @Override
    public Optional<PizzaDto> ObterPizzaPorId(String id) {
      Optional <Pizza> pizza   
      return repositorio.findById(id);
        if(){}
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
  public Optional<Pizza> atualizarPizzaPorId (String id, Pizza pizza) {
    Optional<Pizza> retorno = repositorio.findById(id);

    if (retorno.isPresent()) {
      pizza.setId(id);
      return Optional.of(repositorio.save(pizza));
    } else {
      return Optional.empty();
    }
    }
    
}
