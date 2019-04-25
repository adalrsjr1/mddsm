ANTLR=java -jar $(HOME)/.local/lib/antlr-4.7.2-complete.jar
JAVA=javac

.PHONY: all

all: clean grammar compiler

grammar:
	@echo "Creating grammar"
	$(ANTLR) Ml4mdScript.g4

compiler:
	@echo "Compiling grammar parser"
	$(JAVA) Ml4mdScript*.java

clean:
	@echo "clening up"
	rm -rf *.java *.tokens *.interp *.class
