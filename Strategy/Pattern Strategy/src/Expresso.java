class Expresso implements FreteStrategy {
    @Override
    public double calcular(double peso) {
        return peso * 15.0; // R$15 por kg
    }
}