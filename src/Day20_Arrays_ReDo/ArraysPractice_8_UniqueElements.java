package Day20_Arrays_ReDo;

public class ArraysPractice_8_UniqueElements {
    public static void main(String[] args) {

        String[] words = {"Java", "Java", "Beans", "Beans", "Byron"};

        for (int j = 0; j < words.length; j++) { //representing each element of the array
            String element = words[j];
            // Assigning the first element as the unique element. Then comparing it with a loop
            int frequency = 0;

            for (int i = 0; i < words.length; i++) { //representing the index numbers of the array
                if (words[i].equals(element)) {
                    frequency++;
                }
            }
            if (frequency == 1) {
                System.out.println(element);
            }
        }

        System.out.println("-------------------------------");

        char[] chars = {'A', 'A', 'A', 'B', 'C', 'C', 'D', 'D', 'D'};

        for (int k = 0; k < chars.length; k++) {
            char ch = chars[k]; //'A'
            int frequency2 = 0;
            for (int l = 0; l < chars.length; l++) {
                if(chars[l] ==ch){
                    frequency2++;
                }
            }

            if(frequency2 == 2){
                System.out.println(ch);
            }

        }


    }
}