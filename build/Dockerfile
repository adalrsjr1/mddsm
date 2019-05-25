FROM maven:3-jdk-11

RUN curl http://eclipse.c3sl.ufpr.br/technology/epp/downloads/release/2019-03/R/eclipse-modeling-2019-03-R-linux-gtk-x86_64.tar.gz --output eclipse.tar.gz && \
    tar xzf eclipse.tar.gz -C /opt/ 

RUN mkdir /home/builder && chmod 777 /home/builder
WORKDIR /home/builder

CMD ["mvn", "clen", "package"]