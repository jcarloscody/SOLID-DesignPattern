package service.reajuste;

import java.math.BigDecimal;
import exception.ValidacaoException;
import model.Cargo;
import model.Funcionario;


public interface ValidacaoReajuste {
	
	void validar(Funcionario funcionario, BigDecimal aumento);

}
