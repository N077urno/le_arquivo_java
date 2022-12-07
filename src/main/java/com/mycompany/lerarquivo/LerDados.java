/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lerarquivo;

/**
 *
 * @author nando
 */

import java.io.BufferedReader; //Biblioteca para ler o buffer de dados
import java.io.FileReader; //Biblioteca para ler o arquivo
import java.io.IOException; //Biblioteca de erro
import java.util.Scanner; //Biblioteca para leitura do teclado

public class LerDados { //Classe para ler os dados do arquivo
    String arquivo; //armazena o nome do arquivo (incluido o caminho)
    
    void leNomeArquivo(){//método para ler o nome do arquivo
        Scanner ler = new Scanner(System.in); // ler da entrada padrão (teclado)
        System.out.println("Entre com o nome do arquivo"); //mensagem para o usuário
        this.arquivo = ler.nextLine(); //le o nome do arquivo do teclado
    }
    
    void leConteudoArquivo(){//método para ler o conteúdo do arquivo
        try{//testa o erro
            FileReader arq = new FileReader(this.arquivo); //abrir o arquivo
            BufferedReader lerConteudo = new BufferedReader(arq);//prepara para ler o conteúdo do arquivo
            
            String linha = lerConteudo.readLine();//lê uma linha do arquivo
            while(linha != null){//testa se chegamos ao final do arquivo
                System.out.println("valor no arquivo..: "+linha);//imprimir
                linha = lerConteudo.readLine();//lê a próxima linha
            }
            
            arq.close();//fecha o arquivo
        }catch(IOException e){//o erro aconteceu
            System.err.println("Erro na abertura do arquivo");//Imprime a mensagem pro usuário
            e.getMessage();//informa o erro
            
        }
    }
}
