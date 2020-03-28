package programmingchallenges1;

/**
 * @author noname
 */
public class CashRegister {
    public CashRegister(RetailItem a){
        RetailItem=a;
    }
    public CashRegister(){}
    public double getSubtotal(){
        return RetailItem.getPrice()*quantity;
    }
    public double getTax(){
        return getSubtotal()*0.06d;
    }
    public double getTotal(){
        return getSubtotal()*1.06d;
    }
    private volatile RetailItem RetailItem;
    private volatile int quantity;

    /**
     * @param quantity the quantity to set
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public void save() {
        java.io.File file;
        //for (int i = 1;; i++) {
            //file = new java.io.File(SomeTools.desktopPath() + "Sales Receipt File第" + i + "次储存.txt");
            file = SomeTools.fileChooser(new String[][]{{".txt", "文本文档 (.txt)"}});
            if (!file.exists()) {
                try {
                    file.createNewFile();
                    try (java.io.PrintWriter x = new java.io.PrintWriter(file)) {
                        x.println("SALES RECEIPT");
                        x.println("Unit Price: $" + new java.text.DecimalFormat("#.00").format(this.RetailItem.getPrice()));
                        x.println("Quantity: " + quantity);
                        x.println("Subtotal: $" + getSubtotal());
                        x.println("Sales Tax: $" + getTax());
                        x.println("Total: $" + getTotal());
                    }
                    System.out.println("Successfully stored on the desktop(成功储存在桌面)");
                } catch (java.io.IOException ex) {
                    java.util.logging.Logger.getLogger(ProgrammingChallenges1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                }
                //break;
            }
        //}
    }
}
