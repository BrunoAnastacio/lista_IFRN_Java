
import java.util.Scanner;
public class Algoritmos {


    //1. A imobiliária Imóbilis vende apenas terrenos retangulares. Faça um algoritmo para ler as dimensões de um terreno e depois exibir a área do terreno.
    public static double areaTerreno(double largura, double comprimento) {

        return largura * comprimento;

    }

    //2. Faça um algoritmo para calcular quantas ferraduras são necessárias para equipar todos os cavalos comprados para um haras.

    public static int calculoFerraduras(int qtdCavalos) {

        return qtdCavalos * 4;

    }

    /*
3. A padaria Hotpão vende uma certa quantidade de pães franceses e uma quantidade de broas a
cada dia. Cada pãozinho custa R$ 0,12 e a broa custa R$ 1,50. Ao final do dia, o dono quer saber
quanto arrecadou com a venda dos pães e broas (juntos), e quanto deve guardar numa conta de
poupança (10% do total arrecadado). Você foi contratado para fazer os cálculos para o dono. Com
base nestes fatos, faça um algoritmo para ler as quantidades de pães e de broas, e depois calcular
os dados solicitados.
*/


    public static double[] calculoPadaria(int qtdPao, int qtdBroa) {

        double[] retorno = new double[2]; //0: total_vendas, 1: valor_poupança
        retorno[0] = calculoArrecadacao(qtdPao, qtdBroa);
        retorno[1] = valorPoupanca(retorno[0]);

        return retorno;

    }

    protected static double calculoArrecadacao(int qtdPao, int qtdBroa) {

        double totalVendas = (qtdPao * 0.12) + (qtdBroa * 1.5);
        return totalVendas;
    }

    protected static double valorPoupanca(double totalVendas) {
        double valorPoupanca = totalVendas * 0.1;
        return valorPoupanca;
    }

    /*
    4. Escreva um algoritmo para ler o nome e a idade de uma pessoa, e exibir quantos dias de vida
        ela possui. Considere sempre anos completos, e que um ano possui 365 dias. Ex: uma pessoa
        com 19 anos possui 6935 dias de vida; veja um exemplo de saída: MARIA, VOCÊ JÁ VIVEU 6935
        DIAS
    */
    public static String exibirDiasDeVida(String nome, int idade) {
        return nome.toUpperCase() + ", VOCÊ JÁ VIVEU " + (idade * 365) + " DIAS";

    }

/*
5. Um motorista deseja colocar no seu tanque X reais de gasolina. Escreva um algoritmo para ler o
preço do litro da gasolina e o valor do pagamento, e exibir quantos litros ele conseguiu colocar no
tanque.
*/

    public static double calculoGasolina(double precoLitro, double valorPago) {

        return valorPago / precoLitro;
    }

 /*
6. O restaurante a quilo "Bem-Bão" cobra R$12,00 por cada quilo de refeição. Escreva um algoritmo
que leia o peso do prato montado pelo cliente (em quilos) e imprima o valor a pagar. Assuma que a
balança já desconte o peso do prato.
*/

    public static double calcularPrato(double peso) {
        return peso * 12.0;
    }

/*
7. Entrar com o dia e o mês de uma data e informar quantos dias se passaram desde o início do
    ano. Esqueça a questão dos anos bissextos e considere sempre que um mês possui 30 dias
*/

    public static int diasDoAno(int dia, int mes) {
        return (mes - 1) * 30 + dia;

    }

/*
8. Faça um algoritmo para ler três notas de um aluno em uma disciplina e imprimir a sua média
ponderada (as notas tem pesos respectivos de 1, 2 e 3).
*/

    public static double mediaPonderadaAluno(double nota1, double nota2, double nota3) {
        return (nota1 * 1 + nota2 * 2 + nota3 * 3) / 6;

    }

    /*
9. Uma fábrica de camisetas produz os tamanhos pequeno, médio e grande, cada uma sendo
vendida respectivamente por 10, 12 e 15 reais. Construa um algoritmo em que o usuário forneça a
quantidade de camisetas pequenas, médias e grandes referentes a uma venda, e a máquina
informe quanto será o valor arrecadado.
*/

    public static int valorCamisetas(int qtdPequenas, int qtdMedias, int qtdGrandes) {
        return qtdPequenas * 10 + qtdMedias * 12 + qtdGrandes * 15;

    }


/*
10. Construa um algoritmo para calcular a distância entre dois pontos do plano cartesiano. Cada
ponto é um par ordenado (x,y).
*/

    public static double distanciaParOrdenado(double x1, double y1, double x2, double y2) {

        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }


    /*
11. Uma fábrica controla o tempo de trabalho sem acidentes pela quantidade de dias. Faça um
algoritmo para converter este tempo em anos, meses e dias. Assuma que cada mês possui sempre
30 dias.
    */

    public static String controleDeAcidentes(int diasSemAcidente) {
        int anos = diasSemAcidente / 365;
        int meses = (diasSemAcidente % 365) / 30;
        int dias = (diasSemAcidente % 365) % 30;

        return diasSemAcidente + " dias sem acidentes equivalem a " + anos + "anos, " + meses + " meses e " + dias + "dias.";
    }


/*12. Faça um algoritmo para ler o salário de um funcionário e aumentá-Io em 15%. Após o aumento,
desconte 8% de impostos. Imprima o salário inicial, o salário com o aumento e o salário final.
*/

    public static void alterarSalarioFuncionario(double salario) {

        double aumento = salario * 0.15;
        double novoSalario = salario + aumento;
        double imposto = novoSalario * 0.08;
        double salarioFinal = novoSalario - imposto;

        System.out.println("Salário inicial: R$" + salario);
        System.out.println("Salário com aumento de 15%: R$" + novoSalario);
        System.out.println("Salário final após desconto de 8% de impostos: R$" + salarioFinal);
    }


/*
13. Ler um número inteiro (assuma até três dígitos) e imprimir a saída da seguinte forma:
CENTENA = x
DEZENA = x
UNIDADE = x
*/

    public static void separarNumeros(int numero) {


        int centena = numero / 100;
        int dezena = (numero % 100) / 10;
        int unidade = numero % 10;

        System.out.println("CENTENA = " + centena);
        System.out.println("DEZENA = " + dezena);
        System.out.println("UNIDADE = " + unidade);


    }


/*
14. Calcule a área de uma pizza que possui um raio R (pi=3.14).
*/

    public static double areaPizza(double raio){
        return (raio*raio) * 3.14;
    }

/*
15. Três amigos, Carlos, André e Felipe. decidiram rachar igualmente a conta de um bar. Faça um
algoritmo para ler o valor total da conta e imprimir quanto cada um deve pagar, mas faça com que
Carlos e André não paguem centavos. Ex: uma conta de R$101,53 resulta em R$33,00 para
Carlos, R$33,00 para André e R$35,53 para Felipe.
*/

    public static void contaBar(double valorConta) {

        double valorDividido = Math.floor(valorConta / 3);
        double valorFelipe = valorConta - 2 * valorDividido;

        System.out.println("Valor total da conta: R$" + valorConta);
        System.out.println("Valor que Carlos e André devem pagar: R$" + valorDividido);
        System.out.println("Valor que Felipe deve pagar: R$" + valorFelipe);


    }

    /*
16. A lanchonete Gostosura vende apenas um tipo de sanduíche, cujo recheio inclui duas fatias de
queijo, uma fatia de presunto e uma rodela de hambúrguer. Sabendo que cada fatia de queijo ou
presunto pesa 50 gramas, e que a rodela de hambúrguer pesa 100 gramas, faça um algoritmo em
que o dono forneça a quantidade de sanduíches a fazer, e a máquina informe as quantidades (em
quilos) de queijo, presunto e carne necessários para compra.
*/

    public static void ingredientesSanduiches(int qtdSanduiches) {


        double qtdQueijo = qtdSanduiches * 2 * 50 / 1000.0;
        double qtdPresunto = qtdSanduiches * 1 * 50 / 1000.0;
        double qtdCarne = qtdSanduiches * 1 * 100 / 1000.0;

        System.out.printf("Para fazer %d sanduíches, é necessário:\n", qtdSanduiches);
        System.out.printf("%.2f kg de queijo\n", qtdQueijo);
        System.out.printf("%.2f kg de presunto\n", qtdPresunto);
        System.out.printf("%.2f kg de carne\n", qtdCarne);
    }

/*
17. Alguns países medem temperaturas em graus Celsius, e outros em graus Fahrenheit. Faça um
algoritmo para ler uma temperatura Celsius e imprimi-Ia em Fahrenheit (pesquise como fazer este
tipo de conversão).
*/

    public static double converterTemperatura(double celsius) {
        return (celsius * 9 / 5) + 32;
    }


/*
18. A empresa Hipotheticus paga R$10,00 por hora normal trabalhada, e R$15,00 por hora extra.
Faça um algoritmo para calcular e imprimir o salário bruto e o salário líquido de um determinado
funcionário. Considere que o salário líquido é igual ao salário bruto descontando-se 10% de
impostos.
*/

    public static void calcularSalarioHipotheticus(double horasTrabalhadas, double horasExtras ) {

        double salarioBruto = (horasTrabalhadas * 10) + (horasExtras * 15);
        double salarioLiquido = salarioBruto * 0.9;

        System.out.printf("Salário bruto: R$%.2f\n", salarioBruto);
        System.out.printf("Salário líquido: R$%.2f\n", salarioLiquido);
    }


/*
19. A granja Frangotech possui um controle automatizado de cada frango da sua produção. No pé
direito do frango há um anel com um chip de identificação; no pé esquerdo são dois anéis para
indicar o tipo de alimento que ele deve consumir. Sabendo que o anel com chip custa R$4,00 e o
anel de alimento custa R$3,50, faça um algoritmo para calcular o gasto total da granja para marcar
todos os seus frangos.
*/

    public static double gastosGranja(int qtdFrangos) {
        return  qtdFrangos * (4.0 + (3.5 * 2));
    }


/*
20. Uma confecção produz X blusas de lã e para isto gasta uma certa quantidade de novelos. Faça
um algoritmo para calcular quantos novelos de lã ela gasta por blusa.
*/

    public static double gastoLa(int blusas, int novelos){
        return novelos/blusas;
    }


/*
21. A fábrica de refrigerantes Meia-Cola vende seu produto em três formatos: lata de 350 ml,
garrafa de 600 ml e garrafa de 2 litros. Se um comerciante compra uma determinada quantidade
de cada formato, faça um algoritmo para calcular quantos litros de refrigerante ele comprou.
*/

    public static double totalLitros(int lata, int garrafapeq, int garrafagr){
        return (garrafagr * 2) + (garrafapeq * 0.6) + (lata * 0.35);
    }

/*
22. Pedrinho tem um cofrinho com muitas moedas, e deseja saber quantos reais conseguiu
poupar. Faça um algoritmo para ler a quantidade de cada tipo de moeda, e imprimir o valor total
economizado, em reais. Considere que existam moedas de 1, 5, 10, 25 e 50 centavos, e ainda
moedas de 1 real. Não havendo moeda de um tipo, a quantidade respectiva é zero.
*/

    public static double poupancaPedrinho(int moeda1, int moeda5, int moeda10, int moeda25, int moeda50, int moeda1Real  ) {
        return moeda1 * 0.01 + moeda5 * 0.05 + moeda10 * 0.10 + moeda25 * 0.25 + moeda50 * 0.50 + moeda1Real;

    }


/*
23. Num dia de sol, você deseja medir a altura de um prédio, porém, a trena não é suficientemente
longa. Assumindo que seja possível medir sua sombra e a do prédio no chão, e que você lembre
da sua altura, faça um algoritmo para ler os dados necessários e calcular a altura do prédio.
*/

    public static double medirAlturaPredio(double alturaPessoa, double sombraPessoa, double sombraPredio) {
        return (sombraPredio * alturaPessoa) / sombraPessoa;
    }

/*
24. Um tonel de refresco é feito com 8 partes de água mineral e 2 partes de suco de maracujá.
    Faça um algoritmo para calcular quantos litros de água e de suco são necessários para se fazer X
    litros de refresco (informados pelo usuário).
*/

    public static void calcularQtdeSucoAgua(double litrosRefresco) {
        double litrosAgua = (8.0/10.0) * litrosRefresco;
        double litrosSuco = (2.0/10.0) * litrosRefresco;
        System.out.printf("Para fazer %.2f litros de refresco, são necessários:\n", litrosRefresco);
        System.out.printf("%.2f litros de água mineral\n", litrosAgua);
        System.out.printf("%.2f litros de suco de maracujá\n", litrosSuco);
    }

/*
25. Calcule o volume de uma caixa d'água cilíndrica.
*/

    public static double volumeCaixaDAgua(double raio, double altura) {
        double volume = Math.PI * Math.pow(raio, 2) * altura;
        return volume;
    }

/*
26. Faça um algoritmo que receba três números, calcule e mostre a multiplicação desses números.
*/

    public static double multiplicarEMostrar(double num1, double num2, double num3) {
        return num1 * num2 * num3;
    }


/*
27. Faça um algoritmo que receba dois números, calcule e mostre a divisão do primeiro número
pelo segundo. Sabe-se que o segundo número não pode ser zero, portanto não é necessário se
preocupar com validações.
*/

    public static double divisao(double num1, double num2) {
        return  num1 / num2;
    }


/*
28. Faça um algoritmo que receba duas notas, calcule e mostre a média ponderada dessas notas,
considerando peso 2 para a primeira nota e peso 3 para a segunda nota.
*/

    public static double mediaPonderada(double nota1, double nota2) {
        return (nota1 * 2 + nota2 * 3) / 5;

    }
/*
29. Faça um algoritmo que receba o preço de um produto, calcule e mostre o novo preço,
sabendo-se que este sofreu um desconto de 10%.
*/

    public static double desconto(double preco){
        return preco - (preco * 0.1);
    }

    /*
30. Um funcionário recebe um salário fixo mais 4% de comissão sobre as vendas. Faça um
algoritmo que receba o salário fixo de um funcionário e o valor de suas vendas, calcule e mostre a
comissão e o salário final do funcionário.
*/


    public static void calculoSalario(double salarioFixo, double valorVendas) {

        double comissao = valorVendas * 0.04; // 4% de comissão sobre as vendas
        double salarioFinal = salarioFixo + comissao;

        System.out.printf("Comissão: R$ %.2f\n", comissao);
        System.out.printf("Salário final: R$ %.2f\n", salarioFinal);

    }

/*
31. Faça um algoritmo que receba o peso de uma pessoa, calcule e mostre:
a) o novo peso se a pessoa engordar 15% sobre o peso digitado;
b) o novo peso se a pessoa emagrecer 20% sobre o peso digitado.
*/

    public static void calcularNovoPeso(double peso ) {

        double novoPesoEngordar = peso * 1.15; // 15% de acréscimo no peso
        double novoPesoEmagrecer = peso * 0.80; // 20% de decréscimo no peso

        System.out.printf("Novo peso se engordar 15%%: %.2f\n", novoPesoEngordar);
        System.out.printf("Novo peso se emagrecer 20%%: %.2f\n", novoPesoEmagrecer);

    }

//32. Faça um algoritmo que receba o peso de uma pessoa em quilos, calcule e mostre esse pesoem gramas.
    public static double pesoGramas(double pesoKg){
        return pesoKg/1000;
    }

    /*33. Faça um algoritmo que calcule e mostre a área de um trapézio. Sabe-se que: A = (base maior +
    base menor)* altura)/2 ;
    */

    public static double areaTrapezio(double baseMaior, double baseMenor, double altura ){
        return ((baseMaior + baseMenor)* altura)/2;
    }


/*34. Faça um algoritmo que calcule e mostre a área de um quadrado.
Sabe-se que: A = lado * lado;
*/

    public static double areaQuadrado(double lado){
        return lado * lado;
    }

    /*
35. Faça um algoritmo que calcule e mostre a área de um losango. Sabe-se que: A =
(diagonal_maior * diagonal_menor)/2;
*/

    public static double areaLosango(double diagonalMaior, double diagonalMenor ){
        return (diagonalMaior * diagonalMenor)/2;
    }


/*
36. Faça um algoritmo que receba o valor do salário mínimo e o valor do salário de um funcionário,
calcule e mostre a quantidade de salários mínimos que ganha esse funcionário.
*/

    public static double qtdeSalariosMinimos(double salarioMinimo, double salarioFuncionario){
        return salarioFuncionario/salarioMinimo;
    }

/*
37. Faça um algoritmo que calcule e mostre a tabuada de um número digitado pelo usuário.
*/

    public static void calcularTabuada(int numero) {
        System.out.println("Tabuada do número " + numero + ":");

        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }

    }

/*
38. Faça um algoritmo que receba o ano de nascimento de uma pessoa e o ano atual, calcule e
mostre:
a) a idade dessa pessoa em anos;
b) a idade dessa pessoa em meses;
c) a idade dessa pessoa em dias;
d) a idade dessa pessoa em semanas.
*/

    public static void calcularIdade(int anoNascimento, int anoAtual) {

        int idadeAnos = anoAtual - anoNascimento;
        int idadeMeses = idadeAnos * 12;
        int idadeDias = idadeAnos * 365;
        int idadeSemanas = idadeDias / 7;

        System.out.println("Idade em anos: " + idadeAnos + " anos");
        System.out.println("Idade em meses: " + idadeMeses + " meses");
        System.out.println("Idade em dias: " + idadeDias + " dias");
        System.out.println("Idade em semanas: " + idadeSemanas + " semanas");

    }

/*
39. João recebeu seu salário de R$ 1200,00 e precisa pagar duas contas (C1=R$ 200,00 e
C2=R$120,00) que estão atrasadas. Como as contas estão atrasadas, João terá de pagar multa de
2% sobre cada conta. Faça um algoritmo que calcule e mostre quanto restará do salário do João
*/

    public static void calcularSaldoRestante() {
        double salario = 1200.00;
        double c1 = 200.00;
        double c2 = 120.00;
        double multa = 0.02;

        // Aplica a multa sobre as contas
        double c1ComMulta = c1 + (c1 * multa);
        double c2ComMulta = c2 + (c2 * multa);

        // Calcula o saldo restante após o pagamento das contas
        double saldoRestante = salario - c1ComMulta - c2ComMulta;

        System.out.println("Saldo restante: R$" + saldoRestante);
    }


/*
40. Faça um algoritmo que receba o valor dos catetos de um triângulo, calcule e mostre o valor da
hipotenusa.
*/

    public static double calcularHipotenusa(double cateto1,
                                          double cateto2) {

        // Calcula a hipotenusa usando o teorema de Pitágoras
        return Math.sqrt(cateto1 * cateto1 + cateto2 * cateto2);
    }

}

