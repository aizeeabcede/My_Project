class Tester {
	public static void main (String[] args) {
		SortObj so = new BubbleSortObj(5);
		// SortObj so = new SelectionSortObj(5);
		// SortObj so = new InsertionSortObj(5);


		so.insert("Aleaya", "Galura", 9, "AleaAddress");
		so.insert("Russelle", "Galura", 13, "RussAddress");
		so.insert("Rodrigo", "Galura", 21, "RodzAddress");
		so.insert("Moymoy", "Galura", 3, "MoyAddress");
		so.insert("Randolf", "Galura", 6, "RandAddress");

		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n");
		System.out.println("****************************");
		System.out.println("*\tBubbleSort Sort\t   *");
		System.out.println("****************************\n");

		// --------------------------------------------------
		System.out.println("Original position of Patient\n");
		so.displayAllObj();

		System.out.println("After Sort in ascending order the age of Patient\n");
		so.sort();
		so.displayAllObj();

		System.out.println("After Sort in descending order inverse the age of Patient\n");
		so.rsort();
		so.displayAllObj();
		// --------------------------------------------------
		System.out.println();
	}
}