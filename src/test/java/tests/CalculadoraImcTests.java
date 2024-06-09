package tests;

import control.CalculadoraImc;
import org.junit.Assert;
import org.junit.Test;
/*

Baixo peso: entre 17 e 18,49 kg/m².
Peso normal: entre 18,50 e 24,99 kg/m².
Sobrepeso: entre 25 e 29,99 kg/m².
Obesidade grau I: entre 30 e 34,99 kg/m².
Obesidade grau II: entre 35 e 39,99 kg/m².
Obesidade grau III (obesidade mórbida): maior que 40 kg/m²
 */
public class CalculadoraImcTests {

    //ADULTOS
    @Test
    public void testeAdultoBaixoPesoMuitoGrave (){
        CalculadoraImc calcImc = new CalculadoraImc();
        Assert.assertEquals("Baixo peso muito grave", calcImc.calcularImc(48.0, 1.74, 20, "masculino"));
    }


    @Test
    public void testeAdultoBaixoPesoGraveLimiteInferior (){
        CalculadoraImc calcImc = new CalculadoraImc();
        Assert.assertEquals("Baixo peso grave", calcImc.calcularImc(49.0, 1.75, 65, "masculino"));
    }

    @Test
    public void testeAdultoBaixoPesoGraveLimiteSuperior (){
        CalculadoraImc calcImc = new CalculadoraImc();
        Assert.assertEquals("Baixo peso grave", calcImc.calcularImc(52.0, 1.75, 65, "masculino"));
    }

    @Test
    public void testeAdultoBaixoPesoLimiteInferior (){
        CalculadoraImc calcImc = new CalculadoraImc();
        Assert.assertEquals("Baixo peso", calcImc.calcularImc(47.0, 1.66, 65, "masculino"));
    }

    @Test
    public void testeAdultoBaixoPesoLimiteSuperior (){
        CalculadoraImc calcImc = new CalculadoraImc();
        Assert.assertEquals("Baixo peso", calcImc.calcularImc(52.0, 1.68, 65, "masculino"));
    }

    @Test
    public void testeAdultoPesoNormalLimiteInferior (){
        CalculadoraImc calcImc = new CalculadoraImc();
        Assert.assertEquals("Peso normal", calcImc.calcularImc(53.0, 1.69, 65, "masculino"));
    }

    @Test
    public void testeAdultoPesoNormalLimiteSuperior (){
        CalculadoraImc calcImc = new CalculadoraImc();
        Assert.assertEquals("Peso normal", calcImc.calcularImc(73.0, 1.71, 65, "masculino"));
    }

    @Test
    public void testeAdultoSobrepesoLimiteInferior (){
        CalculadoraImc calcImc = new CalculadoraImc();
        Assert.assertEquals("Sobrepeso", calcImc.calcularImc(71.0, 1.68, 65, "masculino"));
    }

    @Test
    public void testeAdultoSobrepesoLimiteSuperior (){
        CalculadoraImc calcImc = new CalculadoraImc();
        Assert.assertEquals("Sobrepeso", calcImc.calcularImc(84.0, 1.68, 65, "masculino"));
    }

    @Test
    public void testeAdultoObesidadeGrau1LimiteInferior (){
        CalculadoraImc calcImc = new CalculadoraImc();
        Assert.assertEquals("Obesidade grau I", calcImc.calcularImc(85.0, 1.68, 65, "masculino"));
    }

    @Test
    public void testeAdultoObesidadeGrau1LimiteSuperior (){
        CalculadoraImc calcImc = new CalculadoraImc();
        Assert.assertEquals("Obesidade grau I", calcImc.calcularImc(98.0, 1.68, 65, "masculino"));
    }

    @Test
    public void testeAdultoObesidadeGrau2LimiteInferior (){
        CalculadoraImc calcImc = new CalculadoraImc();
        Assert.assertEquals("Obesidade grau II", calcImc.calcularImc(99.0, 1.68, 65, "masculino"));
    }

    @Test
    public void testeAdultoObesidadeGrau2LimiteSuperior (){
        CalculadoraImc calcImc = new CalculadoraImc();
        Assert.assertEquals("Obesidade grau II", calcImc.calcularImc(112, 1.68, 65, "masculino"));
    }

    @Test
    public void testeAdultoObesidadeGrau3LimiteSuperior (){
        CalculadoraImc calcImc = new CalculadoraImc();
        Assert.assertEquals("Obesidade grau III (obesidade mórbida)", calcImc.calcularImc(113, 1.68, 65, "masculino"));
    }


    //IDOSO MASCULINO
    @Test
    public void testeIdosoMasculinoBaixoPeso (){
        CalculadoraImc calcImc = new CalculadoraImc();
        Assert.assertEquals("Baixo peso", calcImc.calcularImc(61.0, 1.68, 66, "masculino"));
    }

    @Test
    public void testeIdosoMasculinoPesoNormalLimiteInferior (){
        CalculadoraImc calcImc = new CalculadoraImc();
        Assert.assertEquals("Peso normal", calcImc.calcularImc(63.0, 1.68, 66, "masculino"));
    }

    @Test
    public void testeIdosoMasculinoPesoNormalLimiteSuperior (){
        CalculadoraImc calcImc = new CalculadoraImc();
        Assert.assertEquals("Peso normal", calcImc.calcularImc(76.0, 1.68, 66, "masculino"));
    }

    @Test
    public void testeIdosoMasculinoSobrepesoLimiteInferior (){
        CalculadoraImc calcImc = new CalculadoraImc();
        Assert.assertEquals("Sobrepeso", calcImc.calcularImc(77.0, 1.68, 66, "masculino"));
    }

    @Test
    public void testeIdosoMasculinoSobrepesoLimiteSuperior (){
        CalculadoraImc calcImc = new CalculadoraImc();
        Assert.assertEquals("Sobrepeso", calcImc.calcularImc(84.0, 1.68, 66, "masculino"));
    }

    @Test
    public void testeIdosoMasculinoObesidadeGrau1LimiteInferior (){
        CalculadoraImc calcImc = new CalculadoraImc();
        Assert.assertEquals("Obesidade grau I", calcImc.calcularImc(85.0, 1.68, 66, "masculino"));
    }

    @Test
    public void testeIdosoMasculinoObesidadeGrau1LimiteSuperior (){
        CalculadoraImc calcImc = new CalculadoraImc();
        Assert.assertEquals("Obesidade grau I", calcImc.calcularImc(98.0, 1.68, 66, "masculino"));
    }

    @Test
    public void testeIdosoMasculinoObesidadeGrau2LimiteInferior (){
        CalculadoraImc calcImc = new CalculadoraImc();
        Assert.assertEquals("Obesidade grau II", calcImc.calcularImc(101.0, 1.69, 66, "masculino"));
    }

    @Test
    public void testeIdosoMasculinoObesidadeGrau2LimiteSuperior (){
        CalculadoraImc calcImc = new CalculadoraImc();
        Assert.assertEquals("Obesidade grau II", calcImc.calcularImc(114.0, 1.69, 66, "masculino"));
    }

    @Test
    public void testeIdosoMasculinoObesidadeGrau3LimiteSuperior (){
        CalculadoraImc calcImc = new CalculadoraImc();
        Assert.assertEquals("Obesidade grau III (obesidade mórbida)", calcImc.calcularImc(115.0, 1.69, 66, "masculino"));
    }

    //IDOSO FEMININO
    @Test
    public void testeIdosoFemininoBaixoPeso (){
        CalculadoraImc calcImc = new CalculadoraImc();
        Assert.assertEquals("Baixo peso", calcImc.calcularImc(61.0, 1.68, 66, "feminino"));
    }

    @Test
    public void testeIdosoFemininoPesoNormalLimiteInferior (){
        CalculadoraImc calcImc = new CalculadoraImc();
        Assert.assertEquals("Peso normal", calcImc.calcularImc(63.0, 1.68, 66, "feminino"));
    }

    @Test
    public void testeIdosoFemininoPesoNormalLimiteSuperior (){
        CalculadoraImc calcImc = new CalculadoraImc();
        Assert.assertEquals("Peso normal", calcImc.calcularImc(76.0, 1.68, 66, "feminino"));
    }

    @Test
    public void testeIdosoFemininoSobrepesoLimiteInferior (){
        CalculadoraImc calcImc = new CalculadoraImc();
        Assert.assertEquals("Sobrepeso", calcImc.calcularImc(77.0, 1.68, 66, "feminino"));
    }

    @Test
    public void testeIdosoFemininoSobrepesoLimiteSuperior (){
        CalculadoraImc calcImc = new CalculadoraImc();
        Assert.assertEquals("Sobrepeso", calcImc.calcularImc(90.0, 1.68, 66, "feminino"));
    }

    @Test
    public void testeIdosoFemininoObesidadeGrau1LimiteInferior (){
        CalculadoraImc calcImc = new CalculadoraImc();
        Assert.assertEquals("Obesidade grau I", calcImc.calcularImc(91.0, 1.68, 66, "feminino"));
    }

    @Test
    public void testeIdosoFemininoObesidadeGrau1LimiteSuperior (){
        CalculadoraImc calcImc = new CalculadoraImc();
        Assert.assertEquals("Obesidade grau I", calcImc.calcularImc(104.0, 1.68, 66, "feminino"));
    }

    @Test
    public void testeIdosoFemininoObesidadeGrau2LimiteInferior (){
        CalculadoraImc calcImc = new CalculadoraImc();
        Assert.assertEquals("Obesidade grau II", calcImc.calcularImc(106.0, 1.69, 66, "feminino"));
    }

    @Test
    public void testeIdosoFemininoObesidadeGrau2LimiteSuperior (){
        CalculadoraImc calcImc = new CalculadoraImc();
        Assert.assertEquals("Obesidade grau II", calcImc.calcularImc(118.0, 1.68, 66, "feminino"));
    }

    @Test
    public void testeIdosoFemininoObesidadeGrau3LimiteSuperior (){
        CalculadoraImc calcImc = new CalculadoraImc();
        Assert.assertEquals("Obesidade grau III (obesidade mórbida)", calcImc.calcularImc(120.0, 1.69, 66, "feminino"));
    }

    // TESTES PARA CRIANÇAS MENINOS
    @Test
    public void testeMenino2AnosBaixoPeso() {
        CalculadoraImc calcImc = new CalculadoraImc();
        Assert.assertEquals("Baixo peso", calcImc.calcularImc(12.0, 0.85, 2, "masculino"));
    }

    @Test
    public void testeMenino2AnosPesoNormal() {
        CalculadoraImc calcImc = new CalculadoraImc();
        Assert.assertEquals("Peso normal", calcImc.calcularImc(13.0, 0.85, 2, "masculino"));
    }

    @Test
    public void testeMenino2AnosSobrepeso() {
        CalculadoraImc calcImc = new CalculadoraImc();
        Assert.assertEquals("Sobrepeso", calcImc.calcularImc(13.5, 0.85, 2, "masculino"));
    }

    @Test
    public void testeMenino2AnosObesidade() {
        CalculadoraImc calcImc = new CalculadoraImc();
        Assert.assertEquals("Obesidade", calcImc.calcularImc(15.0, 0.85, 2, "masculino"));
    }

    @Test
    public void testeMenino4AnosBaixoPeso() {
        CalculadoraImc calcImc = new CalculadoraImc();
        Assert.assertEquals("Baixo peso", calcImc.calcularImc(14.0, 1.00, 4, "masculino"));
    }

    @Test
    public void testeMenino4AnosPesoNormal() {
        CalculadoraImc calcImc = new CalculadoraImc();
        Assert.assertEquals("Peso normal", calcImc.calcularImc(18.5, 1.00, 4, "masculino"));
    }

    @Test
    public void testeMenino4AnosSobrepeso() {
        CalculadoraImc calcImc = new CalculadoraImc();
        Assert.assertEquals("Sobrepeso", calcImc.calcularImc(19.0, 1.00, 4, "masculino"));
    }

    @Test
    public void testeMenino4AnosObesidade() {
        CalculadoraImc calcImc = new CalculadoraImc();
        Assert.assertEquals("Obesidade", calcImc.calcularImc(20.0, 1.00, 4, "masculino"));
    }

    @Test
    public void testeMenino6AnosBaixoPeso() {
        CalculadoraImc calcImc = new CalculadoraImc();
        Assert.assertEquals("Baixo peso", calcImc.calcularImc(18.0, 1.10, 6, "masculino"));
    }

    @Test
    public void testeMenino6AnosPesoNormal() {
        CalculadoraImc calcImc = new CalculadoraImc();
        Assert.assertEquals("Peso normal", calcImc.calcularImc(24.0, 1.10, 6, "masculino"));
    }

    @Test
    public void testeMenino6AnosSobrepeso() {
        CalculadoraImc calcImc = new CalculadoraImc();
        Assert.assertEquals("Sobrepeso", calcImc.calcularImc(25.0, 1.10, 6, "masculino"));
    }

    @Test
    public void testeMenino6AnosObesidade() {
        CalculadoraImc calcImc = new CalculadoraImc();
        Assert.assertEquals("Obesidade", calcImc.calcularImc(27.0, 1.10, 6, "masculino"));
    }

    @Test
    public void testeMenino8AnosBaixoPeso() {
        CalculadoraImc calcImc = new CalculadoraImc();
        Assert.assertEquals("Baixo peso", calcImc.calcularImc(22.0, 1.20, 8, "masculino"));
    }

    @Test
    public void testeMenino8AnosPesoNormal() {
        CalculadoraImc calcImc = new CalculadoraImc();
        Assert.assertEquals("Peso normal", calcImc.calcularImc(30.0, 1.20, 8, "masculino"));
    }

    @Test
    public void testeMenino8AnosSobrepeso() {
        CalculadoraImc calcImc = new CalculadoraImc();
        Assert.assertEquals("Sobrepeso", calcImc.calcularImc(33.0, 1.20, 8, "masculino"));
    }

    @Test
    public void testeMenino8AnosObesidade() {
        CalculadoraImc calcImc = new CalculadoraImc();
        Assert.assertEquals("Obesidade", calcImc.calcularImc(35.0, 1.20, 8, "masculino"));
    }

    @Test
    public void testeMenino10AnosBaixoPeso() {
        CalculadoraImc calcImc = new CalculadoraImc();
        Assert.assertEquals("Baixo peso", calcImc.calcularImc(27.0, 1.35, 10, "masculino"));
    }

    @Test
    public void testeMenino10AnosPesoNormal() {
        CalculadoraImc calcImc = new CalculadoraImc();
        Assert.assertEquals("Peso normal", calcImc.calcularImc(39.0, 1.25, 10, "masculino"));
    }

    @Test
    public void testeMenino10AnosSobrepeso() {
        CalculadoraImc calcImc = new CalculadoraImc();
        Assert.assertEquals("Sobrepeso", calcImc.calcularImc(48.0, 1.35, 10, "masculino"));
    }

    @Test
    public void testeMenino10AnosObesidade() {
        CalculadoraImc calcImc = new CalculadoraImc();
        Assert.assertEquals("Obesidade", calcImc.calcularImc(52.0, 1.35, 10, "masculino"));
    }

    @Test
    public void testeMenino12AnosBaixoPeso() {
        CalculadoraImc calcImc = new CalculadoraImc();
        Assert.assertEquals("Baixo peso", calcImc.calcularImc(33.0, 1.50, 12, "masculino"));
    }

    @Test
    public void testeMenino12AnosPesoNormal() {
        CalculadoraImc calcImc = new CalculadoraImc();
        Assert.assertEquals("Peso normal", calcImc.calcularImc(56.0, 1.50, 12, "masculino"));
    }

    @Test
    public void testeMenino12AnosSobrepeso() {
        CalculadoraImc calcImc = new CalculadoraImc();
        Assert.assertEquals("Sobrepeso", calcImc.calcularImc(64.0, 1.50, 12, "masculino"));
    }

    @Test
    public void testeMenino12AnosObesidade() {
        CalculadoraImc calcImc = new CalculadoraImc();
        Assert.assertEquals("Obesidade", calcImc.calcularImc(70.0, 1.50, 12, "masculino"));
    }

    // TESTES PARA CRIANÇAS MENINAS
    @Test
    public void testeMenina2AnosBaixoPeso() {
        CalculadoraImc calcImc = new CalculadoraImc();
        Assert.assertEquals("Baixo peso", calcImc.calcularImc(11.0, 0.85, 2, "feminino"));
    }

    @Test
    public void testeMenina2AnosPesoNormal() {
        CalculadoraImc calcImc = new CalculadoraImc();
        Assert.assertEquals("Peso normal", calcImc.calcularImc(13.0, 0.85, 2, "feminino"));
    }

    @Test
    public void testeMenina2AnosSobrepeso() {
        CalculadoraImc calcImc = new CalculadoraImc();
        Assert.assertEquals("Sobrepeso", calcImc.calcularImc(13.5, 0.85, 2, "feminino"));
    }

    @Test
    public void testeMenina2AnosObesidade() {
        CalculadoraImc calcImc = new CalculadoraImc();
        Assert.assertEquals("Obesidade", calcImc.calcularImc(16.0, 0.85, 2, "feminino"));
    }

    @Test
    public void testeMenina4AnosBaixoPeso() {
        CalculadoraImc calcImc = new CalculadoraImc();
        Assert.assertEquals("Baixo peso", calcImc.calcularImc(14.0, 1.00, 4, "feminino"));
    }

    @Test
    public void testeMenina4AnosPesoNormal() {
        CalculadoraImc calcImc = new CalculadoraImc();
        Assert.assertEquals("Peso normal", calcImc.calcularImc(18.0, 1.00, 4, "feminino"));
    }

    @Test
    public void testeMenina4AnosSobrepeso() {
        CalculadoraImc calcImc = new CalculadoraImc();
        Assert.assertEquals("Sobrepeso", calcImc.calcularImc(19.0, 1.00, 4, "feminino"));
    }

    @Test
    public void testeMenina4AnosObesidade() {
        CalculadoraImc calcImc = new CalculadoraImc();
        Assert.assertEquals("Obesidade", calcImc.calcularImc(20.0, 1.00, 4, "feminino"));
    }

    @Test
    public void testeMenina6AnosBaixoPeso() {
        CalculadoraImc calcImc = new CalculadoraImc();
        Assert.assertEquals("Baixo peso", calcImc.calcularImc(18.0, 1.10, 6, "feminino"));
    }

    @Test
    public void testeMenina6AnosPesoNormal() {
        CalculadoraImc calcImc = new CalculadoraImc();
        Assert.assertEquals("Peso normal", calcImc.calcularImc(23.0, 1.10, 6, "feminino"));
    }

    @Test
    public void testeMenina6AnosSobrepeso() {
        CalculadoraImc calcImc = new CalculadoraImc();
        Assert.assertEquals("Sobrepeso", calcImc.calcularImc(26.0, 1.10, 6, "feminino"));
    }

    @Test
    public void testeMenina6AnosObesidade() {
        CalculadoraImc calcImc = new CalculadoraImc();
        Assert.assertEquals("Obesidade", calcImc.calcularImc(27.0, 1.10, 6, "feminino"));
    }

    @Test
    public void testeMenina8AnosBaixoPeso() {
        CalculadoraImc calcImc = new CalculadoraImc();
        Assert.assertEquals("Baixo peso", calcImc.calcularImc(22.0, 1.20, 8, "feminino"));
    }

    @Test
    public void testeMenina8AnosPesoNormal() {
        CalculadoraImc calcImc = new CalculadoraImc();
        Assert.assertEquals("Peso normal", calcImc.calcularImc(29.0, 1.20, 8, "feminino"));
    }

    @Test
    public void testeMenina8AnosSobrepeso() {
        CalculadoraImc calcImc = new CalculadoraImc();
        Assert.assertEquals("Sobrepeso", calcImc.calcularImc(34.0, 1.20, 8, "feminino"));
    }

    @Test
    public void testeMenina8AnosObesidade() {
        CalculadoraImc calcImc = new CalculadoraImc();
        Assert.assertEquals("Obesidade", calcImc.calcularImc(45.0, 1.20, 8, "feminino"));
    }

    @Test
    public void testeMenina10AnosBaixoPeso() {
        CalculadoraImc calcImc = new CalculadoraImc();
        Assert.assertEquals("Baixo peso", calcImc.calcularImc(27.0, 1.35, 10, "feminino"));
    }

    @Test
    public void testeMenina10AnosPesoNormal() {
        CalculadoraImc calcImc = new CalculadoraImc();
        Assert.assertEquals("Peso normal", calcImc.calcularImc(42.0, 1.35, 10, "feminino"));
    }

    @Test
    public void testeMenina10AnosSobrepeso() {
        CalculadoraImc calcImc = new CalculadoraImc();
        Assert.assertEquals("Sobrepeso", calcImc.calcularImc(48.0, 1.35, 10, "feminino"));
    }

    @Test
    public void testeMenina10AnosObesidade() {
        CalculadoraImc calcImc = new CalculadoraImc();
        Assert.assertEquals("Obesidade", calcImc.calcularImc(53.0, 1.35, 10, "feminino"));
    }

    @Test
    public void testeMenina12AnosBaixoPeso() {
        CalculadoraImc calcImc = new CalculadoraImc();
        Assert.assertEquals("Baixo peso", calcImc.calcularImc(33.0, 1.50, 12, "feminino"));
    }

    @Test
    public void testeMenina12AnosPesoNormal() {
        CalculadoraImc calcImc = new CalculadoraImc();
        Assert.assertEquals("Peso normal", calcImc.calcularImc(56.0, 1.50, 12, "feminino"));
    }

    @Test
    public void testeMenina12AnosSobrepeso() {
        CalculadoraImc calcImc = new CalculadoraImc();
        Assert.assertEquals("Sobrepeso", calcImc.calcularImc(65.0, 1.50, 12, "feminino"));
    }

    @Test
    public void testeMenina12AnosObesidade() {
        CalculadoraImc calcImc = new CalculadoraImc();
        Assert.assertEquals("Obesidade", calcImc.calcularImc(70.0, 1.50, 12, "feminino"));
    }
}
