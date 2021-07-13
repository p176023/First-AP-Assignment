 // Author: M Jawad -- P17-6023
// Dated: April 13 2021
public class Assignment2 extends Thread
{


    public static void count_even(int rng)
    {
        int evens = 0;
        for(int i = 1;i <= rng;i++)
        {
            if(i % 2 == 0)
            {
                System.out.println("Even number found");
                evens++;
            }
        }
        System.out.println(evens);
    }

    // Check single number
    public static boolean isPrime(int num)
    {
        if(num <= 1)
        {
            return false;
        }
            
        for(int i = 2; i * i <= num; i++)
        {
            if(num % i == 0)
            {
                return false;
            }
        }

        return true;
    }

//    Check prime number in range and count them
    public static void count_prime(int rng)
    {
        int primes = 0;
        for(int num = 1; num <= rng; num++ )
        {
            if(isPrime(num))
            {
                System.out.println("Prime number found");
                primes++;
            }
        }

        System.out.println(primes);
    }
////////////////////////////////////////////
    public static void main(String[] args)
    {
        int rng = 1000;

        Runnable r1Runnable=()->{
            count_prime(rng);
        };

        Runnable r2Runnable=()->{
            count_even(rng);
        };

        new Thread(r1Runnable).start();
        new Thread(r2Runnable).start();
    }
}