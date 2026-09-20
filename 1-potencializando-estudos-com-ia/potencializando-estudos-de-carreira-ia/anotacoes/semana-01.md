# 📝 Diário de Bordo: Semana 01

> **Instruções de Uso**:
> Este arquivo serve tanto como o seu registro oficial da **Semana 01** quanto como **modelo (template)** para as semanas seguintes.
> Quando for iniciar uma nova semana, basta duplicar este arquivo, renomear para `semana-02.md`, `semana-03.md` ou `semana-04.md` e atualizar os tópicos e datas!

---

## 📋 Informações Gerais

- **Semana**: 01 (Dias 1 a 7)
- **Tema Principal**: Git e GitHub (Organização e Versionamento)
- **Período**: `[DD/MM/AAAA]` a `[DD/MM/AAAA]`
- **Meta de Horas**: 7 horas (1 hora por dia)
- **Horas Concluídas**: `[0 / 7h]`
- **Status da Semana**: `[ ] Não Iniciada | [ ] Em Andamento | [ ] Concluída`

---

## 🎯 Metas da Semana

- [ ] Instalar e configurar ambiente local do Git com chaves de autenticação
- [ ] Dominar comandos de ciclo de vida (`init`, `add`, `commit`, `status`, `log`)
- [ ] Praticar criação e mesclagem de branches sem medo de conflitos
- [ ] Configurar repositório remoto no GitHub e realizar `push`/`pull`
- [ ] Criar o repositório base para os projetos do plano com README bem estruturado

---

## 📅 Registro Diário de Estudos

### 🔹 Dia 1: Introdução ao Git e Configuração do Ambiente
- **Data**: `[DD/MM/AAAA]` | **Tempo dedicado**: `[1h]`
- **O que estudei / Conceitos-chave**:
  - O que é um sistema de controle de versão distribuído (DVCS).
  - Diferença entre Working Directory, Staging Area e Git Repository (.git).
- **Comandos & Snippets praticados**:
  ```bash
  git config --global user.name "Seu Nome"
  git config --global user.email "seuemail@exemplo.com"
  git config --list
  ```
- **Dificuldades e como resolvi**:
  - *Anotar desafios com terminal, chaves SSH ou credenciais.*
- **Commit / Link do dia**: `[Link para commit ou PR]`

---

### 🔹 Dia 2: Comandos Fundamentais
- **Data**: `[DD/MM/AAAA]` | **Tempo dedicado**: `[1h]`
- **O que estudei / Conceitos-chave**:
  - Fluxo de trabalho: `git status` -> `git add` -> `git commit -m`.
  - Como escrever mensagens de commit claras e objetivas.
- **Comandos & Snippets praticados**:
  ```bash
  git init
  git status
  git add .
  git commit -m "feat: inicializa projeto e adiciona estrutura basica"
  git log --oneline --graph
  ```
- **Dificuldades e como resolvi**:
  - 
- **Commit / Link do dia**: `[Link para commit ou PR]`

---

### 🔹 Dia 3: Trabalhando com Branches e Merges
- **Data**: `[DD/MM/AAAA]` | **Tempo dedicado**: `[1h]`
- **O que estudei / Conceitos-chave**:
  - Por que não commitar direto na `main`.
  - Criação de feature branches e fluxo de merge (Fast-forward vs. 3-way merge).
- **Comandos & Snippets praticados**:
  ```bash
  git branch feature/nova-funcionalidade
  git switch feature/nova-funcionalidade   # ou git checkout -b
  git switch main
  git merge feature/nova-funcionalidade
  ```
- **Dificuldades e como resolvi**:
  - 
- **Commit / Link do dia**: `[Link para commit ou PR]`

---

### 🔹 Dia 4: Integração com o GitHub
- **Data**: `[DD/MM/AAAA]` | **Tempo dedicado**: `[1h]`
- **O que estudei / Conceitos-chave**:
  - Conceito de repositório remoto (`origin`).
  - Associação de repositório local a remoto e primeiro push.
- **Comandos & Snippets praticados**:
  ```bash
  git remote add origin https://github.com/usuario/repositorio.git
  git branch -M main
  git push -u origin main
  git pull origin main
  ```
- **Dificuldades e como resolvi**:
  - 
- **Commit / Link do dia**: `[Link para commit ou PR]`

---

### 🔹 Dia 5: Resolução de Conflitos de Código
- **Data**: `[DD/MM/AAAA]` | **Tempo dedicado**: `[1h]`
- **O que estudei / Conceitos-chave**:
  - Como o Git marca conflitos (`<<<<<<<`, `=======`, `>>>>>>>`).
  - Como inspecionar, resolver o conflito manualmente e finalizar o merge commit.
- **Anotações práticas**:
  - 
- **Commit / Link do dia**: `[Link para commit ou PR]`

---

### 🔹 Dia 6: Prática Guiada - Estruturação do Repositório (Parte 1)
- **Data**: `[DD/MM/AAAA]` | **Tempo dedicado**: `[1h]`
- **O que construí**:
  - Inicialização do projeto base em Java/Python.
  - Criação de `.gitignore` para ignorar `bin/`, `target/`, `.venv/`, `.idea/`, `.vscode/`.
- **Commit / Link do dia**: `[Link para repositório]`

---

### 🔹 Dia 7: Prática Guiada - Consolidação e Revisão (Parte 2)
- **Data**: `[DD/MM/AAAA]` | **Tempo dedicado**: `[1h]`
- **O que construí**:
  - Criação de um README inicial do projeto explicando sua finalidade.
  - Simulação de pull request ou revisão do histórico com `git log`.
- **Commit / Link do dia**: `[Link para repositório]`

---

## 🛠️ Projeto / Desafio Prático da Semana

- **Nome do Projeto**: `[Ex: Estruturação de Repositório de Estudos Back-End]`
- **Link do Repositório**: `[URL do GitHub]`
- **Tecnologias Utilizadas**: Git, GitHub, Markdown, Java/Python.
- **Resumo do que foi construído**:
  - *Descreva em 2 ou 3 parágrafos a entrega prática da semana.*

---

## 🔍 Retrospectiva da Semana

### 🟢 O que funcionou muito bem?
- 

### 🟡 Quais foram as maiores dificuldades?
- 

### 🚀 O que posso ajustar para a próxima semana?
- *(Ex: melhorar o foco nos primeiros 40 minutos, evitar distrações, refinar commits)*
