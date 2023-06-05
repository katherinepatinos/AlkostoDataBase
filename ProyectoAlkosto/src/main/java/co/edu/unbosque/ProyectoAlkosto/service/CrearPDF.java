package co.edu.unbosque.ProyectoAlkosto.service;

import java.awt.Font;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.springframework.stereotype.Service;

import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;

@Service
public class CrearPDF {

	public void exportar(String nom) {

		String path = System.getProperty("user.home") + "/Desktop/" + nom + ".pdf";

		try {
			PdfWriter in = new PdfWriter(path);
			PdfDocument pdfDoc = new PdfDocument(in);
			pdfDoc.addNewPage();

			Document doc = new Document(pdfDoc);

			Paragraph titulo = new Paragraph("Estimado/a " + nom + ", \n");
			Paragraph texto = new Paragraph(
					"Lamentamos comunicarle que su empleo en Alkosto S.A. sera finalizado con efecto a partir del presente dia. Esta decision ha sido tomada luego de una cuidadosa consideracion y evaluacion de la situacion actual de la empresa. Desafortunadamente, nos hemos visto en la necesidad de reducir nuestra fuerza laboral y reestructurar nuestras operaciones, lo cual ha llevado a la terminacion de tu contrato laboral. \n");
			Paragraph texto2 = new Paragraph("Durante tu tiempo en Alkosto S.A., has desempenado un papel importante en nuestro equipo, y valoramos sinceramente tus esfuerzos y dedicacion. Sin embargo, debido a razones específicas relacionadas con la reorganizacion de la empresa, nos vemos obligados a realizar esta difícil decision. \n");
			Paragraph texto3 = new Paragraph("Entendemos que este despido puede tener un impacto significativo en tu vida, y deseamos ofrecerte nuestra asistencia en la medida de lo posible. Alkosto S.A. te proporcionara una compensacion de acuerdo con las leyes laborales y nuestras políticas internas. Ademas, estamos dispuestos a brindarte una carta de recomendacion que resalte tus habilidades y contribuciones durante tu tiempo en la empresa, si así lo solicitas. \n");
			Paragraph texto4 = new Paragraph("Agradecemos sinceramente tus esfuerzos y compromiso demostrados durante tu empleo en Alkosto S.A. Si tienes alguna pregunta o inquietud, no dudes en comunicarte con el Departamento de Recursos Humanos o conmigo directamente. Te deseamos mucho éxito en tus futuros proyectos y oportunidades laborales. \n");
			Paragraph texto5 = new Paragraph("Atentamente, \n" + "Alkosto S.A");
			
			doc.add(titulo);
			doc.add(texto);
			doc.add(texto2);
			doc.add(texto3);
			doc.add(texto4);
			doc.add(texto5);
			doc.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}
}
