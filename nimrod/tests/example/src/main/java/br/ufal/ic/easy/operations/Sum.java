package br.ufal.ic.easy.operations;

public class Sum implements Operation {

    public int impacted(int a, int b) {
        return a + this.execute(a, b);
    }

    public int execute(int a, int b) {
        return a + b;
    }
}