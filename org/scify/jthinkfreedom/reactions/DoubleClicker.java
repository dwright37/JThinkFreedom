/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.scify.jthinkfreedom.reactions;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ggianna
 */
public class DoubleClicker  extends ReactorAdapter {

    @Override
    public void react() {
        try {
//            String[] sCmd = new String[]{"/usr/bin/xte", "'mouseclick 3'"};
//            String[] sCmd = new String[]{"/usr/bin/xte", "'key A'"};
            String sCmd = "eventScripts/doubleClick.sh";
            // DEBUG LINES
            System.err.println(System.getProperty("os.name"));
            //////////////
            if (System.getProperty("os.name").contains("Win"))
                sCmd = "eventScripts/doubleClick.bat";
            Process p = Runtime.getRuntime().exec(sCmd);
            
            try {
                p.waitFor();
                System.err.println("Double Click!" + p.exitValue());
            } catch (InterruptedException ex) {
                Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, null, ex);
            }
        } catch (IOException ex) {
            Logger.getLogger(this.getClass().getName()).log(
                    Level.SEVERE, "Please install xte program.", ex);
        }
    }


}