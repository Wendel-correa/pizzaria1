package br.com.tech4pizza.pizzaria.shared;

import org.springframework.data.mongodb.core.mapping.Document;


public class PizzaDto {
private String id;
  private String sabor;
  private Double valor;

  
public String getId() {
    return id;
}
public void setId(String id) {
    this.id = id;
}
public String getSabor() {
    return sabor;
}
public void setSabor(String sabor) {
    this.sabor = sabor;
}
public Double getValor() {
    return valor;
}
public void setValor(Double valor) {
    this.valor = valor;
}
}
