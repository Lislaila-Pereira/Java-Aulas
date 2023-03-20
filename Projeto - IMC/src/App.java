public class App {
    public static void main(String[] args) throws Exception {
        Paciente p1 = new Paciente(56.5, 1.57);
        Paciente p2 = new Paciente(105, 1.60);
        Paciente p3 = new Paciente(38.5, 1.60);
        System.out.println(p1.Diagnostico());
        System.out.println(p2.Diagnostico());
        System.out.println(p3.Diagnostico());
    }
}
