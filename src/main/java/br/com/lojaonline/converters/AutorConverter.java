package br.com.lojaonline.converters;

import java.util.Objects;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import br.com.lojaonline.models.Autor;

@FacesConverter("autorConverter")
public class AutorConverter implements Converter {

	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String id) {

		if (Objects.isNull(id) || id.trim().isEmpty())
			return null;

		System.out.println("Convertendo para Objeto: " + id);

		Autor autor = new Autor();
		autor.setId(Integer.valueOf(id));
		return autor;
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component, Object autorObject) {
		if (Objects.isNull(autorObject))
			return null;

		System.out.println("Convertendo para String: " + autorObject);

		Autor autor = (Autor) autorObject;
		return autor.getId().toString();
	}
}
