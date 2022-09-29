/*
 * +-------+
               | interface Instrument|
               |         void play ();            |
               |   String what ();         |
                |         void adjust ();          |

               +-------+
                   |
       |   
    implements     implements          implements
+---------------+  +---------------+  +---------------+
| Wind     |      | Percussion       |   | Stringed     |
+---------------+  +---------------+   +---------------+
| void play ();   |  | void play ();   |   | void play ();   |
| String what (); |  |String what (); |
                    | void adjust ();  |   | String what (); |
| void adjust ();  |  +---------------+   | void adjust ();  |
+---------------+                      +---------------+

                    /
+---------------+  +---------------+  +---------------+
| Brass     |      | Woodwind       |   
+---------------+  +---------------+
| void play ();   |  | void play ();   |
| String what (); |  |void adjust ();|
+---------------+                     +---------------+
 */

 class Instrument {
     public void play() {
         System.out.println("Instrument.play()");
     }
     
     public String what() {
         return "Instrument";
     }
     
     public void adjust() {
         System.out.println("Instrument.adjust()");
     }
 }

    class Wind extends Instrument {
        public void play() {
            System.out.println("Wind.play()");
        }
        
        public String what() {
            return "Wind";
        }
        
        public void adjust() {
            System.out.println("Wind.adjust()");
        }
    }

    class Percussion extends Instrument {
        public void play() {
            System.out.println("Percussion.play()");
        }
        
        public String what() {
            return "Percussion";
        }
        
        public void adjust() {
            System.out.println("Percussion.adjust()");
        }
    }

    class Stringed extends Instrument {
        public void play() {
            System.out.println("Stringed.play()");
        }
        
        public String what() {
            return "Stringed";
        }
        
        public void adjust() {
            System.out.println("Stringed.adjust()");
        }
    }

    class Woodwind extends Instrument {
        public void play() {
            System.out.println("Woodwind.play()");
        }
        
        public String what() {
            return "Woodwind";
        }
        
        public void adjust() {
            System.out.println("Woodwind.adjust()");
        }
    }

    class Brass extends Wind {
        public void play() {
            System.out.println("Brass.play()");
        }
        
        public String what() {
            return "Brass";
        }
        
        public void adjust() {
            System.out.println("Brass.adjust()");
        }
    }

