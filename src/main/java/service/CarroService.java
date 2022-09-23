package service;

import model.Carro;

public interface CarroService {

    void acelerar(Carro carro);
    void frear(Carro carro);
    void ligar(Carro carro);
    void desligar(Carro carro);
    String estadoAtual(Carro carro);

}