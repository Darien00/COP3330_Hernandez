public class Decryptor {
    public int decrypt(int n){
        int decryptarr[] = new int[4];

        //do the same thing as encyptor
        //seperate values into array indexes
        for(int i = 3; i >=0;i--){
            decryptarr[i]=n%10;
            n = n/10;
        }
        //swap values
        int temp;
        temp = decryptarr[0];
        decryptarr[0]= decryptarr[2];
        decryptarr[2]=temp;

        temp = decryptarr[1];
        decryptarr[1]=decryptarr[3];
        decryptarr[3]=temp;

        for(int i=0; i < 4;i++){
            decryptarr[i]=(decryptarr[i]+10)-7;
        }

        int dnumber =0;
        for(int i =0; i<4; i++){
            dnumber = dnumber * 10 + decryptarr[i];
        }
        return dnumber;
    }
}
