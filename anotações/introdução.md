# o que é o Java:

A linguagem Java é composta por um conjunto bem definido de funcionalidades.

- Orientada a objetos
- Plataforma independente
    - Bytecode
- Portátil
    - O conceito WORA (Write once run anywhere) e o recurso independente de plataforma tornam o java portátil. Os desenvolvedores podem obter o mesmo resultado em qualquer máquina, escrevendo o código apenas uma vez.
- Robusta
    - Capaz de lidar com o encerramento inesperado de um programa.
    - Usa gerenciamento de memória forte
    - fornece coleta de lixo automática
    - há tratamento de exceção e mecanismo de verificação de tipos em Java.
- Segura
    - Problemas como ameaças de vírus, adulteração, espionagem ou representação podem ser tratados ou minimizados usando Java.
- Interpretada
    - Os programas Java são compilados para gerar arquivos de Bytecode e a JVM ( Java Virtual Machine) interpreta o arquivo Bytecode durante a execução.
- Multi-thread
    - Subprocesso leve e independente de um programa em execução que compartilha recursos.

## História:

Interessada em dispositivos eletrônicos inteligentes, a Sun Microsystems financiou uma pesquisa interna com o codinome Green em 1991. O projeto resultou no desenvolvimento de uma linguagem baseada em C e C++ que seu criador, James Gosling, chamou de Oak (carvalho) em homenagem a uma árvore que dava para a janela do seu escritório na Sun.

Descobriu-se mais tarde, que já havia uma linguagem de computador chamada Oak. Quando uma equipe da Sun visitou uma cafeteria local, o nome Java (cidade de origem de um tipo de café importado) foi sugerido e pegou. Mas o projeto Green atravessava algumas dificuldades. O mercado para dispositivos eletrônicos inteligentes destinados ao consumidor final, não estava se desenvolvendo tão rapidamente como a Sun tinha previsto. Pior ainda, um contrato importante pelo qual a Sun competia fora concedido a outra empresa. Então, o projeto estava em risco de cancelamento. Por pura sorte, a World Wide Web explodiu em popularidade em 1993 e as pessoas da Sun viram o imediato potencial de utilizar Java para criar páginas da Web com o chamado conteúdo dinâmico. Isso deu nova vida ao projeto.
Em maio de 1995, a Sun anunciou Java formalmente em uma conferência importante. Normalmente, um evento como esse não teria gerado muita atenção. Entretanto, Java gerou interesse imediato na comunidade comercial, por causa do fenomenal interesse pela World Wide Web.

## Ambiente de Desenvolvimento Java

Para aumentar nossa produtividade, nós podemos escolher algumas ferramentas denominadas de IDE - Integrated Development Environment ou Ambiente de Desenvolvimento Integrado.

dispõe de recursos que auxiliam muito nosso desenvolvimento, como:

- Aceleração de nossa escrita com **Auto-complete** ou **IntelliSense;**
- Formatação de palavras e blocos de códigos;
- Análise de erro de sintaxe;
- Compilação de programa;
- Depuração (acompanhamento) de execução do programa.

<img src=”[https://img.shields.io/badge/Visual_Studio_Code-0078D4?style=for-the-badge&logo=visual studio code&logoColor=white](https://img.shields.io/badge/Visual_Studio_Code-0078D4?style=for-the-badge&logo=visual%20studio%20code&logoColor=white)”>

<img src=”[https://img.shields.io/badge/IntelliJ_IDEA-000000.svg?style=for-the-badge&logo=intellij-idea&logoColor=white](https://img.shields.io/badge/IntelliJ_IDEA-000000.svg?style=for-the-badge&logo=intellij-idea&logoColor=white)”>

<img src=”[https://img.shields.io/badge/Eclipse-2C2255?style=for-the-badge&logo=eclipse&logoColor=white](https://img.shields.io/badge/Eclipse-2C2255?style=for-the-badge&logo=eclipse&logoColor=white)”>

## Eclipse

O [Eclipse IDE](https://www.eclipse.org/downloads/) é uma alternativa muito comum de encontrar ambientes de desenvolvimento, principalmente pelo aspecto de uma interface simples, plugins para recursos adicionais, atalhos para operações de menu e de escrita e para quem trabalha com Java Swing, pode adicionar o plugin [WindowBuilder](https://www.eclipse.org/windowbuilder/download.php) que de dispõe de uma interface gráfica para criar as telas, gerando o código de layout para o desenvolvedor.

## IntelliJ

O [IntelliJ](https://www.jetbrains.com/pt-br/idea/) é uma plataforma de código aberto, para criação de IDEs e ferramentas para desenvolvedores, mas nem todos os recursos estão disponíveis de forma gratuita.

Mesmo com a proposta de ser inteligente, talvez em um primeiro contato, é difícil já desfrutar de todos os recursos, fazendo com que você opte por mudar ou voltar para uma IDE como o Eclipse. Claro que não podemos deixar de destacar que, muitas coisas a gente não precisa, como: Salvar aquivo, encode padrão UTF-8 e sugestões que vão surgindo ao longo das nossas interações com a ferramenta.

## Visual Studio Code

Desenvolvido pela Microsoft, é um editor de texto muito simples e interativo que conta com inúmeras extensões, temas variados e integração com tecnologias como NodeJS e Java.

Comparando-se em performance, o [VS Code](https://code.visualstudio.com/docs/languages/java) demonstra um grande desempenho de inicialização, codificação e execução dos programas desenvolvidos.

**Maven**
É uma ferramenta de automação de compilação, utilizada primariamente em projetos Java, mas hoje também é utilizada para construir e gerenciar projetos escritos em C#, Ruby, Scala e outras linguagens.

## **Configurando o ambiente**

Para começar a desenvolver em Java, é necessário que tenhamos o JDK instalado.

- Busque no Google por Java [JDK xxx](https://www.oracle.com/br/java/technologies/javase/javase8-archive-downloads.html) (versão desejada);
- Selecione a opção **.exe** de acordo com o seu sistema operacional.
- Depois, você precisará realizar um login no site da [Oracle](https://login.oracle.com/mysso/signon.jsp).
- Após realizar o download, executar o instalador para instalar o Java no Windows. Este processo instalará tanto o **JDK** quanto a **JRE**.
- Precisamos agora, validar se a instalação também já configurou nossa variável de ambiente, para poder executar o Java pelo Prompt de comando ou PowerShell do Windows.
- Abra o Prompt de comando e execute o comando `java -version`.

## Integrando o VSCode com o GitHub:

**no VSCode**: 

- ctrl + shit+ P → Git clone
- ctrl + shit+ P → projeto java

**no ícone de Source Control:** 

- digita a mensagem para o commit
- clica em commit e sincronizar changes