#!/usr/bin/env bash
clear
if [ -n "$1" ]; then
    classname="$1"
    classname="$(tr '[:lower:]' '[:upper:]' <<< ${classname:0:1})${classname:1}"

    # Utilisation du point-virgule pour Windows et ajout de hamcrest pour éviter les erreurs junit
    CP="out;lib/junit-4.12.jar;lib/hamcrest-core-1.3.jar"

    javac -classpath "$CP" -d out src/exercices/${classname}.java 2> logs/checkmethod_output.txt
    if [[ $(< logs/checkmethod_output.txt) != "" ]]; then
        cat logs/checkmethod_output.txt
    else
    # Compilation des tests avec le bon classpath
        javac -classpath "$CP" -d out src/tests/MainTest.java
        javac -classpath "$CP" -d out src/tests/${classname}Test.java

        # Exécution du test (on ajoute 'out' pour que Java trouve les fichiers .class compilés)
        java -classpath "$CP;out" org.junit.runner.JUnitCore ${classname}Test
    fi
else
    echo "Please specify the class to test, e.g. : ./tester.sh PrimitiveTraining"
fi