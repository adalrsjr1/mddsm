package br.inf.ufg.mddsm.controller.img;

public abstract class PostModelGenerationOperation {
	Object data;
	public PostModelGenerationOperation(Object data){
		this.data = data;
	}
	public abstract boolean execute ();
}
