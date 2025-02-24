package ma.dnaengineering.backend.common.enumeration;

import ma.dnaengineering.backend.common.bean.BaseEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * ENUM_BIRT_EXPORT_FORMAT
 *
 * @author JAF
 * @version 1.2
 */

@JsonFormat(shape = JsonFormat.Shape.OBJECT) 
public enum BIRT_EXPORT_FORMAT implements BaseEnum {

		PDF("PDF"),
		DOCX("Docx"),
		DOC("Doc"),
		XLSX("Xlsx"),
		XLS("Xls");

	private final String label;

	BIRT_EXPORT_FORMAT(String label) {
		this.label = label;
	}

	public String getName() {
		return this.name();
	}

	@Override
	public String getDisplayText() {
		return this.label;
	}
	
	@JsonCreator
	public static BIRT_EXPORT_FORMAT forValue(@JsonProperty("name") String value) {
		for (BIRT_EXPORT_FORMAT o : BIRT_EXPORT_FORMAT.values()) {
			if (o.name().equals(value)) {
				return o;
			}
		}
		throw new IllegalArgumentException("Valeur invalide: " + value);
	}	

	@Override
	public String toString() {

		return getName();
	}
}