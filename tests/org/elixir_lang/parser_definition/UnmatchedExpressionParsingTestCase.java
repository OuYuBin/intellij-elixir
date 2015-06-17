package org.elixir_lang.parser_definition;

public class UnmatchedExpressionParsingTestCase extends ParsingTestCase {
    public void testQualifiedNoArgumentsCallBlock() {
        assertParsedAndQuotedCorrectly();
    }

    public void testUnqualifiedNoArgumentsAfterBlock() {
        assertParsedAndQuotedCorrectly();
    }

    public void testUnqualifiedNoArgumentsAfterStabBlock() {
        assertParsedAndQuotedCorrectly();
    }

    public void testUnqualifiedNoArgumentsBlock() {
        assertParsedAndQuotedCorrectly();
    }

    public void testUnqualifiedNoArgumentsCatchBlock() {
        assertParsedAndQuotedCorrectly();
    }

    public void testUnqualifiedNoArgumentsCatchStabBlock() {
        assertParsedAndQuotedCorrectly();
    }

    public void testUnqualifiedNoArgumentsElseBlock() {
        assertParsedAndQuotedCorrectly();
    }

    public void testUnqualifiedNoArgumentsElseStabBlock() {
        assertParsedAndQuotedCorrectly();
    }

    public void testUnqualifiedNoArgumentsRepeatBlock() {
        assertParsedAndQuotedCorrectly();
    }

    public void testUnqualifiedNoArgumentsRescueBlock() {
        assertParsedAndQuotedCorrectly();
    }

    public void testUnqualifiedNoArgumentsRescueStabBlock() {
        assertParsedAndQuotedCorrectly();
    }

    public void testUnqualifiedNoArgumentsStabAfterStabBlock() {
        assertParsedAndQuotedCorrectly();
    }

    public void testUnqualifiedNoArgumentsStabCatchStabBlock() {
        assertParsedAndQuotedCorrectly();
    }

    public void testUnqualifiedNoArgumentsStabElseStabBlock() {
        assertParsedAndQuotedCorrectly();
    }

    public void testUnqualifiedNoArgumentsStabRescueStabBlock() {
        assertParsedAndQuotedCorrectly();
    }

    public void testUnqualifiedNoArgumentsStabBlock() {
        assertParsedAndQuotedCorrectly();
    }

    @Override
    protected String getTestDataPath() {
        return super.getTestDataPath() + "/unmatched_expression_parsing_test_case";
    }
}
