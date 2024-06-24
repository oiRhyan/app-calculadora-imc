<div align="center">
  <img src="logo.png">
  <h1> Calculadora de IMC para Android </h1>
</div>


Calculadora de IMC desenvolvida durante o curso completo de Android utilizando Java & Kotlin

## Tecnologias Utilizadas

[![My Skills](https://skillicons.dev/icons?i=kotlin,androidstudio)](https://skillicons.dev)


## Recursos

- Interface inteligente utilizando gerenciamento de Activitys
- Entrada de dados utilizando TextInputLayout
- Validação de dados e comparação para obtem de resultados

## Desenvolvimento

Esta aplicação utiliza a linguagem Kotlin e foi desenvolvida seguindo uma estrutura organizada e modular. A seguir, detalho os principais componentes e funcionalidades implementados:

Criação da Activity Principal: Inicialmente, criamos uma Activity que serve como a principal interface do usuário. Nesta Activity, foi anexado um ConstraintLayout, que é responsável por organizar os elementos de forma responsiva e flexível, permitindo que todos os componentes interajam corretamente.

Leitura de Inputs: A captura dos inputs do usuário é realizada no código principal (Main). Cada componente de entrada é associado a um ID específico por meio da função handleComponents. Esta função é responsável por vincular os elementos da interface aos seus respectivos manipuladores de dados.

Validação de Campos: Após a leitura dos inputs, os dados são validados para garantir que estejam corretos e completos. Em seguida, utilizamos a função startActivity para iniciar uma nova Activity, passando os parâmetros necessários por meio de uma Intent. Esta nova Activity receberá e processará os dados do usuário.

Cálculo do IMC: Na nova Activity, uma função específica realiza a verificação da situação do usuário. Este processo envolve o cálculo do Índice de Massa Corporal (IMC), que é obtido dividindo o peso do usuário (em quilos) pela altura (em metros) elevada ao quadrado (altura x altura). Com base no resultado, a aplicação faz a comparação necessária e apresenta o estado do usuário.

Com essa estrutura, a aplicação garante uma interação fluida e eficiente com o usuário, ao mesmo tempo em que mantém um código limpo e bem organizado.
<div>
 <img src="jokenpo (1).gif">
</div>


## Acompanhe o desenvolvimento desta e outras aplicações em
<p>
  <a href="https://www.linkedin.com/in/rhyan-araujo-chaves/">
    <img src="https://skillicons.dev/icons?i=linkedin" />
  </a>
</p>

<h1 align="center">
   Desenvolvido por Rhyan Araujo Chaves @2024
</h1>



