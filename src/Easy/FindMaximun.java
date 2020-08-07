package Easy;

public class FindMaximun {

    public static void main(String[] args) {
        Integer numList [] = {3, 2, 33, 20, 201, 2};
        System.out.println(maximun(numList));;
    }

    public static Integer maximun (Integer[] numList){
        int max = 0;
        for (int i = 0; i < numList.length; i++) {
            max = max > numList[i] ? max: numList[i];
        }
        return max;
    }


}
