class position{
    int ligne;
    int colonne;

    position(int l , int c){
        ligne = l;
        colonne = c;

    }

}
class piece{
    position Position;

    public boolean isvalidmove(position nouvelle){
     return nouvelle.ligne >= 1 && nouvelle.ligne <= 8 && nouvelle.colonne >= 1 && nouvelle.colonne <= 8;

    }
}
class reine extends piece{
    @Override
    public boolean isvalidmove(position nouvelle){
        if (! super.isvalidmove(nouvelle)) {

            return false;

        }
        int diffligne = Math.abs(nouvelle.ligne - this.Position.ligne);
        int diffcolonne = Math.abs(nouvelle.colonne - this.Position.colonne);
        return diffligne == diffcolonne || diffligne == 0 || diffcolonne == 0;
    }
}



public class JeuDechecs {
    public static void main(String[]args){
reine Reine = new reine();
Reine.Position = new position(4,4);

position destination = new position(4,7);

if (Reine.isvalidmove(destination)){
    System.out.println("Déplacement autorisé");
}
else {
    System.out.println("Déplacement interdit");
}

    }
}
