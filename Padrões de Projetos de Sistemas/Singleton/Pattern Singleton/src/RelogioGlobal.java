import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class RelogioGlobal {
    // 1. Atributo estático da única instância
    private static RelogioGlobal instancia;

    // 2. Construtor privado (ninguém pode criar instâncias com 'new')
    private RelogioGlobal() {}

    // 3. Método estático de acesso global
    public static RelogioGlobal getInstancia() {
        if (instancia == null) {
            instancia = new RelogioGlobal();
        }
        return instancia;
    }

    // Método de negócio
    public String getHoraAtual() {
        return LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss"));
    }
}