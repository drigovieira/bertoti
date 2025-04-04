public class Sedex  implements FreteStrategy{
    @Override
    public double calcular(double peso) {
        return peso * 10.0;
    }
}
