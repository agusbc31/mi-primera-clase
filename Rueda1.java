public class Rueda1 {
        private int km;
        private String marca;
        private boolean invierno;

        public Rueda1(int km, boolean invierno){
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

        public void imprimirEstadoRueda(){
            String estadoInvierno;
            if (invierno == true){
                estadoInvierno = ("si");
            }
            else {
                estadoInvierno = ("no");
            }
            System.out.println("Marca de las ruedas: " + marca + " || Kilometros de duracion: " + km + " || Ruedas de invierno: " + estadoInvierno);
        }

        public String estadoRueda(){
            String estadoInvierno;
            if (invierno == true){
                estadoInvierno = ("si");
            }
            else {
                estadoInvierno = ("no");
            }
            String estadoRueda = ("Marca de las ruedas: " + marca + " || Kilometros de duracion: " + km + " || Ruedas de invierno: " + estadoInvierno);
            return estadoRueda;
        }
}
