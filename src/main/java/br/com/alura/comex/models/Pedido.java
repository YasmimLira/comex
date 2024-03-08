package br.com.alura.comex.models;

import java.math.BigDecimal;

public class Pedido {
    private int id;
    private Cliente cliente;
    private double preco;
    private int quantidade;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "id=" + id + "\n" +
                ", cliente=" + cliente + "\n" +
                ", preco=" + preco + "\n" +
                ", quantidade=" + quantidade + "\n" +
                ", valor total = " + getValorTotal() +
                '}';
    }

    public boolean isMaisBaratoQue(Pedido outroPedido) {
        if (this.preco < outroPedido.getPreco()) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isMaisCaroQue(Pedido outroPedido) {
        if (this.preco > outroPedido.getPreco()) {
            return true;
        } else {
            return false;
        }
    }

    public BigDecimal getValorTotal() {
        BigDecimal precoBigDecimal = BigDecimal.valueOf(this.preco);
        BigDecimal quantBigDecimal = BigDecimal.valueOf(this.quantidade);
        return precoBigDecimal.multiply(quantBigDecimal);
    }
}
