#include <iostream>
using namespace std;

int main() {
	 //create three Variables to store three numbers
    int number1;
	int number2; 
	int number3;
    
     // Prompt user to input 3 numbers
    cout << "Enter three numbers: ";
    
     // Read user input
    cin >> number1 >> number2 >> number3;
    
    // Assume first number is the maximum
    int maxNum = number1; 
  
    // Compare second number with maxNum  
    if (number2 > maxNum) { 
        maxNum = number2;
    }
     // Compare third number with maxNum
    if (number3 > maxNum) {
        maxNum = number3;
    }
     // print the maximum  number
    
    cout << "The maximum number is: " << maxNum << endl;
    
    return 0; 
}