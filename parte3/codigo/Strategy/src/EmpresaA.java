public class EmpresaA extends Empresa{
    @Override
    public double calcularFrete(double valor) {
        return valor * 0.10;
    }
}
