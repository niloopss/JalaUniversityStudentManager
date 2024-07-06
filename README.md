# Atividade 3 - Tarefa I - JalaUniversityStudentManager  
## JalaUniversityStudentManager  
JalaUniversityStudentManager é um sistema de gerenciamento de alunos em uma universidade.  

## Descrição
JalaUniversityStudentManager permite realizar as seguintes operações:  
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

![Fluxograma - JalaUniversityStudentManager - Mermaid.png](Fluxograma%20-%20JalaUniversityStudentManager%20-%20Mermaid.png)

**Análise do Fluxograma:**  
Ele se inicia com um menu principal (Menu) que oferece as seguintes opções:

1. **Adicionar Aluno:** O sistema solicita o nome e a nota inicial do aluno, cria um objeto Aluno e o adiciona à universidade.
2. **Atribuir Curso:** O sistema solicita o nome do aluno e o nome do curso, encontra o aluno e, se existir, adiciona o curso à sua lista de cursos. Caso contrário, exibe uma mensagem de erro.
3. **Atribuir Nota:** O sistema solicita o nome do aluno e a nova nota, encontra o aluno e, se existir, atualiza sua nota. Caso contrário, exibe uma mensagem de erro.
4. **Listar por Curso:** O sistema solicita o nome do curso, filtra os alunos matriculados nesse curso e os exibe. Se não houver alunos, exibe uma mensagem de erro.
5. **Listar Todos:** O sistema exibe as informações de todos os alunos cadastrados.
6. **Sair:** Encerra o programa.  

Após cada operação, o sistema retorna ao menu principal, permitindo ao usuário realizar outras ações ou sair do programa.

## Resultados da Execução


## Inputs e Outputs

O sistema interage com o usuário através de um menu no console. As opções do menu e seus respectivos inputs e outputs são:

**2. Tabelas de Inputs e Outputs:**

| Ação                       | Input                                                     | Output                                                                                                                                                  |
|----------------------------|-----------------------------------------------------------|---------------------------------------------------------------------------------------------------------------------------------------------------------|
| 1. Adicionar Aluno         | `Nome do aluno: [nome]`, `Nota inicial: [nota]`           | `(Nenhum output, o aluno é adicionado à lista)`                                                                                                         |
| 2. Atribuir Curso a Aluno  | `Nome do aluno: [nome]`, `Curso a ser atribuído: [curso]` | `(Nenhum output se o aluno for encontrado e o curso adicionado com sucesso, caso contrário, uma mensagem de erro será exibida: "Aluno não encontrado")` |
| 3. Atribuir Nota a Aluno   | `Nome do aluno: [nome]`, `Nova nota: [nota]`              | `(Nenhum output se o aluno for encontrado e a nota atualizada com sucesso, caso contrário, uma mensagem de erro será exibida: "Aluno não encontrado")`  |
| 4. Listar Alunos por Curso | `Nome do curso: [curso]`                                  | `Alunos no curso [curso]: [lista de nomes]` (se houver alunos) ou `Nenhum aluno encontrado no curso [curso]` (se não houver alunos)                     |
| 5. Listar Todos os Alunos  | `(Nenhum input)`                                          | `Nome: [nome], Nota: [nota], Cursos: [lista de cursos]` (para cada aluno cadastrado)                                                                    |
| 0. Sair                    | `(Nenhum input)`                                          | `Mensagem "Saindo..." e o programa é encerrado.`                                                                                                        |








Menu:
1. Adicionar aluno
2. Atribuir curso a aluno
3. Atribuir nota a aluno
4. Listar alunos por curso
5. Listar todos os alunos
0. Sair
   Escolha uma opção: 1
   Nome do aluno: Ana Silva
   Nota inicial: 8,7

Menu:
1. Adicionar aluno
2. Atribuir curso a aluno
3. Atribuir nota a aluno
4. Listar alunos por curso
5. Listar todos os alunos
0. Sair
   Escolha uma opção: 1
   Nome do aluno: Carlos Santos
   Nota inicial: 7,5

Menu:
1. Adicionar aluno
2. Atribuir curso a aluno
3. Atribuir nota a aluno
4. Listar alunos por curso
5. Listar todos os alunos
0. Sair
   Escolha uma opção: 1
   Nome do aluno: Maria Oliveira
   Nota inicial: 9,3

Menu:
1. Adicionar aluno
2. Atribuir curso a aluno
3. Atribuir nota a aluno
4. Listar alunos por curso
5. Listar todos os alunos
0. Sair
   Escolha uma opção: 1
   Nome do aluno: João Pereira
   Nota inicial: 6,8

Menu:
1. Adicionar aluno
2. Atribuir curso a aluno
3. Atribuir nota a aluno
4. Listar alunos por curso
5. Listar todos os alunos
0. Sair
   Escolha uma opção: 2
   Nome do aluno: Ana Silva
   Curso a ser atribuído: Matematica

Menu:
1. Adicionar aluno
2. Atribuir curso a aluno
3. Atribuir nota a aluno
4. Listar alunos por curso
5. Listar todos os alunos
0. Sair
   Escolha uma opção: 2
   Nome do aluno: Ana Silva
   Curso a ser atribuído: Programação

Menu:
1. Adicionar aluno
2. Atribuir curso a aluno
3. Atribuir nota a aluno
4. Listar alunos por curso
5. Listar todos os alunos
0. Sair
   Escolha uma opção: 2
   Nome do aluno: Carlos Santos
   Curso a ser atribuído: Fisica

Menu:
1. Adicionar aluno
2. Atribuir curso a aluno
3. Atribuir nota a aluno
4. Listar alunos por curso
5. Listar todos os alunos
0. Sair
   Escolha uma opção: 2
   Nome do aluno: Carlos Santos
   Curso a ser atribuído: Banco de Dados

Menu:
1. Adicionar aluno
2. Atribuir curso a aluno
3. Atribuir nota a aluno
4. Listar alunos por curso
5. Listar todos os alunos
0. Sair
   Escolha uma opção: 2
   Nome do aluno: Maria Oliveira
   Curso a ser atribuído: Quimica

Menu:
1. Adicionar aluno
2. Atribuir curso a aluno
3. Atribuir nota a aluno
4. Listar alunos por curso
5. Listar todos os alunos
0. Sair
   Escolha uma opção: 2
   Nome do aluno: João Pereira
   Curso a ser atribuído: Historia

Menu:
1. Adicionar aluno
2. Atribuir curso a aluno
3. Atribuir nota a aluno
4. Listar alunos por curso
5. Listar todos os alunos
0. Sair
   Escolha uma opção: 5
   Nome: Ana Silva, Nota: 8.7, Cursos: Matematica, Programação
   Nome: Carlos Santos, Nota: 7.5, Cursos: Fisica, Banco de Dados
   Nome: Maria Oliveira, Nota: 9.3, Cursos: Quimica
   Nome: João Pereira, Nota: 6.8, Cursos: Historia

Menu:
1. Adicionar aluno
2. Atribuir curso a aluno
3. Atribuir nota a aluno
4. Listar alunos por curso
5. Listar todos os alunos
0. Sair
   Escolha uma opção: 4
   Nome do curso: Programação
   Alunos no curso Programação: Ana Silva

Menu:
1. Adicionar aluno
2. Atribuir curso a aluno
3. Atribuir nota a aluno
4. Listar alunos por curso
5. Listar todos os alunos
0. Sair
   Escolha uma opção: 3
   Nome do aluno: Ana Silva
   Nova nota: 9,9

Menu:
1. Adicionar aluno
2. Atribuir curso a aluno
3. Atribuir nota a aluno
4. Listar alunos por curso
5. Listar todos os alunos
0. Sair
   Escolha uma opção: 5
   Nome: Ana Silva, Nota: 9.9, Cursos: Matematica, Programação
   Nome: Carlos Santos, Nota: 7.5, Cursos: Fisica, Banco de Dados
   Nome: Maria Oliveira, Nota: 9.3, Cursos: Quimica
   Nome: João Pereira, Nota: 6.8, Cursos: Historia

Menu:
1. Adicionar aluno
2. Atribuir curso a aluno
3. Atribuir nota a aluno
4. Listar alunos por curso
5. Listar todos os alunos
0. Sair
   Escolha uma opção: 0
   Saindo...

Process finished with exit code 0


## Resultados da Sessão de Uso

A interação com o sistema resultou nos seguintes dados:

**Alunos Cadastrados:**  

- Ana Silva (Nota: 9.9, Cursos: Matemática, Programação)
- Carlos Santos (Nota: 7.5, Cursos: Física, Banco de Dados)
- Maria Oliveira (Nota: 9.3, Cursos: Química)
- João Pereira (Nota: 6.8, Cursos: História)

**Outras Ações:**

| Ação                     | Detalhes                                                 |
|--------------------------|----------------------------------------------------------|
| Adicionar aluno          | Aluna Ana Silva foi adicionada                           |
| Adicionar aluno          | Aluno Carlos Santos foi adicionada                       |
| Adicionar aluno          | Aluna Maria Oliveira foi adicionada                      |
| Adicionar aluno          | Aluno João Pereira foi adicionada                        |
| Atribuir Curso           | Ana Silva matriculada em "Matemática" e "Programação"    |
| Atribuir Curso           | Carlos Santos matriculado em "Física" e "Banco de Dados" |
| Atribuir Curso           | Maria Oliveira matriculada em "Química"                  |
| Atribuir Curso           | João Pereira matriculado em "História"                   |
| 3. Atribuir nota a aluno | Aluna Ana Silva foi adicionada                           |
| Listar Alunos por Curso  | Exibidos os alunos do curso "Programação": Ana Silva     |