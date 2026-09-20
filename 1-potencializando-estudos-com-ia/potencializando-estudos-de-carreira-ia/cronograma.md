# 📅 Cronograma Semanal (30 Dias de Estudos)

Este cronograma detalha sua jornada de estudos de 30 dias para desenvolvimento Back-End. O plano é desenhado para uma carga horária de **1 hora diária**, equilibrando teoria sólida e prática no código.

---

## 📌 Visão Geral do Calendário

- [Semana 1: Git e GitHub (Organização e Versionamento)](#semana-1-git-e-github-organização-e-versionamento) (Dias 1 a 7)
- [Semana 2: Princípios de Clean Code (Código Limpo)](#semana-2-princípios-de-clean-code-código-limpo) (Dias 8 a 14)
- [Semana 3: Estruturas de Dados e Algoritmos](#semana-3-estruturas-de-dados-e-algoritmos) (Dias 15 a 21)
- [Semana 4: Bancos de Dados Relacionais, SQL e APIs REST](#semana-4-bancos-de-dados-relacionais-sql-e-criação-de-apis-rest) (Dias 22 a 30)

---

## Semana 1: Git e GitHub (Organização e Versionamento)

> **Foco**: Dominar o fluxo de versionamento de código, essencial para estruturar seus futuros projetos, histórico de commits e portfólio profissional.

| Dia | Tópico / Atividade (1h/dia) | Entregável / Prática | Status |
| :---: | :--- | :--- | :---: |
| **Dia 1** | **Introdução ao Git**: Conceitos básicos, arquitetura local e instalação/configuração inicial (`git config`). | Terminal configurado com nome, e-mail e chave SSH/GPG. | [ ] |
| **Dia 2** | **Comandos Fundamentais**: Ciclo de vida dos arquivos, `git init`, `git add`, `git commit` e `git status`. | Criar primeiro repositório de testes local e versionar primeiros arquivos. | [ ] |
| **Dia 3** | **Trabalhando com Branches e Merges**: Criação de ramificações (`git branch`, `git checkout`/`git switch`) e união de código (`git merge`). | Simular criação de feature branch e merge para a branch `main`. | [ ] |
| **Dia 4** | **Integração com o GitHub**: Repositórios remotos, comandos `git remote`, `git push` e `git pull`. | Sincronizar o repositório local com um repositório remoto no GitHub. | [ ] |
| **Dia 5** | **Resolução de Conflitos de Código**: Entender quando e por que conflitos acontecem, e como resolvê-los na prática. | Criar e resolver manualmente um conflito de merge entre branches. | [ ] |
| **Dia 6** | **Prática Guiada (Parte 1)**: Estruturação do repositório de portfólio no GitHub com um projeto base em Java/Python. | Repositório criado com `.gitignore` adequado, estrutura de pastas e README inicial. | [ ] |
| **Dia 7** | **Prática Guiada (Parte 2)**: Consolidação do fluxo Git com commits semânticos e documentação da semana. | Repositório publicado, commits organizados e preenchimento de `anotacoes/semana-01.md`. | [ ] |

---

## Semana 2: Princípios de Clean Code (Código Limpo)

> **Foco**: Alinhar o perfil analítico e perfeccionista à escrita de códigos profissionais, legíveis, manuteníveis e enxutos.

| Dia | Tópico / Atividade (1h/dia) | Entregável / Prática | Status |
| :---: | :--- | :--- | :---: |
| **Dia 8** | **Nomes Significativos**: Variáveis, métodos e classes que revelam intenção sem ambiguidades ou abreviações obscuras. | Refatorar pequenos trechos renomeando variáveis e métodos com nomes expressivos. | [ ] |
| **Dia 9** | **Funções Pequenas e Focadas**: O princípio da responsabilidade única (Single Responsibility) aplicado a métodos. | Quebrar funções longas ou que executam mais de uma tarefa em subfunções claras. | [ ] |
| **Dia 10** | **Comentários Úteis vs. Códigos Autoexplicativos**: Quando comentar (intenção/regras de negócio) e quando limpar o código. | Eliminar código comentado e comentários redundantes substituindo por código legível. | [ ] |
| **Dia 11** | **Tratamento Adequado de Erros e Exceções**: Utilização de Exceptions específicas, evitar retornos nulos e tratamento defensivo. | Implementar tratamento de exceções customizadas em métodos de serviço. | [ ] |
| **Dia 12** | **Refatoração Prática (Dia 1)**: Escolha de um código legado (ou projeto acadêmico) para análise e mapeamento de code smells. | Diagnóstico e anotações dos pontos críticos a refatorar. | [ ] |
| **Dia 13** | **Refatoração Prática (Dia 2)**: Aplicação dos princípios de nomes, funções concisas e separação de responsabilidades. | Código reestruturado e testado localmente. | [ ] |
| **Dia 14** | **Refatoração Prática (Dia 3) & Revisão**: Limpeza final, formatação de acordo com estilo da linguagem e commit com histórico limpo. | Versão final refatorada commitada e preenchimento de `anotacoes/semana-02.md`. | [ ] |

---

## Semana 3: Estruturas de Dados e Algoritmos

> **Foco**: Reforçar a base da Ciência da Computação para resolver problemas lógicos com eficiência de tempo e espaço (Notação Big-O).

| Dia | Tópico / Atividade (1h/dia) | Entregável / Prática | Status |
| :---: | :--- | :--- | :---: |
| **Dia 15** | **Arrays e Listas Encadeadas (Linked Lists)**: Diferenças de alocação em memória, acesso indexado vs. inserção/remoção. | Implementar ou manipular listas encadeadas simples em Java ou Python. | [ ] |
| **Dia 16** | **Pilhas (Stacks) e Filas (Queues)**: Princípios LIFO e FIFO, casos de uso reais em sistemas (call stack, buffers, filas de mensagens). | Resolver problema prático de balanceamento de parênteses usando Stack. | [ ] |
| **Dia 17** | **Tabelas Hash (Hash Maps / Dicionários)**: Função hash, colisões, complexidade média $O(1)$ para busca e inserção. | Implementar solução para contagem de frequência de elementos / Two Sum. | [ ] |
| **Dia 18** | **Algoritmos de Ordenação**: Funcionamento e complexidade de algoritmos clássicos (Merge Sort, Quick Sort, Insertion Sort). | Comparar complexidades no papel e rodar benchmark simples. | [ ] |
| **Dia 19** | **Algoritmos de Busca**: Busca Linear vs. Busca Binária (Binary Search) e pré-requisitos para aplicação. | Implementar Binary Search iterativa e recursiva. | [ ] |
| **Dia 20** | **Resolução de Desafios Lógicos (Dia 1)**: Aplicação prática na DIO, LeetCode ou HackerRank com estruturas lineares. | Resolver 2 desafios fáceis/médios documentando raciocínio e Big-O. | [ ] |
| **Dia 21** | **Resolução de Desafios Lógicos (Dia 2)**: Desafios envolvendo Hash Maps e buscas eficientes. | Resolver 2 desafios, subir soluções para o GitHub e preencher anotações da semana. | [ ] |

---

## Semana 4: Bancos de Dados Relacionais, SQL e Criação de APIs REST

> **Foco**: Unir persistência de dados relacional e desenvolvimento de serviços web modernos com Java/Spring Boot (ou Python/FastAPI).

| Dia | Tópico / Atividade (1h/dia) | Entregável / Prática | Status |
| :---: | :--- | :--- | :---: |
| **Dia 22** | **Fundamentos de Bancos Relacionais**: Tabelas, colunas, chaves primárias (PK), chaves estrangeiras (FK) e normalização básica. | Desenhar diagrama entidade-relacionamento (DER) simples para o projeto integrador. | [ ] |
| **Dia 23** | **Consultas SQL Essenciais**: Comandos DDL e DML (`SELECT`, `INSERT`, `UPDATE`, `DELETE`, cláusulas `WHERE`, `GROUP BY` e `JOINs`). | Escrever script SQL com criação de tabelas e queries com `INNER/LEFT JOIN`. | [ ] |
| **Dia 24** | **Introdução a APIs REST**: Arquitetura cliente-servidor, protocolo HTTP, verbos (`GET`, `POST`, `PUT`, `DELETE`) e status codes (`200`, `201`, `400`, `404`, `500`). | Testar requisições em APIs públicas usando Postman, Insomnia ou cURL. | [ ] |
| **Dia 25** | **Setup do Framework Web**: Configuração do ecossistema Java com Spring Boot (Spring Initializr) ou Python com FastAPI. | Projeto base rodando localmente com um endpoint "Hello World" `/health`. | [ ] |
| **Dia 26** | **Camadas da Aplicação**: Controllers, Services, Repositories e integração com banco relacional (H2 / PostgreSQL). | Configurar conexão com o banco e mapear a primeira entidade com JPA/Hibernate (ou SQLAlchemy). | [ ] |
| **Dia 27** | **Projeto Integrador (Etapa 1)**: Criação das rotas CRUD (Create e Read) para o recurso principal. | Endpoints `POST` e `GET` testados e persistindo dados no banco. | [ ] |
| **Dia 28** | **Projeto Integrador (Etapa 2)**: Implementação das rotas de atualização (`PUT`) e remoção (`DELETE`), com validações. | CRUD completo operacional com validações de dados de entrada. | [ ] |
| **Dia 29** | **Projeto Integrador (Etapa 3)**: Tratamento global de erros e padronização de respostas JSON. | Respostas de erro amigáveis (`404 Not Found`, `400 Bad Request`) implementadas. | [ ] |
| **Dia 30** | **Conclusão e Portfólio**: Documentação completa do projeto no `README.md` do repositório, commits finais e retrospectiva do plano. | Projeto publicado no GitHub com documentação das rotas e instruções de execução. | [ ] |
