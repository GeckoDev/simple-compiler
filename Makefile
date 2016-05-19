ANTLR=/usr/local/lib/antlr-4.5-complete.jar
TestFilesDir=TestFiles

all: generate_ir generate_bytecode test

generate_ir:
	java -cp $(ANTLR):out/production/CompilerGenerator/ Main.Main $(TestFilesDir)/test.x > $(TestFilesDir)/test.ll

generate_bytecode:
	llvm-as $(TestFilesDir)/test.ll

test:
	lli $(TestFilesDir)/test.bc

clean:
	rm $(TestFilesDir)/test.ll
	rm $(TestFilesDir)/*.class