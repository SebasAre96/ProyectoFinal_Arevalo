# Proyecto Final – Automatización OrangeHRM

## Selenium · Cucumber · TestNG · Page Object Model

---

## 📋 Descripción

Este proyecto corresponde al **trabajo final del curso de Testing Automation**.  
Se implementa una solución de automatización de pruebas funcionales sobre la aplicación **OrangeHRM Demo**, utilizando
el **stack completo de automatización visto en clase**.

El proyecto aplica **BDD con Cucumber**, **Selenium WebDriver**, **TestNG** y el patrón **Page Object Model (POM)** para
automatizar flujos críticos de la aplicación.

---

## 🎯 Objetivos

Al finalizar este proyecto se demuestra la capacidad de:

- Aplicar automatización de pruebas funcionales con Selenium WebDriver
- Implementar BDD utilizando Cucumber y Gherkin
- Utilizar Page Object Model para mantener el código ordenado
- Ejecutar pruebas con TestNG
- Automatizar flujos End-to-End (E2E)
- Integrar todas las herramientas vistas durante el curso

---

## 📁 Estructura del Proyecto

```
ProyectoFinal_Arevalo/
│
├── pom.xml                     ← Dependencias Maven
├── testng.xml                  ← Configuración TestNG
├── .gitignore
├── README.md                   ← Esta documentación
│
└── src/
    ├── main/
    │   └── java/ar/org/proyectoFinal/
    │       ├── BasePage.java        ← Métodos comunes
    │       ├── LoginPage.java       ← Page Object Login
    │       ├── DashboardPage.java   ← Page Object Dashboard
    │       └── PIMPage.java         ← Page Object PIM
    │
    └── test/
        ├── java/ar/org/proyectoFinal/
        │   ├── runner/
        │   │   ├── TestRunner.java  ← Configuración Cucumber + TestNG
        │   │   └── Hooks.java       ← Inicialización y cierre del driver
        │   │
        │   └── steps/
        │       └── FlujoPrincipalSteps.java ← Step Definitions
        │
        └── resources/
            └── features/
                └── flujo_completo.feature ← Escenarios Gherkin
```

## 🧪 Features Automatizados

### ✔️ Login exitoso

Validar que el usuario pueda ingresar a la aplicación con credenciales válidas y visualizar el dashboard.

### ✔️ Búsqueda de empleado

Realizar login, navegar al módulo **PIM**, buscar un empleado y validar que se muestren resultados.

### ✔️ Flujo completo E2E

Ejecutar el flujo completo:

- Login
- Navegación a PIM
- Búsqueda de empleado
- Cierre de sesión
- Retorno a la página de login

---

## 📄 Ejemplo de Feature (Gherkin)

```gherkin
Feature: Flujo completo OrangeHRM

  Scenario: Login exitoso
    Given el usuario accede a OrangeHRM
    When realiza login
    Then visualiza el dashboard

  Scenario: Buscar empleado
    Given el usuario accede a OrangeHRM
    And realiza login
    When navega al modulo PIM
    And busca el empleado "John"
    Then se muestran resultados

  Scenario: Flujo completo E2E
    Given el usuario accede a OrangeHRM
    When realiza login
    And navega al modulo PIM
    And busca el empleado "John"
    And cierra sesion
    Then vuelve a la pagina de login
```

## 🚀 Cómo Ejecutar el Proyecto

Desde IntelliJ IDEA

Click derecho sobre testng.xml
Seleccionar Run 'testng.xml'

## 🧱 Arquitectura Utilizada

Page Object Model (POM) para encapsular la lógica de las páginas

Cucumber + Gherkin para definir escenarios legibles

TestNG como framework de ejecución

Hooks para inicializar y cerrar el WebDriver

WebDriverManager para gestión automática del driver

## 🔑 Herramientas utilizadas

✓ Java

✓ Maven

✓ Selenium WebDriver

✓ Cucumber (BDD)

✓ Gherkin

✓ TestNG

✓ Page Object Model

✓ Automatización End-to-End

## 📝 Notas Importantes

Los selectores priorizan estabilidad (name, cssSelector, xpath)

El proyecto sigue las buenas prácticas vistas en clase

Los warnings de CDP no afectan la ejecución de las pruebas

El código está preparado para ser extendido con Data-Driven Testing

## 👤 Autor

Sebastián Arévalo
Curso de Testing Automation – ICARO

