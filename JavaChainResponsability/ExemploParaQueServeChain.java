public class CalculadorDeDesconto {
 
  public static void main(String[] args) {
      final Pedido pedido = new Pedido;
      calculaDesconto(pedido);
  }   

  public BigDecimal calculaDesconto(Pedido pedido) {
       if(pedido.getItens().size() > 10) {
           return pedido.getValor().multiply(BigDecimal.valueOf(0.5));
       } else if(pedido.getValor() > 1000.0) {
           return pedido.getValor().multiply(BigDecimal.valueOf(0.10));
       } else {
           return BigDecimal.ZERO;
       }
  }
}