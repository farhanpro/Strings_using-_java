public class Main {

    public static void main(String[] args) {
	int bottels=99;
	String word =" bottels";
	    while(bottels>0)
        {
            if (bottels==1)
            {
                word="bottel";
            }
            System.out.println((bottels-1) +"" +word+"In the wall");
            System.out.println((bottels-1)+""+word+"Down");
            System.out.println("Take one Down");
            System.out.println("Pass it around");
            bottels=bottels-1;
            if (bottels>0)
            {
                System.out.println(bottels+""+word+""+"of beer on the wall");
            }
            if(bottels==0)
            {
                System.out.println("No more bottels of beer on the wall");
            }
        }
    }
}
