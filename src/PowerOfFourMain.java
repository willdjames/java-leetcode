// https://leetcode.com/problems/power-of-four/

boolean isPowerOfFour(int n) {
    if(n == 0){
        return false;
    }
    while (n % 4 == 0) {
        n = n / 4;
    }
    return n == 1;
}


void main() {
    int caseA = -16;
    int caseB = 16;
    int caseC = 5;
    int caseD = 1;
    int caseE = 0;

    assert !isPowerOfFour(caseA) : "caseA";
    assert isPowerOfFour(caseB) : "caseB";
    assert !isPowerOfFour(caseC) : "caseC";
    assert isPowerOfFour(caseD) : "caseD";
    assert !isPowerOfFour(caseE) : "caseE";
}
