public class EmpresaB extends Empresa{
    @Override
    public double calcularFrete(double valor) {
        return valor * 0.15;
    }
}
