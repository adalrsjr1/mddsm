package br.inf.ufg.metlang4md.tests.tools.parser

import br.ufg.inf.synthesis.*
import org.junit.jupiter.api.Test

class TestControlStatement {

    @Test
    void testAddCommandSyntax() {
        ControlStatement.builder()
                .action(CommandAction.ADD)
                .expressionStatement(
                        ExpressionStatementAdd.builder()
                        .element()
                        .to()
                        .withMetadata(
                                MetadataStatement.builder()
                                .arisingBehavior()
                                .interactionBehavior()
                                .cardinality()
                                .coordination()
                                .build()
                        ).build()
                ).build()
    }

    @Test
    void testDeleteCommandSyntax() {
        ControlStatement.builder()
                .action(CommandAction.DELETE)
                .expressionStatement(
                        ExpressionStatementDelete.builder()
                                .element()
                                .from()
                                .build()
                ).build()
    }

    @Test
    void testChangeCommandSyntax() {
        ControlStatement.builder()
                .action(CommandAction.CHANGE)
                .expressionStatement(
                        ExpressionStatementChange.builder()
                                .name()
                                .value()
                                .into()
                                .build()
                ).build()
    }

}
