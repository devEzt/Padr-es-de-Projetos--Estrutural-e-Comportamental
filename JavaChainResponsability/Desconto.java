public interface Desconto {
 
  BigDecimal calcular(Pedido pedido);

  void setProximo(Desconto proximo);
}