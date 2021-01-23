# Loja De Livros Online: Mundo Do Desenvolvedor

Este projeto é uma loja virtual de livros. Esta loja foi desenvolvida pensando no mundo do desenvolvedor, 
ela é voltada para todas as áreas de desenvolvimento desde o front-end até o back-end, mas nada impede também
de ser utilizada para a venda de qualquer livro! :stuck_out_tongue_winking_eye:

Objetivo:

Construir uma loja vitual de livros voltados para a grande e maravilhosa área do desenvolvimento de software. :heart_eyes: :computer:

# Tecnologias utilizadas: 

* Java (Versão 8); 
* JavaEE;
* Bcrypt;
* Maven;
* WildFly;
* Frameworks: JSF; JPA; Myfaces; Bootstrap;
* APIs: JAAS; Java Mail
* Mysql;
* HTML;
* Css;
* Javascript

# Pre-requisitos:

1. Baixar e descompactar o servidor de aplicação WildFly versão 16. Com o servidor baixado e descompactado vá para a pasta: wildfly-16.0.0.Final\standalone\configuration, substitua o conteudo do arquivo standalone-full.xml pelo conteudo do arquivo, standalone-full.txt, que se encontra na raiz do projeto. :file_folder:

2. Dentro da pasta Modules, que se encontra dentro do servidor de aplicação WildFly crie uma pasta com a seguinte estrutura: \com\mysql\main, logo após a criação da pasta criar um arquivo de nome: module.xml e colocar dentro desse arquivo o conteúdo, que esta dentro do arquivo de nome: module.txt. O arquivo module.txt se encontra na raiz do projeto, não esqueça de colocar,também dentro dessa pasta o driver conector do banco de dados do Mysql que é o: mysql-connector. O driver mysql-connector está disponível dentro do projeto na pasta: \src\main\drivers. :open_file_folder:

3. Criar uma pasta no diretório local do computador com o nome: lojaonline e dentro dela criar uma outra pasta de nome: Livros. Ex: C:\lojaonline\Livros. É nessa pasta que ficará todas as imagens das capas dos
livros.

Obs: Para fazer o envio dos e-mails foi criado um e-mail fake :email:. O usuário e a senha do e-mail são:
Usuário: compras.livraria.lojaonline@gmail.com
Senha: Compr@sLoj@Onlin3

Caso queira testar e receber um e-mail da compra de um livro em outro e-mail que não seja, compras.livraria.lojaonline@gmail.com, não esqueça de habilitar a opção de acesso a app menos seguros. Esse recurso está disponível em todas as configurações de e-mail. :mailbox_with_no_mail:

:wink: :sunglasses: :heart_eyes:
