public class ComputdorDoPedrinho {
    public static void main(String[] args) {

        ServicoDeMensagemInstantanea smi = null;

        String appEscolhido = "tlm";

        if (appEscolhido.equals("msn"))
            smi = new MSNMessenger();

        else if (appEscolhido.equals("fbm"))
            smi = new FacebookMessenger();

        else if (appEscolhido.equals("tlm"))
            smi = new TelegramMessenger();

        smi.enviarMensagem();
        smi.receberMensagem();
    }

}
