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
public class Emprestimo {
    
   public Livro livro;
   public Pessoa pessoa;
    
    private int vc = 0;
    
    public void mostrarlivros (){
       
            System.out.println("Nome do livro " + this.livro.nomelivro);
            System.out.println("Nome do autor " + this.livro.nomedoautor);
            System.out.println("Ano de lançamento " + this.livro.Datadelancamento);
            System.out.println(" Pessoa cadstrada " + this.pessoa.nome);
        }
    
    }
    

    

