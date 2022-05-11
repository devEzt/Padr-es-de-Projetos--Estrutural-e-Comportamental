public class DescontoPorItens implements Desconto {
        
  private Desconto proximo;

  @Override
  public BigDecimal calcular(Pedido pedido) {
      if(pedido.getItens().size() > 10) {
          return pedido.getValor().multiply(BigDecimal.valueOf(0.5));
      } else {
          return proximo.calcular(pedido);
     }
  }

  @Override
  public void setProximo(Desconto proximo) {
     this.proximo = proximo;
  }
}