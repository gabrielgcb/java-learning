package br.com.abc.poocursoemvideo.C_relacionamentoentreclasses.classes;

import java.util.Random;

public class Luta {
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;


    public void marcarLuta() {
        if(this.desafiado != null && this.desafiante != null) {
            if(this.desafiado != this.desafiante){
                if(this.desafiado.getCategoria().equals(this.desafiante.getCategoria())){
                    System.out.println("---------- @A LUTA PODE ACONTECER.");
                    this.aprovada = true;
                    this.lutar();
                    return;
                }
            }
        }
        System.out.println("**********\nA LUTA NAO PODE ACONTECER.");
        this.aprovada = false;
    }

    public void lutar() {
        this.desafiado.apresentar();
        this.desafiante.apresentar();
        Random gerador = new Random();
            if(gerador.nextInt(101) % 3 == 0) {
                System.out.println("\n\n\n");
                System.out.println("---------- @E O VENCEDOR DA LUTA FOI " + this.desafiado.getNome() + "!!!");
                this.desafiado.ganharLuta();
                this.desafiante.perderLuta();
            } else if(gerador.nextInt(11) % 2 == 0) {
                System.out.println("\n\n\n");
                System.out.println("---------- @E O VENCEDOR DA LUTA FOI " + this.desafiante.getNome() + "!!!");
                this.desafiante.ganharLuta();
                this.desafiado.perderLuta();
            } else {
                System.out.println("\n\n\n");
                System.out.println("---------- @A LUTA TERMINOU EMPATADA.");
                this.desafiante.empatarLuta();
                this.desafiado.empatarLuta();
            }
    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
}
