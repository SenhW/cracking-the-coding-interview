#include <stdio.h>
#include <string.h>

/** 
 * Question 1.2: Implement a function void reverse(char* str) in C or C++
 * which reverses a null-terminated string.
 */

void reverse(char* str) {
	char *start = str; // *start points to first character in str
	char *end = start + strlen(str) - 1; // *end points to last character in str
	char tmp;
	
	while(start < end) {
		tmp = *start;
		*start = *end;
		start++;
		*end = tmp;
		end--;
	}
}

void main() {
	char str[] = "world";
	reverse(str);
	printf("%s\n", str);
}