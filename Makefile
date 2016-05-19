ANTLR=/usr/local/lib/antlr-4.5-complete.jar
TestFilesDir=TestFiles
TestFileName=test

all: generate_ir generate_bytecode test

generate_ir:
	java -cp $(ANTLR):out/production/CompilerGenerator/ Main.Main $(TestFilesDir)/$(TestFileName).x > $(TestFilesDir)/$(TestFileName).ll

generate_bytecode:
	llvm-as $(TestFilesDir)/$(TestFileName).ll

test:
	lli $(TestFilesDir)/$(TestFileName).bc

clean:
	rm $(TestFilesDir)/*.ll
	rm $(TestFilesDir)/*.bc