package service;

import model.Carro;

public class CarroServiceImpl implements CarroService {

    @Override
    public void acelerar(Carro carro) {
        double velocidadeAMais = carro.getCavalos() * (0.10);
        if(carro.isLigado()) {
            carro.setVelocidadeAtual((int) (carro.getVelocidadeAtual() + velocidadeAMais));
        }
    }

    @Override
    public void frear(Carro carro) {
        double velocidadeAMenos = carro.getCavalos() * (0.15);
        if(velocidadeAMenos >= carro.getVelocidadeAtual()) {
            carro.setVelocidadeAtual(0);
        } else {
            carro.setVelocidadeAtual((int) (carro.getVelocidadeAtual() - velocidadeAMenos));
        }
    }

    @Override
    public void ligar(Carro carro) {
        carro.setLigado(true);
    }

    @Override
    public void desligar(Carro carro) {
        carro.setLigado(false);
    }

    @Override
    public String estadoAtual(Carro carro) {
        return "O carro está ligado: " +
                carro.isLigado() +
                " e a velocidade atual é: " +
                carro.getVelocidadeAtual();
    }
}