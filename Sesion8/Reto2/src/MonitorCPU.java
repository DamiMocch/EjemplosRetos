import java.util.HashSet;
import java.util.Scanner;

public class MonitorCPU {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        No permite duplicados
        HashSet<Integer> registrosCPU = new HashSet<>();
        boolean continuar = true;

        try {
            while (continuar) {
                System.out.print("Introduce el consumo de CPU (0-100, o -1 para salir): ");
                String entrada = scanner.nextLine();
//                Validar si es un número
                int consumo;
                try {
                    consumo = Integer.parseInt(entrada);
                } catch (NumberFormatException e) {
                    System.out.println("❌ Error: Ingresa un número válido.");
                    continue;
                }

//                Salir del bucle
                if (consumo == -1) {
                    continuar = false;
                    break;
                }

//                Validación del rango
                if (consumo < 0 || consumo > 100) {
                    System.out.println("⚠️ El consumo debe estar entre 0 y 100.");
                    continue;
                }

//                Verifica si hay duplicados
                if (registrosCPU.contains(consumo)) {
                    System.out.println("⚠️ Ya registraste ese valor. No se permiten duplicados.");
                    continue;
                }

//                Verifica si es crítico
                if (consumo > 95) {
                    throw new ConsumoCriticoException("🔥 Alerta: El consumo supera el 95% (" + consumo + "%).");
                }

//                Agregar cuando un registro válido
                registrosCPU.add(consumo);
                System.out.println("✅ Registro agregado: " + consumo + "%");
            }

        } catch (ConsumoCriticoException e) {
            System.out.println("🚨 Excepción crítica: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("❌ Error inesperado: " + e.getMessage());
        } finally {
            scanner.close();
            System.out.println("\n Registros únicos de consumo:");
            for (int registro : registrosCPU) {
                System.out.println("- " + registro + "%");
            }
            System.out.println("Proceso finalizado.");
        }
    }
}
