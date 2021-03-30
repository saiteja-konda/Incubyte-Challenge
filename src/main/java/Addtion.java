public class Addtion {

    public int Add(String number) throws NumberFormatException, NegitiveNumberNotAllowedException {

        String clean = number.replaceAll("\n", ",");
        String[] strArry = clean.split(",");

        int[] intArry = new int[strArry.length];
        int count = 0;
        int negtiveCount = 0;
        try {
            for (int i = 0; i < strArry.length; i++) {
                String s = strArry[i];
                boolean b = s.startsWith("-");
                if (!b) {
                    intArry[i] = Integer.parseInt(strArry[i]);
                } else {
                    negtiveCount = +1;
                    throw new NegitiveNumberNotAllowedException("Negative numbers are not allowed, you have given " + negtiveCount + " numbers");
                }
            }
            for (int el : intArry) {
                count = count + el;
            }
            return count;
        } catch (NumberFormatException e) {
            return 0;
        }
    }
}
