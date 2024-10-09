package com.trybe.acc.java;

/**
 * Método getNome().
 */
public class NullGenerator {
  /**
   * Método getNome().
   */
  public String getNome(int divisor) {

    Pessoa pessoa;
    if (divisor % 2 == 0) {
      pessoa = new Pessoa("bob");
    } else {
      pessoa = new Pessoa(null);
    }

    return pessoa.getNomeUpperCase();
  }
}
