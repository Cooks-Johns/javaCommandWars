package codingChallenge;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class P2 {



        /*
         * Get the all the keys associated with given Value V from map
         */
        public static <K, V> List<K> getAllKeysForValue(Map<K, V> mapOfWords, V value)
        {
            List<K> listOfKeys = null;

            //Check if Map contains the given value
            if(mapOfWords.containsValue(value))
            {
                // Create an Empty List
                listOfKeys = new ArrayList<>();

                // Iterate over each entry of map using entrySet
                for (Map.Entry<K, V> entry : mapOfWords.entrySet())
                {
                    // Check if value matches with given value
                    if (entry.getValue().equals(value))
                    {
                        // Store the key from entry to the list
                        listOfKeys.add(entry.getKey());
                    }
                }
            }
            // Return the list of keys whose value matches with given value.
            return listOfKeys;

    }

		public static void getAllKeysForValue(String string, String string2) {
			// TODO Auto-generated method stub
			
		}

}
