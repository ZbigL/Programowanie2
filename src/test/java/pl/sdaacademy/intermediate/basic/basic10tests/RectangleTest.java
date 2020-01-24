package pl.sdaacademy.intermediate.basic.basic10tests;


import org.junit.*;

/**
 * @author Zbigniew Lemiesz
 */
public class RectangleTest {
    Rectangle rectangle;

    @BeforeClass
    public static void startingClassTest() {
        System.out.println("Starting RectangleTest");
    }

    @AfterClass
    public static void finishingClassTest() {
        System.out.println("Finishing RectangleTest");
    }

    @Before
    public void setRectangle() {
        this.rectangle = new Rectangle(3, 4);
    }

    @After
    public void showStatement() {
        System.out.println("After single test case");
    }

    @Test
    public void testCalculateAre() {
        Assert.assertEquals(12, rectangle.calculateArea());
    }

    @Test
    public void testCalculatePerimeter() {
        Assert.assertEquals(14, rectangle.calculatePerimeter());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testThrowExceptionOnIncorrectValuesInConstructor() {
        new Rectangle(1, -1);
    }


    @Test
    public void getWidth() {
        Assert.assertEquals(3, rectangle.getWidth());
    }


    @Test
    public void getHeight() {
        Assert.assertEquals(4, rectangle.getHeight());
    }

    @Test
    public void updateHeight() {
        rectangle.updateHeight(5);
        Assert.assertEquals(5, rectangle.getHeight());
    }

    @Test
    public void updateWeight() {
        rectangle.updateWidth(6);
        Assert.assertEquals(6, rectangle.getWidth());
    }

    @Test
    public void noUpdateHeight() {
        rectangle.updateHeight(0);
        Assert.assertEquals(4, rectangle.getHeight());
    }

    @Test
    public void noUpdateWeight() {
        rectangle.updateWidth(-1);
        Assert.assertEquals(3, rectangle.getWidth());
    }

}


