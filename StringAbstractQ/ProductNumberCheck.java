package likeLionTestQ.StringAbstractQ;

public class ProductNumberCheck {
    public static void main(String[] args) {
        ProductNumberCheck p = new ProductNumberCheck();
        System.out.println(p.checkProductNumber("t13456"));
        System.out.println(p.checkProductNumber("t13t56"));
        System.out.println(p.checkProductNumber("t1345t"));
        System.out.println(p.checkProductNumber("t21345"));
        System.out.println(p.checkProductNumber("tt2144"));
    }

    public boolean checkProductNumber(String productNumber) {
        if (productNumber.length() != 6) {
            return false;
        }
        if (!Character.isLetter(productNumber.charAt(0)) ||
                !Character.isLetter(productNumber.charAt(1))) {
            return false;
        }
        for (int i = 2; i < productNumber.length(); i++) {
            if (!Character.isDigit(productNumber.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}
