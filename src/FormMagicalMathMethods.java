/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kamac8665
 */
public class FormMagicalMathMethods extends javax.swing.JFrame {

    /**
     * Creates new form FormMagicalMathMethods
     */
    public FormMagicalMathMethods() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleLabel = new javax.swing.JLabel();
        largestPanel = new javax.swing.JPanel();
        infoLabel1 = new javax.swing.JLabel();
        largestProgramInput1 = new javax.swing.JTextField();
        largestProgramInput2 = new javax.swing.JTextField();
        largestProgramButton = new javax.swing.JButton();
        largestProgramOutputLabel = new javax.swing.JLabel();
        smallestPanel = new javax.swing.JPanel();
        infoLabel2 = new javax.swing.JLabel();
        smallestProgramInput1 = new javax.swing.JTextField();
        smallestProgramInput2 = new javax.swing.JTextField();
        smallestProgramButton = new javax.swing.JButton();
        smallestProgramOutputLabel = new javax.swing.JLabel();
        powerOfPanel = new javax.swing.JPanel();
        infoLabel3 = new javax.swing.JLabel();
        powerProgramInput1 = new javax.swing.JTextField();
        powerProgramInput2 = new javax.swing.JTextField();
        powerProgramButton = new javax.swing.JButton();
        powerProgramOutputLabel = new javax.swing.JLabel();
        hypotenusePanel = new javax.swing.JPanel();
        infoLabel4 = new javax.swing.JLabel();
        hypotenuseProgramInput1 = new javax.swing.JTextField();
        hypotenuseProgramInput2 = new javax.swing.JTextField();
        hypotenuseProgramButton = new javax.swing.JButton();
        hypotenuseProgramOutputLabel = new javax.swing.JLabel();
        roundingDownPanel = new javax.swing.JPanel();
        infoLabel5 = new javax.swing.JLabel();
        roundingDownProgramInput = new javax.swing.JTextField();
        roundingDownProgramButton = new javax.swing.JButton();
        roundingDownProgramOutputLabel = new javax.swing.JLabel();
        roundingUpPanel = new javax.swing.JPanel();
        infoLabel6 = new javax.swing.JLabel();
        roundingUpProgramInput = new javax.swing.JTextField();
        roundingUpProgramButton = new javax.swing.JButton();
        roundingUpProgramOutputLabel = new javax.swing.JLabel();
        squareRootPanel = new javax.swing.JPanel();
        infoLabel7 = new javax.swing.JLabel();
        squareRootProgramInput = new javax.swing.JTextField();
        squareRootProgramButton = new javax.swing.JButton();
        squareRootProgramOutputLabel = new javax.swing.JLabel();
        angleInRadiansPanel = new javax.swing.JPanel();
        infoLabel8 = new javax.swing.JLabel();
        angleInRadiansProgramInput = new javax.swing.JTextField();
        angleInRadiansProgramButton = new javax.swing.JButton();
        angleInRadiansProgramOutputLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titleLabel.setFont(new java.awt.Font("Simplified Arabic", 0, 24)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(0, 153, 153));
        titleLabel.setText("MAGICAL MATH METHODS");

        largestPanel.setBackground(new java.awt.Color(204, 204, 255));

        infoLabel1.setFont(new java.awt.Font("Segoe UI Symbol", 0, 11)); // NOI18N
        infoLabel1.setText("Enter two numbers and click the button. The program will display the largest of the two numbers:");

        largestProgramInput1.setText(" ");

        largestProgramInput2.setText(" ");

        largestProgramButton.setText("Largest");
        largestProgramButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                largestProgramButtonActionPerformed(evt);
            }
        });

        largestProgramOutputLabel.setFont(new java.awt.Font("Segoe UI Symbol", 0, 12)); // NOI18N
        largestProgramOutputLabel.setText("---");

        javax.swing.GroupLayout largestPanelLayout = new javax.swing.GroupLayout(largestPanel);
        largestPanel.setLayout(largestPanelLayout);
        largestPanelLayout.setHorizontalGroup(
            largestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(largestPanelLayout.createSequentialGroup()
                .addGroup(largestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(largestPanelLayout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(largestProgramInput1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(largestProgramInput2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(largestProgramButton)
                        .addGap(18, 18, 18)
                        .addComponent(largestProgramOutputLabel))
                    .addComponent(infoLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        largestPanelLayout.setVerticalGroup(
            largestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(largestPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(infoLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(largestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(largestProgramOutputLabel)
                    .addComponent(largestProgramInput1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(largestProgramInput2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(largestProgramButton)))
        );

        smallestPanel.setBackground(new java.awt.Color(204, 204, 255));

        infoLabel2.setFont(new java.awt.Font("Segoe UI Symbol", 0, 11)); // NOI18N
        infoLabel2.setText("Enter two numbers and click the button. The program will display the smallest of the two numbers:");

        smallestProgramButton.setText("Smallest");
        smallestProgramButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smallestProgramButtonActionPerformed(evt);
            }
        });

        smallestProgramOutputLabel.setFont(new java.awt.Font("Segoe UI Symbol", 0, 12)); // NOI18N
        smallestProgramOutputLabel.setText("---");

        javax.swing.GroupLayout smallestPanelLayout = new javax.swing.GroupLayout(smallestPanel);
        smallestPanel.setLayout(smallestPanelLayout);
        smallestPanelLayout.setHorizontalGroup(
            smallestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(smallestPanelLayout.createSequentialGroup()
                .addGroup(smallestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(smallestPanelLayout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(smallestProgramInput1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(smallestProgramInput2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(smallestProgramButton)
                        .addGap(18, 18, 18)
                        .addComponent(smallestProgramOutputLabel))
                    .addComponent(infoLabel2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        smallestPanelLayout.setVerticalGroup(
            smallestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(smallestPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(infoLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(smallestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(smallestProgramOutputLabel)
                    .addComponent(smallestProgramInput1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(smallestProgramInput2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(smallestProgramButton)))
        );

        powerOfPanel.setBackground(new java.awt.Color(204, 204, 255));

        infoLabel3.setFont(new java.awt.Font("Segoe UI Symbol", 0, 11)); // NOI18N
        infoLabel3.setText("Enter two numbers and click the button. The program will display the first number to the power of the second:");

        powerProgramButton.setText("To The Power Of...");
        powerProgramButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                powerProgramButtonActionPerformed(evt);
            }
        });

        powerProgramOutputLabel.setFont(new java.awt.Font("Segoe UI Symbol", 0, 12)); // NOI18N
        powerProgramOutputLabel.setText("---");

        javax.swing.GroupLayout powerOfPanelLayout = new javax.swing.GroupLayout(powerOfPanel);
        powerOfPanel.setLayout(powerOfPanelLayout);
        powerOfPanelLayout.setHorizontalGroup(
            powerOfPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(powerOfPanelLayout.createSequentialGroup()
                .addGroup(powerOfPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(powerOfPanelLayout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(powerProgramInput1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(powerProgramInput2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(powerProgramButton)
                        .addGap(18, 18, 18)
                        .addComponent(powerProgramOutputLabel))
                    .addComponent(infoLabel3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        powerOfPanelLayout.setVerticalGroup(
            powerOfPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(powerOfPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(infoLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(powerOfPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(powerProgramOutputLabel)
                    .addComponent(powerProgramInput1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(powerProgramInput2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(powerProgramButton)))
        );

        hypotenusePanel.setBackground(new java.awt.Color(204, 204, 255));

        infoLabel4.setFont(new java.awt.Font("Segoe UI Symbol", 0, 11)); // NOI18N
        infoLabel4.setText("Enter the length of two sides of a right triangle. The program will display the hypotenuse of the triangle:");

        hypotenuseProgramButton.setText("Hypotenuse");
        hypotenuseProgramButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hypotenuseProgramButtonActionPerformed(evt);
            }
        });

        hypotenuseProgramOutputLabel.setFont(new java.awt.Font("Segoe UI Symbol", 0, 12)); // NOI18N
        hypotenuseProgramOutputLabel.setText("---");

        javax.swing.GroupLayout hypotenusePanelLayout = new javax.swing.GroupLayout(hypotenusePanel);
        hypotenusePanel.setLayout(hypotenusePanelLayout);
        hypotenusePanelLayout.setHorizontalGroup(
            hypotenusePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hypotenusePanelLayout.createSequentialGroup()
                .addGroup(hypotenusePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(hypotenusePanelLayout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(hypotenuseProgramInput1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(hypotenuseProgramInput2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(hypotenuseProgramButton)
                        .addGap(18, 18, 18)
                        .addComponent(hypotenuseProgramOutputLabel))
                    .addComponent(infoLabel4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        hypotenusePanelLayout.setVerticalGroup(
            hypotenusePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hypotenusePanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(infoLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(hypotenusePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hypotenuseProgramOutputLabel)
                    .addComponent(hypotenuseProgramInput1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hypotenuseProgramInput2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hypotenuseProgramButton)))
        );

        roundingDownPanel.setBackground(new java.awt.Color(204, 204, 255));

        infoLabel5.setFont(new java.awt.Font("Segoe UI Symbol", 0, 11)); // NOI18N
        infoLabel5.setText("Enter a decimal value. The program will display the value rounded down to the nearest interger:");

        roundingDownProgramButton.setText("Rounded Down");
        roundingDownProgramButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roundingDownProgramButtonActionPerformed(evt);
            }
        });

        roundingDownProgramOutputLabel.setFont(new java.awt.Font("Segoe UI Symbol", 0, 12)); // NOI18N
        roundingDownProgramOutputLabel.setText("---");

        javax.swing.GroupLayout roundingDownPanelLayout = new javax.swing.GroupLayout(roundingDownPanel);
        roundingDownPanel.setLayout(roundingDownPanelLayout);
        roundingDownPanelLayout.setHorizontalGroup(
            roundingDownPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundingDownPanelLayout.createSequentialGroup()
                .addGroup(roundingDownPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(roundingDownPanelLayout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(roundingDownProgramInput, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75)
                        .addComponent(roundingDownProgramButton)
                        .addGap(18, 18, 18)
                        .addComponent(roundingDownProgramOutputLabel))
                    .addComponent(infoLabel5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        roundingDownPanelLayout.setVerticalGroup(
            roundingDownPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundingDownPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(infoLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(roundingDownPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(roundingDownProgramOutputLabel)
                    .addComponent(roundingDownProgramInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(roundingDownProgramButton)))
        );

        roundingUpPanel.setBackground(new java.awt.Color(204, 204, 255));

        infoLabel6.setFont(new java.awt.Font("Segoe UI Symbol", 0, 11)); // NOI18N
        infoLabel6.setText("Enter a decimal value. The program will display the value rounded up to the nearest interger:");

        roundingUpProgramButton.setText("Rounded Up");
        roundingUpProgramButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roundingUpProgramButtonActionPerformed(evt);
            }
        });

        roundingUpProgramOutputLabel.setFont(new java.awt.Font("Segoe UI Symbol", 0, 12)); // NOI18N
        roundingUpProgramOutputLabel.setText("---");

        javax.swing.GroupLayout roundingUpPanelLayout = new javax.swing.GroupLayout(roundingUpPanel);
        roundingUpPanel.setLayout(roundingUpPanelLayout);
        roundingUpPanelLayout.setHorizontalGroup(
            roundingUpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundingUpPanelLayout.createSequentialGroup()
                .addGroup(roundingUpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(roundingUpPanelLayout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(roundingUpProgramInput, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75)
                        .addComponent(roundingUpProgramButton)
                        .addGap(18, 18, 18)
                        .addComponent(roundingUpProgramOutputLabel))
                    .addComponent(infoLabel6))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        roundingUpPanelLayout.setVerticalGroup(
            roundingUpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundingUpPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(infoLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(roundingUpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(roundingUpProgramOutputLabel)
                    .addComponent(roundingUpProgramInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(roundingUpProgramButton)))
        );

        squareRootPanel.setBackground(new java.awt.Color(204, 204, 255));

        infoLabel7.setFont(new java.awt.Font("Segoe UI Symbol", 0, 11)); // NOI18N
        infoLabel7.setText("Enter an integer. The program will display the square root of the integer:");

        squareRootProgramButton.setText("Squared");
        squareRootProgramButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                squareRootProgramButtonActionPerformed(evt);
            }
        });

        squareRootProgramOutputLabel.setFont(new java.awt.Font("Segoe UI Symbol", 0, 12)); // NOI18N
        squareRootProgramOutputLabel.setText("---");

        javax.swing.GroupLayout squareRootPanelLayout = new javax.swing.GroupLayout(squareRootPanel);
        squareRootPanel.setLayout(squareRootPanelLayout);
        squareRootPanelLayout.setHorizontalGroup(
            squareRootPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(squareRootPanelLayout.createSequentialGroup()
                .addGroup(squareRootPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(squareRootPanelLayout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(squareRootProgramInput, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75)
                        .addComponent(squareRootProgramButton)
                        .addGap(18, 18, 18)
                        .addComponent(squareRootProgramOutputLabel))
                    .addComponent(infoLabel7))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        squareRootPanelLayout.setVerticalGroup(
            squareRootPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(squareRootPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(infoLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(squareRootPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(squareRootProgramOutputLabel)
                    .addComponent(squareRootProgramInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(squareRootProgramButton)))
        );

        angleInRadiansPanel.setBackground(new java.awt.Color(204, 204, 255));

        infoLabel8.setFont(new java.awt.Font("Segoe UI Symbol", 0, 11)); // NOI18N
        infoLabel8.setText("Enter an angle in degrees. The program will display the angle in radians:");

        angleInRadiansProgramButton.setText("In Radians");
        angleInRadiansProgramButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                angleInRadiansProgramButtonActionPerformed(evt);
            }
        });

        angleInRadiansProgramOutputLabel.setFont(new java.awt.Font("Segoe UI Symbol", 0, 12)); // NOI18N
        angleInRadiansProgramOutputLabel.setText("---");

        javax.swing.GroupLayout angleInRadiansPanelLayout = new javax.swing.GroupLayout(angleInRadiansPanel);
        angleInRadiansPanel.setLayout(angleInRadiansPanelLayout);
        angleInRadiansPanelLayout.setHorizontalGroup(
            angleInRadiansPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(angleInRadiansPanelLayout.createSequentialGroup()
                .addGroup(angleInRadiansPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(angleInRadiansPanelLayout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(angleInRadiansProgramInput, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75)
                        .addComponent(angleInRadiansProgramButton)
                        .addGap(18, 18, 18)
                        .addComponent(angleInRadiansProgramOutputLabel))
                    .addComponent(infoLabel8))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        angleInRadiansPanelLayout.setVerticalGroup(
            angleInRadiansPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(angleInRadiansPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(infoLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(angleInRadiansPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(angleInRadiansProgramOutputLabel)
                    .addComponent(angleInRadiansProgramInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(angleInRadiansProgramButton)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(149, 149, 149)
                .addComponent(titleLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(hypotenusePanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(roundingDownPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(squareRootPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(angleInRadiansPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(powerOfPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(smallestPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(largestPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(roundingUpPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(titleLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(largestPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(smallestPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(powerOfPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(hypotenusePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(roundingDownPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(roundingUpPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(squareRootPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(angleInRadiansPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void largestProgramButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_largestProgramButtonActionPerformed
        //get text from program
        int num1 = Integer.parseInt(largestProgramInput1.getText());
        int num2 = Integer.parseInt(largestProgramInput2.getText());
        //output the largest number
        largestProgramOutputLabel.setText("The largest number is " + Math.max(num1,num2));
    }//GEN-LAST:event_largestProgramButtonActionPerformed

    private void smallestProgramButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smallestProgramButtonActionPerformed
        //get text from program
        int num1 = Integer.parseInt(smallestProgramInput1.getText());
        int num2 = Integer.parseInt(smallestProgramInput2.getText());
        //output the smallest number
        smallestProgramOutputLabel.setText("The smallest number is " + Math.min(num1,num2));
    }//GEN-LAST:event_smallestProgramButtonActionPerformed

    private void powerProgramButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_powerProgramButtonActionPerformed
        //get text from program
        int num1 = Integer.parseInt(powerProgramInput1.getText());
        int num2 = Integer.parseInt(powerProgramInput2.getText());
        //output the answer to the power of
        powerProgramOutputLabel.setText("The answer is " + Math.pow(num1,num2));
    }//GEN-LAST:event_powerProgramButtonActionPerformed

    private void hypotenuseProgramButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hypotenuseProgramButtonActionPerformed
        //get text from program
        int num1 = Integer.parseInt(hypotenuseProgramInput1.getText());
        int num2 = Integer.parseInt(hypotenuseProgramInput2.getText());
        //output the answer to the power of
        hypotenuseProgramOutputLabel.setText("The hypotenuse is " + Math.hypot(num1,num2));
    }//GEN-LAST:event_hypotenuseProgramButtonActionPerformed

    private void roundingDownProgramButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roundingDownProgramButtonActionPerformed
        //get text from program
        int num1 = Integer.parseInt(roundingDownProgramInput.getText());
        //output the answer to the power of
        roundingDownProgramOutputLabel.setText("The rounded down number is " + Math.floor(num1));
    }//GEN-LAST:event_roundingDownProgramButtonActionPerformed

    private void roundingUpProgramButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roundingUpProgramButtonActionPerformed
        //get text from program
        int num1 = Integer.parseInt(roundingUpProgramInput.getText());
        //output the answer to the power of
        roundingUpProgramOutputLabel.setText("The rounded up number is " + Math.ceil(num1));
    }//GEN-LAST:event_roundingUpProgramButtonActionPerformed

    private void squareRootProgramButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_squareRootProgramButtonActionPerformed
        //get text from program
        int num1 = Integer.parseInt(squareRootProgramInput.getText());
        //output the answer to the power of
        squareRootProgramOutputLabel.setText("The square root is " + Math.sqrt(num1));
    }//GEN-LAST:event_squareRootProgramButtonActionPerformed

    private void angleInRadiansProgramButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_angleInRadiansProgramButtonActionPerformed
        //get text from program
        int num1 = Integer.parseInt(angleInRadiansProgramInput.getText());
        //output the answer to the power of
        angleInRadiansProgramOutputLabel.setText("The angle in radians is " + Math.toRadians(num1));
    }//GEN-LAST:event_angleInRadiansProgramButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormMagicalMathMethods.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormMagicalMathMethods.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormMagicalMathMethods.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormMagicalMathMethods.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormMagicalMathMethods().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel angleInRadiansPanel;
    private javax.swing.JButton angleInRadiansProgramButton;
    private javax.swing.JTextField angleInRadiansProgramInput;
    private javax.swing.JLabel angleInRadiansProgramOutputLabel;
    private javax.swing.JPanel hypotenusePanel;
    private javax.swing.JButton hypotenuseProgramButton;
    private javax.swing.JTextField hypotenuseProgramInput1;
    private javax.swing.JTextField hypotenuseProgramInput2;
    private javax.swing.JLabel hypotenuseProgramOutputLabel;
    private javax.swing.JLabel infoLabel1;
    private javax.swing.JLabel infoLabel2;
    private javax.swing.JLabel infoLabel3;
    private javax.swing.JLabel infoLabel4;
    private javax.swing.JLabel infoLabel5;
    private javax.swing.JLabel infoLabel6;
    private javax.swing.JLabel infoLabel7;
    private javax.swing.JLabel infoLabel8;
    private javax.swing.JPanel largestPanel;
    private javax.swing.JButton largestProgramButton;
    private javax.swing.JTextField largestProgramInput1;
    private javax.swing.JTextField largestProgramInput2;
    private javax.swing.JLabel largestProgramOutputLabel;
    private javax.swing.JPanel powerOfPanel;
    private javax.swing.JButton powerProgramButton;
    private javax.swing.JTextField powerProgramInput1;
    private javax.swing.JTextField powerProgramInput2;
    private javax.swing.JLabel powerProgramOutputLabel;
    private javax.swing.JPanel roundingDownPanel;
    private javax.swing.JButton roundingDownProgramButton;
    private javax.swing.JTextField roundingDownProgramInput;
    private javax.swing.JLabel roundingDownProgramOutputLabel;
    private javax.swing.JPanel roundingUpPanel;
    private javax.swing.JButton roundingUpProgramButton;
    private javax.swing.JTextField roundingUpProgramInput;
    private javax.swing.JLabel roundingUpProgramOutputLabel;
    private javax.swing.JPanel smallestPanel;
    private javax.swing.JButton smallestProgramButton;
    private javax.swing.JTextField smallestProgramInput1;
    private javax.swing.JTextField smallestProgramInput2;
    private javax.swing.JLabel smallestProgramOutputLabel;
    private javax.swing.JPanel squareRootPanel;
    private javax.swing.JButton squareRootProgramButton;
    private javax.swing.JTextField squareRootProgramInput;
    private javax.swing.JLabel squareRootProgramOutputLabel;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}
