package duskis.spirograph;

import org.junit.jupiter.api.Test;

import javax.swing.*;

import static org.mockito.Mockito.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SpirographControllerTest {
    @Test
    void updateModel() {
<<<<<<< HEAD
        SpirographView view = mock();
        JTextField largeRfield = mock();
        JTextField rfield = mock();
        JTextField penDfield2 = mock();
        JTextField numStepsfield2 = mock();
        JTextField anglefield2 = mock();

        SpirographController controller = new SpirographController(view,
                largeRfield,
                rfield,
                penDfield2,
                numStepsfield2,
                anglefield2);

        controller.updateModel();

        SpirographModel model = view.getModel();

        assertEquals(210, model.getLargeRadius());
        assertEquals(65, model.getSmallRadius());
        assertEquals(50, model.getPenDistance());
        assertEquals(2600, model.getNumSteps());
        assertEquals(0.006, model.getAnglePerStep());
=======
        SpirographView view = mock(SpirographView.class);
        SpirographModel model = mock(SpirographModel.class);
        JTextField largeRfield = mock(JTextField.class);
        doReturn("210").when(largeRfield).getText();
        JTextField rfield = mock(JTextField.class);
        doReturn("65").when(rfield).getText();
        JTextField penDfield = mock(JTextField.class);
        doReturn("50").when(penDfield).getText();
        JTextField numStepsfield = mock(JTextField.class);
        doReturn("2600").when(numStepsfield).getText();
        JTextField anglefield = mock(JTextField.class);
        doReturn("0.006").when(anglefield).getText();

        SpirographController controller = new SpirographController(view,
                model,
                largeRfield,
                rfield,
                penDfield,
                numStepsfield,
                anglefield);

        //controller.updateModel(); calls it two times

        verify(model).setLargeRadius(210);
        verify(model).setSmallRadius(65);
        verify(model).setPenDistance(50);
        verify(model).setNumSteps(2600);
        verify(model).setAnglePerStep(0.006);
>>>>>>> ea83817a7f7d0cb4591717ab329a89ac3c1e2ea2
    }
}
