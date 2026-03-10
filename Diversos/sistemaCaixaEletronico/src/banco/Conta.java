package banco;

import users.Cliente;

public class Conta {
    private Cliente cliente;
    private String numconta;
    private double saldo;
    private boolean status;

    public Conta(String numconta, Cliente cliente){
        this.cliente = cliente;
        this.numconta = numconta;
        this.saldo = 0;
        this.status = true;
    }

    public void deposito(double valor) {
        if (status) {
            this.saldo += valor;
        }else
            throw new RuntimeException("Conta inativa");
    }

    public void saque(double valor) {
        if (status)
            if (saldo >= valor) {
                this.saldo -= valor;
            } else {
                throw new RuntimeException("Saldo insuficiente");
            }
    }

    public double extrato() {
        return this.saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getNumconta() {
        return numconta;
    }

    public void setNumconta(String numconta) {
        this.numconta = numconta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
