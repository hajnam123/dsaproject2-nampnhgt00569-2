public class main {

	public static void main(String[] args) {
		String[] a = {"158","124", "238", "707", "608", "250", "888"};
		sort(a,3);
	}

	public static void sort(String[] a, int w) {
        int n = a.length;
        int R = 256;
        String[] aux = new String[n];
        print(a);
        System.out.println(' ');
        

        for (int d = w-1; d >= 0; d--) {
        	
            int[] count = new int[R+1];
            for (int i = 0; i < n; i++)
                count[a[i].charAt(d) + 1]++;
            print(count);
            System.out.println(' ');
            for (int r = 0; r < R; r++)
                count[r+1] += count[r];
            print(count);
            System.out.println(' ');

            for (int i = 0; i < n; i++)
                aux[count[a[i].charAt(d)]++] = a[i];

            for (int i = 0; i < n; i++)
                a[i] = aux[i];
            print(a);
            System.out.println(' ');
        }
    }
	
	public static void print(int[] count){
		for(int i: count){
			System.out.print(i);
		}
	}
	
	public static void print(String[] a){
		for(String i : a){
			System.out.print(i + " ");
		}
	}
}
