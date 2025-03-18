public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static int find(int[] array, int num) {

		for (int i = 0; i < array.length; i++) {
			if (array[i] == num) {
				return i;
			}
		}
		return -1;
	}
	
	public static int findLast(String[] array, String thisString) {
		for (int i = array.length - 1; i >= 0; i--) {
			if (array[i].equals(thisString)) {
				return i;
			}
		}
		return -1;
	}

	public static int findSecond(char[] array, char thisChar) {
		int foundFirst = -1;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == thisChar) {
				if (foundFirst != -1) {
					return i;
				} else {
					foundFirst = i;
				}
			}
		}
		return foundFirst;
	}
}

/*
[![Open in Codespaces](https://classroom.github.com/assets/launch-codespace-2972f46106e565e64193e422d61a12cf1da4916b45550586e14ef0a7c637dd04.svg)](https://classroom.github.com/open-in-codespaces?assignment_repo_id=18744872)
# Instructions  

  ## Questions

1. Create a function called _find_(int[] array, int number) that searches an int array for the given number.</br>
return the index of the first occurrence of the integer. return -1 if the number cannot be found.</br>

2. Create a function called _findLast_(String[] array, String string) that searches an String array for the given String.</br>
return the index of the last occurrence of the string. return -1 if the String cannot be found.</br>

3. Create a function called _findSecond_(char[] array, char character) that searches an char array for the given char.</br>
return the index of the second occurrence of the char.  If there is only one occurrence, return that index of the char.  return -1 if the char cannot be found.  _Hint: Use a counter_</br>

*/