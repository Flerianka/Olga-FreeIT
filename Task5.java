package FreeIT;

class task5 {
    public static void main(String[] args) {
        int value = 9989;
        int tmp = 0;
        tmp = value % 10;
        value = (value - tmp) / 10;
        int result1 = tmp;
        tmp = value % 10;
        value = (value - tmp) / 10;
        int result2 = tmp;
        tmp = value % 10;
        value = (value - tmp) / 10;
        int result3 = tmp;
        tmp = value % 10;
        value = (value - tmp) / 10;
        int result4 = tmp;
        if (result1 != result2 & result1 != result3 & result1 != result4 & result2 != result4 & result2 != result3 & result3 != result4){
            System.out.println( "Цифры не повторяются");
        } else{
            System.out.println("Есть повторяющиеся цифры");
        }
    }
}