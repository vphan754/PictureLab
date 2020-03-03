/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("beach.jpg");
    beach.zeroBlue();
    beach.explore();
  }
  
  /** Method to testKeepOnlyBlue() **/
  public static void testKeepOnlyBlue()
  {
      Picture beach = new Picture("beach.jpg");
      beach.keepOnlyGreen();
      beach.explore();
    }
  
      /** Method to testKeepOnlyGreen() **/
  public static void testKeepOnlyGreen()
  {
      Picture beach = new Picture("beach.jpg");
      beach.keepOnlyGreen();
      beach.explore();
    }
    
      /** Method to testKeepOnlyRed() **/
  public static void testKeepOnlyRed()
  {
      Picture beach = new Picture("beach.jpg");
      beach.keepOnlyRed();
      beach.explore();
    }
    
    /** Method to test Negate() **/
   public static void testNegate()
   {
       Picture snow = new Picture("wall.jpg");
       snow.Negate();
       snow.explore();
    }
    
    /** Method to test grayscale() **/
    public static void testGrayScale()
    {
        Picture snow = new Picture("snowman.jpg");
        snow.GrayScale();
        snow.explore();
    }
    
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("redMotorcycle.jpg");
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  
  /** Method to test mirrorVerticalRighttoLeft() **/
  public static void testMirrorVerticalRighttoLeft()
  {
      Picture caterpillar = new Picture("caterpillar.jpg");
      caterpillar.mirrorVerticalRighttoLeft();
      caterpillar.explore();
    }
  
  /** Method to test mirrorHorizontal() **/
  public static void testMirrorHorizontal()
  {
      Picture caterpillar = new Picture("redMotorcycle.jpg");
      caterpillar.mirrorHorizontal();
      caterpillar.explore();
    }
    
     /** Method to test mirrorHorizontalBottoTop()**/
  public static void testMirrorHorizontalBottoTop()
  {
      Picture caterpillar = new Picture("redMotorcycle.jpg");
      caterpillar.mirrorHorizontalBottoTop();
      caterpillar.explore();
    }
    
    /** Method to test mirrorDiagonal() **/
  public static void testMirrorDiagonal()
  {
      Picture bruh = new Picture("bruh.jpg");
      bruh.mirrorDiagonal();
      bruh.explore();
    }
    
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
    /** Method to test snowman4() */
  public static void testSnowman4()
  {
    Picture sno = new Picture("snowman.jpg");
    sno.snowman4();
    sno.explore();
  }
  
      /** Method to test anotherSeagull() */
  public static void testAnotherSeagull()
  {
    Picture gull = new Picture("seagull.jpg");
    gull.anotherSeagull();
    gull.explore();
  }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }
  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
    //testZeroBlue();
    testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    //testNegate();
    //testGrayscale();
    //testFixUnderwater();
    //testMirrorVertical();
    //testMirrorTemple();
    //testMirrorArms();
    //testMirrorGull();
    //testMirrorDiagonal();
    //testCollage();
    //testCopy();
    //testEdgeDetection();
    //testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
  }
}