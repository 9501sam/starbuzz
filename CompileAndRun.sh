#!/bin/sh

rm bin/* -rf

javac -d bin $(find src -name "*java")

#java --classpath bin
