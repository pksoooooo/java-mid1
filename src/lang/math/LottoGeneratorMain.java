package lang.math;

import java.util.Arrays;
import java.util.Random;

public class LottoGeneratorMain {
    static void main(String[] args) {

//        int[] lottoNumbers = new LottoGenerator2().generate();
        int[] lottoNumbers = new LottoGenerator().generate();

        System.out.print("로또 번호 : ");
        for (int lottoNumber : lottoNumbers) {
            System.out.print(lottoNumber + " ");
        }
    }
}
