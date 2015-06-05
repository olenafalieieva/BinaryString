package ua.goit.alg;
import static org.junit.Assert.*;
import org.junit.Test;

public class TestBinaryString {

  @Test
  public void shouldReturnBinaryString_WhenInputStringsLengthTheSame() {
	String s1 = "01011";
	String s2 = "00111";
	String expected = "10010";
	String actual = BinaryStringCalc.add(s1,s2);
	assertEquals(expected,actual);
  }
  
  @Test
  public void shouldReturnBinaryString_WhenInputStringsLengthAreDifferent() {
	String s1 = "010";
	String s2 = "00111";
	String expected = "01001";
	String actual = BinaryStringCalc.add(s1,s2);
	assertEquals(expected,actual);
  }
  
  @Test
  public void shouldReturnBinaryStringWhithOverBit() {
	String s1 = "111";
	String s2 = "111";
	String expected = "1110";
	String actual = BinaryStringCalc.add(s1,s2);
	assertEquals(expected,actual);
  }
}