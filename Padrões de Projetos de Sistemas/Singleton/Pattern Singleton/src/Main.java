public class Main {
    public static void main(String[] args) {
        // Acessando a instância única
        RelogioGlobal relogio = RelogioGlobal.getInstancia();

        // Usando em diferentes partes do sistema
        System.out.println("Hora atual: " + relogio.getHoraAtual()); // Ex: 14:30:45

        // Verificando se é a mesma instância
        RelogioGlobal mesmoRelogio = RelogioGlobal.getInstancia();
        System.out.println("Mesmo objeto? " + (relogio == mesmoRelogio)); // true
    }
}