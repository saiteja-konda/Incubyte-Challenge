public class Addtion {

    public int Add(String number) {

        String clean = number.replaceAll("\n",",");
        String[] strArry = clean.split(",");

        int[] intArry = new int[strArry.length];
        int count = 0;
        try {
            for (int i = 0; i < strArry.length; i++) {
                intArry[i] = Integer.parseInt(strArry[i]);
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
