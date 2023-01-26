import java.util.Random;

class Cards {
    private String typeId;
    private String numberId;

    public Cards(String typeId, String numberId) {
        this.typeId = typeId;
        this.numberId = numberId;
    }

    public String getNumberId() {
        return new String("Number-" + this.numberId + ", Card-" + this.typeId);
    }

}

class Main {
    public static void main(String[] args) {
        Cards a1 = new Cards("Diamond", "Three");
        // System.out.println(a1.getNumberId());
        // Random random = new Random();
        // int x = random.nextInt(56);
        // int y = (int) (Math.random() * (10 - 56 + 1) + 56);

        PackGenerate a2 = new PackGenerate();
        // a2.packPrinter(a2.packOriginal());
        a2.shuffleCard();
        // a2.packPrinter(a2.packOriginal());
        // a2.crossChek();
        dealer a3 = new dealer(a2.packOriginal());
	  System.out.println("Gihan__________________________");
        a3.packPrinters(a3.getPone());
        System.out.println("Mahesha__________________________");
        a3.packPrinters(a3.getPtwo());
        System.out.println("Even__________________________");
        a3.packPrinters(a3.getPthree());
        System.out.println("Erick__________________________");
        a3.packPrinters(a3.getPfour());
        
    }

}

class PackGenerate {
    private String[] packOriginal = new String[56];
    private String[] cardType = { "Club", "Diamond", "Kalabara", "Heart" };
    private String[] cardNumber = { "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten",
            "Jack", "Qeen", "King", "Ace" };

    public PackGenerate() {
        int count = 0;
        for (int i = 0; i < cardType.length; i++) {
            for (int j = 0; j < cardNumber.length; j++) {
                count++;
                this.packOriginal[count - 1] = cardType[i] + "-" + cardNumber[j];
            }

        }
    }

    public String[] packOriginal() {
        return this.packOriginal;
    }

    public void packPrinter(String[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println((i + 1) + "." + a[i]);
        }
    }

    public void shuffleCard() {
        for (int i = 0; i < packOriginal.length; i++) {
            Random x = new Random();
            int randomN = x.nextInt(56);
            String temp = packOriginal[i];
            packOriginal[i] = packOriginal[randomN];
            packOriginal[randomN] = temp;

        }
    }

    public void crossChek() {
        for (int i = 0; i < packOriginal.length; i++) {
            int count = 0;
            for (int j = 0; j < packOriginal.length; j++) {
                if (packOriginal[i] == packOriginal[j]) {
                    count++;
                }
            }
            if (count > 1)
                System.out.println(count + packOriginal[i]);
            else
                System.out.println(i + ". " + packOriginal[i]);
        }
    }
}

class dealer {
    private String[] pOne = new String[14];
    private String[] pTwo = new String[14];
    private String[] pThree = new String[14];
    private String[] pFour = new String[14];

    public dealer(String[] a) {
        for (int i = 0; i < 56; i++) {
            if (i < 14) {
                this.pOne[i] = a[i];
            } else if (i > 13 && i < 28) {
                this.pTwo[i - 14] = a[i];
            } else if (i > 27 && i < 42) {
                this.pThree[i - 28] = a[i];
            } else {
                this.pFour[i - 42] = a[i];
            }
        }
    }

    public String[] getPone() {
        return pOne;
    }

    public String[] getPtwo() {
        return pTwo;
    }

    public String[] getPthree() {
        return pThree;
    }

    public String[] getPfour() {
        return pFour;
    }
    public void packPrinters(String[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println((i + 1) + "." + a[i]);
        }
    }
}