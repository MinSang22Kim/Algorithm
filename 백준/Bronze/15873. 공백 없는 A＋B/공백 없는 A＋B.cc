#include <iostream>

int main() {
    int num = 0, sum = 0;
    
    std::cin >> num;
    
    if (100 > num)
        sum += (num / 10 + num % 10);
    else if (num % 10 == 0)
        sum += (num / 100 + 10);
    else
        sum += (num % 100 + 10);
        
    std::cout << sum;
    
    return 0;
}
