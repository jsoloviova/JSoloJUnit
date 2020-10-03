public class Calculator {
    public Object siteElements;

    //CalculatorTest
    public int sum(int i, int j){
        return i + j;
    }

    public int multiply(int a, int b){
        return a * b;
    }

    //AssertTrueTest
    public boolean isEven(int x, int y){
        return (x + y) % 2 == 0;
    }

    public boolean arrIsShort(Integer[] arr){
        return arr.length < 11;
    }

    //AssertSameTest
    public boolean linkAttributes(String prodID, String prodName, String partnerName){
        prodID ="prodID";
        prodName = "prodName";
        partnerName = "partnerName";
        return true;
    }

    //AssertThatTest
    public String title = "Site Title";

    //AssertNullTest
    public String product(String prodName) {
        return prodName;
    }

    //Timeout
    public long timeout(long n){
        for (n = 0; n < 1000000000; n++){
        }
        return n;
    }

    //Parameterized
    public boolean isOdd(int t){
        return t % 2 == 1;
    }

}
