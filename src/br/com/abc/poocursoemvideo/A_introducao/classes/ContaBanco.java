package br.com.abc.poocursoemvideo.A_introducao.classes;

public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public ContaBanco(float saldo, boolean status) {
        this.setSaldo(saldo);
        this.setStatus(status);
    }

    public int getNumConta() {
        return this.numConta;
    }
    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }
    public String getTipo() {
        return this.tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getDono() {
        return this.dono;
    }
    public void setDono(String dono) {
        this.dono = dono;
    }
    public float getSaldo() {
        return this.saldo;
    }
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    public boolean getStatus() {
        return this.status;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }

    public void abrirConta() {
        if(!this.getStatus()) {
            this.setStatus(true);
            System.out.println("----------------------------------------");
            System.out.println("Abertura de conta realizada com sucesso.");
            this.statusConta();
        } else {
            System.out.println("----------------------------------------");
            System.out.println("A conta já se encontra aberta.");
            this.statusConta();
        }
    }
    public void fecharConta() {
        if(this.getStatus()) {
            if(this.getSaldo() < 0) {
                System.out.println("----------------------------------------");
                System.out.println("Nao eh possivel fechar a conta, pois ela possui debitos.");
                this.statusConta();
            } else if(this.getSaldo() > 0) {
                System.out.println("----------------------------------------");
                System.out.println("Nao eh possivel fechar a conta, pois ela possui saldo. Retire o dinheiro restante.");
                this.statusConta();
            } else {
                System.out.println("----------------------------------------");
                System.out.println("Conta fechada com sucesso.");
                this.setStatus(false);
                this.statusConta();
            }
        } else {
            System.out.println("----------------------------------------");
            System.out.println("A conta ja se encontra fechada.");
            this.statusConta();
        }
    }
    public void depositar(float valor) {
        if(this.getStatus()) {
            this.setSaldo(this.getSaldo()+valor);
            System.out.println("----------------------------------------");
            System.out.println("Deposito de " + valor + " realizado com sucesso");
            this.pagarMensal();
            System.out.println("Saldo atual da conta: " + this.getSaldo());
        } else {
            System.out.println("----------------------------------------");
            System.out.println("Nao e possivel realizar um deposito, pois a conta se encontra fechada.");
            this.statusConta();
        }
    }
    public void sacar(float valor) {
        if(this.getStatus()) {
            if(this.getSaldo() >= valor) {
                this.setSaldo(this.getSaldo() - valor);
                System.out.println("----------------------------------------");
                System.out.println("Saque de R$" + valor + " realizado com sucesso.");
                System.out.println("Saldo atual da conta: " + this.getSaldo());
            } else {
                System.out.println("----------------------------------------");
                System.out.println("Nao e possivel realizar o saque de " +valor+ ", pois excede o salto disponivel na conta.");
                System.out.println("Saldo atual da conta: " + this.getSaldo());
            }
        } else {
            System.out.println("----------------------------------------");
            System.out.println("Nao e possivel realizar o saque, pois a conta se encontra fechada.");
            this.statusConta();
        }
    }
    public void pagarMensal() {
        if(this.getStatus()) {
            if(this.getTipo().equals("CC") && this.getSaldo() >= 100) {
                this.setSaldo(this.getSaldo() - 12);
                System.out.println("Pagamento da mensalidade >Conta Corrente< (R$12.00) realizado com sucesso.");
            } else if(this.getTipo().equals("CP") && this.getSaldo() >= 200){
                this.setSaldo(this.getSaldo() - 20);
                System.out.println("Pagamento da mensalidade >Conta Poupanca< (R$20.00) realizado com sucesso.");
            }
        } else {
            System.out.println("----------------------------------------");
            System.out.println("Nao e possivel pagar a mensalidade, pois a conta esta fechada.");
        }
    }
    public void statusConta() {
        System.out.println("********** RELATORIO DA CONTA **********");
        System.out.println("Numero da conta: " + this.getNumConta());
        System.out.println("Tipo da conta: " + this.getTipo());
        System.out.println("Dono da conta: " + this.getDono());
        System.out.println("Saldo da conta: " + this.getSaldo());
        System.out.println("A conta esta aberta? " + this.getStatus());
    }
}








