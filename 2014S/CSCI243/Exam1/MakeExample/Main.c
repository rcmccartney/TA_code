#include "Employee.h"

int main() {
	//two ways to construct each form above	
	struct Employee empl1;
	empl1.id = 42;
	empl1.wage = 12.75;
	empl1.dept = 1337;
	struct Employee empl2 = {2, 125.60, 17};

	Employee2 empl3;
	empl3.id = 32;
	empl3.wage = 4.75;
	empl3.dept = 4555;
	// other form
	Employee2 empl4 = { 10, 200.45, 1};

	printf("%s %d %.2f %d\n", "empl1", empl1.id, empl1.wage, empl1.dept);
	printf("%s %d %.2f %d\n", "empl4", empl4.id, empl4.wage, empl4.dept);

	int size = 6;
	Employee2 emps[size];
	int i;
	for(i=0; i < size; ++i) {
		emps[i].id = i;
	       	emps[i].wage = 45.50+i;
		emps[i].dept = 47 + i%2;	
	}
	printf("Get wage: %.2f\n", getWage(emps, size, 2));
	printf("Avg wage: %.2f\n", getAverageWage(emps, size));
	printf("Num dept: %d\n", numEmployeesInDept(emps, size, 48));
}
