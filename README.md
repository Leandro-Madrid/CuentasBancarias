# Modelado de Cuentas Bancarias

Queremos modelar **Cuentas Bancarias**. Cada cuenta tiene un saldo (que comienza en 0) y un ID único e irrepetible. Existen dos tipos de cuentas: **Caja de Ahorro** y **Cuenta Corriente**. La diferencia principal es que la cuenta corriente permite tener un saldo negativo hasta un monto de descubierto, que es específico para cada cuenta.

Una cuenta bancaria entiende los siguientes mensajes:

- `getSaldo()`: Retorna el saldo disponible.
- `depositar(double cantidad)`: Aumenta el saldo en la cantidad especificada.
- `extraer(double cantidad)`: Disminuye el saldo en la cantidad especificada.

## Explicación del Patrón Template Method

- **Template Method**: El método `extraer(double cantidad)` en `CuentaBancaria` actúa como el template. Este método define el flujo general para realizar una extracción, que incluye la verificación de disponibilidad y la ejecución de la operación.

- **Hooks**:
  - `puedeExtraer(double cantidad)`: Método abstracto que permite que las subclases definan sus propias reglas de extracción.
  - `realizarExtraccion(double cantidad)`: Método protegido que puede ser sobrescrito si se requiere un comportamiento diferente al realizar la extracción.
