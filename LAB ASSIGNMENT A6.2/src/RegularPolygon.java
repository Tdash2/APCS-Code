class RegularPolygon{
        //number of sides
        private int myNumSides;
        //length of each side
        private double mySideLength;
        //radius of circumscribed circle
        private double myR;
         // radius of inscribed circle
         private double myr;
     /**
      * Creates a default shape
      */
        public RegularPolygon () {
        myNumSides = 3;
        mySideLength = 100;
        }

     /**
      * Creates the shape
      * @param numSides The number of sides
      * @param sideLength The length of the sides
      */
        public RegularPolygon (int numSides, double sideLength) {
                mySideLength= sideLength;
                myNumSides = numSides;
        }

     /**
      * calculates R
      */
        private void calcR() {
                myR=0.5*mySideLength*(1/Math.sin(Math.PI/myNumSides));
        }
     /**
      * calculates r
      */
        private void calcr() {
                myr = 0.5*mySideLength*(1/Math.tan(Math.PI/myNumSides) );
        }
     /**
      * calculates the vertexAngle
      */
        public double vertexAngle() {
                return ( (double)(myNumSides-2)/myNumSides) * 180;
        }
     /**
      * calculates the perimeter
      */
        public double perimeter () {
                return mySideLength*myNumSides;
        }
     /**
      * calculates the area
      */
        public double area () {
                return 0.5*myNumSides*(getR()*getR())*Math.sin(2*Math.PI/myNumSides) ;
        }

     /**
      *
      * @return Returns the number of sides of the shape
      */
     public int getNumSide () {
                return myNumSides;
        }
     /**
      *
      * @return Returns the length of a side
      */
        public double getSideLength() {
                return mySideLength;
        }

     /**
      *
      * @return Returns R
      */
     public double getR() {
                calcR();
                return myR;
     }
     /**
      *
      * @return Returns r
      */
        public double getr() {
                calcr();
                return myr;
        }
}
