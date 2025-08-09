bool isPalindrome(long int x) {
    long int s=0,n=x;
    while(x>0){
        s=(s*10)+(x%10);
        x/=10;
    }
    if(s==n)
        return true;
    else 
        return false;
}