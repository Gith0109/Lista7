package Questao4Lista7;

public class TesteVeiculos {
    public static void main(String[] args) {

        Proprietario proprietario1 = new Proprietario("Paula de Fraga","Lami, Praça Dois Irmãos, 658", 'F', "314.949.130-46","36605660084");
        Proprietario proprietario2 = new Proprietario("Carlos Oliveira","Lageado ,Rua Oito Mil e Treze, 378", 'M', "748.771.970-79","08308095859");

        Veiculo veiculo1 = new Veiculo("IOP-8039","Amarelo","AUMARK 3.5 - 11ST 2.8 4x2 TB Diesel\n",proprietario1);
        Veiculo veiculo2 = new Veiculo("FCW-8106","Verde","Sonata GLS 2.0 4p\n",proprietario1);
        Veiculo veiculo3 = new Veiculo("HOI-0359","Preto","Legacy GL TW 2.0 4x4 Mec.\n",proprietario2);
        Veiculo veiculo4 = new Veiculo("KEG-3595","Vermelho","Vantage 6.0 V12 510cv\n",proprietario1);
        Veiculo veiculo5 = new Veiculo("MJW-2950","Branco","BR-800 (todos)/ Supermini\n",proprietario2);

        Veiculo[] veiculo = {veiculo1,veiculo2,veiculo3,veiculo4,veiculo5};

        System.out.println("Informações dos Veículos:");

        for (int x = 0; x < veiculo.length; x++){
            System.out.printf("Veículo %d:\n%s\n\n", x+1,veiculo[x].toString());

        }
    }
}
