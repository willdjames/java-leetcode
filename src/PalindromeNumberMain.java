
boolean isPalindrome(int x) {
    if(x < 0) {
        return false;
    }
    // u/chiknluvr: n=12874 m=0 while n>0: m=m*10+n%10 n=(n-n%10)/10 print(int(m))
    int m = 0;
    int _x = x;
    while (x > 0) {
        m = (m * 10) + (x % 10);
        x = (x - x % 10) / 10;
    }
    return m == _x;
}


void main() {
    int x = 121;
    int y = -121;
    int z = 10;
    int zz = 1234567899;

    assert isPalindrome(x) : "X deve ser true";
    assert isPalindrome(y) : "Y deve ser false";
    assert isPalindrome(z) : "Z deve ser false";

    System.out.printf("x(true): %s\n", isPalindrome(x));
    System.out.printf("y(false): %s\n", isPalindrome(y));
    System.out.printf("z(false): %s\n", isPalindrome(z));
    System.out.printf("zz(false): %s\n", isPalindrome(zz));
}
