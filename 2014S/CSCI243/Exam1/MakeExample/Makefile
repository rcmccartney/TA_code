objects = Main.o Employee.o

EmpExec : Employee.o Main.o
	gcc -o EmpExec Employee.o Main.o

Employee.o : Employee.h Employee.c
	gcc -c Employee.c

Main.o : Employee.h Main.c
	gcc -c Main.c

.PHONY : clean

clean :
	-rm EmpExec $(objects)



