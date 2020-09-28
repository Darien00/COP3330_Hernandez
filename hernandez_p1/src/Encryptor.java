public class Encryptor {


    public int encrypt(int n){

        int[] encrptarr= new int[4];


        //fill in each element in our array
        for(int i =3; i >= 0 ; i--){
            encrptarr[i] = n % 10;
            n = n/10;
        }

        /*
            encyptarr values ex 1234
            encrpyt[0]=1
            encrpyt[0]=2
            encrpyt[0]=3
            encrpyt[0]=4
        */

        //replace each digit with the result of adding 7 and the remainder  after dividing the new value by 10
        for(int i =0; i < 4; i++){
            encrptarr[i] = (encrptarr[i]+7)%10;
        }
        //swapping digits 1st with third second with fourth
        int temp;
        temp = encrptarr[0];//first digit is saved in temp
        encrptarr[0] = encrptarr[2];//puts the third array value in first
        encrptarr[2]=temp;

        temp = encrptarr[1];
        encrptarr[1]=encrptarr[3];
        encrptarr[3]=temp;

        int enumber =0;
        for(int i=0; i<4;i++){
            enumber = enumber * 10 + encrptarr[i];
        }



        return enumber;


    }

}
/*
    public int Encrypt(int n)
    {
        int i,temp;
        int r[] = new int[4];
        for(i=3;i>=0;i--)
        {
            r[i] = n %10;
            n =n/10;
        }

        for(i=0;i<4;i++)
        {
            r[i] = (r[i] + 7) %10;

        }
        temp = r[0];
        r[0] = r[2];
        r[2] = temp;

        temp = r[1];
        r[1] = r[3];
        r[3] = temp;
        int num=0;
        for(i=0;i<4;i++)
        {
            n = n* 10 + r[i];
            System.out.print(r[i]);

        }
        return n;
    }

 */
