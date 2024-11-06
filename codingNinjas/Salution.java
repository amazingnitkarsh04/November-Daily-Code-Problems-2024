package codingNinjas;

class Salution{

    public static void OneToHundred(int n)
    {

        if (n>10000000){
            return;

        }else {
            System.out.println(n);

            OneToHundred(n+1);}



    }


    public static void main (String args[]){
   int n=1;
        OneToHundred(n);

}}