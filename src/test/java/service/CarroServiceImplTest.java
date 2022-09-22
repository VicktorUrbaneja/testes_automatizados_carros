package service;

import model.Carro;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;

public class CarroServiceImplTest {


    @Test
    public void testeCarroConsegueAcelerar(){
        CarroService carroService = new CarroServiceImpl();

        //Given
        Carro carro =
                new Carro("prata", "GM", "2012", "Celta");

        //When

        carroService.ligar(carro);
        carroService.acelerar(carro,10);

        //Then

        Assert.assertTrue(carro.getVelocidadeAtual() == 10);
    }


    @Test
    public void testeVelocidadeNaoPodeSerNegativa() {

        CarroService carroService = new CarroServiceImpl();

        // Given
        Carro carro1 =
                new Carro("prata", "GM", "2012", "Celta");

        // When
        carroService.acelerar(carro1, 20);
        carroService.frear(carro1, 20);
        carroService.frear(carro1, 20);

        // Then
        Assert.assertTrue(carro1.getVelocidadeAtual() == 0);
    }

    @Test
    public void testeDeveAcelerarCorretamente() {
        CarroService carroService = new CarroServiceImpl();

        // Given
        Carro carro1 =
                new Carro("prata", "GM", "2012", "Celta");


        // When
        carroService.ligar(carro1);
        carroService.acelerar(carro1, 20);

        // Then
        Assert.assertTrue(carro1.getVelocidadeAtual() == 20);
    }

    @Test
    public void testeNaoDeveAcelerarDesligado() {
        CarroService carroService = new CarroServiceImpl();

        // Given
        Carro carro1 =
                new Carro("prata", "GM", "2012", "Celta");


        // When
        carroService.acelerar(carro1, 20);

        // Then
        Assert.assertTrue(carro1.getVelocidadeAtual() == 0);
    }

    @Test
    public void asserts(){

        boolean eMaiorDeIdade = true;

        Assert.assertTrue(eMaiorDeIdade);
        Assert.assertFalse(false);

        Assert.assertEquals(true, eMaiorDeIdade);

        Assert.assertEquals(1, 1);

        Carro carro1 =
                new Carro("prata", "GM", "2012", "Celta");
        Carro carro2 =
                new Carro("prata", "GM", "2012", "Celta");

        CarroService carroService = new CarroServiceImpl();
        carroService.ligar(carro2);
        carroService.acelerar(carro2,10);

        Assert.assertEquals(carro1, carro2);
        Assert.assertSame(carro1, carro1);

        Assert.assertEquals(1, 1);

        //Assert.assertEquals(double, double) -> depreciado/deprecado
        //Assert.assertEquals(10.10, 10.10);

        //Assert.assertEquals(double, double, delta) -> atual: delta indica precisão
        Assert.assertEquals(10.10, 10.10, 0.01);

        Assert.assertNotEquals(1,2);

        Carro c3 = null;

        Assert.assertNull(c3);

        //teste 01
        Assert.assertTrue(eMaiorDeIdade);



        //teste 02


        //Object
        //Automóvel
        //Carro // equals



    }

    @Test
    public void assertThat(){
        //verifique que:

        //Given
        CarroService carroService = new CarroServiceImpl();
        Carro carro1 =
                new Carro("prata", "GM", "2012", "Celta");

        //When

        carroService.ligar(carro1);
        carroService.acelerar(carro1,10);

        //Then

        Assert.assertThat(carro1.getVelocidadeAtual(), is(equalTo(10)));
        Assert.assertThat(carro1.getVelocidadeAtual(), is(not(20)));

    }

    @Test
    public void atividade(){

        // Given
        CarroService carroService = new CarroServiceImpl();
        Carro carro1 =
                new Carro("prata", "GM", "2012", "Celta");
        Carro carro2 =
                new Carro("prata", "GM", "2012", "Celta");
        Carro carro3 =
                new Carro("vermelho", "Fiat", "2011", "Uno");

        // When
        carroService.acelerar(carro1, 50);

        // Then
        Assert.assertTrue(carro1.getVelocidadeAtual() == 0);
        Assert.assertFalse(carro1.isLigado());
        Assert.assertEquals(carro1.getCor(), carro2.getCor());
        Assert.assertEquals(carro1.getModelo(), carro2.getModelo());
        Assert.assertNotEquals(carro1, carro3);
        Assert.assertThat(carro1.getCor(), is(equalTo("prata")));
        Assert.assertThat(carro3.getMarca(), is(equalTo("Fiat")));
        Assert.assertSame(50,50);
        String nulo = null;
        Assert.assertNull(nulo);
    }

}