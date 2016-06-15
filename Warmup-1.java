/* 1
sleepIn
The parameter weekday is true if it is a weekday,
and the parameter vacation is true if we are on vacation.
We sleep in if it is not a weekday or we're on vacation.
Return true if we sleep in.

sleepIn(false, false) → true
sleepIn(true, false) → false
sleepIn(false, true) → true
*/

public boolean sleepIn(boolean weekday, boolean vacation){
  return (!weekday || vacation ? true : false);
}

/* 2
monkeyTrouble
We have two monkeys, a and b, and the parameters aSmile and bSmile
indicate if each is smiling. We are in trouble if they are both smiling
or if neither of them is smiling. Return true if we are in trouble.

monkeyTrouble(true, true) → true
monkeyTrouble(false, false) → true
monkeyTrouble(true, false) → false
*/

public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
  return ((!aSmile && !bSmile) || (aSmile && bSmile))? true:false;
}

/* 3
sumDouble
Given two int values, return their sum. Unless the two values are the same,
then return double their sum.

sumDouble(1, 2) → 3
sumDouble(3, 2) → 5
sumDouble(2, 2) → 8
*/

public int sumDouble(int a, int b) {
  return (a != b)? a+b : 2*(a+b);
}

/* 4
diff21
Given an int n, return the absolute difference between n and 21,
except return double the absolute difference if n is over 21.

diff21(19) → 2
diff21(10) → 11
diff21(21) → 0
*/

public int diff21(int n){
  return ((n-21 <= 0)? (n-21)*-1 : 2*(n-21));
}

/* 5
parrotTrouble
We have a loud talking parrot. The "hour" parameter is the current hour
time in the range 0..23. We are in trouble if the parrot is talking and
the hour is before 7 or after 20. Return true if we are in trouble.

parrotTrouble(true, 6) → true
parrotTrouble(true, 7) → false
parrotTrouble(false, 6) → false
*/

public boolean parrotTrouble(boolean talking, int hour) {
  return ((talking && (hour < 7 || hour > 20)) ? true : false);
}

/* 6
makes10
Given 2 ints, a and b, return true if one if them is 10 or if their sum is 10.

makes10(9, 10) → true
makes10(9, 9) → false
makes10(1, 9) → true
*/
public boolean makes10(int a, int b) {
  return (a == 10 || b == 10 || a + b == 10) ? true : false;
}

/* 7
near_hundred
Given an int n, return True if it is within 10 of 100 or 200.
Note: abs(num) computes the absolute value of a number.

near_hundred(93) → True
near_hundred(90) → True
near_hundred(89) → False
*/

public boolean nearHundred(int n) {
  return (Math.abs(n-100) <= 10 || Math.abs(n-200) <= 10) ? true:false;
}


/* 8
posNeg
Given 2 int values, return true if one is negative and one is positive.
Except if the parameter "negative" is true,
then return true only if both are negative.

posNeg(1, -1, false) → true
posNeg(-1, 1, false) → true
posNeg(-4, -5, true) → true
*/

public boolean posNeg(int a, int b, boolean negative) {
  if ((!negative && a < 0 && b > 0) || (!negative && a > 0 && b < 0))
  return true;
  else if (negative && a < 0 && b < 0)
  return true;
  else return false;
}
//OR
public boolean posNeg(int a, int b, boolean negative) {
  return ((!negative && a < 0 && b > 0) || (!negative && a > 0 && b < 0))? true:
  (negative && a < 0 && b < 0)? true:false;
}
//OR
public boolean posNeg(int a, int b, boolean negative) {
  if (negative) {
    return (a < 0 && b < 0);
  }
  else {
    return ((a < 0 && b > 0) || (a > 0 && b < 0));
  }
}

/* 9
notString

Given a string, return a new string where "not " has been added to the front.
However, if the string already begins with "not", return the string unchanged.
Note: use .equals() to compare 2 strings.

notString("candy") → "not candy"
notString("x") → "not x"
notString("not bad") → "not bad"
*/

public String notString(String str) {
  return (str.length() >= 3 && str.substring(0,3).equals("not")) ? str: "not "+str;
} //str.length() >= 3  other wise will show error to check "not" if the strng is shorter than 3

/*
