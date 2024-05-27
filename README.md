API de Produtos
Bem-vindo à API de Produtos! Esta API REST permite gerenciar informações de produtos, incluindo criação, leitura, atualização e exclusão de produtos. A API utiliza PostgreSQL como banco de dados.

Sumário
Introdução
Instalação
Configuração
Endpoints
Estrutura do Banco de Dados
Execução de Testes
Contribuição
Licença
Introdução
A API de Produtos permite operações CRUD (Create, Read, Update, Delete) para gerenciar um catálogo de produtos. É uma API RESTful desenvolvida utilizando Node.js com Express e PostgreSQL.

Instalação
Clone o repositório:

sh
Copy code
git clone https://github.com/seu-usuario/api-produtos.git
cd api-produtos
Instale as dependências:

sh
Copy code
npm install
Configure as variáveis de ambiente (ver seção Configuração).

Execute as migrações para configurar o banco de dados:

sh
Copy code
npx sequelize-cli db:migrate
Inicie o servidor:

sh
Copy code
npm start
Configuração
Crie um arquivo .env na raiz do projeto com as seguintes variáveis de ambiente:

env
Copy code
DB_HOST=localhost
DB_PORT=5432
DB_NAME=nome_do_banco
DB_USER=usuario
DB_PASSWORD=senha
PORT=3000
Substitua nome_do_banco, usuario, e senha com as informações do seu banco de dados PostgreSQL.

Endpoints
Criar Produto
URL: /produtos
Método: POST
Descrição: Cria um novo produto.
Corpo da Requisição:
json
Copy code
{
    "nome": "Nome do Produto",
    "descricao": "Descrição do Produto",
    "preco": 100.00,
    "estoque": 50
}
Resposta de Sucesso:
Código: 201 Created
Corpo:
json
Copy code
{
    "id": 1,
    "nome": "Nome do Produto",
    "descricao": "Descrição do Produto",
    "preco": 100.00,
    "estoque": 50,
    "createdAt": "2024-05-27T12:00:00.000Z",
    "updatedAt": "2024-05-27T12:00:00.000Z"
}
Listar Produtos
URL: /produtos
Método: GET
Descrição: Lista todos os produtos.
Resposta de Sucesso:
Código: 200 OK
Corpo:
json
Copy code
[
    {
        "id": 1,
        "nome": "Nome do Produto",
        "descricao": "Descrição do Produto",
        "preco": 100.00,
        "estoque": 50,
        "createdAt": "2024-05-27T12:00:00.000Z",
        "updatedAt": "2024-05-27T12:00:00.000Z"
    },
    ...
]
Obter Produto
URL: /produtos/:id
Método: GET
Descrição: Obtém os detalhes de um produto específico.
Parâmetros da URL: id (ID do produto)
Resposta de Sucesso:
Código: 200 OK
Corpo:
json
Copy code
{
    "id": 1,
    "nome": "Nome do Produto",
    "descricao": "Descrição do Produto",
    "preco": 100.00,
    "estoque": 50,
    "createdAt": "2024-05-27T12:00:00.000Z",
    "updatedAt": "2024-05-27T12:00:00.000Z"
}
Atualizar Produto
URL: /produtos/:id
Método: PUT
Descrição: Atualiza as informações de um produto específico.
Parâmetros da URL: id (ID do produto)
Corpo da Requisição:
json
Copy code
{
    "nome": "Nome do Produto Atualizado",
    "descricao": "Descrição do Produto Atualizada",
    "preco": 150.00,
    "estoque": 40
}
Resposta de Sucesso:
Código: 200 OK
Corpo:
json
Copy code
{
    "id": 1,
    "nome": "Nome do Produto Atualizado",
    "descricao": "Descrição do Produto Atualizada",
    "preco": 150.00,
    "estoque": 40,
    "createdAt": "2024-05-27T12:00:00.000Z",
    "updatedAt": "2024-05-27T12:30:00.000Z"
}
Deletar Produto
URL: /produtos/:id
Método: DELETE
Descrição: Deleta um produto específico.
Parâmetros da URL: id (ID do produto)
Resposta de Sucesso:
Código: 204 No Content
Estrutura do Banco de Dados
A tabela Produtos possui a seguinte estrutura:

Coluna	Tipo	Descrição
id	INTEGER	Chave primária, auto-incremento
nome	STRING	Nome do produto
descricao	STRING	Descrição do produto
preco	DECIMAL	Preço do produto
estoque	INTEGER	Quantidade em estoque
createdAt	TIMESTAMP	Data de criação
updatedAt	TIMESTAMP	Data de última atualização
Execução de Testes
Para executar os testes, utilize o comando:

sh
Copy code
npm test
Contribuição
Contribuições são bem-vindas! Por favor, siga os passos abaixo:

Fork o projeto.
Crie uma nova branch (git checkout -b feature/nova-feature).
Faça commit das suas mudanças (git commit -am 'Adiciona nova feature').
Faça push para a branch (git push origin feature/nova-feature).
Abra um Pull Request.
Licença
Este projeto está licenciado sob a licença MIT. Veja o arquivo LICENSE para mais detalhes.






