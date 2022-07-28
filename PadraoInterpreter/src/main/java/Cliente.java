public class Cliente {
    private double pedido1;
    private double pedido2;

    public double getPedido1() {
        return pedido1;
    }

    public void setPedido1(double pedido1) {
        this.pedido1 = pedido1;
    }

    public double getPedido2() {
        return pedido2;
    }

    public void setPedido2(double pedido2) {
        this.pedido2 = pedido2;
    }

    public double calcularPedido() {
        return Loja.calcularPedido(this.pedido1, this.pedido2);
    }
}
