#include "Employee.h"

float getWage(Employee2 employees[], int numEmployees, int id) {
	int i;
	for(i = 0; i < numEmployees; ++i) {
		if (employees[i].id == id)
		       return employees[i].wage;	
	}
	return -1;
}

float getAverageWage(Employee2 employees[], int numEmployees) {
	int i; double sum;
	for(i=0, sum=0; i < numEmployees; ++i) {
		sum += employees[i].wage;	
	}
	return sum/numEmployees;
}	

int numEmployeesInDept(Employee2 employees[], int numEmployees, int dept) {
	int i, sum;
	for(i=0,sum=0; i < numEmployees; ++i) {
		if (employees[i].dept == dept)
	   		sum += 1;	
	}
	return sum;
}	
