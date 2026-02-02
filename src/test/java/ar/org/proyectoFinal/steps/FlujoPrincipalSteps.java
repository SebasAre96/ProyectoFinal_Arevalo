package ar.org.proyectoFinal.steps;

import ar.org.proyectoFinal.DashboardPage;
import ar.org.proyectoFinal.LoginPage;
import ar.org.proyectoFinal.PIMPage;
import ar.org.proyectoFinal.runner.Hooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class FlujoPrincipalSteps {


    private LoginPage loginPage;
    private DashboardPage dashboardPage;
    private PIMPage pimPage;

    // -------------------------
    // GIVEN
    // -------------------------

    @Given("el usuario accede a OrangeHRM")
    public void elUsuarioAccedeAOrangeHRM() {
        loginPage = new LoginPage(Hooks.driver);
        loginPage.goTo();
        Assert.assertTrue(loginPage.isOnLoginPage(), "La página de login no está visible");
    }

    @Given("el usuario esta logueado")
    public void elUsuarioEstaLogueado() {
        loginPage = new LoginPage(Hooks.driver);
        loginPage.goTo();
        dashboardPage = loginPage.loginAs("Admin", "admin123");
        Assert.assertTrue(dashboardPage.isOnDashboard(), "No se visualiza el dashboard después del login");
    }

    // -------------------------
    // WHEN
    // -------------------------

    @When("ingresa credenciales validas")
    public void ingresaCredencialesValidas() {
        dashboardPage = loginPage.loginAs("Admin", "admin123");
    }

    @When("navega al modulo PIM")
    public void navegaAlModuloPIM() {
        pimPage = dashboardPage.goToPIM();
        Assert.assertTrue(pimPage.isOnPIMPage(), "No se encuentra en la página PIM");
    }

    @When("busca el empleado {string}")
    public void buscaElEmpleado(String nombreEmpleado) {
        pimPage.searchEmployeeByName(nombreEmpleado);
    }

    @When("realiza login")
    public void realizaLogin() {
        dashboardPage = loginPage.loginAs("Admin", "admin123");
    }

    @When("cierra sesion")
    public void cierraSesion() {
        loginPage = dashboardPage.logout();
    }

    // -------------------------
    // THEN
    // -------------------------

    @Then("visualiza el dashboard")
    public void visualizaElDashboard() {
        Assert.assertTrue(dashboardPage.isOnDashboard(), "El dashboard no es visible");
    }

    @Then("se muestran resultados")
    public void seMuestranResultados() {
        boolean hayResultados = pimPage.hasResults();
        boolean sinRegistros = pimPage.isNoRecordsDisplayed();

        Assert.assertTrue(hayResultados || sinRegistros,
                "No se encontraron resultados ni registro equivocado mostrado");
    }

    @Then("vuelve a la pagina de login")
    public void vuelveALaPaginaDeLogin() {
        Assert.assertTrue(loginPage.isOnLoginPage(), "No vuelve a la página de login después del logout");
    }
}
