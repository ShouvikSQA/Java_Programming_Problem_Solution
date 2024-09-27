# Problem Solving In Java

## Project Summery -
 Here I Have solved 12 basic level Programming Problem Using Java

 ## Problem Description and Soltutions -
   ## Questions
   ### Question 1
   -  Here is the 10 students CGPA [3.50, 3.52, 3.43, 3.63, 3.48, 3.32, 3.30, 3.60, 3.86, 3.75]
    Find out who achieved the 2nd highest score. (without sorting, use linear searching algorithm)
   ####Solution Approch : 
   Here I have Taken one variable For the max value (max1) and another For the second max value (max1). Then Loop Through the whole array and updated Those variables.
    When the value from the array was Greater the nax1 , update max1 . When the array value is smaller than max1 , but greater than max2 , Just update max2 with array value. 
   ### Question 2
   -  Sort the above scores from according to the order of highest CGPA (don’t use Arrays.sort() method, do it programmatically)
   #### Solution Approch : 
   Here I have sorted the array, By moving the lowest element at last position, Moving 2nd lowest element at the 2nd last position and so on.
   ### Question 3
   -  Take a CGPA as user input. Now from the given array find if your input CGPA is present using binary search algorithm
   #### Solution Approch :
   Here The array is unsorted . So, We will First sort the array, as we need a sorted array for Binary Search . 
   Then we will perform the binary search on the sorted array.
  ### Question 4
   - Generate random 10 integer numbers in an array and print out all the numbers from the array and also print the max and min number from the array.
#### Solution Approch
  We will generate 10 random number and put them in an array. Than we will Traverse the array , and while traversing we will update the max and min variable.
  ### Question 5
   - Write a program that will break down the amount and count notes for any given amount. Here is the notes in the given array:    
notes=[1000,500,200,100,50,20,10,5,2,1]
#### Solution Approch
  We will take an array and put all the note values. Then we will devide the total amount with first note and get the count of that note. After that we will modulo the total amount with the note to get the remaining amount. Thus we will perform the same operation for all the notes.

   ### Question 6
   - Write a program that will give following output:  
   - ![image](https://github.com/user-attachments/assets/9115f2ab-e838-4e83-bdc2-0db4c26c3a11)

   #### Solution Approch
   Here we will use two nested for loop . One for printing the 1 to 5 th row . Next loop is to print the remaining rows.
   
  ### Question 7
   - Take input as height of 10 babies in cm. Now find out the 2 lowest height of babies. (Don’t use Arrays.sort() method)
  #### Solution Approch 
  Here we will take 10 inputs and store them in array . Then we will traverse the loop and keep track of lowest and 2nd lowest value.
  ### Question 8
  - Count number of words, number of characters without spaces, number of vowels and consonant from the given string
  #### Solution Approch 
   Here we will run a loop through the string. Will count the number of spaces , vowels and consonants. Ther number of character without space will be (vowel + consonent).
   And the number of  words will be space+1.
  ### Question 9 
  - Find the number of occurrences of characters in a String
   ### Question 10
   - Print the  numbers which are not duplicate from the given array. 
numbers=[1, 1, 2, 3, 1, 2, 4, 5, 6, 5, 4, 7]
  ### Question 11
  - Remove Vowels from a String
   ### Question 12
   - A core i 7 laptop price is 85000 tk and a gaming mouse price is 2500 tk. If I buy the laptop and 1 piece mouse, what will be my total cost after giving 15% discount? [Extract the digits from the paragraph and calculate the price]

   ## Solution Codes -
 - [Click Here To See The Solution Codes and Output Document](https://docs.google.com/document/d/10otlwVuxS67WUWe2gvgaZWC6V_TL8AXSRg9miniAAV4/edit?usp=sharing)
