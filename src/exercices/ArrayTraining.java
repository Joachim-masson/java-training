public class ArrayTraining {

    /**
     * @param n size of the array, eg: 3
     * @return an empty int array of size n, eg: {0, 0, 0}
     */
    public int[] emptyIntArray(int n) {
        return new int[n];
    }

    /**
     * @param n size of the array, eg: 2
     * @return an empty String array of size n, eg: {null, null}
     */
    public String[] emptyStringArray(int n) {

        return new String[n];
    }

    /**
     * @param a first value, eg: 3
     * @param b second value, eg: 2
     * @param c third value, eg: 1
     * @return an int array with a, b and c values, eg: {3, 2, 1}
     */
    public int[] intArray(int a, int b, int c) {
        return new int[] {a, b, c};
    }

    /**
     * @param a first value, eg: "test"
     * @param b second value, eg: "sample"
     * @param c third value, eg: "value"
     * @return a String array with a, b and c values,
     * eg: {"test", sample", "value"}
     */
    public String[] stringArray(String a, String b, String c) {

        return new String[] {a, b, c};
    }

    /**
     * @param array, eg: {1, 2, 3}
     * @return length of the array, eg: 1
     */
    public int length(int[] array) {

        return array.length;
    }

    /**
     * @param array, eg: {3, 2, 1}
     * @return first value of the array, eg: 3
     */
    public int firstValue(int[] array) {

        return array[0];
    }

    /**
     * @param array, eg: {3, 2, 1}
     * @return last value of the array, eg: 1
     */
    public int lastValue(int[] array) {

        return array[array.length-1];
    }

    /**
     * @param array,    eg: {3, 2, 1}
     * @param position, eg: 1
     * @return value of the array at position, eg: 2
     */
    public int valueAtPosition(int[] array, int position) {

        return array[position];
    }

    /**
     * @param array,    eg: {3, 8, 5}
     * @param value,    eg: 4
     * @param position, eg: 1
     * @return the array with the value replaced at position, eg: {3, 4, 5}
     */
    public int[] replace(int[] array, int value, int position) {
        array[position] = value;
        return array;
    }

    /**
     * @param array, eg: {1, 2, 3}
     * @return sum of values of the array, eg: 6
     */
    public int sum(int[] array) {
        int sum = 0;
        for (int value : array) { // "Pour chaque valeur dans le tableau"
        sum += value;
        }
        return sum;
    }

    /**
     * @param array,  eg: {1, 2, 3}
     * @param search, eg: 2
     * @return if array contains searched value, eg: true
     */
    public boolean contains(int[] array, int search) {
        for (int i = 0; i < array.length; i++){
            if (array[i] == search){
                return true;
            }
        }
        return false;
    }

    /**
     * @param array, eg: {"sample", "value"}
     * @return array where all words are capitalized, eg: {"Sample", "Value"}
     */
    public String[] capitalize(String[] array) {
  // On utilise une boucle for classique pour pouvoir modifier le tableau via son index
    for (int i = 0; i < array.length; i++) {
        String word = array[i];
        
        // Sécurité : on vérifie que le mot n'est pas vide ou null
        if (word != null && !word.isEmpty()) {
            // 1. Première lettre en majuscule
            String firstLetter = word.substring(0, 1).toUpperCase();
            // 2. Le reste du mot en minuscules
            String remainder = word.substring(1).toLowerCase();
            
            // 3. On réassemble et on remplace dans le tableau
            array[i] = firstLetter + remainder;
        }
    }
        return array;
    }

    /**
     * @param first,  eg: {1, 2, 3}
     * @param second, eg: {3, 2, 1}
     * @return if values in first and second arrays, in the same position,
     * are equals, eg: false
     */
    public boolean equals(int[] first, int[] second) {
        for (int i = 0; i < first.length;i++){
            if (first[i] == second[i]){
                return true;
            }
        }
        return false;
    }

    /**
     * @param array, eg: {1, 2, 3}
     * @return array with reversed values, eg: {3, 2, 1}
     */
    public int[] reverse(int[] array) {
        int[] reversed = new int[array.length];

        for (int i = 0; i < array.length; i++){
            reversed[array.length - 1 - i] = array[i];
        }
        return reversed;
    }

    /**
     * @param first,  eg: {1, 2, 3}
     * @param second, eg: {4, 5}
     * @return concatenates first and second values in one array,
     * eg: {1, 2, 3, 4, 5}
     */
    public int[] concat(int[] first, int[] second) {
        // 1. On crée le tableau final avec la taille cumulée
        int[] result = new int[first.length + second.length];
    
        // 2. On copie le premier tableau
        for (int i = 0; i < first.length; i++) {
            result[i] = first[i];
        }
    
        // 3. On copie le deuxième tableau juste après
        for (int j = 0; j < second.length; j++) {
            // L'index dans 'result' doit commencer à 'first.length'
            result[first.length + j] = second[j];
        }
        return result;
    }
}
