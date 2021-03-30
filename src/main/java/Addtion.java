public class Addtion {

    public int Add(String number, String number2)  {

        try {
            return Integer.parseInt(number) + Integer.parseInt(number2);
        } catch (NumberFormatException e){
            return 0;
        }
    }
}
