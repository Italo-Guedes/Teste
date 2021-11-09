public class BubbleSort {

	public static void main(String[] args) {
		int v[] = { 5, 3, 2, 4, 7, 1, 0, 6 };

		int troca;
		boolean verifica;
		int n = 1;

		for (int i = 0; i < v.length; i++) {

			verifica = true;
			for (int j = 0; j < (v.length - n); j++) {

				if (v[j] > v[j + 1]) {
					troca = v[j];
					v[j] = v[j + 1];
					v[j + 1] = troca;
					verifica = false;
				}
			}
			n++;

			if (verifica) {
				break;
			}

		}
		for (int i = 0; i < v.length; i++) {
			System.out.print(v[i] + " ");
		}

	}
}
