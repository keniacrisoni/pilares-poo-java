public class ComputdorDoPedrinho {
    public static void main(String[] args) {

        System.out.println("MSN");
        ServicoDeMensagemInstantanea msn = new MSNMessenger();
        msn.enviarMensagem();
        msn.receberMensagem();

        System.out.println("Facebook");
        ServicoDeMensagemInstantanea fcb = new FacebookMessenger();
        fcb.enviarMensagem();
        fcb.receberMensagem();

        System.out.println("Telegram");
        ServicoDeMensagemInstantanea tlm = new TelegramMessenger();
        tlm.enviarMensagem();
        tlm.receberMensagem();

    }

}
