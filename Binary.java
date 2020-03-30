package basics;

public class Binary {
	static int[] a = { 2, 4, 6, 7, 8 };
	static int low = 0, high = a.length - 1;

	public static void main(String[] args) {

		Binary b = new Binary();
		int searchEx = b.binarySearchEx(a, low, high);
		if (searchEx == -1)
			System.out.println("element not found");
		else
			System.out.println("element found at index  " + searchEx);
	}

	public int binarySearchEx(int[] a, int low, int high) {
		if(low <= high) {
		int search = 4;
		int middle = (low + high) / 2;
		if (search == a[middle])
			return middle;
		else if (search > a[middle])
			return binarySearchEx(a, middle + 1, high);
		else if (search < a[middle])
			return binarySearchEx(a, low, middle - 1);
		}
		return -1;
	}

}
