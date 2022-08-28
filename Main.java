public class Main {

    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setName("Franco");
        cliente.setAge(28);
        cliente.setPhone(142536);
        cliente.setCredito(3000);

        System.out.println("Mi nombre es " + cliente.getName());
        System.out.println("Mi edad es " + cliente.getAge());
        System.out.println("Mi telefono es " + cliente.getPhone());
        System.out.println("Mi credito es " + cliente.getCredito());

        Trabajador trabajador = new Trabajador();
        trabajador.setName("Pablo");
        trabajador.setAge(31);
        trabajador.setPhone(152463);
        trabajador.setSalario(1500.5);

        System.out.println("Mi nombre es " + trabajador.getName());
        System.out.println("Mi edad es " + trabajador.getAge());
        System.out.println("Mi numero es " + trabajador.getPhone());
        System.out.println("Mi salario es " + trabajador.getSalario());
    }
}

class Persona {
    int age;
    String name;
    int phone;

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public int getPhone() {
        return this.phone;
    }
}

class Cliente extends Persona {
    double credito;

    public void setCredito(double credito) {
        this.credito = credito;
    }

    public double getCredito() {
        return this.credito;
    }
}

class Trabajador extends Persona {
    double salario;

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getSalario() {
        return this.salario;
    }
}