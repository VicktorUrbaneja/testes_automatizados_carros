package service;

import model.Carro;

public interface CarroService {

    void acelerar(Carro carro, int velocidadeAMais);

    //void acelerar(Carro, int) = assinatura do método (nome(obj, tipo))

    void frear(Carro carro, int velocidadeAMenos);
    void ligar(Carro carro);
    void desligar(Carro carro);
    String estadoAtual(Carro carro);

}