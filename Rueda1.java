public class Rueda1 {
    public class Rueda {
        private int km;
        private String marca;
        private boolean invierno;

        public Rueda(int km, boolean invierno){
            this.km = km;
            this.marca = "Yokohama";
            this.invierno = invierno;
        }

        public int getKm() {
            return km;
        }

        public String getMarca() {
            return marca;
        }

        public boolean getInvierno(){
            return invierno;
        }

        public void setMarca(String newMarca) {
            this.marca = newMarca;
        }

        public void addKm(int moreKm) {
            this.km = km + moreKm;
        }

        public boolean changeInvierno(){
            boolean variable;
            if(invierno == true){
                variable = false;
            }
            else {
                variable = true;
            }
            return variable;
        }
    }
}
