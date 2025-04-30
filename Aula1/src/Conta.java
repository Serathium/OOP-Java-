public class Conta {

    // Atributos

    int numero;
    String dono;
    double saldo;
    double limite;

    // Métodos

    void deposita(double quantidade) {
        saldo = saldo + quantidade;
    }

    boolean saca(double valor) {
        if (saldo < valor) {
            return false;
        } else {
            saldo = saldo - valor;
            return true;
        }
    }

    void imprimeDono(){
        System.out.println( "Dono da conta " + numero + ": " + dono );
    }

    void devolveSaldo()
    {
        System.out.println( "Saldo atual da conta " + numero + ": " + saldo );
    }

    void transferePara( Conta destino, double valor )
    {
        saldo -= valor;
        destino.deposita(valor);
    }

    void imprimeDados()
    {
        System.out.println( "Número da conta: " + numero );
        System.out.println( "Nome do dono da conta: " + dono );
        System.out.println( "Saldo da conta: R$" + saldo );
        System.out.println( "Limite da conta: R$" + limite);
    }

    public static void main(String[] args){

        Conta contas[];
        contas = new Conta[2];  
        contas[0] = new Conta();
        

        contas[0].dono = "Maria Silva";
        contas[0].saldo = 1000;
        contas[0].numero = 123;
        contas[0].limite = 500;

        contas[1].dono = "João Pedro";
        contas[1].saldo = 500;
        contas[1].numero = 456;
        contas[1].limite = 500;

        contas[0].imprimeDono();
        contas[0].devolveSaldo();
        contas[0].imprimeDados();
    }
}
    

