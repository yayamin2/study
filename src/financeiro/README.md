# 📈 Simulador de Investimento

Programa em **Java** que simula um investimento com juros compostos.

## O que faz
- Calcula o saldo **mês a mês**, com aporte mensal
- Valida o tempo (não aceita zero nem negativo)
- Compara juros compostos com juros simples
- Calcula o imposto de renda sobre o rendimento
- Tem um menu para escolher o que ver

## Fórmula
A cada mês: saldo = saldo + aporte; depois saldo = saldo + saldo × (juros ÷ 100)

## Exemplo
Valor 1000, 3 meses, aporte 0, juros 10%:
- Saldo final: R$ 1331,00 (juros: R$ 331,00)
- Juros simples: R$ 1300,00 (diferença: R$ 31,00)
- Imposto: R$ 74,47 (alíquota 22,5%)

## ⚠️ Aviso
É uma **simulação simplificada para estudo**, não é recomendação de investimento. No imposto de renda considerei 30 dias por mês, usei a tabela regressiva da renda fixa e tratei o aporte como se estivesse aplicado o tempo todo. As regras podem mudar, então confira a regra vigente antes de decidir.

## Tecnologias
Java · `Scanner` · `for` · `while` · `if/else` · `switch`
