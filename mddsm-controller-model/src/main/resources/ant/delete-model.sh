#!/bin/bash

PROJECT_DIR=$1 # for maven

echo "deleting $PROJECT_DIR/src/main/java/*"
rm -rf $PROJECT_DIR/src/main/java/*