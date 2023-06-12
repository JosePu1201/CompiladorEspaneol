#!/bin/bash
rm Lexer.java
rm parser.java
rm sym.java
jflex Lexico.jflex
cup sintactico.cup
