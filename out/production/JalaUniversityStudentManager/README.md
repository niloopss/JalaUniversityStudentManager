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
   Nome do aluno: João Pereira
   Curso a ser atribuído: Historia

Menu:
1. Adicionar aluno
2. Atribuir curso a aluno
3. Atribuir nota a aluno
4. Listar alunos por curso
5. Listar todos os alunos
0. Sair
   Escolha uma opção: 2
   Nome do aluno: Ana Silva
   Curso a ser atribuído: Programação 2

Menu:
1. Adicionar aluno
2. Atribuir curso a aluno
3. Atribuir nota a aluno
4. Listar alunos por curso
5. Listar todos os alunos
0. Sair
   Escolha uma opção: 2
   Nome do aluno: Carlos Santos
   Curso a ser atribuído: Banco de Dados 1

