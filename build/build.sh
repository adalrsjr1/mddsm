#!/bin/bash

func() {
  docker run -it --rm -v "$(dirname $PWD)":/home/builder -v "$HOME/.m2":/root/.m2   adalrsjr1/mddsm-builder mvn $1
  rm -rf builder
}

clean() {
  func "clean"
}

install() {
  func "install"
}

if [[ $1 == "clean" ]]; then
  clean $1
elif [[ $1 == "install" ]]; then
  install $1
fi
