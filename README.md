# Sistema Para Gerenciamento-Estoque
Sistema para controle e Gerenciamento de Estoque de qualquer Segmento Comercial que necessite de organização e controle em seu estoque.
## Documentação Sistema
 * [Documentação introdução](https://github.com/Samuel-Amaro/Gerenciamento-Estoque/blob/master/Documentacao/Documentacao-Introducao.pdf)
 * [Documentação Completa](https://github.com/Samuel-Amaro/Gerenciamento-Estoque/blob/master/Documentacao/Documentacao-Completa-Sistema.pdf)
 * [Modelo Banco Dados - MR(Modelo Relacional)](https://github.com/Samuel-Amaro/Gerenciamento-Estoque/blob/master/Documentacao/Diagrama-Banco-Dados.pdf)
 * [Caso de Uso do Usúario](https://github.com/Samuel-Amaro/Gerenciamento-Estoque/blob/master/Documentacao/Diagrama-Caso-Uso-Usuario.png)
 * [Diagrama Classes Sistema](https://github.com/Samuel-Amaro/Gerenciamento-Estoque/blob/master/Documentacao/Diagrama-Classes-UML.pdf)
 ## Ferramentas Usadas Para Implementação
 * [IDE(Apache netbeans 11.01)](https://netbeans.apache.org/)
 * [SQLITE(versão 3.30.1)](https://www.sqlitetutorial.net/download-install-sqlite/)
 ## APIs Usadas e Bibliotecas
 * [Ireport Impressão de Relatórios Banco Dados](https://sourceforge.net/projects/ireport/)
 * [Library/Jar SQLITE](https://bitbucket.org/xerial/sqlite-jdbc/downloads/)
 ## Padrão de Projeto Aplicado
 * MVC(MODEL,VIEW,CONTROLLER) em um sistema desktop java;
   * O princípio básico do MVC é a divisão da aplicação em três camadas: a camada de interação do usuário (view), a camada de manipulação dos dados (model) e a camada de            controle (controller);
   * MODEL
     1. A responsabilidade dos models é representar o negócio. Também é responsável pelo acesso e manipulação dos dados na sua aplicação.
   * CONTROLER
     1. É a camada de controle, responsável por ligar o model e a view, fazendo com que os models possam ser repassados para as views e vice-versa. 
   * VIEW
     1. A view é responsável pela interface que será apresentada, mostrando as informações do model para o usuário.
 ### Prototipos Interfaces - (GUI)
 * **PREVIEW - Da interface de entrada onde usuario escolhe a sua ação no sistema!**
 
 
 ![Tela Entrada](https://github.com/Samuel-Amaro/Gerenciamento-Estoque/blob/master/Prototipos-Telas/prototipos-interfaces/prototipo-interface-entrada.png)
 * **PREVIEW DA INTERFACE DE LOGIM!**


 ![Tela Login](https://github.com/Samuel-Amaro/Gerenciamento-Estoque/blob/master/Prototipos-Telas/prototipos-interfaces/prototipo-interface-login.png)
 * **PREVIEW DA INTERFACE PRINCIPAL DO SISTEMA**
 
 
 ![Tela Principal](https://github.com/Samuel-Amaro/Gerenciamento-Estoque/blob/master/Prototipos-Telas/prototipos-interfaces/prototipo-interface-principal.png)
 * **PREVIEW DA INTERFACE DE MANIPULAÇÃO DE USUARIOS DO SISTEMA**
 
 
 ![Tela Usuario](https://github.com/Samuel-Amaro/Gerenciamento-Estoque/blob/master/Prototipos-Telas/Nova-prototipacao/prototipo-interface-usuario.png)
 * **PREVIEW DA INTERFACE DE MANIPULAÇÃO DE PRODUTOS CADASTRO, ALTERAÇÃO, EXCLUSÃO**
 
 
 ![Tela Produtos](https://github.com/Samuel-Amaro/Gerenciamento-Estoque/blob/master/Prototipos-Telas/Nova-prototipacao/prototipo-interface-produtos.png)
 * **PREVIEW DA INTERFACE DE MANIPULAÇÃO DO ESTOQUE, ONDE REGISTRA AS MOVIMENTAÇÕES DE ENTRADA E SAIDA DO ESTOQUE**
 
 
  ![Tela Estoque](https://github.com/Samuel-Amaro/Gerenciamento-Estoque/blob/master/Prototipos-Telas/Nova-prototipacao/interface-view-estoque.png)
