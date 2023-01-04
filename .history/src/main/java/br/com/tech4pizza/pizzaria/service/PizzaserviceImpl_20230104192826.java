package br.com.tech4pizza.pizzaria.service;

import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.tech4pizza.pizzaria.repository.PizzaRepository;
import br.com.tech4pizza.pizzaria.shared.PizzaCompletoDto;
import br.com.tech4pizza.pizzaria.shared.PizzaDto;

@Service
public class PizzaserviceImpl implements PizzaService{
     @Autowired
       private PizzaRepository repositorio;

    @Override
    public List<PizzaCompletoDto> obterTodasAsPizzas() {
      List<Pizza> pizzas = repositorio.finsAll(;)
        return repositorio.findAll();
    }

    @Override
    public Optional<PizzaDto> ObterPizzaPorId(String id) {
      Optional <PizzaCompletoDto> pizza = repositorio.findById(id);  
      if(pizza.isPresent()){
      return Optional.of(new ModelMapper().map(pizza.get(), PizzaDto.class)); 
      }
      return Optional.empty(); 
    }

    @Override
    public void excluirPizzaPorId(String id) {
        repositorio.deleteById(id);
    }

    @Override
    public PizzaCompletoDto cadastrarPizza(PizzaCompletoDto pizza) {
        return repositorio.save(pizza);
    }

    @Override
  public Optional<PizzaCompletoDto> atualizarPizzaPorId (String id, PizzaCompletoDto pizza) {
    Optional<PizzaCompletoDto> retorno = repositorio.findById(id);

    if (retorno.isPresent()) {
      pizza.setId(id);
      return Optional.of(repositorio.save(pizza));
    } else {
      return Optional.empty();
    }
    }
    
}