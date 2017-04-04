/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rootscalculatorapp;

import rootscalculatorapp.CalculatorApp;
import javax.swing.JButton;
import javax.swing.JTextField;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jimstewart
 */
public class CalculatorAppTest {
    CalculatorApp calc;
    JTextField display;
    JButton[] buttons = new JButton[16];
    public CalculatorAppTest() {
        calc = new CalculatorApp();
        display = calc.displayField;
        buttons[0] = calc.zeroButton;
        buttons[1] = calc.oneButton;
        buttons[2] = calc.twoButton;
        buttons[3] = calc.threeButton;
        buttons[4] = calc.fourButton;
        buttons[5] = calc.fiveButton;
        buttons[6] = calc.sixButton;
        buttons[7] = calc.sevenButton;
        buttons[8] = calc.eightButton;
        buttons[9] = calc.nineButton;
        buttons[10] = calc.plusButton;
        buttons[11] = calc.minusButton;
        buttons[12] = calc.timesButton;
        buttons[13] = calc.divideButton;
        buttons[14] = calc.equalsButton;
        buttons[15] = calc.clearButton;
        buttons[16] = calc.decimalButton;
    }
    /**
     * 
     */
    class CalculatorState{
        boolean overWrite;
        CalculatorApp.Operation activeOperation;
        String screenState;
        CalculatorState(boolean overWrite, CalculatorApp.Operation activeOperation, String screenState){
            this.overWrite = overWrite;
            this.activeOperation = activeOperation;
            this.screenState = screenState;
        }
        CalculatorState(boolean overWrite, String screenState){
            this.overWrite = overWrite;
            this.activeOperation = CalculatorApp.Operation.NONE;
            this.screenState = screenState;
        }
        CalculatorState(String screenState){
            this.overWrite = false;
            this.activeOperation = CalculatorApp.Operation.NONE;
            this.screenState = screenState;
        }
        CalculatorState(){
            this.overWrite = calc.overWrite;
            this.screenState = display.getText();
            this.activeOperation = calc.activeOperation;;
        }
    }
    
    @Test
    public void testZeroButton(){
        int buttonTestNumber = 0;
        display.setText("");
        calc.overWrite = false;
        numberButtonTest(buttonTestNumber);
        display.setText("");
        calc.overWrite = true;
        numberButtonTest(buttonTestNumber);
        display.setText("25");
        calc.overWrite = false;
        numberButtonTest(buttonTestNumber);
        display.setText("25");
        calc.overWrite = true;
        numberButtonTest(buttonTestNumber);
        display.setText("25");
        calc.overWrite = true;
        numberButtonTest(buttonTestNumber);
        display.setText("25");
        calc.overWrite = true;
        numberButtonTest(buttonTestNumber,3);
    }
    
    @Test
    public void testOneButton(){
        int buttonTestNumber = 1;
        display.setText("");
        calc.overWrite = false;
        numberButtonTest(buttonTestNumber);
        display.setText("");
        calc.overWrite = true;
        numberButtonTest(buttonTestNumber);
        display.setText("25");
        calc.overWrite = false;
        numberButtonTest(buttonTestNumber);
        display.setText("25");
        calc.overWrite = true;
        numberButtonTest(buttonTestNumber);
        display.setText("25");
        calc.overWrite = true;
        numberButtonTest(buttonTestNumber,3);
    }

    
    @Test
    public void testTwoButton(){
        int buttonTestNumber = 2;
        display.setText("");
        calc.overWrite = false;
        numberButtonTest(buttonTestNumber);
        display.setText("");
        calc.overWrite = true;
        numberButtonTest(buttonTestNumber);
        display.setText("25");
        calc.overWrite = false;
        numberButtonTest(buttonTestNumber);
        display.setText("25");
        calc.overWrite = true;
        numberButtonTest(buttonTestNumber);
        display.setText("25");
        calc.overWrite = true;
        numberButtonTest(buttonTestNumber,3);
    }

    
    @Test
    public void testThreeButton(){
        int buttonTestNumber = 3;
        display.setText("");
        calc.overWrite = false;
        numberButtonTest(buttonTestNumber);
        display.setText("");
        calc.overWrite = true;
        numberButtonTest(buttonTestNumber);
        display.setText("25");
        calc.overWrite = false;
        numberButtonTest(buttonTestNumber);
        display.setText("25");
        calc.overWrite = true;
        numberButtonTest(buttonTestNumber);
        display.setText("25");
        calc.overWrite = true;
        numberButtonTest(buttonTestNumber,3);
    }

    @Test
    public void testFourButton(){
        int buttonTestNumber = 4;
        display.setText("");
        calc.overWrite = false;
        numberButtonTest(buttonTestNumber);
        display.setText("");
        calc.overWrite = true;
        numberButtonTest(buttonTestNumber);
        display.setText("25");
        calc.overWrite = false;
        numberButtonTest(buttonTestNumber);
        display.setText("25");
        calc.overWrite = true;
        numberButtonTest(buttonTestNumber);
        display.setText("25");
        calc.overWrite = true;
        numberButtonTest(buttonTestNumber,3);
    }
    

    @Test
    public void testFiveButton(){
        int buttonTestNumber = 5;
        display.setText("");
        calc.overWrite = false;
        numberButtonTest(buttonTestNumber);
        display.setText("");
        calc.overWrite = true;
        numberButtonTest(buttonTestNumber);
        display.setText("25");
        calc.overWrite = false;
        numberButtonTest(buttonTestNumber);
        display.setText("25");
        calc.overWrite = true;
        numberButtonTest(buttonTestNumber);
        display.setText("25");
        calc.overWrite = true;
        numberButtonTest(buttonTestNumber,3);
    }
    

    @Test
    public void testSixButton(){
        int buttonTestNumber = 6;
        display.setText("");
        calc.overWrite = false;
        numberButtonTest(buttonTestNumber);
        display.setText("");
        calc.overWrite = true;
        numberButtonTest(buttonTestNumber);
        display.setText("25");
        calc.overWrite = false;
        numberButtonTest(buttonTestNumber);
        display.setText("25");
        calc.overWrite = true;
        numberButtonTest(buttonTestNumber);
        display.setText("25");
        calc.overWrite = true;
        numberButtonTest(buttonTestNumber,3);
    }
    

    @Test
    public void testSevenButton(){
        int buttonTestNumber = 7;
        display.setText("");
        calc.overWrite = false;
        numberButtonTest(buttonTestNumber);
        display.setText("");
        calc.overWrite = true;
        numberButtonTest(buttonTestNumber);
        display.setText("25");
        calc.overWrite = false;
        numberButtonTest(buttonTestNumber);
        display.setText("25");
        calc.overWrite = true;
        numberButtonTest(buttonTestNumber);
        display.setText("25");
        calc.overWrite = true;
        numberButtonTest(buttonTestNumber,3);
    }
    

    @Test
    public void testEightButton(){
        int buttonTestNumber = 8;
        display.setText("");
        calc.overWrite = false;
        numberButtonTest(buttonTestNumber);
        display.setText("");
        calc.overWrite = true;
        numberButtonTest(buttonTestNumber);
        display.setText("25");
        calc.overWrite = false;
        numberButtonTest(buttonTestNumber);
        display.setText("25");
        calc.overWrite = true;
        numberButtonTest(buttonTestNumber);
        display.setText("25");
        calc.overWrite = true;
        numberButtonTest(buttonTestNumber,3);
    }

    @Test
    public void testNineButton(){
        int buttonTestNumber = 9;
        display.setText("");
        calc.overWrite = false;
        numberButtonTest(buttonTestNumber);
        display.setText("");
        calc.overWrite = true;
        numberButtonTest(buttonTestNumber);
        display.setText("25");
        calc.overWrite = false;
        numberButtonTest(buttonTestNumber);
        display.setText("25");
        calc.overWrite = true;
        numberButtonTest(buttonTestNumber);
        display.setText("25");
        calc.overWrite = true;
        numberButtonTest(buttonTestNumber,3);
    }
    
//    @Test
//    private void testPlusButton(){
//        
//    }
    

    private void numberButtonTest(int buttonNumber){
        boolean ow = calc.overWrite;
        String prevValue = display.getText();
        String expectedString = "";
        if(buttonNumber>0 && buttonNumber<10){
            buttons[buttonNumber].doClick();
            if(ow){
                expectedString = Integer.toString(buttonNumber);
            } else {
                expectedString = prevValue + Integer.toString(buttonNumber);
            }
            
        }
        String testNumber = Integer.toString(buttonNumber);
        String errorMessage = "Test "+ testNumber + " failed. Expected string \"" + expectedString + "\" and got string " + 
                                display.getText();
        String t = display.getText();
        assertEquals(errorMessage, 
                    expectedString, 
                    t);
    }

    @Test
    private void decimalButtonTest(){
        String expectedValue;
        display.setText("10");
        calc.overWrite = false;
        expectedValue = "10.";
        assertEquals("Test 16 failed.", expectedValue, display.getText());
        display.setText("10");
        calc.overWrite = true;
        expectedValue = "0.";
        assertTrue("Decimal button test failed.", expectedValue.equals(display.getText()) && calc.overWrite == false);
    }
    
    @Test
    private void numberButtonTest(int buttonNumber, int numberOfPresses){
        boolean ow = calc.overWrite;
        String prevValue = display.getText();
        String expectedString = "";
        if(buttonNumber>0 && buttonNumber<10){
            if(ow){
                expectedString = "";
            } else {
                expectedString = prevValue;
            }
            for(int i=0;i<numberOfPresses;i++){
                buttons[buttonNumber].doClick();
                expectedString+=buttonNumber;
            }
            
        }
        String testNumber = Integer.toString(buttonNumber);
        String errorMessage = "Test "+ testNumber + " failed. Expected string \"" + expectedString + "\" and got string " + 
                                display.getText();
        String t = display.getText();
        assertEquals(errorMessage, 
                    expectedString, 
                    t);
    }
    
    
    @Test
    public void clearButtonTest(){
        buttons[15].doClick();
        assertEquals("Expected string \"\", got string " + display.getText(), "", display);
    }
    
    @Test
    public void plusButtonTest(){
        buttons[10].doClick();
        assertTrue("Did not activate ADD operation or turn on overWrite.", CalculatorApp.Operation.ADD.equals(calc.activeOperation) && calc.overWrite==true);
        //assertEquals("Did not activate add operation.", CalculatorApp.Operation.ADD, calc.activeOperation);
    }

    
    
    @Test
    public void minusButtonTest(){
        buttons[11].doClick();
        assertTrue("Did not activate SUBTRACT operation or turn on overWrite.", CalculatorApp.Operation.SUBTRACT.equals(calc.activeOperation) && calc.overWrite==true);
        //assertEquals("Did not activate add operation.", CalculatorApp.Operation.ADD, calc.activeOperation);
    }

    @Test
    public void timesButtonTest(){
        buttons[12].doClick();
        assertTrue("Did not activate MULTIPLY operation or turn on overWrite.", CalculatorApp.Operation.MULTIPLY.equals(calc.activeOperation) && calc.overWrite==true);
        //assertEquals("Did not activate add operation.", CalculatorApp.Operation.ADD, calc.activeOperation);
    }

    @Test
    public void divideButtonTest(){
        buttons[13].doClick();
        assertTrue("Did not activate add operation or turn on overWrite.", CalculatorApp.Operation.DIVIDE.equals(calc.activeOperation) && calc.overWrite==true);
        //assertEquals("Did not activate add operation.", CalculatorApp.Operation.ADD, calc.activeOperation);
    }
    
    @Test
    public void equalsButtonTest(){
        double expectedValue;
        double firstNum;
        double secondNum;
        
        equalsTest(-17,12,CalculatorApp.Operation.ADD);
        equalsTest(32.75,16.9, CalculatorApp.Operation.ADD);
        equalsTest(-9.3,-16.5,CalculatorApp.Operation.ADD);

        equalsTest(-17,12,CalculatorApp.Operation.SUBTRACT);
        equalsTest(32.75,16.9, CalculatorApp.Operation.SUBTRACT);
        equalsTest(-9.3,-16.5,CalculatorApp.Operation.SUBTRACT);
        
        equalsTest(-17,12,CalculatorApp.Operation.MULTIPLY);
        equalsTest(32.75,16.9, CalculatorApp.Operation.MULTIPLY);
        equalsTest(-9.3,-16.877,CalculatorApp.Operation.MULTIPLY);
               
        equalsTest(-17,12,CalculatorApp.Operation.DIVIDE);
        equalsTest(32.75,16.9, CalculatorApp.Operation.DIVIDE);
        equalsTest(-18.3,-16.532,CalculatorApp.Operation.DIVIDE);
               
        equalsTest(0,12,CalculatorApp.Operation.NONE);
        equalsTest(0,16.9, CalculatorApp.Operation.NONE);
        equalsTest(0,0,CalculatorApp.Operation.NONE);
    }
    
   
    private void equalsTest(double firstNum, double secondNum, CalculatorApp.Operation op){
        //[tk] need to make sure overWrite was turned back on as well
        double expectedValue;
        String opString;
        calc.firstNumber = firstNum;
        calc.activeOperation = op;
        display.setText(Double.toString(secondNum));
        switch(op){
            case ADD: 
                expectedValue = firstNum + secondNum;
                opString = "ADD";
                break;
            case SUBTRACT:
                expectedValue = firstNum - secondNum;
                opString = "SUBTRACT";
                break;
            case MULTIPLY:
                expectedValue = firstNum * secondNum;
                opString = "MULTIPLY";
                break;
            case DIVIDE:
                expectedValue = firstNum / secondNum;
                opString = "DIVIDE";
                break;
            default:
                try{
                    expectedValue = Double.parseDouble(display.getText());
                } catch (NumberFormatException nfe) {
                    expectedValue = 0;
                }
                opString = "no";
                break;
        }
        buttons[14].doClick();
        assertEquals("Test Failed for " + opString + " operation. " +
                        "First number was " + firstNum + ". " +
                        ". Second number was " + secondNum + ". " +
                        "Expected " + expectedValue + ". " +
                        "Instead got " + display.getText(), 
                        expectedValue, 
                        display.getText());
        
    }

    private String setButtonErrorMessage(int testNumber, String prevValue, String expectedString, String actualString){
        return "Test "+ testNumber + 
                " failed. Previous display value was \"" + prevValue + 
                " Expected string \"" + expectedString + 
                "\" and got string " + actualString;
    }

    
    
}
