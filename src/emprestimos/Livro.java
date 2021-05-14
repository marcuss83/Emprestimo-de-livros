/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emprestimos;

/**
 *
 * @author SESI_SENAI
 */
public class Livro {
    
    public String nomelivro;
    public String nomedoautor;
    public int  Datadelancamento;
           
    Livro qtdlivros[]= new Livro[10];
    
    
    
    public Livro(String nomelivro, String nomedoautor, int Datadelancamento) {
        this.nomelivro = nomelivro;
        this.nomedoautor = nomedoautor;
        this.Datadelancamento = Datadelancamento;
    }
    
   
    }
    

