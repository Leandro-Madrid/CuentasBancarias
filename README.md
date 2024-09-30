### Explicación

- **Template Method**: El método `extraer(double cantidad)` en `CuentaBancaria` es el template. Este método define el flujo general para realizar una extracción, que incluye la verificación de disponibilidad y la ejecución de la operación.
- **Hooks**:
    - `puedeExtraer(double cantidad)`: Método abstracto que permite que las subclases definan sus propias reglas de extracción.
    - `realizarExtraccion(double cantidad)`: Método protegido que puede ser sobrescrito si se requiere un comportamiento diferente al realizar la extracción.
