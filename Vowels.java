 class Vowels
{
    public static void main(String args[])
    {
        char r;
        Scanner scan = new Scanner(System.in);
		
        System.out.print("Enter an Alphabet : ");
        ch = scan.next().charAt(0);
		
        if(r=='a' || r=='A' || r=='e' || r=='E' || r=='i' || r=='I' || r=='o' || r=='O' || r=='u' || r=='U')
        {
            System.out.print(" Vowel");
        }
        else
        {
            System.out.print("not a Vowel");
        }
    }
}
