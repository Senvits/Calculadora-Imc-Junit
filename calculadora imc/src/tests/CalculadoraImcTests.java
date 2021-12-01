//Feito por Alex Alves
package tests;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

import control.CalculadoraImc;

public class CalculadoraImcTests {
	CalculadoraImc calc;
	
	@Before
	public void setup( ) {
		calc = new CalculadoraImc();
	}
	
	//adultos M
	@Test
	public void tAdultoMBaixopesomuitograve() {
		Assert.assertEquals("Baixo peso muito grave", calc.calcularImc(2.02, 60.0, "M", 42, false));
	}
	
	@Test
	public void tAdultoMBaixopesograve() {
		Assert.assertEquals("Baixo peso grave", calc.calcularImc(1.92, 60.0, "M", 42, false));
	}
	
	@Test
	public void tAdultoMBaixopeso() {
		Assert.assertEquals("Baixo peso", calc.calcularImc(1.82, 60.0, "M", 42, false));
	}
	
	@Test
	public void tAdultoMPesonormal() {
		Assert.assertEquals("Peso normal", calc.calcularImc(1.72, 60.0, "M", 42, false));
	}
	
	@Test
	public void tAdultoMPesonobrepeso() {
		Assert.assertEquals("Sobrepeso", calc.calcularImc(1.72, 80.0, "M", 42, false));
	}
	
	@Test
	public void tAdultoM01() {
		Assert.assertEquals("Obesidade grau I", calc.calcularImc(1.82, 100.0, "M", 42, false));
	}
	
	@Test
	public void tAdultoM02() {
		Assert.assertEquals("Obesidade grau II", calc.calcularImc(1.82, 120.0, "M", 42, false));
	}
	
	@Test
	public void tAdultoMO3() {
		Assert.assertEquals("Obesidade grau III", calc.calcularImc(1.82, 200.0, "M", 42, false));
	}
	
	//adultos F
	@Test
	public void tAdultoFBaixoPesoMuitograve() {
		Assert.assertEquals("Baixo peso muito grave" , calc.calcularImc(1.75, 24.82, "F", 31, false));
	}
	
	@Test
	public void tAdultoFBaixopesograve() {
		Assert.assertEquals("Baixo peso grave", calc.calcularImc(1.92, 60.0, "F", 42, false));
	}
	
	@Test
	public void tAdultoFBaixopeso() {
		Assert.assertEquals("Baixo peso", calc.calcularImc(1.82, 60.0, "F", 42, false));
	}
	
	@Test
	public void tAdultoFPesonormal() {
		Assert.assertEquals("Peso normal", calc.calcularImc(1.72, 60.0, "F", 42, false));
	}
	
	@Test
	public void tAdultoFPesonobrepeso() {
		Assert.assertEquals("Sobrepeso", calc.calcularImc(1.72, 80.0, "F", 42, false));
	}
	
	@Test
	public void tAdultoF01() {
		Assert.assertEquals("Obesidade grau I", calc.calcularImc(1.82, 100.0, "F", 42, false));
	}
	
	@Test
	public void tAdultoF02() {
		Assert.assertEquals("Obesidade grau II", calc.calcularImc(1.82, 120.0, "F", 42, false));
	}
	
	@Test
	public void tAdultoFO3() {
		Assert.assertEquals("Obesidade grau III", calc.calcularImc(1.82, 200.0, "F", 42, false));
	}
	
	//Idosos F 
	@Test
    public void tIdosoFBaixoPeso() {
		Assert.assertEquals("Baixo peso" , calc.calcularImc(1.60, 43, "F", 75, false));
	}
	
	@Test
	public void tIdosoFPesonormal() {
	   Assert.assertEquals("Peso normal" , calc.calcularImc(1.60, 63, "F", 75, false));
    }
	
	@Test
	public void tIdosoFSobrepeso() {
	   Assert.assertEquals("Sobrepeso" , calc.calcularImc(1.60, 70, "F", 75, false));
    }
	
	@Test
	public void tIdosoF0I() {
	   Assert.assertEquals("Obesidade grau I" , calc.calcularImc(1.60, 90, "F", 75, false));
    }
	
	@Test
	public void tIdosoFOII() {
	   Assert.assertEquals("Obesidade grau II" , calc.calcularImc(1.60, 100, "F", 75, false));
    }
	
	@Test
	public void tIdosoFOIII() {
	   Assert.assertEquals("Obesidade grau III" , calc.calcularImc(1.60, 120, "F", 75, false));
    }
	
	//Idosos M
	@Test
	public void tIdosoMBaixoPeso() {
	   Assert.assertEquals("Baixo peso" , calc.calcularImc(1.60, 43, "M", 75, false));
    }
        
	@Test
	public void tIdosoMPesonormal() {
	   Assert.assertEquals("Peso normal" , calc.calcularImc(1.60, 63, "M", 75, false));
	}

	@Test
	public void tIdosoMSobrepeso() {
	   Assert.assertEquals("Sobrepeso" , calc.calcularImc(1.60, 70, "M", 75, false));
	}

	@Test
	public void tIdosoM0I() {
	   Assert.assertEquals("Obesidade grau I" , calc.calcularImc(1.60, 80, "M", 75, false));
	}

	@Test
	public void tIdosoMOII() {
	   Assert.assertEquals("Obesidade grau II" , calc.calcularImc(1.60, 100, "M", 75, false));
	}


    @Test
    public void tIdosoMOIII() {
      Assert.assertEquals("Obesidade grau III" , calc.calcularImc(1.60, 120, "M", 75, false));
    }
    
    // Crianças M (2 anos)
    @Test
	public void tCriançaM2anosBaixopeso() {
		Assert.assertEquals("Baixo peso" , calc.calcularImc(1.30, 14.72, "M", 2, false));
	}
	
	@Test
	public void tCriançaM2anosPesonormal() {
		Assert.assertEquals("Peso normal", calc.calcularImc(1.30, 20.72, "M", 2, false));
	}
	
	@Test
	public void tCriançaM2anosSobrepeso() {
		Assert.assertEquals("Sobrepeso", calc.calcularImc(1.30, 24.72, "M", 2, false));
	}
	
	public void tCriançaM2anosObesidade() {
		Assert.assertEquals("Obesidade", calc.calcularImc(1.30, 44.72, "M", 2, false));
	} 
   
    // Crianças M (4 anos)
    @Test
	public void tCriançaM4anosBaixopeso() {
		Assert.assertEquals("Baixo peso" , calc.calcularImc(1.30, 14.72, "M", 4, false));
	}
	
	@Test
	public void tCriançaM4anosPesonormal() {
		Assert.assertEquals("Peso normal", calc.calcularImc(1.30, 24.72, "M", 4, false));
	}
	
	@Test
	public void tCriançaM4anosSobrepeso() {
		Assert.assertEquals("Sobrepeso", calc.calcularImc(1.30, 26.72, "M", 4, false));
	}
	
	public void tCriançaM4anosObesidade() {
		Assert.assertEquals("Obesidade", calc.calcularImc(1.30, 44.72, "M", 4, false));
	}
	

	// Crianças M (6 anos)
    @Test
	public void tCriançaM6anosBaixopeso() {
		Assert.assertEquals("Baixo peso" , calc.calcularImc(1.30, 14.72, "M", 6, false));
	}
	
	@Test
	public void tCriançaM6anosPesonormal() {
		Assert.assertEquals("Peso normal", calc.calcularImc(1.30, 24.72, "M", 6, false));
	}
	
	@Test
	public void tCriançaM6anosSobrepeso() {
		Assert.assertEquals("Sobrepeso", calc.calcularImc(1.30, 29.72, "M", 6, false));
	}
	
	public void tCriançaM6anosObesidade() {
		Assert.assertEquals("Obesidade", calc.calcularImc(1.30, 44.72, "M", 6, false));
	}
	
	// Crianças M (8 anos)
    @Test
	public void tCriançaM8anosBaixopeso() {
		Assert.assertEquals("Baixo peso" , calc.calcularImc(1.30, 14.72, "M", 8, false));
	}
	
	@Test
	public void tCriançaM8anosPesonormal() {
		Assert.assertEquals("Peso normal", calc.calcularImc(1.30, 27.72, "M", 8, false));
	}
	
	@Test
	public void tCriançaM8anosSobrepeso() {
		Assert.assertEquals("Sobrepeso", calc.calcularImc(1.30, 29.72, "M", 8, false));
	}
	
	public void tCriançaM8anosObesidade() {
		Assert.assertEquals("Obesidade", calc.calcularImc(1.30, 44.72, "M", 8, false));
	}
	// Crianças M (10 anos)
    @Test
	public void tCriançaM10anosBaixopeso() {
		Assert.assertEquals("Baixo peso" , calc.calcularImc(1.30, 14.72, "M", 10, false));
	}
	
	@Test
	public void tCriançaM10anosPesonormal() {
		Assert.assertEquals("Peso normal", calc.calcularImc(1.30, 29.72, "M", 10, false));
	}
	
	@Test
	public void tCriançaM10anosSobrepeso() {
		Assert.assertEquals("Sobrepeso", calc.calcularImc(1.30, 34.72, "M", 10, false));
	}
	
	public void tCriançaM10anosObesidade() {
		Assert.assertEquals("Obesidade", calc.calcularImc(1.30, 44.72, "M", 10, false));
	}
	
	// Crianças M (12 anos)
    @Test
	public void tCriançaM12anosBaixopeso() {
		Assert.assertEquals("Baixo peso" , calc.calcularImc(1.30, 14.72, "M", 12, false));
	}
	
	@Test
	public void tCriançaM12anosPesonormal() {
		Assert.assertEquals("Peso normal", calc.calcularImc(1.30, 34.72, "M", 12, false));
	}
	
	@Test
	public void tCriançaM12anosSobrepeso() {
		Assert.assertEquals("Sobrepeso", calc.calcularImc(1.30, 39.72, "M", 12, false));
	}
	
	public void tCriançaM12anosObesidade() {
		Assert.assertEquals("Obesidade", calc.calcularImc(1.30, 44.72, "M", 12, false));
	}
	
	// Crianças M (14 anos)
    @Test
	public void tCriançaM14anosBaixopeso() {
		Assert.assertEquals("Baixo peso" , calc.calcularImc(1.30, 14.72, "M", 14, false));
	}
	
	@Test
	public void tCriançaM14anosPesonormal() {
		Assert.assertEquals("Peso normal", calc.calcularImc(1.30, 34.72, "M", 14, false));
	}
	
	@Test
	public void tCriançaM14anosSobrepeso() {
		Assert.assertEquals("Sobrepeso", calc.calcularImc(1.30, 40.72, "M", 14, false));
	}
	
	public void tCriançaM14anosObesidade() {
		Assert.assertEquals("Obesidade", calc.calcularImc(1.30, 44.72, "M", 14, false));
	}
	
	// Crianças F (2 anos)
    @Test
	public void tCriançaF2anosBaixopeso() {
		Assert.assertEquals("Baixo peso" , calc.calcularImc(1.30, 14.72, "F", 2, false));
	}
	
	@Test
	public void tCriançaF2anosPesonormal() {
		Assert.assertEquals("Peso normal", calc.calcularImc(1.30, 20.72, "F", 2, false));
	}
	
	@Test
	public void tCriançaF2anosSobrepeso() {
		Assert.assertEquals("Sobrepeso", calc.calcularImc(1.30, 24.72, "F", 2, false));
	}
	
	public void tCriançaF2anosObesidade() {
		Assert.assertEquals("Obesidade", calc.calcularImc(1.30, 44.72, "F", 2, false));
	} 
   
    // Crianças F (4 anos)
    @Test
	public void tCriançaF4anosBaixopeso() {
		Assert.assertEquals("Baixo peso" , calc.calcularImc(1.30, 14.72, "F", 4, false));
	}
	
	@Test
	public void tCriançaF4anosPesonormal() {
		Assert.assertEquals("Peso normal", calc.calcularImc(1.30, 24.72, "F", 4, false));
	}
	
	@Test
	public void tCriançaF4anosSobrepeso() {
		Assert.assertEquals("Sobrepeso", calc.calcularImc(1.30, 26.72, "F", 4, false));
	}
	
	public void tCriançaF4anosObesidade() {
		Assert.assertEquals("Obesidade", calc.calcularImc(1.30, 44.72, "F", 4, false));
	}
	

	// Crianças F (6 anos)
    @Test
	public void tCriançaF6anosBaixopeso() {
		Assert.assertEquals("Baixo peso" , calc.calcularImc(1.30, 14.72, "F", 6, false));
	}
	
	@Test
	public void tCriançaF6anosPesonormal() {
		Assert.assertEquals("Peso normal", calc.calcularImc(1.30, 24.72, "F", 6, false));
	}
	
	@Test
	public void tCriançaF6anosSobrepeso() {
		Assert.assertEquals("Sobrepeso", calc.calcularImc(1.30, 27.72, "F", 6, false));
	}
	
	public void tCriançaF6anosObesidade() {
		Assert.assertEquals("Obesidade", calc.calcularImc(1.30, 44.72, "F", 6, false));
	}
	
	// Crianças F (8 anos)
    @Test
	public void tCriançaF8anosBaixopeso() {
		Assert.assertEquals("Baixo peso" , calc.calcularImc(1.30, 14.72, "F", 8, false));
	}
	
	@Test
	public void tCriançaF8anosPesonormal() {
		Assert.assertEquals("Peso normal", calc.calcularImc(1.30, 27.72, "F", 8, false));
	}
	
	@Test
	public void tCriançaF8anosSobrepeso() {
		Assert.assertEquals("Sobrepeso", calc.calcularImc(1.30, 29.72, "F", 8, false));
	}
	
	public void tCriançaF8anosObesidade() {
		Assert.assertEquals("Obesidade", calc.calcularImc(1.30, 44.72, "F", 8, false));
	}
	// Crianças F (10 anos)
    @Test
	public void tCriançaF10anosBaixopeso() {
		Assert.assertEquals("Baixo peso" , calc.calcularImc(1.30, 14.72, "F", 10, false));
	}
	
	@Test
	public void tCriançaF10anosPesonormal() {
		Assert.assertEquals("Peso normal", calc.calcularImc(1.30, 29.72, "F", 10, false));
	}
	
	@Test
	public void tCriançaF10anosSobrepeso() {
		Assert.assertEquals("Sobrepeso", calc.calcularImc(1.30, 34.72, "F", 10, false));
	}
	
	public void tCriançaF10anosObesidade() {
		Assert.assertEquals("Obesidade", calc.calcularImc(1.30, 44.72, "F", 10, false));
	}
	
	// Crianças F (12 anos)
    @Test
	public void tCriançaF12anosBaixopeso() {
		Assert.assertEquals("Baixo peso" , calc.calcularImc(1.30, 14.72, "F", 12, false));
	}
	
	@Test
	public void tCriançaF12anosPesonormal() {
		Assert.assertEquals("Peso normal", calc.calcularImc(1.30, 34.72, "F", 12, false));
	}
	
	@Test
	public void tCriançaF12anosSobrepeso() {
		Assert.assertEquals("Sobrepeso", calc.calcularImc(1.30, 39.72, "F", 12, false));
	}
	
	public void tCriançaF12anosObesidade() {
		Assert.assertEquals("Obesidade", calc.calcularImc(1.30, 44.72, "F", 12, false));
	}
	
	// Crianças F (14 anos)
    @Test
	public void tCriançaF14anosBaixopeso() {
		Assert.assertEquals("Baixo peso" , calc.calcularImc(1.30, 14.72, "F", 14, false));
	}
	
	@Test
	public void tCriançaF14anosPesonormal() {
		Assert.assertEquals("Peso normal", calc.calcularImc(1.30, 34.72, "F", 14, false));
	}
	
	@Test
	public void tCriançaF14anosSobrepeso() {
		Assert.assertEquals("Sobrepeso", calc.calcularImc(1.30, 40.72, "F", 14, false));
	}
	
	public void tCriançaF14anosObesidade() {
		Assert.assertEquals("Obesidade", calc.calcularImc(1.30, 44.72, "F", 14, false));
	}
	
	//Gravidas
	@Test
	public void tGravidaBaixopeso() {
		Assert.assertEquals("Baixo peso", calc.calcularImc(1.72, 40.0, "F", 42, true));
	}
	
	@Test
	public void tGravidaPesonormal() {
		Assert.assertEquals("Peso normal", calc.calcularImc(1.72, 60.0, "F", 42, true));
	}
	
	@Test
	public void tGravidaSobrepeso() {
		Assert.assertEquals("Sobrepeso", calc.calcularImc(1.72, 80.0, "F", 42, true));
	}
	
	@Test
	public void tGravidaObesidade() {
		Assert.assertEquals("Obesidade", calc.calcularImc(1.72, 130.0, "F", 42, true));
	}
}