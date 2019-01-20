import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Anagram{

        List<List<String>> anagramGroupList = null;
        
        public static void main(String[] args){
        	
        	 try {

                 Anagram anagram = new Anagram();

                 List<List<String>> anagramGroupList = anagram.findAnagrams("input.txt");

                 try{
                	 
                	 FileWriter writer = new FileWriter("output.txt"); 
                	 
                	 // Retrieves anagram groups from list
                	 for (List<String> anagramList : anagramGroupList) {
                		 if (anagramList.size() > 1) {
                			 for (String angrm : anagramList) {
                				 writer.write(angrm+",");
                			 }
                			 writer.write("\n");
                		 }
                	 }
                	 
                	 writer.flush();
                	 writer.close();
                 }catch(IOException ex){
                	 ex.printStackTrace();
                 }

             } catch (FileNotFoundException ex) {
                 ex.printStackTrace();
             }
        }

        public List<List<String>> findAnagrams(String filePath) throws FileNotFoundException {

            try {
            	
                // Open the file
                FileInputStream inputStream = new FileInputStream(filePath);
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
                Map<String, List<String>> anagramMap = new HashMap<String, List<String>>();
                String word;

                // Read File Line By Line
                while ((word = bufferedReader.readLine()) != null) {
                    // Sort characters of word
                    String sortedWord = sorting(word);

                    /*
                     * Use sorted word as a key for map
                     * If map contains key, add the list
                     * If not, create a new anagram list and add list with key
                     */
                    if (!anagramMap.containsKey(sortedWord))
                        anagramMap.put(sortedWord, new ArrayList<String>());

                    anagramMap.get(sortedWord).add(word);
                }

                anagramGroupList = new ArrayList<List<String>>(anagramMap.values());
                bufferedReader.close();
            } catch (IOException ex) {

                ex.printStackTrace();
            }
            return anagramGroupList;
        }

        // Sort alphabetically characters of given word
        private static String sorting(String word) {
            char[] sortedChars = word.toCharArray();
            Arrays.sort(sortedChars);
            return new String(sortedChars);
        }
    }