package programmingchallenges1;

/**
 * @author noname
 * <p>
 * {@link RoomDimension} {@link RoomCarpet}</p>
 * <p>
 * {@link LandTract}</p>
 * <p>
 * {@link CashRegister} {@link RetailItem}</p>
 * <p>
 * none</p>
 * <p>
 * {@link ParkedCar} {@link ParkingMeter} {@link ParkingTicket} {@link PoliceOfficer}</p>
 */
public abstract class ProgrammingChallenges1 {

    public static void main(String[] args) {
        int[] a;
        double[] b;
        main:
        while (true) {
            switch (SomeTools.customOptions("Select the project", new String[]{
                "Carpet Calculator",
                "LandTract Class",
                "CashRegister Class",
                "Sales Receipt File",
                "Parking Ticket Simulator",
                "test",
                "exit"
            }, 1).toString()) {
                case "Carpet Calculator":
                    while (true) {
                        b = new double[2];
                        System.out.print("Input length:");
                        b[0] = SomeTools.enterDecimal(0d, false, true, true);
                        System.out.print("Input width:");
                        b[1] = SomeTools.enterDecimal(0d, false, true, true);
                        System.out.print("Input price:");
                        RoomCarpet RoomCarpet = new RoomCarpet(new RoomDimension(b[0], b[1]), SomeTools.enterDecimal(0d, false, true, true));
                        System.out.println(RoomCarpet + "\ncost:" + RoomCarpet.getTotalCost());
                        if ((int) SomeTools.customOptions(null, new String[]{"again", "exit"}, 0) == 1) {
                            break;
                        }
                    }
                    break;
                case "LandTract Class":
                    while (true) {
                        b = new double[1];
                        System.out.print("The length of the first piece of land:");
                        b[0] = SomeTools.enterDecimal(0d, false, true, true);
                        System.out.print("The width of the first piece of land:");
                        LandTract LandTract1 = new LandTract(b[0], SomeTools.enterDecimal(0d, false, true, true));
                        System.out.print("The length of the second piece of land:");
                        b[0] = SomeTools.enterDecimal(0d, false, true, true);
                        System.out.print("The width of the second piece of land:");
                        LandTract LandTract2 = new LandTract(b[0], SomeTools.enterDecimal(0d, false, true, true));
                        System.out.println(LandTract1 + "\n" + LandTract2
                                + "\nThe area of the first piece of land:" + LandTract1.getArea()
                                + "\nThe area of the second piece of land:" + LandTract2.getArea()
                                + "\nWhether the two lands are equal in area:" + (LandTract1.getArea() == LandTract2.getArea()));
                        if ((int) SomeTools.customOptions(null, new String[]{"again", "exit"}, 0) == 1) {
                            break;
                        }
                    }
                    break;
                case "CashRegister Class":
                    while (true) {
                        System.out.print("Input item price:");
                        CashRegister CashRegister = new CashRegister(new RetailItem("none", SomeTools.enterDecimal(0d, false, true, true)));
                        System.out.print("Input purchase quantity:");
                        CashRegister.setQuantity(SomeTools.enterInteger(0, true, true, true));
                        System.out.println("Subtotal of sales:" + CashRegister.getSubtotal()
                                + "\nSales tax amount:" + CashRegister.getTax()
                                + "\nTotal sales:" + CashRegister.getTotal());
                        if ((int) SomeTools.customOptions(null, new String[]{"again", "exit"}, 0) == 1) {
                            break;
                        }
                    }
                    break;
                case "Sales Receipt File":
                    while (true) {
                        int asd;
                        System.out.print("Input purchase quantity:");
                        asd = SomeTools.enterInteger(0, true, true, true);
                        new CashRegister(new RetailItem("none", 10d)) {
                            private volatile RetailItem RetailItem = new RetailItem("none", 10d);
                            private volatile int quantity = asd;

                            @Override
                            public double getSubtotal() {
                                return RetailItem.getPrice() * quantity;
                            }

                            @Override
                            public double getTax() {
                                return getSubtotal() * 0.06d;
                            }

                            @Override
                            public double getTotal() {
                                return getSubtotal() * 1.06d;
                            }

                            public void save() {
                                java.io.File file;
                                for (int i = 1;; i++) {
                                    file = new java.io.File(SomeTools.desktopPath() + "Sales Receipt File第" + i + "次储存.txt");
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
                                        break;
                                    }
                                }
                            }
                        }.save();
                        if ((int) SomeTools.customOptions(null, new String[]{"again", "exit"}, 0) == 1) {
                            break;
                        }
                    }
                    break;
                case "Parking Ticket Simulator":
                    while (true) {
                        ParkedCar temp1 = new ParkedCar("?", "¿", "??", "¿¿", 100);
                        PoliceOfficer temp2 = new PoliceOfficer("???", "¿¿¿");
                        ParkingTicket temp3 = temp2.examine(temp1);
                        temp3.output();
                        if ((int) SomeTools.customOptions(null, new String[]{"again", "exit"}, 0) == 1) {
                            break;
                        }
                    }
                    break;
                case "test":
                    //for(int i=0;i<10;i++)for(int j=0;j<10;j++)System.out.println(i+"|"+j+"|"+(i>>>j));
                    //System.out.println("\n\n\n↑int   char↓\n\n\n");
                    //for(char i=0;i<10;i++)for(int j=0;j<10;j++)System.out.println(i+"|"+j+"|"+(i>>>j));
                    /*String[] YuanYin={"a","e","i","o","u"};
                    String[] FuYin={"b","c","d","f","g","h","j","k","l","m","n","p","q","r","s","t","v","w","x","y","z"};
                    int y=0,f=0;
                    String str=new java.util.Scanner(System.in).nextLine();
                    for(int i=0;i<str.length();i++){
                        for(int j=0;j<YuanYin.length;j++)if(str.substring(i, i+1).toLowerCase().equals(YuanYin[j]))y++;
                        for(int j=0;j<FuYin.length;j++)if(str.substring(i, i+1).toLowerCase().equals(FuYin[j]))f++;
                    }
                    System.out.println("元音"+y+"\n辅音"+f);*/
 /*int a=14,b=70;
                    System.out.println(Integer.toBinaryString(a)+"|"+Integer.toBinaryString(b));
                    System.out.println(">>     "+Integer.toBinaryString(a>>2)+"|"+Integer.toBinaryString(b>>1));
                    System.out.println(">>>    "+Integer.toBinaryString(a>>>2)+"|"+Integer.toBinaryString(b>>>2));
                    System.out.println("<<     "+Integer.toBinaryString(a<<2)+"|"+Integer.toBinaryString(b<<1));
                    System.out.println("|      "+Integer.toBinaryString(a|b)+"|"+Integer.toBinaryString(b|a));
                    System.out.println("&      "+Integer.toBinaryString(a&b)+"|"+Integer.toBinaryString(b&a));
                    System.out.println("~      "+Integer.toBinaryString(~a)+"|"+Integer.toBinaryString(~b));
                    System.out.println("^      "+Integer.toBinaryString(a^b)+"|"+Integer.toBinaryString(b^a));*/
                    //System.out.println(SomeTools.desktopPath());
                    break;
                case "exit":
                    break main;
            }
        }
    }
    
}
