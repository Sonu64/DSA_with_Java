public class compareAndSubstring {
    public static void main(String[] args) {

        /* STRING COMPARISION */
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = new String("Hello");


        /**  
         * 
         * '==' works for String literals in SCP, as the strings are reference wise same.
        If a string with the value "Hello" already exists in the SCP, the JVM simply 
        returns a reference to that single, existing object. So the reference is actually compared,
        not the values of String. Only 1 String "Hello" is created in the SCP, and s1 and s2 point 
        to that reference (memory addresss). As they point to same address, it returns true.
        
        * The JVM ensures that only one object with the value "Hello" exists in the SCP.
        Therefore, both s1 and s2 are assigned the exact same memory address (Reference A).

        * But they are different variables, s1 and s2 are simply references to the Address of "Hello"
        in the SCP. And as SCP does not allow duplicate object values, both of s1 and s2 contain the 
        same addresses. Remember Strings are char arrays, and arrays are simply pointers to first element
        of the array. Though pointers don't exist in Java, the process is same for Object Referencing.
        
        * s1 and s2 are indeed separate reference variables stored on the stack. They do not 
        hold the character data themselves; they hold the memory address of where the actual 
        String object (the character data) resides. This is the core mechanism of object 
        referencing in Java, which acts similarly to pointers in languages like C/C++.

         */
        System.out.println(s1 == s2); 



        /**
         *  doesn't work for General Heap memory Strings as it is made in different area than SCP.
        and as '==' compares reference addresses of the 2 Strings it returns False as the 2 Strings
        are created in different areas with different memory addresses (one in SCP and the other in
        General Heap Memory) 
         */
        System.out.println(s1 == s3);












        /* SUBSTRINGS */
    }
}
