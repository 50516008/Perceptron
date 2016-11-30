package perceptron;

public class Perceptron_main {
      /*AND演算は、OR演算と比べ４分の１の２５回ほどで値が出た。これは、ANDは（１，１）以外では０を返すため
       関数計算の掛け算や足し算の部分をが速く正確に行うことができたと考えられる。*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub

double nu[] = {0.35, 0.2};
Perceptron_lib plib = new Perceptron_lib(2, nu, 0.01, 0.5);
double input[][] = { {1,1}, {1,0}, {0,1}, {0,0}};

    double output[] = {1, 0, 0, 0};






//学習

        int index;

        for(int i = 0; i < 25; i++){

            index = (int)(Math.random()*4);  //0~3の乱数発生

            plib.getParameter(input[index], output[index]);

            System.out.println("index : "+i+"nu = "+nu[0]+", "+nu[1]);

        }











     



for(int i = 0; i < output.length; i++){

            if(plib.getOutput(input[i]) == output[i])

                System.out.println("Correct! : input("+input[i][0]+","+input[i][1]+") to output("+output[i]+")");

            else System.out.println("Miss! : input("+input[i][0]+","+input[i][1]+") to output("+output[i]+")");

        }

        System.out.println("Check : nu = "+nu[0]+", "+nu[1]);

	}
}




	
	
	






    

	
    

