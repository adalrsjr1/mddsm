#!/bin/bash

ECLIPSE_DIR=$1
PROJECT_DIR=$(pwd)

echo $PROJECT_DIR

FILES=$(find $PROJECT_DIR/src -name *.genmodel)

for genmodel in $FILES; do
    echo ""
    echo "### Generating $(basename $genmodel)"
    echo ""
    
    $ECLIPSE_DIR/eclipse -nosplash \
    -data ../$PROJECT_DIR \
    -application org.eclipse.emf.codegen.ecore.Generator \
    -projects $PROJECT_DIR \
    -model \
    $genmodel

done

## workaround to generate classes into correct folder
echo ">>> Coping folders <<<"
find ../home -name src -exec cp -v -R {} ./ \;
rm -rf ../home
