package at.ac.tuwien.big.stl.codegen;

import org.eclipse.emf.common.util.URI;
import org.eclipse.xtext.parser.IEncodingProvider;

public class Utf8EncodingProvider implements IEncodingProvider {

	@Override
	public String getEncoding(URI uri) {
		return "UTF-8";
	}

}
