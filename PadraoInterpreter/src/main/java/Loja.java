public class Loja {
    public static String formula = "pedido1 / 2 + pedido2";

    public static double calcularPedido(double pedido1, double pedido2) {
        String expressao;
        expressao = formula.replace("pedido1", Double.toString(pedido1));
        expressao = expressao.replace("pedido2", Double.toString(pedido2));
        InterpretadorExpressao interpretador = new InterpretadorExpressoesAritmeticas(expressao);
        return interpretador.interpretar();
    }
}
