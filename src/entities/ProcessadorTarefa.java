package entities;

public class ProcessadorTarefa implements Runnable {

    private final String nomeTarefa;
    private final int totalPassos;

    public ProcessadorTarefa(String nomeTarefa, int totalPassos) {
        this.nomeTarefa = nomeTarefa;
        this.totalPassos = totalPassos;
    }

    @Override
    public void run() {
        System.out.println(" [Início] Tarefa: " + nomeTarefa + " iniciada pela thread: " + Thread.currentThread().getName());

        for (int i = 1; i <= totalPassos; i++) {
            System.out.println(" [" + nomeTarefa + "] Processando passo " + i + "/" + totalPassos);
            try {
                // Simula um trabalho pesado fazendo a thread dormir por 500ms
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.err.println(" Tarefa " + nomeTarefa + " foi interrompida.");
                Thread.currentThread().interrupt(); // Boa prática: restaura a flag de interrupção
            }
        }

        System.out.println(" [Fim] Tarefa: " + nomeTarefa + " concluída!");
    }
}