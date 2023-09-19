public class ControleRemoto implements Controlador {
    private int volume;
    private boolean ligado;
    private boolean tocando;

    public void ControleRemoto() {
        volume = 50;
        ligado = false;
        tocando = false;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean getLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public boolean getTocando() {
        return tocando;
    }

    public void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    @Override
    public void ligar() {
        this.setLigado(true);
        // TODO Auto-generated method stub
        
    }

    @Override
    public void desligar() {
        this.setLigado(false);
        // TODO Auto-generated method stub
        
    }

    @Override
    public void abrirMenu() {
        System.out.println("Está ligado? "+this.getLigado());
        System.out.println("Está tocando? "+this.getTocando());
        System.out.println("Volume: "+this.getVolume());
        // TODO Auto-generated method stub
        
    }

    @Override
    public void fecharMenu() {
        System.out.println("fechando Menu...");
        // TODO Auto-generated method stub
        
    }

    @Override
    public void maisVolume() {
        if(this.getLigado()){
            this.setVolume(this.getVolume() + 1);
        }
        // TODO Auto-generated method stub
        
    }

    @Override
    public void menosVolume() {
        if(this.getLigado()){
            this.setVolume(this.getVolume() - 1);

        }
        // TODO Auto-generated method stub
        
    }

    @Override
    public void ligarMudo() {
        if (this.getLigado()&& this.getVolume()>0){
            this.setVolume(0);
            
        }
        // TODO Auto-generated method stub
        ;
    }

    @Override
    public void desligarMudo() {
        if(this.getLigado()&& this.getVolume() == 0){
            this.setVolume(50);
        }
        // TODO Auto-generated method stub
        
    }

    @Override
    public void play() {
        if(this.getLigado()&& !(this.getTocando())){
            this.setTocando(true);
            System.out.println("TOCANDO......");
       
        // TODO Auto-generated method stub
        
    }   else{
        System.out.println("Impoossivel tocar desligado");
    }
}

    @Override
    public void pause() {
        if(this.getLigado()&& this.getTocando()){
            this.setTocando(false);
        }
        // TODO Auto-generated method stub
        
    }

}
