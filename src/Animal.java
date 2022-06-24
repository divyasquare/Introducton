/**
 * This is simple java bean class
 * @author my name
 * @version 11
 */
public class Animal {
   //fields
    String name;

    /**
     * get name of animal
     * @return  String
     */
    public String getName() {
        return name;
    }

    /**
     * set name of animal
     * @param  name of animal
     */
    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        System.out.println("welcome!!");

        System.out.println(args[0]);
        System.out.println(args[1]);
    }
}
