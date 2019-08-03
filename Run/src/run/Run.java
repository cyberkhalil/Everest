package run;

public class Run {

    public static void main(String[] args) {
        try {
            Util.prerun_check();
        } catch (Exception ex) {
            System.out.println(ex);
        }
        try {
            Runtime.getRuntime().exec("java -jar C:/Everest/Everest.jar");
        } catch (Exception ex) {
            javax.swing.JOptionPane.showMessageDialog(null, ex);
        }
    }

}
