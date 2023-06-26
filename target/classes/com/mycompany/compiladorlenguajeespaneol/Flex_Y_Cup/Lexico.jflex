package com.mycompany.compiladorlenguajeespaneol.Flex_Y_Cup;

import java_cup.runtime.*;
import java.util.*;
import java_cup.runtime.XMLElement;

%%
    //config de jflex
%class Lexer
%unicode
%line
%column 
%public
%standalone
%cup


//palabras reservadas
ESCRIBIR = "Escribir"
LEER = "Leer"
ENTERO = "Entero"
FLOTANTE = "flotante"
STRING = "Texto"
SI = "Si"
SINO = "Sino"
FINSI = "Finsi"
PARA = "para"
FINPARA = "finpara"
CAMBIO = "cambio"
CASO = "caso"
PARAR = "parar"
FINCASO = "finCaso"
MIENTRAS = "mientras"
FINMIENTRAS = "finMientras"
MAIN = "main"
FUN = "Fun"
PROS = "Pros"
RETORNO = "RETORNAR"
PARENTESISABIERTO = "("
PARENTESISCERRADO = ")"
LLAVEA = "{"
LLAVEC = "}"
COMILLAS = "\""
DOSPUNTOS = ":"
PUNTOYCOMA = ";"
COMA = "," 
MULTIPLICAR = "*"
MENOS = "-" 
DIAGONAL = "/"
POTENCIA = "^"
MAS = "+"
MAYOR = ">"
MENOR = "<"
IGUAL = "="
ESPACIO = " "
    //Expresiones regulares
LineTerminator = \n|\r|\n\r 
WhiteSpace = {LineTerminator}|[ \t\f]|[" "]
entero = 0|[1-9][0-9]*
decimal = {entero}\.\d+
id = [a-zA-Z][a-zA-Z|0-9]*
textoPlano = [^\n]
igualDoble = [IGUAL][IGUAL]
mayorIgual = [[IGUAL][MAYOR]]|[[MAYOR][IGUAL]]
menorIgual = [[IGUAL][MENOR]]|[[MENOR][IGUAL]]
%%

//palabras reservadas 
{ESCRIBIR}                  {System.out.println(yytext());return new Symbol(sym.ESCRIBIR,yyline+1,yycolumn+1,yytext());}
{LEER}                  {System.out.println(yytext());return new Symbol(sym.LEER,yyline+1,yycolumn+1,yytext());}
{ENTERO}                  {System.out.println(yytext());return new Symbol(sym.ENTERO,yyline+1,yycolumn+1,yytext());}
{FLOTANTE}           {System.out.println(yytext());return new Symbol(sym.FLOTANTE,yyline+1,yycolumn+1,yytext());}
{STRING}             {System.out.println(yytext());return new Symbol(sym.STRING,yyline+1,yycolumn+1,yytext());}
{SI}             {System.out.println(yytext());return new Symbol(sym.SI,yyline+1,yycolumn+1,yytext());}
{FINSI}             {System.out.println(yytext());return new Symbol(sym.FINSI,yyline+1,yycolumn+1,yytext());}
{SINO}             {System.out.println(yytext());return new Symbol(sym.SINO,yyline+1,yycolumn+1,yytext());}
{PARA}             {System.out.println(yytext());return new Symbol(sym.PARA,yyline+1,yycolumn+1,yytext());}
{FINPARA}             {System.out.println(yytext());return new Symbol(sym.FINPARA,yyline+1,yycolumn+1,yytext());}
{CAMBIO}             {System.out.println(yytext());return new Symbol(sym.CAMBIO,yyline+1,yycolumn+1,yytext());}
{CASO}             {System.out.println(yytext());return new Symbol(sym.CASO,yyline+1,yycolumn+1,yytext());}
{PARAR}             {System.out.println(yytext());return new Symbol(sym.PARAR,yyline+1,yycolumn+1,yytext());}
{FINCASO}             {System.out.println(yytext());return new Symbol(sym.FINCASO,yyline+1,yycolumn+1,yytext());}
{MIENTRAS}             {System.out.println(yytext());return new Symbol(sym.MIENTRAS,yyline+1,yycolumn+1,yytext());}
{FINMIENTRAS}             {System.out.println(yytext());return new Symbol(sym.FINMIENTRAS,yyline+1,yycolumn+1,yytext());}
{FUN}                  {System.out.println(yytext());return new Symbol(sym.FUN,yyline+1,yycolumn+1,yytext());}
{PROS}                  {System.out.println(yytext());return new Symbol(sym.PROS,yyline+1,yycolumn+1,yytext());}
{MAIN}                  {System.out.println(yytext());return new Symbol(sym.MAIN,yyline+1,yycolumn+1,yytext());}
{RETORNO}                  {System.out.println(yytext());return new Symbol(sym.RETORNO,yyline+1,yycolumn+1,yytext());}


//  Escribir("hola");
//agrupacion 
{PARENTESISABIERTO}                     {System.out.println(yytext());return new Symbol(sym.PARENTESISABIERTO,yyline+1,yycolumn+1,yytext());}
{PARENTESISCERRADO}                     {System.out.println(yytext());return new Symbol(sym.PARENTESISCERRADO,yyline+1,yycolumn+1,yytext());}
{LLAVEA}                                {System.out.println(yytext());return new Symbol(sym.LLAVEA,yyline+1,yycolumn+1,yytext());}
{LLAVEC}                                {System.out.println(yytext());return new Symbol(sym.LLAVEC,yyline+1,yycolumn+1,yytext());}

//signos 
{COMILLAS}                      {System.out.println(yytext());return new Symbol(sym.COMILLAS,yyline+1,yycolumn+1,yytext());}
{PUNTOYCOMA}                    {System.out.println(yytext());return new Symbol(sym.PUNTOYCOMA,yyline+1,yycolumn+1,yytext());}
{DOSPUNTOS}                     {System.out.println(yytext());return new Symbol(sym.DOSPUNTOS,yyline+1,yycolumn+1,yytext());}
{COMA}                          {System.out.println(yytext());return new Symbol(sym.COMA,yyline+1,yycolumn+1,yytext());}
{MULTIPLICAR}                   {System.out.println(yytext());return new Symbol(sym.MULTIPLICAR,yyline+1,yycolumn+1,yytext());}
{MENOS}                         {System.out.println(yytext());return new Symbol(sym.MENOS,yyline+1,yycolumn+1,yytext());}
{DIAGONAL}                      {System.out.println(yytext());return new Symbol(sym.DIAGONAL,yyline+1,yycolumn+1,yytext());}
{POTENCIA}                      {System.out.println(yytext());return new Symbol(sym.POTENCIA,yyline+1,yycolumn+1,yytext());}                        
{MAS}                           {System.out.println(yytext());return new Symbol(sym.MAS,yyline+1,yycolumn+1,yytext());}
{MAYOR}                      {System.out.println(yytext());return new Symbol(sym.MAYOR,yyline+1,yycolumn+1,yytext());}
{MENOR}                    {System.out.println(yytext());return new Symbol(sym.MENOR,yyline+1,yycolumn+1,yytext());}
{IGUAL}                     {System.out.println(yytext());return new Symbol(sym.IGUAL,yyline+1,yycolumn+1,yytext());}
{igualDoble}                          {System.out.println(yytext());return new Symbol(sym.IGUALDOBLE,yyline+1,yycolumn+1,yytext());}
{mayorIgual}                          {System.out.println(yytext());return new Symbol(sym.MAYORIGUAL,yyline+1,yycolumn+1,yytext());}
{menorIgual}                          {System.out.println(yytext());return new Symbol(sym.MENORIGUAL,yyline+1,yycolumn+1,yytext());}



//reglas lexicas 
{entero}               {System.out.println(yytext());return new Symbol(sym.NUMERO,yyline+1,yycolumn+1,yytext());}
{decimal}               {System.out.println(yytext());return new Symbol(sym.DECIMAL,yyline+1,yycolumn+1,yytext());}
{id}                    {System.out.println(yytext());return new Symbol(sym.ID,yyline+1,yycolumn+1,yytext());}
{WhiteSpace}            {}

[^]                     {/*return new SYMBOL(sym.ERROR,yyline,yycolumn,yytext());*/}//Expresion regular de erro