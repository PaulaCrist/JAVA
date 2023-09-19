public class main {
     public static void main(String[] args) {
            Carro meuCarro = new Carro("Toyota", "Corolla", 2022, 4);
            Moto minhaMoto = new Moto("Honda", "CBR 1000RR", 2021, 1000);

            System.out.println("Detalhes do Carro:");
            meuCarro.imprimirDetalhes();

            System.out.println("\nDetalhes da Moto:");
            minhaMoto.imprimirDetalhes();
        }
    }

