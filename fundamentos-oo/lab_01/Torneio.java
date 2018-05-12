/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poocc2015.pkg2.lista01;

/**
 *
 * @author maratona
 */
public class Torneio {

    private Time[] times = new Time[2];
    private int quantidadeTimes = 0;
    private int quantidadeGols = 0;

    public Torneio() {
        
    }

    public void incluirTime(Time novoTime) {
        if (quantidadeTimes < times.length) {
            times[quantidadeTimes] = novoTime;
            quantidadeTimes++;
        } else {
            System.out.println("\nNao pode ser incluido mais times!");
        }
    }

    public int quantidadeTime() {
        return quantidadeTimes;
    }

    public float calcularPesoMedioParticipantes() {
        float pesoMedioParticipantes = 0;
        Time time;

        for (int i = 0; i < quantidadeTimes; i++) {
            time = times[i];
            pesoMedioParticipantes = pesoMedioParticipantes + time.calcularPesoMedioTime();
        }
        pesoMedioParticipantes = pesoMedioParticipantes / quantidadeTimes;

        return pesoMedioParticipantes;
    }

    public float calcularIdadeMediaParticipantes() {
        float idadeMediaParticipantes = 0;
        Time time;

        for (int i = 0; i < quantidadeTimes; i++) {
            time = times[i];
            idadeMediaParticipantes = idadeMediaParticipantes + time.calcularIdadeMedioTime();
        }
        idadeMediaParticipantes = idadeMediaParticipantes / quantidadeTimes;

        return idadeMediaParticipantes;
    }

    public void calcularQuantidadeDeGols() {
        System.out.println("=============================================================");
        for (int i = 0; i < this.times.length; i++) {
            System.out.println("\nTime: " + this.times[i].getNome() + " : Gols Sofridos: " + this.times[i].getGolsSofridos() + " - Gols Realizados : " + this.times[i].getGolsRealizados());
            this.quantidadeGols += this.times[i].getGolsRealizados();
        }
        System.out.println("\nQuantidade total de gols no campeonato: " + this.quantidadeGols);
        System.out.println("=============================================================");
    }

    public void calcularTimeCampeao() {
        System.out.println("=============================================================");
        if (this.times[0].getGolsRealizados() > this.times[1].getGolsRealizados()) {
            System.out.println("Time campeao: " + this.times[0].getNome());
        } else if (this.times[1].getGolsRealizados() > this.times[0].getGolsRealizados()) {
            System.out.println("Time campeao: " + this.times[1].getNome());
        } else {
            System.out.println("Empate");
        }
        System.out.println("=============================================================");
    }

}
