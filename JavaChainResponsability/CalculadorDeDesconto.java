public class CalculadorDeDesconto {
 
  public static void main(String[] args) {
      final Pedido pedido = new Pedido;
      calculaDesconto(pedido);
  }   

  public BigDecimal calculaDesconto(Pedido pedido) {
       final Desconto descontoPorItem = new DescontoPorItens();
       final Desconto descontoPorValor = new DescontoPorValor();
       final Desconto semDesconto = new SemDesconto();

       descontoPorItem.setProximo(descontoPorValor);
       descontoPorValor.setProximo(semDesconto);

       return descontoPorItem.calcular(pedido);
  }
}