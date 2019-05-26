#!/bin/bash

PROJECT_DIR=$1 # for maven

echo "deleting $PROJECT_DIR/src/main/java/*"
rm -rf $PROJECT_DIR/src/main/java/*
#rm -rf $PROJECT_DIR/src/main/metalang4md/*
#rm -rf $PROJECT_DIR/src/main/policies/*
#rm -rf $PROJECT_DIR/src/main/cml/*
#rm -rf $PROJECT_DIR/src/main/rbcml/*
#rm -rf $PROJECT_DIR/src/main/mgridml/*
#rm -rf $PROJECT_DIR/src/test/testing/*
rm -rf $PROJECT_DIR/src/test/java/*
