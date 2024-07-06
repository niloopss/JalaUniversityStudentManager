# Atividade 3 - Tarefa I - JalaUniversityStudentManager  
## JalaUManager  
JalaUManager é um sistema de gerenciamento de alunos em uma universidade. Ele permite adicionar alunos, atribuir cursos e notas, além de listar alunos por curso ou exibir todos os alunos cadastrados. O código-fonte deste projeto foi totalmente documentado utilizando JavaDocs, facilitando a compreensão e manutenção do sistema.

## Descrição
JalaUManager permite realizar as seguintes operações:  
1. **Adicionar Aluno:**  
- Coleta o nome e a nota inicial do aluno.  
- Cria um objeto da classe Aluno para representar o novo aluno.  
- Adiciona o objeto Aluno à lista de alunos da universidade (Universidade).  
2. **Atribuir Curso a Aluno:**
- Solicita o nome do aluno e o nome do curso.   
- Procura o aluno na lista da universidade.  
- Se o aluno for encontrado, adiciona o curso à lista de cursos do aluno.  
- Se o aluno não for encontrado, exibe uma mensagem de erro.  
3. **Atribuir Nota a Aluno:**  
- Solicita o nome do aluno e a nova nota.  
- Procura o aluno na lista da universidade.  
- Se o aluno for encontrado, atualiza a nota do aluno.  
- Se o aluno não for encontrado, exibe uma mensagem de erro.  
4. **Listar Alunos por Curso:**  
- Solicita o nome do curso.  
- Filtra os alunos que estão matriculados no curso informado.  
- Se alunos forem encontrados, exibe os nomes dos alunos.  
- Se nenhum aluno for encontrado, exibe uma mensagem de erro.  
5. **Listar Todos os Alunos:**
- Exibe as informações de todos os alunos cadastrados na universidade (nome, nota e cursos).  


## Fluxograma

![Fluxograma - JalaUManager - Mermaid.png](Fluxograma%20-%20JalaUManager%20-%20Mermaid.png)

**Análise do Fluxograma:**  
Ele se inicia com um menu principal (Menu) que oferece as seguintes opções:

1. **Adicionar Aluno:** O sistema solicita o nome e a nota inicial do aluno, cria um objeto Aluno e o adiciona à universidade.
2. **Atribuir Curso:** O sistema solicita o nome do aluno e o nome do curso, encontra o aluno e, se existir, adiciona o curso à sua lista de cursos. Caso contrário, exibe uma mensagem de erro.
3. **Atribuir Nota:** O sistema solicita o nome do aluno e a nova nota, encontra o aluno e, se existir, atualiza sua nota. Caso contrário, exibe uma mensagem de erro.
4. **Listar por Curso:** O sistema solicita o nome do curso, filtra os alunos matriculados nesse curso e os exibe. Se não houver alunos, exibe uma mensagem de erro.
5. **Listar Todos:** O sistema exibe as informações de todos os alunos cadastrados.
6. **Sair:** Encerra o programa.  

Após cada operação, o sistema retorna ao menu principal, permitindo ao usuário realizar outras ações ou sair do programa.

## Diagrama de Classes

![Diagrama de Classes - JalaUManager - IntelliJ.png](Diagrama%20de%20Classes%20-%20JalaUManager%20-%20IntelliJ.png)
Diagrama de classes gerado pelo IntelliJ  


![Diagrama de Classes - JalaUManager  - Mermaid.png](Diagrama%20de%20Classes%20-%20JalaUManager%20%20-%20Mermaid.png)
Diagrama de classes gerado pelo Mermaid

O diagrama de classes mostra as classes principais e seus relacionamentos:

1. **Aluno:**  
- Representa um estudante da universidade.
- Possui atributos como `nome`, `nota` e `cursos`.
- Oferece métodos para gerenciar seus dados, como adicionar cursos (`addCurso`), obter nome e nota (`getNome`, `getNota`), e listar os cursos em que está matriculado (`getCursos`).
2. **Universidade:**
- Representa a instituição de ensino.
- Contém uma lista de `alunos`.
- Permite adicionar novos alunos (`addAluno`), filtrar alunos por curso (`filter`) e listar todos os alunos cadastrados (`listarAlunos`).
3. **Main:**
- Classe principal que inicia a execução do programa.
- Cria instâncias de `Universidade` e `Aluno`, e gerencia a interação com o usuário através do menu.

### Relacionamentos:
- **Universidade - Aluno (1 para muitos):** Uma universidade possui vários alunos. Essa relação é representada pela seta direcionada de `Universidade` para `Aluno` e pela notação "1" e "*" nas extremidades da seta.
- **Main - Universidade e Aluno (dependência):** A classe `Main` cria e utiliza objetos das classes `Universidade` e `Aluno` para realizar as operações do sistema. Essa relação é representada por setas tracejadas com a notação `<<create>>`.



## Inputs e Outputs

O sistema interage com o usuário por um menu no console. As opções do menu e seus respectivos inputs e outputs são:

**Tabelas de Inputs e Outputs:**

| Ação                       | Input                                                     | Output                                                                                                                                                  |
|----------------------------|-----------------------------------------------------------|---------------------------------------------------------------------------------------------------------------------------------------------------------|
| 1. Adicionar Aluno         | `Nome do aluno: [nome]`, `Nota inicial: [nota]`           | `(Nenhum output, o aluno é adicionado à lista)`                                                                                                         |
| 2. Atribuir Curso a Aluno  | `Nome do aluno: [nome]`, `Curso a ser atribuído: [curso]` | `(Nenhum output se o aluno for encontrado e o curso adicionado com sucesso, caso contrário, uma mensagem de erro será exibida: "Aluno não encontrado")` |
| 3. Atribuir Nota a Aluno   | `Nome do aluno: [nome]`, `Nova nota: [nota]`              | `(Nenhum output se o aluno for encontrado e a nota atualizada com sucesso, caso contrário, uma mensagem de erro será exibida: "Aluno não encontrado")`  |
| 4. Listar Alunos por Curso | `Nome do curso: [curso]`                                  | `Alunos no curso [curso]: [lista de nomes]` (se houver alunos) ou `Nenhum aluno encontrado no curso [curso]` (se não houver alunos)                     |
| 5. Listar Todos os Alunos  | `(Nenhum input)`                                          | `Nome: [nome], Nota: [nota], Cursos: [lista de cursos]` (para cada aluno cadastrado)                                                                    |
| 0. Sair                    | `(Nenhum input)`                                          | `Mensagem "Saindo..." e o programa é encerrado.`                                                                                                        |



## Resultados da Execução  

A interação com o sistema resultou nos seguintes dados:  

**Ações:**

| Ação                       | Detalhes                                                                                                                                                                                                                             |
|----------------------------|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| 1. Adicionar aluno         | Aluna Ana Silva foi adicionada, Nota inicial: 8,7                                                                                                                                                                                    |
| 1. Adicionar aluno         | Aluno Carlos Santos foi adicionada, Nota inicial: 7,5                                                                                                                                                                                |
| 1. Adicionar aluno         | Aluna Maria Oliveira foi adicionada, Nota inicial: 9,3                                                                                                                                                                               |
| 1. Adicionar aluno         | Aluno João Pereira foi adicionada, Nota inicial: 6,8                                                                                                                                                                                 |
| 2. Atribuir Curso          | Ana Silva matriculada em "Matemática" e "Programação"                                                                                                                                                                                |
| 2. Atribuir Curso          | Carlos Santos matriculado em "Física" e "Banco de Dados"                                                                                                                                                                             |
| 2. Atribuir Curso          | Maria Oliveira matriculada em "Química"                                                                                                                                                                                              |
| 2. Atribuir Curso          | João Pereira matriculado em "História"                                                                                                                                                                                               |
| 3. Atribuir nota a aluno   | A nota 9,9 foi atribuída à aluna Ana Silva                                                                                                                                                                                           |
| 4. Listar Alunos por Curso | Exibidos os alunos do curso "Programação": Ana Silva                                                                                                                                                                                 |
| 5. Listar todos os alunos  | Exibidos todos os alunos: Ana Silva (Nota: 9.9, Cursos: Matemática, Programação), Carlos Santos (Nota: 7.5, Cursos: Física, Banco de Dados), Maria Oliveira (Nota: 9.3, Cursos: Química), João Pereira (Nota: 6.8, Cursos: História) |
| 0. Sair                    | Mensagem "Saindo..." e programa encerrado                                                                                                                                                                                            |


**Lista final de todos os alunos:**

- Ana Silva (Nota: 9.9, Cursos: Matemática, Programação)
- Carlos Santos (Nota: 7.5, Cursos: Física, Banco de Dados)
- Maria Oliveira (Nota: 9.3, Cursos: Química)
- João Pereira (Nota: 6.8, Cursos: História)

## Imagens das execuções
![Inputs - JalaUManager - IntelliJ.png](Inputs%20-%20JalaUManager%20-%20IntelliJ.png)
![Inputs 2 - JalaUManager - IntelliJ.png](Inputs%202%20-%20JalaUManager%20-%20IntelliJ.png)
![Inputs 3 - JalaUManager - IntelliJ.png](Inputs%203%20-%20JalaUManager%20-%20IntelliJ.png)
![Inputs 4 - JalaUManager - IntelliJ.png](Inputs%204%20-%20JalaUManager%20-%20IntelliJ.png)
![Inputs 5 - JalaUManager - IntelliJ.png](Inputs%205%20-%20JalaUManager%20-%20IntelliJ.png)