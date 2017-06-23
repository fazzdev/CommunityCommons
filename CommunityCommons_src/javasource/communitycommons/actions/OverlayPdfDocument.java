// This file was generated by Mendix Modeler.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package communitycommons.actions;

import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.webui.CustomJavaAction;
import com.mendix.systemwideinterfaces.core.IMendixObject;
import communitycommons.Misc;

/**
 * Overlay a generated PDF document with another PDF (containing the company stationary for example)
 * 
 */
public class OverlayPdfDocument extends CustomJavaAction<Boolean>
{
	private IMendixObject __generatedDocument;
	private system.proxies.FileDocument generatedDocument;
	private IMendixObject __overlay;
	private system.proxies.FileDocument overlay;
	private Boolean onTopOfContent;

	public OverlayPdfDocument(IContext context, IMendixObject generatedDocument, IMendixObject overlay, Boolean onTopOfContent)
	{
		super(context);
		this.__generatedDocument = generatedDocument;
		this.__overlay = overlay;
		this.onTopOfContent = onTopOfContent;
	}

	@Override
	public Boolean executeAction() throws Exception
	{
		this.generatedDocument = __generatedDocument == null ? null : system.proxies.FileDocument.initialize(getContext(), __generatedDocument);

		this.overlay = __overlay == null ? null : system.proxies.FileDocument.initialize(getContext(), __overlay);

		// BEGIN USER CODE
		return Misc.overlayPdf(getContext(), __generatedDocument, __overlay, onTopOfContent);
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@Override
	public String toString()
	{
		return "OverlayPdfDocument";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
