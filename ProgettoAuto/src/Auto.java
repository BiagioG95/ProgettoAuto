public class Auto {

        private int cilindrata;

        private String marca, modello, targa;

        public Auto(String targa){
            this.targa = targa;
        }
        public Auto(){};

        public Auto(int cilindrata, String marca, String modello, String targa){
            this.cilindrata = cilindrata;
            this.marca = marca;
            this.modello = modello;
            this.targa = targa;
        }

        public int getCilindrata() {
            return cilindrata;
        }

        public String getMarca() {
            return marca;
        }

        public String getModello() {
            return modello;
        }

        public String getTarga() {
            return targa;
        }

        public void setCilindrata(int cilindrata) {
            this.cilindrata = cilindrata;
        }

        public void setMarca(String marca) {
            this.marca = marca;
        }

        public void setModello(String modello) {
            this.modello = modello;
        }

        public void setTarga(String targa) {
            this.targa = targa;
        }

    @Override
    public String toString() {
        return "Auto{" +
                "cilindrata=" + cilindrata +
                ", marca='" + marca + '\'' +
                ", modello='" + modello + '\'' +
                ", targa='" + targa + '\'' +
                '}';
    }
}

