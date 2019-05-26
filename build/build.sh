#!/bin/bash

func() {
  docker run -it --rm  -e MAVEN_CONFIG=/var/maven/.m2 -v "$(dirname $PWD)":/home/builder -v "$HOME/.m2":/var/maven/.m2 adalrsjr1/mddsm-builder mvn -Duser.home=/var/maven $1
  rm -rf builder ../?/
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
