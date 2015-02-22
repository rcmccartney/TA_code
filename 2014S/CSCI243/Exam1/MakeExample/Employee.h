#include <stdio.h>

#ifndef _EMPLOYEE
#define _EMPLOYEE

// two ways to do this
struct Employee {
	int id;
	float wage;
	int dept;
};

typedef struct {
	int id;
	float wage;
	int dept;
} Employee2;

float getWage(Employee2 employees[], int numEmployees, int id); 

float getAverageWage(Employee2 employees[], int numEmployees);

int numEmployeesInDept(Employee2 employees[], int numEmployees, int dept);

#endif
