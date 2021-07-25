
public class NextPalindrome {
	public void palindrome() {
		int mid = n / 2;
		 
        // end of left side is always 'mid -1'
        int i = mid - 1;
         
        // Beginning of right side depends
        // if n is odd or even
        int j = (n % 2 == 0) ? mid : mid + 1;
         
        // A bool variable to check if copy of left
        // side to right
        // is sufficient or not
        boolean leftsmaller = false;
 
        // Initially, ignore the middle same digits
        while (i >= 0 && num[i] == num[j])
        {
            i--;
            j++;
        }
         
        // Find if the middle digit(s) need to
        // be incremented or not (or copying left
        // side is not sufficient)
        if (i < 0 || num[i] < num[j])
        {
            leftsmaller = true;
        }
         
        // Copy the mirror of left to tight
        while (i >= 0)
        {
            num[j++] = num[i--];
        }
         
        // Handle the case where middle digit(s)
        // must be incremented. This part of code
        // is for CASE 1 and CASE 2.2
        if (leftsmaller)
        {
            int carry = 1;
         
            // If there are odd digits, then increment
            // the middle digit and store the carry
            if (n % 2 == 1) {
                num[mid] += 1;
                carry = num[mid] / 10;
                num[mid] %= 10;
            }
            i = mid - 1;
            j = (n % 2 == 0 ? mid : mid + 1);
             
            // Add 1 to the rightmost digit of the left
            // side, propagate the carry towards MSB digit
            // and simultaneously copying mirror of the
            // left side to the right side.
            //when carry is zero no need to loop through till i>=0
            while (i >= 0 && carry>0) 
            {
                num[i] = num[i] + carry;
                carry = num[i] / 10;
                num[i] %= 10;
                num[j] = num[i];// copy mirror to right
                i--;
                j++;
            }
 
        }
    }
	}

}
