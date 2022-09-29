/*
 * ArrayStoreException is thrown whenever we are storing something in an array. If we store wrong type object into an array then this will be thrown. Write a java code to generate ArrayStoreException


 */

class six {
    public static void main(String[] args) {
        Object[] obj = new String[2];
        obj[0] = new Integer(10);
    }
}