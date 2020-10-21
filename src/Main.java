import ClassTiedWithStack.List;

public class Main {
    public static void main(String[] args) {
        {
            List StringArr = new List  ();
            StringArr.addBack ("Hey!");
            StringArr.addBack ("This");
            StringArr.addBack("Is");
            StringArr.addBack("Java");
            StringArr.addBack(",");
            StringArr.addBack("What");
            StringArr.addBack("R");
            StringArr.addBack("U");
            StringArr.addBack("Looking");
            StringArr.addBack("at");
            StringArr.addBack("?");
            StringArr.delEl("Hey!");
            System.out.print(StringArr.get(20) + " ");
            StringArr.printEl();
        }

    }
}
