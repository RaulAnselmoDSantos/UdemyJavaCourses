import Model.entities.ProcessadorTarefa;

public class MainThreadsExemple {
    public static void main(String[] args) {
        System.out.println("--- Iniciando a aplicação na Thread Main: " + Thread.currentThread().getName() + " ---");

        // Instanciando as entidades (tarefas)
        ProcessadorTarefa tarefaA = new ProcessadorTarefa("Upload de Arquivo", 4);
        ProcessadorTarefa tarefaB = new ProcessadorTarefa("Geração de Relatório", 3);

        // Criando as Threads de execução
        Thread thread1 = new Thread(tarefaA, "Thread-Upload");
        Thread thread2 = new Thread(tarefaB, "Thread-Relatorio");

        // Disparando as threads (executadas em paralelo)
        thread1.start();
        thread2.start();

        // O código do Main continua executando sem esperar as outras threads terminarem
        System.out.println("--- Thread Main finalizou a inicialização das tarefas ---");
    }
}
