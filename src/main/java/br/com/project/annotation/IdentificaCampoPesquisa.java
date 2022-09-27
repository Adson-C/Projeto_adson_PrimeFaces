package br.com.project.annotation;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Retention(RUNTIME)
@Target(value = ElementType.FIELD)
@Documented
public abstract @interface IdentificaCampoPesquisa {
	
	String descricaoCampo(); // descri��o do campo para a tela
	String campoConsulta(); // campo do banco
	int principal() default 10000; // posi��o que ir� aparecer no combo

}
