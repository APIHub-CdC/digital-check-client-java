package mx.com.cdc.client.model;

import com.google.gson.annotations.SerializedName;

public class Error {
	@SerializedName("Codigo")
	private String codigo;
	@SerializedName("Mensaje")
	private String mensaje;
	
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getMensaje() {
		return mensaje;
	}
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	
	@Override
	public String toString() {
		return "Error [codigo=" + codigo + ", mensaje=" + mensaje + "]";
	}
	
	
}
