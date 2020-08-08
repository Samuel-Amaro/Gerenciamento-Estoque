package utiuls;

/**
 * Classe que vai possuir metodos, que formatam dados, para poder ir para o DB;
 * @author SAMUE
 */
public class FormatadorDados {
    //variaveis essenciaias 
    private String novoValor = "";
    /**
     * Metodo que recebe um valor de tipo string, que esta separado por (.);
     * esse metodo vai converte o (.) para (,) e converte o tipo string para um valor double;
     * @param valor
     * @return  double(valor com (,))
     */
    public double formataValor(String valor) {
      //tenho que percorre toda a string e verificar se possui virgula separando o valor, se tiver, substituir a virgula por um .
      for(int indice = 0; indice < valor.length(); indice += 1) {
          //verifico caracter por caracter da string valor, onde for virgula trocar por ponto
          if(valor.charAt(indice) == ',') {
             novoValor += '.'; 
          }else{
              //copia todo valor antigo para o novovalor so que agora com (.)
              novoValor += valor.charAt(indice);
          }
      }
      //retorna a string formatada com o valor ja separado por (.), e convertido para double
      return Double.parseDouble(novoValor);
    }
}
