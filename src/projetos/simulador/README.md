# 📈 Projeto 01: Simulador Financeiro de Investimento (Renda Fixa)

> **Aplicação interativa em Java para simulação de juros compostos com aportes mensais, comparativo com juros simples e apuração da tabela regressiva de Imposto de Renda (IR).**

---

## 📌 Sobre o Projeto

O **Simulador Financeiro** é um projeto desenvolvido em **Java** com foco na resolução de um problema real do ecossistema financeiro: a projeção patrimonial em investimentos de **Renda Fixa**.

O programa calcula a curva de crescimento do dinheiro mês a mês, levando em consideração um capital inicial investido e aportes recorrentes. Ao final, permite que o investidor visualize o comparativo entre o efeito dos **juros sobre juros (compostos)** versus **juros simples**, além de descontar automaticamente o **Imposto de Renda retido na fonte** segundo a tabela da Receita Federal.

---

## 🎯 O que o Simulador Faz

- 📅 **Projeção Mês a Mês:** Calcula e imprime no console a evolução do saldo a cada mês.
- 💵 **Aportes Mensais:** Permite simular investimentos contínuos (dinheiro novo entrando todo mês).
- 🛡️ **Validação de Entrada:** Impede prazos inválidos (menores ou iguais a zero) com repetição `while`.
- 📊 **Comparativo de Rendimentos:** Mostra claramente a diferença de rendimento gerada pelos juros compostos em relação aos juros simples.
- 🏛️ **Cálculo de Imposto de Renda:** Aplica a alíquota regressiva oficial da Renda Fixa brasileira de acordo com o prazo da aplicação.
- 🎨 **Menu Interativo Colorido:** Interface de terminal estilizada com códigos ANSI (Verde, Vermelho, Amarelo e Ciano).

---

## 💼 Regras de Negócio e Fórmulas Financeiras

### 1. Evolução Patrimonial (Juros Compostos com Aporte)
A cada mês ($t$), o saldo anterior recebe o aporte mensal e, sobre esse total, incide a taxa de juros informada:
$$\text{Saldo}_t = (\text{Saldo}_{t-1} + \text{Aporte}) \times \left(1 + \frac{\text{taxa}}{100}\right)$$

### 2. Tabela Regressiva de Imposto de Renda
O Imposto de Renda incide **exclusivamente sobre o lucro (rendimento)**, nunca sobre o valor total investido:

| Prazo da Aplicação | Dias Corridos | Alíquota de IR |
| :--- | :--- | :--- |
| Até 6 meses | Até 180 dias | **22,5%** |
| De 6 meses a 1 ano | De 181 a 360 dias | **20,0%** |
| De 1 a 2 anos | De 361 a 720 dias | **17,5%** |
| Acima de 2 anos | Mais de 720 dias | **15,0%** |

$$\text{Imposto} = \text{Rendimento} \times \text{Alíquota}$$
$$\text{Valor Líquido de Resgate} = \text{Saldo Final} - \text{Imposto}$$

### 3. Juros Simples vs. Juros Compostos
$$\text{Juros Simples} = \text{Valor Inicial} \times \frac{\text{taxa}}{100} \times \text{tempo}$$
$$\text{Diferença (Juros sobre Juros)} = \text{Rendimento Composto} - \text{Juros Simples}$$

---

## 🖥️ Exemplo Prático de Simulação

**Parâmetros de Entrada:**
- Valor inicial: **R$ 1.000,00**
- Prazo: **3 meses**
- Aporte mensal: **R$ 0,00**
- Taxa mensal: **10,0%**

**Resultado:**
- **Saldo Final (Composto):** R$ 1.331,00 (Juros ganhos: R$ 331,00)
- **Total em Juros Simples:** R$ 1.300,00 (Diferença ganha: R$ 31,00)
- **Imposto de Renda (22,5%):** R$ 74,47
- **Valor Líquido no Resgate:** R$ 1.256,53

---

## 🛠️ Tecnologias e Recursos Utilizados

- **Linguagem:** Java 17+
- **Entrada e Saída:** `java.util.Scanner` e `System.out.printf` formatado com `%.2f`
- **Estruturas de Controle:**
  - `while`: Validação de prazo e loop do menu interativo
  - `for`: Evolução mês a mês dos rendimentos
  - `if / else if / else`: Tabela regressiva de alíquotas de IR
  - `switch / case`: Navegação pelas opções do menu
- **Terminal:** Códigos de escape ANSI para coloração dinâmica

---

## 💻 Como Executar

### No IntelliJ IDEA:
1. Abra o projeto `study`.
2. Navegue até o arquivo `src/projetos/simulador/SimuladorFinanceiro.java`.
3. Clique com o botão direito e selecione **Run 'SimuladorFinanceiro.main()'** (ou pressione `Shift + F10`).
4. Interaja através da aba **Run** no terminal do IntelliJ!

### Pelo Terminal:
```bash
# A partir da pasta raiz do projeto:
javac src/projetos/simulador/SimuladorFinanceiro.java
java -cp src projetos.simulador.SimuladorFinanceiro
```

---

## ⚠️ Aviso Legal
*Este simulador foi desenvolvido para fins didáticos de aprendizado de lógica e programação em Java. Não se trata de uma recomendação formal de investimentos.*

---

## 👩‍💻 Autora

**Yasmin**  
*Graduanda em Engenharia de Software | Trainee em Java na Foursys | Foco em Backend & FinTechs*
