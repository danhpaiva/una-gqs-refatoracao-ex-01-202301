# Gestão e Qualidade de Software

## Fixação - Exercício 01

<p align="center">
  <a href="#">
    <img src="logo\virus.png" width="300" alt="Virus">
  </a>
</p>

Exercício para fixação do conteúdo de Refatoração e Git Semântico.<br>
Leia atentamente o texto e contexto a seguir, e em seguida desenvolva a solução proposta:

### Trecho do Texto:

"Nas últimas semanas, o influenza H5N1, vírus causador da gripe aviária, voltou a figurar nas manchetes de todo o mundo.
Das cidades litorâneas do Daguestão, na Rússia, à costa do Peru, passando por fazendas de visons na Espanha
e granjas nos Estados Unidos, foram vários os episódios registrados de milhões de animais que morreram (ou foram sacrificados)
após terem contato com esse agente infeccioso.<br>

Agências de saúde e pesquisadores do mundo inteiro aumentaram o nível de alerta sobre esse tipo de influenza
e o potencial que ele possui de causar a próxima pandemia.
"Com a capacidade de ser transmitido de uma pessoa para outra, o H5N1 pode ser um dos problemas mais graves
que a humanidade já enfrentou", diz o virologista Edison Luiz Durigon, professor titular
do Instituto de Ciências Biomédicas da Universidade de São Paulo (ICB-USP)."

Fonte: https://www.bbc.com/portuguese/brasil-65214720 <br>
Acessado em 19 de Abril de 2023

 ### Contexto:

"Paiva Junior é um dos pesquisadores virologistas que acompanham a saga das pandemias.
Recentemente ele foi contratado para ajudar na identificação de possíveis expansões virais no Brasil vindas do exterior.<br>
Ele teve a idéia de fazer um questionário de perguntas para todos os turistas e pessoas que estão viajando
e que estão retornando ou conhecendo o Brasil.
Mas para conseguir agilizar o processo de identificação de pessoas infectadas, precisará de ajuda."

Você apoiará na rápida identificação de pessoas sintomáticas e será responsável por criar uma solução em Java<br>
que faça as seguintes perguntas para as pessoas:

- Informe o seu nome: 
- Informe a sua idade: 

Perguntas com respostas "SIM" ou "NAO":

- Seu cartão de vacina está em dia?
- Teve algum dos sintomas recentemente? 
  (dor de cabeça, febre, náusea, dor articular, gripe)
- Teve contato com pessoas com sintomas gripais nos últimos dias?
- Está retornando de viagem realizada no exterior?


O seu programa deverá calcular a porcentagem de risco que a pessoa oferece.<br>
O cálculo da probabilidade de infecção que deverá ser realizado é <br>
a soma da porcentagem de todas as perguntas com respostas "SIM" e "NAO" sendo:

- Cartão Vacinal em Dia - "NAO" : ***+10%***
- Teve Sintomas Recentes - "SIM": ***+30%***
- Teve contato com pessoa infectada - "SIM": ***+30%***
- Retornando de viagem - "SIM": ***+30%***

O programa deverá imprimir no final uma orientação para apoiar no direcionamento de todas as pessoas.
A lógica para orientação final, será baseada na porcentagem de uma pessoa estar infectada, sendo:

- Porcentagem menor ou igual a 30%: <br>*"Paciente sob observação. Caso apareça algum sintoma, gentileza buscar assistência médica."*
- Porcentagem menor ou igual a 60%: <br>*"Paciente com risco de estar infectado. Gentileza aguardar em lockdown por 02 dias para ser acompanhado."*
- Porcentagem menor ou igual a 89%: <br>*"Paciente com alto risco de estar infectado. Gentileza aguardar em lockdown por 05 dias para ser acompanhado."*
- Porcentagem igual ou superior a 90%: <br>*"Paciente crítico! Gentileza aguardar em lockdown por 10 dias para ser acompanhado"*
- Indiferente da porcentagem, caso a pessoa esteja retornando de viagem, imediatamente imprimir: <br>*"Você ficará sob observação por 05 dias."*

Caso a pessoa informe uma resposta errada para cada uma das 04 perguntas de "SIM" e NAO",<br>
o programa fará novamente a mesma pergunta por mais duas tentativas.<br>
Caso erre por três vezes, o programa será encerrado com a mensagem:

```text
"Não foi possível realizar o diagnóstico.
Gentileza procurar ajuda médica caso apareça algum sintoma."
```

Após coletar os dados com sucesso e realizar os cálculos, o programa deverá imprimir:

```text
Nome
Idade
Se o cartão de vacina está em dia
Se teve sintomas recentemente
se teve contato com pessoas infectadas
se a pessoa está retornando de viagem
A probabilidade dessa pessoa estar infectada
A orientação final do atendimento
```

### Orientações Finais

O programa e sua devida refatoração deverá ser feito na linguagem ***Java***.<br>
Lembre-se de testar a solução antes de entregá-la.<br>
Você deverá criar um ***"Fork"*** deste repositório, e após isso, versionar o programa no seu repositório.<br>
Utilize o conceito de Git Semântico para versioná-lo.<br>
Você deverá enviar o link (url) do seu repositório na atividade da lista proposta em aula.<br>
Bons estudos!