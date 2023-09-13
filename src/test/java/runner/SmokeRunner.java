package runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features", // все шаги от папки feature (Cucumber должен искать все feature файлы в этой папке
        glue = "stepDefinitions",                // были реализованы(созданы методы) в папке stepDefinitions
        tags = "@Smoke",
        dryRun = false,                         // если false он запустит все реализованные шаги // true не запускает реализованные шаги а проверяет не реализованные шаги
        plugin = {                            // plugin используется для генерирование отчета в папке target
                "pretty",
                "html:target/default-cucumber-reports",
                "json:target/cucumber.json"
        },
        publish = true                    // на консоле он должен вывести отчет например:  View your Cucumber Report at: []
)
public class SmokeRunner {

}
