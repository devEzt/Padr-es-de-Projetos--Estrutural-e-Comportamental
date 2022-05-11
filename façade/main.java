public class Application {
 public static void main(String[] args) {
   ComputadorFacade Computador = new ComputadorFacade(new cpu(),
               new memoria(),
               new hardDrive());

               Computador.ligarComputador();
 }
}
