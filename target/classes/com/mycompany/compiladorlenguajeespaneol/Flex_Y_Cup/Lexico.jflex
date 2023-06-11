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



ESCRIBIR = "Escribir"
LEER = "Leer"
ENTERO = "Entero"
FLOTANTE = "flotante"
STRING = "Texto"
PARENTESISABIERTO = "("
PARENTESISCERRADO = ")"
COMILLAS = "\""
DOSPUNTOS = ":"
PUNTOYCOMA = ";"
COMA = "," 
MULTIPLICAR = "*"
MENOS = "-" 
DIAGONAL = "/"
POTENCIA = "^"
MAS = "+"
ESPACIO = " "
    //Expresiones regulares
LineTerminator = \n|\r|\n\r 
WhiteSpace = {LineTerminator}|[ \t\f]|[" "]
entero = 0|[1-9][0-9]*
decimal = {entero}\.\d
id = [a-zA-Z][a-zA-Z|0-9]*
textoPlano = [COMILLAS][id]*[COMILLAS]
%%

//palabras reservadas 
{ESCRIBIR}                  {System.out.println(yytext());return new Symbol(sym.ESCRIBIR,yyline+1,yycolumn+1,yytext());}
{LEER}                  {System.out.println(yytext());return new Symbol(sym.LEER,yyline+1,yycolumn+1,yytext());}
{ENTERO}                  {System.out.println(yytext());return new Symbol(sym.ENTERO,yyline+1,yycolumn+1,yytext());}
{FLOTANTE}           {System.out.println(yytext());return new Symbol(sym.FLOTANTE,yyline+1,yycolumn+1,yytext());}
{STRING}             {System.out.println(yytext());return new Symbol(sym.STRING,yyline+1,yycolumn+1,yytext());}


//agrupacion 
{PARENTESISABIERTO}                     {System.out.println(yytext());return new Symbol(sym.PARENTESISABIERTO,yyline+1,yycolumn+1,yytext());}
{PARENTESISCERRADO}                     {System.out.println(yytext());return new Symbol(sym.PARENTESISCERRADO,yyline+1,yycolumn+1,yytext());}


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

//reglas lexicas 
{entero}               {System.out.println(yytext());return new Symbol(sym.NUMERO,yyline+1,yycolumn+1,yytext());}
{decimal}               {System.out.println(yytext());return new Symbol(sym.DECIMAL,yyline+1,yycolumn+1,yytext());}
{id}                    {System.out.println(yytext());return new Symbol(sym.ID,yyline+1,yycolumn+1,yytext());}
{textoPlano}                  {System.out.println(yytext());return new Symbol(sym.COMILLASTEXTO,yyline+1,yycolumn+1,yytext());}
{WhiteSpace}            {}

[^]                     {/*return new SYMBOL(sym.ERROR,yyline,yycolumn,yytext());*/}//Expresion regular de error