#!/bin/bash

ECLIPSE_DIR=$1
PROJECT_DIR=$(pwd)

echo $PROJECT_DIR

$ECLIPSE_DIR/eclipse -nosplash \
-data ../$PROJECT_DIR \
-application org.eclipse.emf.codegen.ecore.Generator \
-projects $PROJECT_DIR \
-model \
$PROJECT_DIR/src/main/resources/model/base.genmodel

## workaround to generate classes into correct folder
GENERATED_SRC=$(find ../home -name base)
cp -R $GENERATED_SRC ./src/main/java
rm -rf ../home