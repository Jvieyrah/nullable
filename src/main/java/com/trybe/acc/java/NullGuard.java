package com.trybe.acc.java;

/**
 * tex2 author joao.
 *
 */
public class NullGuard {
  /**
   * tex2 author joao.
   *
   */
  public String printName(int divisor) {
    //seu código será inserido aqui
    NullGenerator instancia = new NullGenerator();
    try {
      return instancia.getNome(divisor);
    } catch(NullPointerException e) {
      return "nome nulo";
    }
}
}}
