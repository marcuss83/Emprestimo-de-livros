/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emprestimos;

import java.util.Scanner;

public class Emprestimos {

    public static void main(String[] args) {

        Scanner sc1 = new Scanner(System.in);
        int ler;
        String n;
        int a;
        String b;
        int c;
        int l;
        int r;

        System.out.println("Emprestimos de livro");
        System.out.println("-------------------------------------------------------------------");
        System.out.println("Aperte 1 para pedir o livro ou aperte 0 para encerrar o aplicativo");

        ler = sc1.nextInt();

        if (ler >= 1) {
            System.out.println("Vamos criar 1 cadastro primeiro");
        } else {
            System.out.println("Até a proxima leitura :3");
            System.exit(0);
        }

        Scanner sc2 = new Scanner(System.in);
        System.out.println("Digite seu nome");
        n = sc2.nextLine();
        System.out.println("Digite seu email");
        b = sc2.nextLine();
        System.out.println("Digite seu cpf");
        c = sc2.nextInt();
        System.out.println("Digite seu numero de contato");
        a = sc2.nextInt();

        Pessoa p1 = new Pessoa(n, b, c, a);

        Livro l1 = new Livro("As aventuras de marcus hacking", "Autor Marcus", 2018);
        Livro l2 = new Livro("Os 3 maandrakinhos", "Autor Marcus", 2017);
        Livro l3 = new Livro("Fique rico ou morra tentando", "50 Cent", 2014);
        Livro l4 = new Livro("Anos 90", "Autor Jonah hill", 2018);
        Livro l5 = new Livro("Ganhe dinheiro com Libid Gel", "Autor Lobo mau", 2019);
        Livro l6 = new Livro("Ser rico é relativo ?", "Autor Van gogh", 2017);
        Livro l7 = new Livro("Historias cabulosas ", "Autor Xing lau ling", 2012);
        Livro l8 = new Livro("Como aumentar seu amigao", "Autor Maru XXX", 2021);
        Livro l9 = new Livro("Aprendendo Grow", "Autor Tomazine 420", 2019);
        Livro l10 = new Livro("Booyz in the hood", "Autor Ice Cube", 1992);

        System.out.println("Agora com sua conta criada escolha um livro");

        Livro mostraropcoes[] = new Livro[10];
        mostraropcoes[0] = l1;
        mostraropcoes[1] = l2;
        mostraropcoes[2] = l3;
        mostraropcoes[3] = l4;
        mostraropcoes[4] = l5;
        mostraropcoes[5] = l6;
        mostraropcoes[6] = l7;
        mostraropcoes[7] = l8;
        mostraropcoes[8] = l9;
        mostraropcoes[9] = l10;

        for (int i = 0; i < mostraropcoes.length; i++) {
            System.out.println("----------------------------------------------------------");
            System.out.println("["+i+"] - CÓDIGO PARA ESCOLHA");
            System.out.println(mostraropcoes[i].nomelivro);
            System.out.println(mostraropcoes[i].nomedoautor);
            System.out.println(mostraropcoes[i].Datadelancamento);

        }
        Scanner sc3 = new Scanner(System.in);
        System.out.println("Digite o codigo do livro escolido");
        l = sc3.nextInt();
        
       System.out.println(mostraropcoes[l]);
       
       Emprestimo i1 = new Emprestimo ();
       i1.livro = mostraropcoes[l];
       i1.pessoa = p1;
       
       System.out.println("------------------------------------");
       System.out.println(" Aqui estão os dados do emprestimo");
       i1.mostrarlivros();
       Scanner sc4 = new Scanner(System.in);
       System.out.println("-----------------");
       System.out.println("Digite 1 para confirmar ou reinicie o programa");
       r = sc4.nextInt();
       if (ler >= 1){
           System.out.println("Obrigado por usar nossos serviços");
          
       }else 
           System.out.println("REINICIANDO");
System.exit(0);
        
       
        
                
             
    }
}
