package lecture4;

public class Program {

    public static void main(String[] args) {

//        Employee employee1 = new Employee("AAA", 30);
//        System.out.println(employee1.hashCode());

        HashMap<String, String> hashMap = new HashMap<>(4);


        String v = hashMap.put("+79005551122", "Александр");
        v = hashMap.put("+79005551123", "Алексей");
        v = hashMap.put("+79005551124", "Александр1");
        v = hashMap.put("+79005551125", "Александр2");
        v = hashMap.put("+79005551126", "Александр3");
        v = hashMap.put("+79005551127", "Александр4");
        v = hashMap.put("+79005551128", "Александр5");




        for (Object e: hashMap) {
            if (e != null) System.out.println(e);
        }

    }

}
