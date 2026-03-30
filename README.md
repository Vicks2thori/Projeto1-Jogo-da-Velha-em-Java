# 🎮 Jogo da Velha em Java

[![Java](https://img.shields.io/badge/Java-21-orange)](https://www.oracle.com/java/technologies/javase-jdk21-downloads.html)
[![Status](https://img.shields.io/badge/status-em%20desenvolvimento-yellow)]()

Projeto desenvolvido como parte do **Módulo 1 - Lógica de Programação I** do curso **Backend com Java** da **ADA Tech** em parceria com a **Núclea**.

---

## 📝 Sobre o projeto

O **Jogo da Velha** é uma implementação clássica do popular jogo de tabuleiro para dois jogadores. O objetivo é alinhar três símbolos iguais (❌ ou ⭕) em uma linha, coluna ou diagonal.

Este projeto tem como objetivo consolidar os conceitos fundamentais de programação aprendidos durante o módulo, aplicando boas práticas de versionamento com Git.

---

## 🧠 Conceitos aplicados

| Conceito | Aplicação |
|----------|-----------|
| Variáveis e tipos primitivos | Controle do tabuleiro, jogadores, contador de jogadas |
| Operadores | Comparação de jogadas, validação de vitória |
| Entrada e saída de dados | Leitura das coordenadas via `Scanner` |
| Funções e métodos | Separação das responsabilidades (exibir tabuleiro, validar jogada, verificar vitória) |
| Controle de fluxo | `if/else` para validações, `switch` para alternar jogadores |
| Estruturas de repetição | `while` para loop principal do jogo |
| Arrays (Matrizes) | Representação do tabuleiro 3x3 |
| Tratamento de exceções | `try-catch` para entradas inválidas |

---

## 🎯 Funcionalidades (em desenvolvimento)

- [x] Estrutura inicial do projeto
- [x] Representação do tabuleiro 3x3 com matriz
- [ ] Alternância entre dois jogadores (X e O)
- [x] Validação de jogada (coordenadas válidas e casa vazia)
- [ ] Verificação de vitória (linhas, colunas e diagonais)
- [ ] Detecção de empate
- [ ] Tratamento de entradas inválidas com `try-catch`
- [ ] Loop principal do jogo

---

## 🌿 Estratégia de versionamento

Para manter um histórico claro e organizado, estou utilizando **Git Flow** simplificado:

### Branches

| Branch | Finalidade |
|--------|------------|
| `main` | Código estável e concluído |
| `develop` | Integração das features antes de ir para `main` |
| `feature/*` | Cada funcionalidade desenvolvida em sua própria branch |

### Padrão de commits

Os commits seguem o padrão **Conventional Commits**:

```
<tipo>(<escopo>): <descrição sucinta>
```

**Tipos utilizados:**
- `feat` – nova funcionalidade
- `fix` – correção de bug
- `docs` – documentação (README, comentários)
- `refactor` – refatoração sem alterar comportamento

**Exemplos de commits realizados:**
```
feat(estrutura): cria classe principal JogoDaVelha
feat(tabuleiro): implementa matriz 3x3 e método exibirTabuleiro
feat(jogador): adiciona alternância entre jogadores X e O
feat(jogada): implementa validação de coordenadas e casa vazia
```

---

## 📊 Fluxo de desenvolvimento

### 1. Planejamento
Antes de iniciar o código, defini as responsabilidades:
- Representação do tabuleiro
- Controle de jogadores
- Validação de jogadas
- Verificação de vitória
- Tratamento de erros

### 2. Branches por funcionalidade
Cada funcionalidade é desenvolvida isoladamente em sua própria branch:

```
feature/tabuleiro
feature/alternancia-jogadores
feature/validacao-jogada
feature/verificacao-vitoria
feature/tratamento-erros
```

### 3. Commits atômicos
Cada commit representa uma unidade lógica de mudança, facilitando:
- Revisão do código
- Identificação de problemas
- Reversão de alterações se necessário

### 4. Merge para develop
Após concluir uma funcionalidade, a branch `feature` é mesclada na `develop` via Pull Request.

### 5. Release para main
Ao final do desenvolvimento, o código da `develop` será mesclado na `main` como versão estável.

---

## 📁 Estrutura do repositório

```
Jogo-da-Velha/
├── src/
│   └── main.java
├── README.md
└── .gitignore
```

---

## 🔄 Acompanhamento do progresso

O desenvolvimento pode ser acompanhado através dos commits e branches no GitHub:

1. **Commits** – cada commit descreve uma mudança específica
2. **Branches** – cada funcionalidade tem sua própria branch
3. **Pull Requests** – a integração de cada funcionalidade é documentada

---

## 👩🏻‍💻 Autora

Desenvolvido por [Vicks2thori](https://github.com/Vicks2thori) como parte do curso **Backend com Java** da **ADA Tech** em parceria com a **Núclea**.

---

## 🧩 Status atual

🟡 **Em desenvolvimento** – implementando validação de jogada

### Próximos passos
1. Implementar verificação de vitória
2. Implementar detecção de empate
3. Adicionar tratamento de exceções com try-catch
4. Finalizar loop principal do jogo
5. Refatorar e documentar código

---

**🎯 Objetivo:** consolidar os fundamentos de lógica de programação e Java, aplicando boas práticas de versionamento.