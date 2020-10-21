/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metodos_Abstratos;

/**
 *
 * @author João Victor
 */
public enum TipoDocumento {
    
    CPF {
        @Override
        public String geraNumeroTeste() {
            return GeraCpfCnpj.imprimeCPF(CPF);
        }
    }, CNPJ {
        @Override
        public String geraNumeroTeste() {
            return GeraCpfCnpj.imprimeCNPJ(CNPJ);
        }
    };
    
    public abstract String geraNumeroTeste();
}
