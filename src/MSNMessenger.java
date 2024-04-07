public class MSNMessenger extends ServicoDeMensagemInstantanea {

    @Override
    public void enviarMensagem() {
        System.out.println("Enviando mensagem pelo MSN");
    }

    @Override
    public void receberMensagem() {
        System.out.println("REcebendo mensagem pelo MSN");
    }
}