package br.unipar;

public class Main {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.setMarca("Fiat");
        carro2.setMarca("Volksvagem");

        carro1.setModelo("uno");
        carro2.setModelo("ford");

        carro1.setAno(2013);
        carro2.setAno(2024);

        carro1.setCor("branco");
        carro2.setCor("vermelho");

        System.out.println("Carro 1:");
        System.out.println("Marca:" + carro1.getMarca());
        System.out.println("Modelo:" + carro1.getModelo());
        System.out.println("Ano:" + carro1.getAno());
        System.out.println("Cor:" + carro1.getCor());

        System.out.println("---------------------");

        System.out.println("Carro 2:");
        System.out.println("Marca:" + carro2.getMarca());
        System.out.println("Modelo:" + carro2.getModelo());
        System.out.println("Ano:" + carro2.getAno());
        System.out.println("Cor:" + carro2.getCor());


    }
}
