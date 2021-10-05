import java.util.HashMap;
import java.util.Map;


class Element_Array<E> {

        protected Map<E, Integer> map = new HashMap<E, Integer>();

        public void count(E[] ar) {

             for (int i = 0; i < ar.length; i++) {
                if (!map.containsKey(ar[i])) {
                map.put(ar[i], 1);
                } else
                map.put(ar[i], map.get(ar[i]) + 1);
             }
        }

         public Map<E, Integer> getMap() {
            return map;

         }

}