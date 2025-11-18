package clientes;

/*
Nome
cpf
id
idade
credito
 */

import java.util.UUID;

public class Pessoa {

    private int  age, credit;
    private String id,cpf, name;
    private double saldo;

    public Pessoa(String name, int age, String cpf, double saldo) {
        String num = UUID.randomUUID().toString().substring(0, 4);
        this.id = num;
        this.age = age;
        this.credit = 100;
        this.cpf = cpf;
        this.name = name;
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "age=" + age +
                ", credit=" + credit +
                ", id='" + id + '\'' +
                ", cpf='" + cpf + '\'' +
                ", name='" + name + '\'' +
                ", saldo=" + saldo +
                '}';
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public double getSaldo(){
        return saldo;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
}
