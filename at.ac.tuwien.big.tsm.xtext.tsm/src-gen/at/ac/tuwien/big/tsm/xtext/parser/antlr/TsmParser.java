/*
 * generated by Xtext 2.12.0
 */
package at.ac.tuwien.big.tsm.xtext.parser.antlr;

import at.ac.tuwien.big.tsm.xtext.parser.antlr.internal.InternalTsmParser;
import at.ac.tuwien.big.tsm.xtext.services.TsmGrammarAccess;
import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class TsmParser extends AbstractAntlrParser {

	@Inject
	private TsmGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalTsmParser createParser(XtextTokenStream stream) {
		return new InternalTsmParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "StateMachine";
	}

	public TsmGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(TsmGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
