package lang.wrapper.test2;

import java.util.Arrays;
import java.util.Random;

public class LottoGeneration {

    private static int[] lottoNumbers;
    private static int count;

    public void generation(){

        lottoNumbers = new int[6];
        count = 0;

        while(count < 6){
            Random random = new Random();
            int lottoNumber = random.nextInt(45) + 1;

            if(isUnique(lottoNumber)){
                lottoNumbers[count] = lottoNumber;
                count++;
            }
        }

        System.out.println("로또 번호: " + Arrays.toString(lottoNumbers));

    }

    private boolean isUnique(int lottoNumber) {

        for (int number : lottoNumbers) {
            if(lottoNumber == number){
                return false;
            }
        }

        return true;
    }
}
