public class UcBasamakliArmstrong {
    public static void main(String[] args) {
        for (int i = 1 ; i<= 9 ;i ++){

            for (int j = 0 ; j<=9;j++){

                for (int k = 0 ;k<=9;k++){

                    int number= 100*i+10*j+k;
                    int armstrongCalculete=(i*i*i)+(j*j*j)+(k*k*k);
                    if (number == armstrongCalculete){
                        System.out.println(number+"\s"+"Sayisi armstrong sayisidir.");
                    }
                }
            }
        }

        }


    }

