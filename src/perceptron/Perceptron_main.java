package perceptron;

public class Perceptron_main {
      /*AND���Z�́AOR���Z�Ɣ�ׂS���̂P�̂Q�T��قǂŒl���o���B����́AAND�́i�P�C�P�j�ȊO�ł͂O��Ԃ�����
       �֐��v�Z�̊|���Z�⑫���Z�̕��������������m�ɍs�����Ƃ��ł����ƍl������B*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub

double nu[] = {0.35, 0.2};
Perceptron_lib plib = new Perceptron_lib(2, nu, 0.01, 0.5);
double input[][] = { {1,1}, {1,0}, {0,1}, {0,0}};

    double output[] = {1, 0, 0, 0};






//�w�K

        int index;

        for(int i = 0; i < 25; i++){

            index = (int)(Math.random()*4);  //0~3�̗�������

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




	
	
	






    

	
    
