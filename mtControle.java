/* ALUNA: NATÁLIA FREITAS ARAUJO
   ENGENHARIA DA COMPUTAÇÃO - 2015 / 2017.4
   DISCIPLINA: TEORIA DA COMPUTAÇÃ0
*/

import java.util.ArrayList;

public class mtControle {
    //Arrays que irão armazenar as transições escritas pelos os usuarios
        ArrayList<String> posicaoAtual = new ArrayList(); // ESTADO ATUAL
        ArrayList<String> posicaoProxima = new ArrayList(); // PROXIMO ESTADO
        ArrayList<String> valorLido = new ArrayList(); // VALOR LIDO
        ArrayList<String> valorEscrever = new ArrayList(); // VALOR A SER ESCRITO
        ArrayList<String> direcao = new ArrayList(); //DIREÇÃO (E)squerda OU (D)ireita
        ArrayList<String> estadosFinais = new ArrayList(); //ESTADOS FINAIS (qf)
        ArrayList<String> alfabeto = new ArrayList(); // ARMAZENA O ALFABETO
        ArrayList<String> fita = new ArrayList(); //FITA
    //variaveis de auxilio
        String estadoInicial;
        int i, j, t, f;
     
       //recupera as TRANSICOES da classe mtTela
       public void recuperarTransicao (String pA, String vL, String pP, String vE, String d){
            i = posicaoAtual.size();
            this.posicaoAtual.add(i, pA);
            this.valorLido.add(i, vL);
            this.posicaoProxima.add(i, pP);
            this.valorEscrever.add(i, vE);
            this.direcao.add(i, d);
       }
       
       //recupera o estado inicial na classe mtControle
       public String recuperarEI(String qI){
          this.estadoInicial  = qI;
          return qI;
       } 
       
       //recupera o(s) estado(s) final(is) na classe mtControle
       public String recuperarEF (String qF){
           i = estadosFinais.size();
           this.estadosFinais.add(i, qF);
           return estadosFinais.get(i);
       }
       //recupera o alfabeto
       public String recuperarAlf(String alf){
           i = alfabeto.size();
           this.alfabeto.add(i, alf);
           return alfabeto + "";
       }
        
       //recupera a palavra na classe mtControle
       public String recuperarPalavra (String p){
           String aux;
           fita.clear();
           char[] fa = p.toCharArray(); //transformo a palavra em uma Array de caractere
           this.fita.add(0, "*"); // Primeira posição da fita "*"
           //preenhendo a fita
           for(j=1; j<= p.length(); j++){
               aux = String.valueOf(fa[j-1]); //transforma para String
               this.fita.add(j, aux); // adiciona a fita
           }
           this.fita.add(j, "$"); //add o branco
           System.out.println(fita);
           return checarPalavra(); // checa se a palavra pertence ao alfabeto
       }
       
       
       //verifica se a palavra está de acordo com o alfabeto
       public String checarPalavra(){
           int controle = 0;
           for(int y = 1 ; y < fita.size()-1; y++){
               for(int z = 0; z < alfabeto.size(); z++){
                   if(fita.get(y).equals(alfabeto.get(z))){
                       controle ++;
                   }
               }
           }

           if(controle==fita.size()-2){
               return "inicio";
           }
           else{
               return "fim";
           }
       }
       
       //busca para o método maquinaT() o indice das transições
       public int buscarT (String q, String valorL){
           int c = 0, aa = 0;

           for(int x =0; x < posicaoAtual.size(); x++){
               if (q.equals(posicaoAtual.get(x)) && valorL.equals(valorLido.get(x))){
                   c = x;
                   aa=1; //marca que passou no if
               }
           }
           //quando não se acha um transição correspndente e a palavra não é válida
           if(aa==0){
               c = -1;
               return c;
           }else{
               return c;
           }
       }
       
       //busca para o metodo maquinaT() se o estado atual é ou não o final
       public String buscarEstadosF(String q){
           String retorno = "continuar";
           for(int x=0; x <estadosFinais.size(); x++){
               if(q.equals(estadosFinais.get(x))){
                   retorno = "fim";
               }
           }
           return retorno;
       }
       
       //limpa transições para nova Maquina
       public void clearT(){
        posicaoAtual.clear();
        posicaoProxima.clear();
        valorLido.clear();
        valorEscrever.clear();
        direcao.clear();
        estadosFinais.clear();
        alfabeto.clear();
       }

}