import lan.zold.Hexadecagon;

public class HexadecagonTest {
    Hexadecagon hexadecagon;
    @BeforeTest
    public void testCalc() {
        this.hexadecagon = new Hexadecagon();
    }
    @Test
    public void testCalc2() {
        this.hexadecagon.calc();
    }
}
