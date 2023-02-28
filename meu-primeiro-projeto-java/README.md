# anatomia das classes 
A escrita de codigos é feita atraves de palavras pré definidas para determinar o nome dos nossos arquivos ( classes, atributos , métodos )
o ideal é sempre manter o padrão com a lingua inglesa. 

As classes sempre teram a primeira letra maiuscula e o que seria o espaço entre palavras vamos colocar letra maiuscula, Exemplo : MyClass, DioDesafio.


toda variavel deve ser escrita com letra minuscula, porém se a palavra for composta , a primeira letra da segunda palavra deverá ser MAIÚSCULA, Exemplo : anoValidade , anoFabricação. O nome dessa pratica é "camelCase".

se estiver uma variavel com todas as letras maiusculas , ela nao poderá ser alterada , exemplo Final String BR = "Brasil"; 
final - só podemos atribuir o valor a uma variável final uma única vez. Do contrário o compilador vai gerar erro.

organização através de pacotes

variavel deve ser clara , sem abreviações ou definições sem sentido 

variavel sempre no singular , exceto quando for um array ou coleção

definir um idioma padrão ( português tudo em português , ingles tudo em ingles)

não abreviar as variaveis  ( SalarioMedio - salMdedio <-- não fazer isso)

# Tipos e variaveis  
são 8 tipos primitivos em java (int , byte , short , long , float , double , boolean e char)

numerico o mais utilizado é o int pois a jvm ja transforma os outros para int 

numerico com virgula o mais utilizado é o double pois a jvm ja transforma os outros para double

java é fortemente tipado 

## Variaveis vs constantes 
* Uma variavel é uma área de memoria que pode ser associada a um nome e pode armazenar valores de um determinado tipo

* Uma constante são valores armazenados em memória que não podem ser modificados depois de declarados e em java esses valores são representados pela palavra reservada "final"  e sempre deve estar em UPPERCASE exemplo = "final double VALOR_DE_PI = 3.14;"


# Operadores 
temos varios tipos de operadores vou citar alguns 

== - Igual
!= - Diferente
<  - Menor
> - Maior
<= - Menor igual
>= - Maior igual

* Operador ternario 
O operador ternario é representado pelos simbolos ?: utilizados na seguinte estrutura de sintaxe :
<expressão condicional > ? <Caso condição seja true> : <caso condição seja false>
-- em kotlin esse modo é chamado de elvis , pois se juntarmos o ?: parece o topete do elvis --

exemplo :
int a,b;
a = 5; 
b = 6;

String resultado = a==b ? "Verdadeiro" : "falso"; 

saida será false , pois a não é igual a b 

# Metodos 
Os metodos correspondem a funções ou sub-rotinas disponiveis dentro das nossas classes 

Convenções para melhorar a legibilidade do codigo 

* Deve ser nomeado como verbo 

* seguir o padrão camelCase ( Todas as letras minúsculas com exceção da primeira letra da segunda palavra )






