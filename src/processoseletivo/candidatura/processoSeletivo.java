package processoseletivo.candidatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class processoSeletivo {
    static double salarioBase = 2000.0;

    public static void main(String[] args) {
        selecaoCandidatos();
    }

    static public double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1900.0, 2100.0);
    }

    public void emContato() {
        int tentativasRealizadas = 0;
        boolean continuarTentando = true;
        boolean atendeu = atender();

        do {
            atendeu = atender();
            continuarTentando = !atendeu;
            if (!atendeu) {
                tentativasRealizadas++;
            }
        } while (continuarTentando && tentativasRealizadas < 3);
        if (atendeu)
            System.out.println("NAO CONSEGUIMOS CONTATO");
        else
            System.out.println("ATENDEU");
    }

    static boolean atender() {
        return new Random().nextInt(3) == 1;
    }

    static void selecaoCandidatos() {
        String[] candidatos = { "FELIPE", "JULIO", "MARCIA", "JUNIOR", "JULIANA", "BELONDI", "JENNIFER", "VINICCIUS13",
                "JOAO" };

        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + "solicitou este valor de salario" + salarioPretendido);
            if (salarioBase >= salarioPretendido) {
                System.out.println("Candidato " + candidato + " selecionado para a Vaga");
                candidatosSelecionados++;
            }
            candidatoAtual++;
        }
        System.out.println("Busca de candidatos encerrado com sucesso!");
    }

    static void analisarCandidato(double salarioPretendido) {
        String msg;
        if (salarioBase > salarioPretendido) {
            msg = "CHAMAR CANDIDATO";
        } else if (salarioBase == salarioPretendido) {
            msg = "LIGAR COM CONTRA PROPOSTA";
        } else {
            msg = "AGUARDAR RESULTADO DOS DEMAIS";
        }
        System.out.println(msg);
    }
}
