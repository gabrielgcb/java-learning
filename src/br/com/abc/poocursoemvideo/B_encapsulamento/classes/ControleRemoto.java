package br.com.abc.poocursoemvideo.B_encapsulamento.classes;

public class ControleRemoto implements  Controlavel {
    private int volume;
    private boolean ligado;
    private boolean tocando;

    public ControleRemoto() {
        this.volume = 0;
        this.ligado = false;
        this.tocando = false;
    }

    @Override
    public String toString() {
        return "ControleRemoto{" +
                "volume=" + volume +
                ", ligado=" + ligado +
                ", tocando=" + tocando +
                '}';
    }

    @Override
    public void abrirMenu() {
        if(this.ligado == true) {
            System.out.println("*********");
            System.out.println("---------- 0 - Sair");
            System.out.println("*********");
            System.out.println("---------- 1 - Ligar/Desligar");
            System.out.println("*********");
            System.out.println("---------- 2 - Aumentar volume");
            System.out.println("*********");
            System.out.println("---------- 3 - Diminuir volume");
            System.out.println("*********");
            System.out.println("---------- 4 - Mutar/desmutar");
            System.out.println("*********");
        } else {
            System.out.println("--------- @Erro, controle desligado.");
        }
    }

    @Override
    public void fecharMenu() {
        if(this.ligado == true) {
            System.out.println("--------- @Sucesso, menu fechado.");
        } else {
            System.out.println("--------- @Erro, controle desligado");
        }
    }

    @Override
    public void desligar() {
        this.ligado = false;
        System.out.println("---------- @Sucesso, controle desligado.");
    }

    @Override
    public void ligar() {
        this.ligado = true;
        System.out.println("-------- @Sucesso, controle ligado.");
    }

    @Override
    public void maisVolume(int volume) {
        if(this.ligado == true){
            this.volume = this.volume + volume;
            if(this.volume > 100) {
                this.volume = 100;
                System.out.println("--------- @Sucesso, volume aumentado(+"+(volume)+")." );
                return;
            }
            System.out.println("--------- @Sucesso, volume aumentado(+"+volume+")." );
        } else{
            System.out.println("--------- @Erro, controle desligado.");
        }
    }

    @Override
    public void menosVolume(int volume) {
        if(this.ligado == true) {
            this.volume = this.volume - volume;
            System.out.println("--------- @Sucesso, volume diminuido(-"+volume+").");
        } else {
            System.out.println("--------- @Erro, controle desligado.");
        }
    }

    @Override
    public void ligarMudo() {
        if(this.ligado == true) {
            System.out.println("---------- @Sucesso, mudo ligado.");
        } else {
            System.out.println("---------- @Erro, controle desligado.");
        }
    }

    @Override
    public void desligarMudo() {
        if(this.ligado == true) {
            System.out.println("---------- @Sucesso, mudo desligado.");
        } else {
            System.out.println("---------- @Erro, controle desligado.");
        }
    }

    @Override
    public void play() {
        if(this.ligado == true) {
            this.tocando = true;
            System.out.println("---------- @Sucesso, play ligado.");
        } else {
            System.out.println("---------- @Erro, controle desligado.");
        }
    }

    @Override
    public void pause() {
        if(this.ligado == true) {
            this.tocando = false;
            System.out.println("---------- @Sucesso, pause ligado.");
        } else {
            System.out.println("---------- @Erro, controle desligado.");
        }
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public boolean isTocando() {
        return tocando;
    }

    public void setTocando(boolean tocando) {
        this.tocando = tocando;
    }
}
