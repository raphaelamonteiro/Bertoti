# 📝 Atividade: Fazer classes UML ao lado de código java mostrando a relação entre eles como fizemos no quadro:

## Relações Entre Classes

### Usuario e Livro
#### Relacionamento - Associação: Um Usuario pode emprestar e devolver vários Livros. Essa relação é geralmente representada em UML com uma linha conectando as duas classes, frequentemente com uma multiplicidade indicando que um usuário pode lidar com múltiplos livros, e cada livro pode ser emprestado por diferentes usuários ao longo do tempo.
<br> Implementação: O Usuario tem métodos como "emprestarLivro(Livro livro)" e "devolverLivro(Livro livro)" que interagem diretamente com a classe **Livro**.

### Biblioteca e Livro

#### Relacionamento - Associação: A Biblioteca contém uma coleção de Livros. Isso significa que a Biblioteca tem uma lista de livros que está gerenciando, e pode adicionar ou remover livros dessa lista.
<br> Implementação: A classe Biblioteca tem uma lista de Livros e métodos para adicionar e remover livros dessa lista.


### Biblioteca e Usuario

#### Relacionamento - Associação: A Biblioteca também mantém uma lista de Usuarios. Isso significa que a Biblioteca gerencia a lista de usuários que estão registrados, permitindo adicionar e remover usuários.
<br> Implementação: A classe Biblioteca tem uma lista de Usuarios e métodos para adicionar e remover usuários dessa lista.

Descrição dos Relacionamentos
Biblioteca e Livro:

A Biblioteca gerencia uma coleção de Livros, o que implica que cada Biblioteca tem zero ou mais Livros (1
).
Biblioteca e Usuario:

A Biblioteca também gerencia uma coleção de Usuarios, o que implica que cada Biblioteca pode ter zero ou mais Usuarios (1
).
Usuario e Livro:

Um Usuario pode emprestar e devolver vários Livros, mas um Livro pode ser emprestado por diferentes Usuarios ao longo do tempo. A relação pode ser descrita como muitos-para-muitos (N
) no contexto de um sistema real, mas simplificamos para facilitar a compreensão.
Implementação de Relacionamentos no Código
Aqui está uma visão geral de como as interações são implementadas:

Biblioteca e Livro:
Biblioteca contém métodos para adicionar e remover Livros de sua lista.
Biblioteca e Usuario:
Biblioteca contém métodos para adicionar e remover Usuarios de sua lista.
Usuario e Livro:
Usuario interage com Livro através de métodos como emprestarLivro e devolverLivro.


https://www.ibm.com/docs/pt-br/rsas/7.5.0?topic=diagrams-association-classes
