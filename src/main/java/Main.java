import model.Carro;
import org.junit.Test;
import service.CarroService;
import service.CarroServiceImpl;

/**
 *
 * Um carro tem os seguintes atributos:
 *  - cor
 *  - marca
 *  - modelo
 *  - ligado
 *  - velocidadeAtual
 *  - velocidadeMáxima
 *
 *  Enquanto o carro estiver desligado deve ser capaz de:
 *  - Ligar
 *
 * Enquanto o carro estiver ligado deve ser capaz de:
 * - Desligar
 * - Acelerar
 * - Frear
 * - Mostrar estado atual
 *
 * Regras:
 * - O carro não pode passar de sua velocidade máxima
 * - Só podemos realizar as ações com o carro ligado
 * - Só podemos desligar o carro quando ele parar (velocidadeAtual = 0)
 * - Não existe velocidade negativa
 *
 */

public class Main {
    public static void main(String[] args) {
        CarroService carroService = new CarroServiceImpl();

        //Given
        Carro carro = new Carro("azul", "marca","ano","modelo");

        //When
        carroService.ligar(carro);
        carroService.acelerar(carro, 10);



    }

}