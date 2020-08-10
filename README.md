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
 * **PREVIEW - DE COMO USUARIO SE AUTENTICA NO SISTEMA, E MOSTRANDO A INTERFACE PRINCIPAL!**
 
 
 ![Tela Entrada](https://github.com/Samuel-Amaro/Gerenciamento-Estoque/blob/master/videos-para-gif-readme/preview-entrada-login-principal.gif)
 * **PREVIEW DA INTERFACE DE PRODUTOS - MOSTRANDO COMO SE CADASTRAR UM PRODUTO, ALTERAR UM PRODUTO, EXCLUIR UM PRODUTO!**


 ![Tela Entrada](https://github.com/Samuel-Amaro/Gerenciamento-Estoque/blob/master/videos-para-gif-readme/preview-crud-produtos.gif)
 * **UTILIZAÇÃO DA INTERFACE DE USUARIO, PREVIEW DE COMO UM USUARIO CADASTRA UM NOVO USUARIO, E COMO ALTERA O DADOS RELACIONADO A ESSE NOVO USUARIO**
 
 
 ![Tela Entrada](https://github.com/Samuel-Amaro/Gerenciamento-Estoque/blob/master/videos-para-gif-readme/preview-crud-usuario-certo.gif)
 * Interface CRUD(Estoque)
 
 
 ![Tela Estoque](https://github.com/Samuel-Amaro/Gerenciamento-Estoque/blob/master/Prototipos-Telas/prototipo-interface-estoque.PNG)
 * Interface Principal
 
 
 ![Tela Principal](https://github.com/Samuel-Amaro/Gerenciamento-Estoque/blob/master/Prototipos-Telas/prototipo-interface-principal.PNG)
