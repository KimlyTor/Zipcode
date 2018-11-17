# Zipcode

Zipcode class is created to return zip code and bar code to the tester. The first half of the code
is constructed to covert zip code to bar code and the other half is constructed to 
convert bar code to zip code.

To convert zip code to bar code, first, the input integers is converted to string using toString()
then, toCharArray() is used to convert each digit to a character and each character is added 
up. Second, check digit is calculated using simple arithmetic such as subtraction and division.
Third, in case the zip code is less than five digits, string.format() is used to pad up to four "0" 
before the input zipcode. Then, parseInt() is used to separate each digits from the string. Finally,
each digit is converted to bar code using switch method then, each bar code is combined together and 
with the check digit and two side bars "|" at both end.

To convert bar code to zip code, the input bar code is, first, separated by using substring(). This
way, the bar code for the check digit and the side bar can be eliminated and only targeted barcodes
are used to covert to zip code. The targeted bar codes (the barcode that represent the first digit to
the fifth digit),then, are compared to the given bar strings that translate to a digit between 0 to 9. 
For example, if targeted bar code has the same characters as the bar string "||:::" then the bar code 
is translated to zero.The comparison method (stirng.equals(another string)) haven't been addressed
in the lecture yet but I read about it on a java discussion forum called Stackoverflow.

Lastly, in the Zipcode class, command println() is used several times to print variables such as checkDigit
and newBar0 to keep track for sources for debugging.

