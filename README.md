# 🚀 QA Automation Framework – Selenium + BDD (OrangeHRM)

## 🧪 Descripción general

Este proyecto implementa un framework de automatización de pruebas funcionales sobre la aplicación web **OrangeHRM Demo**, utilizando **Selenium WebDriver** y un enfoque **BDD con Cucumber**.

El objetivo es validar flujos críticos de negocio mediante pruebas automatizadas **End-to-End (E2E)**, aplicando buenas prácticas de diseño que permitan mantener un código **escalable, reutilizable y fácil de mantener**.

---

## 💼 ¿Qué demuestra este proyecto?

- Diseño de un **framework de automatización UI escalable**
- Implementación de **BDD (Behavior Driven Development)** con Cucumber y Gherkin
- Aplicación del patrón **Page Object Model (POM)**
- Automatización de **flujos End-to-End (E2E)** reales
- Implementación de **Data-Driven Testing** con Scenario Outline
- Separación clara de responsabilidades (pages, steps, runners)
- Código mantenible orientado a crecimiento del proyecto

---

## 🌐 Aplicación bajo prueba

Aplicación web de gestión de recursos humanos:

👉 https://opensource-demo.orangehrmlive.com/

---

## 🧰 Stack tecnológico

- ☕ Java  
- 🌐 Selenium WebDriver  
- 🥒 Cucumber (BDD – Gherkin)  
- 🧪 TestNG  
- 📦 Maven  
- 🧱 Page Object Model (POM)  
- ⚙️ WebDriverManager  

---

## 🧠 Estrategia de automatización

El framework está diseñado bajo principios de automatización utilizados en entornos reales:

- Uso de **BDD** para definir escenarios entendibles por negocio
- Implementación de **Page Object Model** para desacoplar la lógica de UI
- Reutilización de componentes para mejorar mantenibilidad
- Separación de capas:
  - Features (Gherkin)
  - Step Definitions
  - Page Objects
  - Configuración (Hooks / Runner)
- Automatización de flujos críticos del sistema

---

## 📁 Estructura del proyecto

```
├── pom.xml
├── testng.xml
├── README.md
│
└── src/
    ├── main/java/.../pages/      # Page Objects
    │   ├── BasePage.java
    │   ├── LoginPage.java
    │   ├── DashboardPage.java
    │   └── PIMPage.java
    │
    └── test/
        ├── java/.../runner/      # Runner + Hooks
        ├── java/.../steps/       # Step Definitions
        │
        └── resources/features/   # Escenarios Gherkin
            ├── flujo_completo.feature
            └── flujo_data_driven.feature
```

---

## 🧪 Cobertura de pruebas

### 🔐 Login
- Validación de acceso con credenciales válidas
- Verificación de redirección al dashboard

### 👤 Gestión de empleados (PIM)
- Navegación al módulo PIM
- Búsqueda de empleados
- Validación de resultados

### 🔄 Flujo completo E2E
- Login
- Navegación
- Búsqueda
- Logout
- Validación de retorno al login

---

## ⭐ Data-Driven Testing

Se implementa un enfoque **Data-Driven** utilizando `Scenario Outline` de Cucumber, permitiendo ejecutar múltiples combinaciones de datos sin duplicar escenarios.

### Beneficios:

- Reutilización de lógica de automatización  
- Escalabilidad de pruebas  
- Mayor cobertura con menor esfuerzo  
- Mantenimiento simplificado  

---

## 🥒 Ejemplo de escenario BDD

```gherkin
Feature: Flujo completo OrangeHRM

  Scenario: Login exitoso
    Given el usuario accede a OrangeHRM
    When realiza login
    Then visualiza el dashboard

  Scenario Outline: Flujo completo E2E Data-Driven
    Given el usuario accede a OrangeHRM
    When realiza login con usuario "<usuario>" y password "<password>"
    And navega al modulo PIM
    And busca el empleado "<empleado>"
    And cierra sesion
    Then vuelve a la pagina de login

    Examples:
      | usuario | password | empleado |
      | Admin   | admin123 | John     |
```

---

## ▶️ Ejecución de pruebas

Desde consola:

```
mvn clean test
```

O desde IDE:

- Ejecutar `testng.xml`

---

## 🧱 Arquitectura y buenas prácticas

- ✔️ Page Object Model (POM)  
- ✔️ BDD con Cucumber  
- ✔️ Separación de responsabilidades  
- ✔️ Hooks para setup y teardown  
- ✔️ WebDriverManager para gestión de drivers  
- ✔️ Código reutilizable y mantenible  
- ✔️ Automatización orientada a flujos de negocio  

---

## ⚙️ Próximas mejoras

- Integración con CI/CD (GitHub Actions / Jenkins)  
- Ejecución en paralelo  
- Captura automática de evidencias (screenshots en fallos)  
- Configuración por entornos  
- Integración con reportes (Allure / ExtentReports)  

---

## 📸 Ejecución de pruebas (opcional)

_Agregar screenshots o GIFs de ejecución_

---

## 👨‍💻 Autor

**Sebastian Arevalo**

---

## ⭐ Notas

Este proyecto simula un entorno real de automatización UI, aplicando buenas prácticas utilizadas en QA Automation para asegurar calidad, mantenibilidad y escalabilidad de pruebas.
