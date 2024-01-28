# screenmatch-consumindo-api

# Projeto de Consulta de Filmes utilizando a API OMDB

## Descrição do Projeto

Este projeto foi desenvolvido como parte do curso de Programação Orientada a Objetos oferecido pela empresa Alura. Ele reflete o entendimento abrangente de conceitos fundamentais, como Objetos, Encapsulamento, Polimorfismo, Tratamento de Exceções, e também aborda a prática de consumir uma API em Java.

### Objetivo

O objetivo principal desta aplicação é permitir aos usuários consultar informações detalhadas sobre filmes através da API OMDB. A API OMDB fornece uma vasta gama de dados relacionados a filmes, e nossa aplicação se concentra na busca por título, exibindo informações essenciais, como nome do filme, ano de publicação e duração.

### Funcionalidades Principais

1. **Consulta por Título:**
   - Os usuários podem inserir o título de um filme na aplicação.
   - A aplicação envia uma requisição à API OMDB para obter informações específicas sobre o filme desejado.
   - Os dados recuperados são apresentados ao usuário, incluindo nome do filme, ano de publicação e duração.

### Tecnologias Utilizadas

O projeto foi desenvolvido em Java, aproveitando os princípios de Programação Orientada a Objetos. Além disso, a integração com a API OMDB foi realizada de forma eficiente para garantir uma experiência de consulta de filmes fácil e intuitiva.

### Documentação da API OMDB

A API OMDB é a fonte principal de dados para este projeto. A documentação completa pode ser encontrada [aqui](https://omdbapi.com/), fornecendo detalhes sobre os endpoints disponíveis, parâmetros de consulta e exemplos práticos de uso.

> # Instruções de Execução



## Clonando um Repositório no GitHub e Criando uma Chave SSH (se necessário)

### Clonando um Repositório com HTTPS:
```markdown
1. **Copie o URL do Repositório:**
   - Vá para a página do repositório no GitHub.
   - Clique no botão "Code" e copie o URL exibido (usando HTTPS).

2. **Abra o Terminal:**
   - Abra o terminal no seu computador.

3. **Navegue até o Diretório de Destino:**
   - Use o comando `cd` para navegar até o diretório onde deseja clonar o repositório.

4. **Clone o Repositório:**
   - Cole o URL do repositório que você copiou no passo 1.
   ```bash
   git clone https://github.com/seu-usuario/nome-do-repositorio.git
   ```
   Lembre-se de substituir "seu-usuario" e "nome-do-repositorio" pelos seus detalhes de usuário e nome do repositório.

## Criando uma Chave SSH (se necessário):

1. **Verifique se você tem uma chave SSH:**
   - Abra o terminal.
   - Digite o seguinte comando:
     ```bash
     ls -al ~/.ssh
     ```

2. **Crie uma nova chave SSH (se não tiver uma):**
   - Execute o seguinte comando, substituindo seu endereço de e-mail.
     ```bash
     ssh-keygen -t rsa -b 4096 -C "seu-email@example.com"
     ```
     Pressione Enter para aceitar o caminho padrão e insira uma senha se desejar.

3. **Adicione a Chave SSH ao Agente SSH:**
   - Execute os seguintes comandos:
     ```bash
     eval "$(ssh-agent -s)"
     ssh-add ~/.ssh/id_rsa
     ```

4. **Copie a Chave SSH para a Área de Transferência:**
   - Use o seguinte comando para copiar a chave SSH:
     ```bash
     pbcopy < ~/.ssh/id_rsa.pub
     ```
     Este comando é específico para sistemas macOS. Se estiver usando Linux ou Windows, consulte a documentação apropriada para copiar a chave.

5. **Adicione a Chave SSH ao GitHub:**
   - Vá para as configurações de SSH do GitHub.
   - Adicione uma nova chave SSH, colando o conteúdo copiado.

Agora você deve ser capaz de clonar repositórios usando SSH. Se você ainda preferir usar HTTPS, siga as instruções iniciais de clonagem mencionadas acima.
```

Agora, este conteúdo está formatado em Markdown. Você pode copiar e colar diretamente em um arquivo com extensão ".md".



Este projeto é uma oportunidade de aplicar e consolidar os conhecimentos adquiridos no curso de Programação Orientada a Objetos, proporcionando uma prática valiosa na manipulação de objetos, tratamento de exceções e integração de APIs em Java.