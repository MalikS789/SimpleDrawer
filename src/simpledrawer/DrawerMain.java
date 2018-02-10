/*
 * DrawerMain.java
 *
 * @author Gill Windall
 *
 * A very simple drawing program.
 *
 * The UI for the class has been created using NetBeans GUI Builder.  If you
 * wish to edit the parts generated by the form editor you have two choices:
 * 1) Use a text editor to remove the "editor" comments that NetBeans uses
 * to identify the parts that should not be edited.  This is a one way trip. 
 * Once you have done this you won't be able to use the NetBeans GUI editor 
 * any more for this class
 * 2) Work out how to use the "Code" feature on the property editor in NetBeans
 * to customise the generated code.  You can do most things by use of properties 
 * such as "Pre-Init Code" and "Post-Init Code"
 */
package simpledrawer;

import java.awt.Color;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;

public class DrawerMain extends javax.swing.JFrame {

    private DrawingPanel drawingPanel; // the drawing panel

    /**
     * Initialise the components in the screen and then cast a reference to the
     * panel that will be drawn on so it can be used elsewhere.
     */
    public DrawerMain() {
        initComponents();
        drawingPanel = (DrawingPanel) panDrawingArea;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grpShape = new javax.swing.ButtonGroup();
        panControls = new javax.swing.JPanel();
        panScroller = new javax.swing.JPanel();
        panRedScroller = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        scrRed = new javax.swing.JScrollBar();
        txtRed = new javax.swing.JTextField();
        panGreenScroller = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        scrGreen = new javax.swing.JScrollBar();
        txtGreen = new javax.swing.JTextField();
        panBlueScroller = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        scrBlue = new javax.swing.JScrollBar();
        txtBlue = new javax.swing.JTextField();
        panBrightness = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        scrBrightness = new javax.swing.JScrollBar();
        panMoreControls = new javax.swing.JPanel();
        panShape = new javax.swing.JPanel();
        radLine = new javax.swing.JRadioButton();
        radOval = new javax.swing.JRadioButton();
        radTriangle = new javax.swing.JRadioButton();
        radSquare = new javax.swing.JRadioButton();
        panThickness = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtThickness = new javax.swing.JTextField();
        panRotate = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnLeft = new javax.swing.JButton();
        btnRight = new javax.swing.JButton();
        panButtons = new javax.swing.JPanel();
        btnClear = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        panLoad = new javax.swing.JPanel();
        btnLoadXML = new javax.swing.JButton();
        btnLoadJSON = new javax.swing.JButton();
        ColourPreview = new javax.swing.JLabel();
        panDrawingArea = new DrawingPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Simple Draw");
        getContentPane().setLayout(new java.awt.BorderLayout());

        panControls.setPreferredSize(new java.awt.Dimension(270, 300));
        panControls.setLayout(new java.awt.BorderLayout());

        panScroller.setPreferredSize(new java.awt.Dimension(200, 100));
        panScroller.setLayout(new java.awt.GridLayout(4, 0));

        panRedScroller.setPreferredSize(new java.awt.Dimension(200, 26));
        panRedScroller.setLayout(new java.awt.FlowLayout(0));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel4.setText("Red");
        jLabel4.setPreferredSize(new java.awt.Dimension(35, 14));
        panRedScroller.add(jLabel4);

        scrRed.setMaximum(256);
        scrRed.setOrientation(javax.swing.JScrollBar.HORIZONTAL);
        scrRed.setVisibleAmount(1);
        scrRed.setPreferredSize(new java.awt.Dimension(150, 16));
        scrRed.addAdjustmentListener(new java.awt.event.AdjustmentListener() {
            public void adjustmentValueChanged(java.awt.event.AdjustmentEvent evt) {
                scrColourAdjustmentHandler(evt);
            }
        });
        panRedScroller.add(scrRed);

        txtRed.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtRed.setText("0");
        txtRed.setPreferredSize(new java.awt.Dimension(50, 20));
        panRedScroller.add(txtRed);

        panScroller.add(panRedScroller);

        panGreenScroller.setPreferredSize(new java.awt.Dimension(200, 26));
        panGreenScroller.setLayout(new java.awt.FlowLayout(0));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel5.setText("Green");
        jLabel5.setPreferredSize(new java.awt.Dimension(35, 14));
        panGreenScroller.add(jLabel5);

        scrGreen.setMaximum(256);
        scrGreen.setOrientation(javax.swing.JScrollBar.HORIZONTAL);
        scrGreen.setVisibleAmount(1);
        scrGreen.setPreferredSize(new java.awt.Dimension(150, 16));
        scrGreen.addAdjustmentListener(new java.awt.event.AdjustmentListener() {
            public void adjustmentValueChanged(java.awt.event.AdjustmentEvent evt) {
                scrColourAdjustmentHandler(evt);
            }
        });
        panGreenScroller.add(scrGreen);

        txtGreen.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtGreen.setText("0");
        txtGreen.setPreferredSize(new java.awt.Dimension(50, 20));
        panGreenScroller.add(txtGreen);

        panScroller.add(panGreenScroller);

        panBlueScroller.setPreferredSize(new java.awt.Dimension(200, 26));
        panBlueScroller.setLayout(new java.awt.FlowLayout(0));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel6.setText("Blue");
        jLabel6.setPreferredSize(new java.awt.Dimension(35, 14));
        panBlueScroller.add(jLabel6);

        scrBlue.setMaximum(256);
        scrBlue.setOrientation(javax.swing.JScrollBar.HORIZONTAL);
        scrBlue.setVisibleAmount(1);
        scrBlue.setPreferredSize(new java.awt.Dimension(150, 16));
        scrBlue.addAdjustmentListener(new java.awt.event.AdjustmentListener() {
            public void adjustmentValueChanged(java.awt.event.AdjustmentEvent evt) {
                scrColourAdjustmentHandler(evt);
            }
        });
        panBlueScroller.add(scrBlue);

        txtBlue.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtBlue.setText("0");
        txtBlue.setPreferredSize(new java.awt.Dimension(50, 20));
        panBlueScroller.add(txtBlue);

        panScroller.add(panBlueScroller);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel3.setText("Brightness");
        panBrightness.add(jLabel3);

        scrBrightness.setMaximum(110);
        scrBrightness.setOrientation(javax.swing.JScrollBar.HORIZONTAL);
        scrBrightness.setValue(50);
        scrBrightness.setPreferredSize(new java.awt.Dimension(150, 16));
        scrBrightness.addAdjustmentListener(new java.awt.event.AdjustmentListener() {
            public void adjustmentValueChanged(java.awt.event.AdjustmentEvent evt) {
                scrBrightnessAdjustmentValueChanged(evt);
            }
        });
        panBrightness.add(scrBrightness);

        panScroller.add(panBrightness);

        panControls.add(panScroller, java.awt.BorderLayout.NORTH);

        panMoreControls.setLayout(new java.awt.GridLayout(5, 0));

        grpShape.add(radLine);
        radLine.setSelected(true);
        radLine.setText("Line");
        radLine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radShapeActionPerformed(evt);
            }
        });
        panShape.add(radLine);

        grpShape.add(radOval);
        radOval.setText("Oval");
        radOval.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radShapeActionPerformed(evt);
            }
        });
        panShape.add(radOval);

        grpShape.add(radTriangle);
        radTriangle.setText("Triangle");
        radTriangle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radShapeActionPerformed(evt);
            }
        });
        panShape.add(radTriangle);

        grpShape.add(radSquare);
        radSquare.setText("Square");
        radSquare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radShapeActionPerformed(evt);
            }
        });
        panShape.add(radSquare);

        panMoreControls.add(panShape);

        panThickness.setLayout(new java.awt.FlowLayout(0));

        jLabel1.setText("Thickness");
        panThickness.add(jLabel1);

        txtThickness.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtThickness.setText("5");
        txtThickness.setPreferredSize(new java.awt.Dimension(50, 20));
        txtThickness.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtThicknessFocusLost(evt);
            }
        });
        txtThickness.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtThicknessActionPerformed(evt);
            }
        });
        txtThickness.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtThicknessKeyReleased(evt);
            }
        });
        panThickness.add(txtThickness);

        panMoreControls.add(panThickness);

        panRotate.setLayout(new java.awt.FlowLayout(0));

        jLabel2.setText("Rotate");
        panRotate.add(jLabel2);

        btnLeft.setText("Left");
        btnLeft.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLeftActionPerformed(evt);
            }
        });
        panRotate.add(btnLeft);

        btnRight.setText("Right");
        btnRight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRightActionPerformed(evt);
            }
        });
        panRotate.add(btnRight);

        panMoreControls.add(panRotate);

        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        panButtons.add(btnClear);

        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });
        panButtons.add(btnReset);

        panMoreControls.add(panButtons);

        btnLoadXML.setText("load XML");
        btnLoadXML.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoadXMLActionPerformed(evt);
            }
        });
        panLoad.add(btnLoadXML);

        btnLoadJSON.setText("load JSON");
        btnLoadJSON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoadJSONActionPerformed(evt);
            }
        });
        panLoad.add(btnLoadJSON);

        panMoreControls.add(panLoad);

        panControls.add(panMoreControls, java.awt.BorderLayout.SOUTH);

        ColourPreview.setBackground(new java.awt.Color(126, 126, 126));
        ColourPreview.setText("           ");
        ColourPreview.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        ColourPreview.setOpaque(true);
        panControls.add(ColourPreview, java.awt.BorderLayout.CENTER);

        getContentPane().add(panControls, java.awt.BorderLayout.WEST);

        panDrawingArea.setBackground(new java.awt.Color(255, 255, 255));
        panDrawingArea.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        panDrawingArea.setFocusCycleRoot(true);
        panDrawingArea.setPreferredSize(new java.awt.Dimension(300, 300));
        getContentPane().add(panDrawingArea, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /* rotate the drawing 90 degrees to the left */
    private void btnLeftActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLeftActionPerformed
        drawingPanel.rotate(-90);
    }//GEN-LAST:event_btnLeftActionPerformed
    /* clear the drawing */
    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        drawingPanel.clearDisplay();
    }//GEN-LAST:event_btnClearActionPerformed

    /* set the drawing colours */
    private void scrColourAdjustmentHandler(java.awt.event.AdjustmentEvent evt) {//GEN-FIRST:event_scrColourAdjustmentHandler
        UpdateColour();
    }//GEN-LAST:event_scrColourAdjustmentHandler

    /* change the type of shape to be drawn */
    private void radShapeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radShapeActionPerformed
        if (radLine.isSelected()) {
            drawingPanel.setCurrentShapeType(ShapeType.LINE);
            return;
        }
        if (radOval.isSelected()) {
            drawingPanel.setCurrentShapeType(ShapeType.OVAL);
            return;
        }

        if (radTriangle.isSelected()) {
            drawingPanel.setCurrentShapeType(ShapeType.TRIANGLE);
            return;
        }

        if (radSquare.isSelected()) {
            drawingPanel.setCurrentShapeType(ShapeType.SQUARE);
            return;
        }
    }//GEN-LAST:event_radShapeActionPerformed
    /* user pressed return in the thickness field */
    private void txtThicknessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtThicknessActionPerformed
        handleThickness();
    }//GEN-LAST:event_txtThicknessActionPerformed
    /* user has clicked away from the thickness field */
    private void txtThicknessFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtThicknessFocusLost
        handleThickness();
    }//GEN-LAST:event_txtThicknessFocusLost
    /* user has types somethinginto thickness field */
    private void txtThicknessKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtThicknessKeyReleased
        handleThickness();
    }//GEN-LAST:event_txtThicknessKeyReleased
    /* rotate the drawing 90 degrees to the right */
    private void btnRightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRightActionPerformed
        drawingPanel.rotate(90);
    }//GEN-LAST:event_btnRightActionPerformed

    private void scrBrightnessAdjustmentValueChanged(java.awt.event.AdjustmentEvent evt) {//GEN-FIRST:event_scrBrightnessAdjustmentValueChanged
        UpdateColour();
    }//GEN-LAST:event_scrBrightnessAdjustmentValueChanged

    private void btnLoadXMLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoadXMLActionPerformed
        try {
            XMLShapeReader shapeReader = new XMLShapeReader();

            shapeReader.getShapesFromFile("stored_shapes.xml");
            List listOfLines = shapeReader.getSlList();
            List listOfOvals = shapeReader.getOlList();
            List listOfTriangles = shapeReader.getStList();
            List listOfSquares = shapeReader.getSsList();
            drawingPanel.setShapes(listOfLines);
            drawingPanel.repaint();
            drawingPanel.setShapes(listOfOvals);
            drawingPanel.repaint();
            drawingPanel.setShapes(listOfTriangles);
            drawingPanel.repaint();
            drawingPanel.setShapes(listOfSquares);
            drawingPanel.repaint();

        } catch (ParserConfigurationException | SAXException | IOException ex) {
            Logger.getLogger(XMLShapeReader.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_btnLoadXMLActionPerformed

    private void btnLoadJSONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoadJSONActionPerformed

        try {
            JSONShapeReader shapeReader = new JSONShapeReader();
            shapeReader.getShapesFromFile("stored_shapes.json");
            List listOfLines = shapeReader.getSlList();
            List listOfOvals = shapeReader.getOlList();
            List listOfTriangles = shapeReader.getStList();
            List listOfSquares = shapeReader.getSsList();
            drawingPanel.setShapes(listOfLines);
            drawingPanel.repaint();
            drawingPanel.setShapes(listOfOvals);
            drawingPanel.repaint();
            drawingPanel.setShapes(listOfTriangles);
            drawingPanel.repaint();
            drawingPanel.setShapes(listOfSquares);
            drawingPanel.repaint();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DrawerMain.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnLoadJSONActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        drawingPanel.clearDisplay();
        scrRed.setValue(0);
        scrGreen.setValue(0);
        scrBlue.setValue(0);
        scrBrightness.setValue(50);
        txtThickness.setText("5");
        UpdateColour();
    }//GEN-LAST:event_btnResetActionPerformed

    /* action whatever change has been made to the line thickness */
    private void handleThickness() {
        try {
            int thickness = Integer.parseInt(txtThickness.getText());
            /* only allow thicknesses in the range 1 to 40 */
            thickness = thickness < 1 || thickness > 40 ? 5 : thickness;
            drawingPanel.setCurrentThickness(thickness);
        } catch (NumberFormatException ex) { //If the thickness isn't valid, just set it to the default
            int thickness = 5;
            drawingPanel.setCurrentThickness(thickness);
        }
    }

    private void UpdateColour() {
        int currentRed, currentGreen, currentBlue;
        currentRed = scrRed.getValue();
        currentGreen = scrGreen.getValue();
        currentBlue = scrBlue.getValue();
        txtRed.setText(currentRed + "");
        txtGreen.setText(currentGreen + "");
        txtBlue.setText(currentBlue + "");
        drawingPanel.setCurrentColor(new Color(currentRed, currentGreen, currentBlue));
        float currentBrightness = scrBrightness.getValue();
        currentRed = (int) (scrRed.getValue() * ((100 - currentBrightness) / 100));
        currentGreen = (int) (scrGreen.getValue() * ((100 - currentBrightness) / 100));
        currentBlue = (int) (scrBlue.getValue() * ((100 - currentBrightness) / 100));
        ColourPreview.setBackground(new Color(currentRed, currentGreen, currentBlue));
        drawingPanel.setCurrentBrightness((100 - currentBrightness) / 100);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        new DrawerMain().setVisible(true);

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ColourPreview;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnLeft;
    private javax.swing.JButton btnLoadJSON;
    private javax.swing.JButton btnLoadXML;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnRight;
    private javax.swing.ButtonGroup grpShape;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel panBlueScroller;
    private javax.swing.JPanel panBrightness;
    private javax.swing.JPanel panButtons;
    private javax.swing.JPanel panControls;
    private javax.swing.JPanel panDrawingArea;
    private javax.swing.JPanel panGreenScroller;
    private javax.swing.JPanel panLoad;
    private javax.swing.JPanel panMoreControls;
    private javax.swing.JPanel panRedScroller;
    private javax.swing.JPanel panRotate;
    private javax.swing.JPanel panScroller;
    private javax.swing.JPanel panShape;
    private javax.swing.JPanel panThickness;
    private javax.swing.JRadioButton radLine;
    private javax.swing.JRadioButton radOval;
    private javax.swing.JRadioButton radSquare;
    private javax.swing.JRadioButton radTriangle;
    private javax.swing.JScrollBar scrBlue;
    private javax.swing.JScrollBar scrBrightness;
    private javax.swing.JScrollBar scrGreen;
    private javax.swing.JScrollBar scrRed;
    private javax.swing.JTextField txtBlue;
    private javax.swing.JTextField txtGreen;
    private javax.swing.JTextField txtRed;
    private javax.swing.JTextField txtThickness;
    // End of variables declaration//GEN-END:variables
}
