class Normal implements FreteStrategy {
    @Override
    public double calcular(double peso) {
        return peso * 5.0; // R$5 por kg
    }
}