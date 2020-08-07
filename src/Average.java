public class Average {

    public static void main(String[] args) {

        Integer numList [] = {3, 2, 33, 20, 201, 2};
        System.out.println(average(numList));;
    }

    public static double average (Integer[] numList){
        int sum = 0;
        for(int num : numList){
            sum += num;
        }
        return (double) sum/numList.length;
    }
}
