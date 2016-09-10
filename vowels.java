 class JavaProgram
{
    public static void main(String args[])
    {
        char alphabet;
        Scanner b = new Scanner(System.in);
		
        System.out.print("Enter an Alphabet : ");
        ch = b.next().charAt(0);
		
        if(alphabet=='a' || alphabet=='A' || alphabet=='e' || alphabet=='E' ||alphabet=='i' || alphabet=='I' || alphabet=='o' || alphabet=='O' ||alphabet=='u' || alphabet=='U')
        {
            System.out.println("alphabet Vowel");
        }
        else
        {
            System.out.println("alphabet is not a Vowel");
        }
    }
}
