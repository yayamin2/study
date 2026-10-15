<div align="center">

# 📚 Study

**Meu espaço de aprendizado em Java**
Exercícios, anotações e pequenos projetos na minha transição do Direito para o desenvolvimento back-end.

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![IntelliJ IDEA](https://img.shields.io/badge/IntelliJ_IDEA-000000?style=for-the-badge&logo=intellijidea&logoColor=white)
![Git](https://img.shields.io/badge/Git-F05032?style=for-the-badge&logo=git&logoColor=white)
![GitHub](https://img.shields.io/badge/GitHub-181717?style=for-the-badge&logo=github&logoColor=white)
![Status](https://img.shields.io/badge/status-estudando_todo_dia-brightgreen?style=for-the-badge)

</div>

---

## 🎯 Objetivo

Aprender Java na prática, com foco em:

- 🧠 lógica de programação
- 🔀 estruturas condicionais
- 🔁 laços de repetição
- 📦 arrays, matrizes e coleções
- 🧱 orientação a objetos
- ⚙️ fundamentos de back-end

---

## 🗺️ Meu progresso

| Tema | Status | Pasta |
|------|:------:|-------|
| Java básico (variáveis, Scanner, contas) | ✅ | [`basico`](./src/basico) |
| Condicionais (`if`, `else`, `switch`) | ✅ | [`condicionais`](./src/condicionais) |
| Repetição (`for`, `while`, `do while`) | ✅ | [`repeticao`](./src/repeticao) |
| Arrays | ✅ | [`arrays`](./src/arrays) |
| Matrizes | ✅ | [`matrizes`](./src/matrizes) |
| Exercícios de contexto (financeiro) | ✅ | [`financeiro`](./src/financeiro) |
| Orientação a objetos (POO) | 🔄 em andamento | `poo` |
| Listas e coleções | ⏳ próximo | |
| Back-end com Java | ⏳ | |

---

## 📁 Estrutura do repositório

```text
study/
├── README.md
├── src/
│   ├── basico/          # variáveis, Scanner, contas simples
│   ├── condicionais/    # if, else, switch
│   ├── repeticao/       # for, while, do while
│   ├── arrays/          # vetores
│   ├── matrizes/        # arrays de duas dimensões
│   ├── financeiro/      # problemas do mundo real
│   └── poo/             # em breve
└── .gitignore
```

---

## 🚀 Projeto em destaque

### 📈 Simulador Financeiro de Renda Fixa

O simulador cresceu e agora tem **repositório próprio**: 👉 github.com/yayamin2/SimuladorFinanceiro

- **Evolução mês a mês:** juros compostos com capital inicial e aportes mensais
- **Comparativo real:** juros compostos vs. juros simples
- **Tributação automática:** IR pela tabela regressiva (22,5% a 15%)
- **Menu interativo colorido:** terminal com cores ANSI

---

## 📝 Exercícios realizados

> Clique em cada tema para ver a lista.

<details>
<summary><b>🔰 Básico</b></summary>

- `AreaCirculo`: calcula a área de um círculo a partir do raio
- `AreasGeometricas`: área de triângulo, círculo, trapézio, quadrado e retângulo
- `SomaDoisNumeros`: soma dois números digitados pelo usuário
- `DiferencaProdutos`: calcula `A * B - C * D`

</details>

<details>
<summary><b>🔀 Condicionais</b></summary>

- `Bhaskara`: resolve equações do 2º grau
- `Quadrante` e `SistemaCartesiano`: em qual quadrante do plano está um ponto
- `DiaDaSemana` e `DiasDaSemana`: converte número em dia da semana (`switch case`)
- `IntervaloNumerico`: em qual intervalo está um número
- `NumeroMenor`: o menor entre três números
- `NotasSemestre` e `NotasAluno`: calcula a nota e verifica a situação (Aprovado, Recuperação, Reprovado)
- `NumerosNegativos`: verifica se o número é negativo
- `NumerosMultiplos`: verifica se dois números são múltiplos
- `ParImpar`: par ou ímpar
- `IdadeValida`: valida a idade informada
- `PostoGasolina`: cálculo com `if/else`
- `DuracaoJogo`: calcula a duração de um jogo

</details>

<details>
<summary><b>🔁 Repetição</b></summary>

- `Contagem` e `NumerosAte10`: imprime números em sequência com `for`
- `NumerosParesAte20`: imprime os pares de 2 a 20 (passo do `for`)
- `Soma100`: soma de 1 a 100 com `while` e acumulador (resultado: 5050)
- `NumeroZero`, `NumeroAteZero` e `DiferenteDeZero`: repetem a leitura até o usuário digitar 0 (`do while`)
- `Senha`: repete até a senha correta (`while`)

</details>

<details>
<summary><b>📦 Arrays</b></summary>

- `Notas`: guarda 5 notas, soma e calcula a média
- `MaiorNota`: encontra o maior valor do array
- `MenorNumero`: encontra o menor valor do array

</details>

<details>
<summary><b>🧮 Matrizes</b></summary>

- `MatrizSoma`: preenche e imprime uma matriz 2x3 e soma todos os elementos (`for` dentro de `for`)

</details>

<details>
<summary><b>💰 Financeiro</b></summary>

- `ContaLanchonete`: calcula o valor da conta
- `ContaTelefone`: conta com cobrança extra por minutos excedentes
- `SalarioFuncionario`: salário com base nas horas trabalhadas
- `Imposto`: desconto de imposto sobre o salário
- `CompraRoupas`: valor final da compra
- `SimuladorFinanceiro`: *(promovido a projeto)*, veja a seção acima

</details>

---

## 🧰 Minha cola rápida

<details>
<summary><b>O que aprendi a olhar quando algo dá errado</b></summary>

- O `println` está **dentro ou fora** do loop?
- A variável nasce **dentro ou fora** do loop? Ela só existe dentro das chaves onde foi criada.
- Quem está do **lado esquerdo do `=`**? Ele que recebe o valor.
- Todo `{` tem seu `}` e todo `(` tem seu `)`?
- O `do while` decide quando **continua**, não quando para.
- Leio o código em português: se a frase faz sentido, o código provavelmente está certo.

</details>

<details>
<summary><b>Moldes que mais uso</b></summary>

```java
// for: início; condição; passo
for (int i = 0; i < 5; i++) {
    System.out.println(i);
}

// acumulador: nasce ANTES do loop, println DEPOIS
int soma = 0;
for (int i = 0; i < notas.length; i++) {
    soma = soma + notas[i];
}
System.out.println(soma);

// matriz: for dentro de for
for (int i = 0; i < m.length; i++) {
    for (int j = 0; j < m[i].length; j++) {
        System.out.print(m[i][j] + " ");
    }
    System.out.println();
}
```

</details>

---

## ✅ Próximos passos

- [x] laços de repetição (`for`, `while`, `do while`)
- [x] arrays e matrizes
- [ ] orientação a objetos
- [ ] listas e coleções
- [ ] métodos e boas práticas
- [ ] Git e GitHub no dia a dia
- [ ] Java para back-end

---

## 👩‍💻 Sobre mim

Sou formada em Direito e estou em transição para desenvolvimento back-end, com foco em Java e mercado financeiro.

Este repositório é meu espaço de estudo e prática para evoluir na área de tecnologia. 💛
