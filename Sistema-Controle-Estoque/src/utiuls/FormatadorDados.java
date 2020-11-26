/**
 * Copyright (C) <2020>  <name of Samuel Amaro>

This program is free software; you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation; either version 2 of the License, or
(at your option) any later version.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with this program; if not, write to the Free Software
Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 */

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
