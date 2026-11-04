import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        double valorProduto = 100.0;

        List<Empresa> empresas = new ArrayList<>();

        empresas.add(new EmpresaA());
        empresas.add(new EmpresaB());
        empresas.add(new EmpresaC());

        for (Empresa empresa : empresas) {
            double resultado = empresa.calcularFrete(valorProduto);
            System.out.println("Resultado com a condição: \n" + empresa.getClass().getSimpleName() + "\n" + "Frete : " + resultado);
        }

    }
}