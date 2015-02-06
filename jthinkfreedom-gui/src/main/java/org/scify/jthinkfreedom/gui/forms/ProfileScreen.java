package org.scify.jthinkfreedom.gui.forms;

import java.awt.GridBagConstraints;
import java.util.ArrayList;
import java.util.List;
import org.scify.jthinkfreedom.gui.model.Configuration;
import org.scify.jthinkfreedom.gui.model.User;
import org.scify.jthinkfreedom.gui.utils.ConfigurationHandler;

/**
 *
 * @author peustr
 */
public class ProfileScreen extends javax.swing.JFrame {

    private static final int VIEW_LIMIT = 4;

    private ConfigurationHandler cf;
    private List<ProfilePanel> profiles;
    private List<ConfigurationPanel> configurations;

    private User selectedUser;

    /**
     * Creates new form ProfileScreen
     */
    public ProfileScreen() {
        initComponents();
    }

    public ProfileScreen(ConfigurationHandler cf) {
        this.cf = cf;
        initComponents();
        initCustomComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contentPane = new javax.swing.JPanel();
        logoLabel = new javax.swing.JLabel();
        titleLabel = new javax.swing.JLabel();
        descriptionScrollPane = new javax.swing.JScrollPane();
        descriptionTextPane = new javax.swing.JTextPane();
        nextProfileButton = new javax.swing.JButton();
        previousProfileButton = new javax.swing.JButton();
        profileCountLabel = new javax.swing.JLabel();
        profilePanel = new javax.swing.JPanel();
        configurationTitleLabel = new javax.swing.JLabel();
        previousConfigurationButton = new javax.swing.JButton();
        nextConfigurationButton = new javax.swing.JButton();
        configurationPanel = new javax.swing.JPanel();
        addProfileButton = new javax.swing.JButton();
        runButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Think Freedom");

        contentPane.setBackground(new java.awt.Color(255, 255, 255));
        contentPane.setPreferredSize(new java.awt.Dimension(800, 720));

        logoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/scify/jthinkfreedom/gui/resources/logo_100x59.png"))); // NOI18N

        titleLabel.setFont(new java.awt.Font("Comfortaa", 1, 24)); // NOI18N
        titleLabel.setText("SciFY Supportive Technologies");

        descriptionTextPane.setEditable(false);
        descriptionTextPane.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        descriptionTextPane.setFont(new java.awt.Font("Comfortaa", 0, 12)); // NOI18N
        descriptionTextPane.setText("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mauris id ipsum tempor, lobortis magna sed, fringilla lectus. Nam id condimentum velit. Maecenas vel augue porta, luctus magna id, sollicitudin quam. Proin venenatis tincidunt commodo. Duis quis pharetra magna, ut placerat metus. Nulla erat arcu, dictum non risus at, faucibus fermentum odio. Duis mattis erat nec magna maximus elementum. Nunc massa leo, feugiat non odio eu, accumsan vestibulum nibh. Quisque scelerisque ligula ut purus rutrum, ut posuere mauris auctor. Aliquam elementum dolor eget velit efficitur finibus venenatis ut nulla. Morbi varius massa sed odio viverra, id auctor diam posuere.");
        descriptionScrollPane.setViewportView(descriptionTextPane);

        nextProfileButton.setFont(new java.awt.Font("Comfortaa", 0, 10)); // NOI18N
        nextProfileButton.setText(">");

        previousProfileButton.setFont(new java.awt.Font("Comfortaa", 0, 10)); // NOI18N
        previousProfileButton.setText("<");

        profileCountLabel.setFont(new java.awt.Font("Comfortaa", 1, 14)); // NOI18N
        profileCountLabel.setText("n profiles");

        profilePanel.setBackground(new java.awt.Color(255, 255, 255));
        profilePanel.setLayout(new java.awt.GridBagLayout());

        configurationTitleLabel.setFont(new java.awt.Font("Comfortaa", 1, 14)); // NOI18N
        configurationTitleLabel.setText("No configuration selected");

        previousConfigurationButton.setFont(new java.awt.Font("Comfortaa", 0, 10)); // NOI18N
        previousConfigurationButton.setText("<");

        nextConfigurationButton.setFont(new java.awt.Font("Comfortaa", 0, 10)); // NOI18N
        nextConfigurationButton.setText(">");

        configurationPanel.setBackground(new java.awt.Color(255, 255, 255));
        configurationPanel.setLayout(new java.awt.GridBagLayout());

        addProfileButton.setFont(new java.awt.Font("Comfortaa", 1, 14)); // NOI18N
        addProfileButton.setText("Add new profile");
        addProfileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addProfileButtonActionPerformed(evt);
            }
        });

        runButton.setFont(new java.awt.Font("Comfortaa", 1, 14)); // NOI18N
        runButton.setText("Run");
        runButton.setEnabled(false);
        runButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                runButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout contentPaneLayout = new javax.swing.GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(contentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(configurationPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(profilePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(descriptionScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                        .addComponent(profileCountLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(previousProfileButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nextProfileButton))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                        .addComponent(configurationTitleLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(previousConfigurationButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nextConfigurationButton))
                    .addGroup(contentPaneLayout.createSequentialGroup()
                        .addComponent(logoLabel)
                        .addGap(18, 18, 18)
                        .addComponent(titleLabel)
                        .addGap(0, 301, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(runButton)
                        .addGap(18, 18, 18)
                        .addComponent(addProfileButton)))
                .addContainerGap())
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(contentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(titleLabel)
                    .addComponent(logoLabel))
                .addGap(13, 13, 13)
                .addComponent(descriptionScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(contentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(profileCountLabel)
                    .addComponent(previousProfileButton)
                    .addComponent(nextProfileButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(profilePanel, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(contentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(configurationTitleLabel)
                    .addComponent(previousConfigurationButton)
                    .addComponent(nextConfigurationButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(configurationPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(contentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addProfileButton)
                    .addComponent(runButton))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(contentPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(contentPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void runButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_runButtonActionPerformed
        for (Configuration config : selectedUser.getConfigurations()) {
            config.getSensor().addStimulus(config.getStimulus());
            config.getStimulus().addSensor(config.getSensor());
            config.getStimulus().addReactor(config.getReactor());
            config.getSensor().start();
        }
        setVisible(false);
    }//GEN-LAST:event_runButtonActionPerformed

    private void addProfileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addProfileButtonActionPerformed
        CreateUserScreen cus = new CreateUserScreen(this);
        cus.setLocationRelativeTo(null);
        cus.setVisible(true);
    }//GEN-LAST:event_addProfileButtonActionPerformed

    private void initCustomComponents() {
        // Grid bag layout manager fill from left to right
        gbc = new GridBagConstraints();
        gbc.anchor = GridBagConstraints.WEST;
        gbc.weightx = 1;
        // Fill the profile panel according to pagination
        profiles = new ArrayList<>();
        for (User profile : cf.getProfiles()) {
            profiles.add(new ProfilePanel(this, profile));
        }
        if (!profiles.isEmpty()) {
            profileCountLabel.setText(profiles.size() + " profiles");
            for (int i = 0; i < VIEW_LIMIT; i++) {
                try {
                    profilePanel.add(profiles.get(i), gbc);
                } catch (IndexOutOfBoundsException e) {
                    // Do nothing
                }
            }
        }
        configurations = new ArrayList<>();
        // Pack the fuck up
        pack();
    }

    public List<ProfilePanel> getProfiles() {
        return profiles;
    }

    public void setProfiles(List<ProfilePanel> profiles) {
        this.profiles = profiles;
    }

    public List<ConfigurationPanel> getConfigurations() {
        return configurations;
    }

    public void setConfigurations(List<ConfigurationPanel> configurations) {
        this.configurations = configurations;
    }

    public User getSelectedUser() {
        return selectedUser;
    }

    public void setSelectedUser(User selectedUser) {
        this.selectedUser = selectedUser;
    }

    public void repaintConfigurations(User user) {
        configurationTitleLabel.setText("Currently displaying configuration for " + user.getName());
        configurationPanel.removeAll();
        if (!configurations.isEmpty()) {
            for (int i = 0; i < VIEW_LIMIT; i++) {
                try {
                    configurationPanel.add(configurations.get(i), gbc);
                } catch (IndexOutOfBoundsException e) {
                    // Do nothing
                }
            }
        }
        runButton.setEnabled(true);
        pack();
    }

    private GridBagConstraints gbc;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addProfileButton;
    private javax.swing.JPanel configurationPanel;
    private javax.swing.JLabel configurationTitleLabel;
    private javax.swing.JPanel contentPane;
    private javax.swing.JScrollPane descriptionScrollPane;
    private javax.swing.JTextPane descriptionTextPane;
    private javax.swing.JLabel logoLabel;
    private javax.swing.JButton nextConfigurationButton;
    private javax.swing.JButton nextProfileButton;
    private javax.swing.JButton previousConfigurationButton;
    private javax.swing.JButton previousProfileButton;
    private javax.swing.JLabel profileCountLabel;
    private javax.swing.JPanel profilePanel;
    private javax.swing.JButton runButton;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}
