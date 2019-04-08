package br.inf.ufg.metlang4md.tests.tools.parser

import org.junit.jupiter.api.Test

import br.inf.ufg.metalang4md.tools.parser.CommandControl
import br.inf.ufg.metalang4md.tools.parser.CommandAction
import br.inf.ufg.metalang4md.tools.parser.CommandExpression
import br.inf.ufg.metalang4md.tools.parser.CommandExpressionMetadata
import metalang4md.EArising
import metalang4md.ECardinality
import metalang4md.ECoordinationBehavior
import metalang4md.EInteractionBehavior

class TestCommand {

	@Test
	void testAddCommand() {
		CommandControl c = CommandControl.builder(CommandAction.ADD)
				.withExpression(CommandExpression.builder()
					.withSource("source", "sourceXMI")
					.withTarget("target", "targetXMI")
					.build())
				.build()

		assert "ADD source=sourceXMI COMMAND_EXPRESSION target=targetXMI" == c.toString()
	}
	
	@Test
	void testAddItemCommand() {
		CommandControl c = CommandControl.builder(CommandAction.ADD)
				.withExpression(CommandExpression.builder()
					.withElement("element", "elementXMI")
					.withMetadata(CommandExpressionMetadata.builder()
						.withArising(EArising.DYNAMIC)
						.build())
					.build())
				.build()

		assert "ADD element=elementXMI with arising=DYNAMIC" == c.toString()
	}
	
	@Test
	void testAddCommandWithNullMetadata() {
		CommandControl c = CommandControl.builder(CommandAction.ADD)
				.withExpression(CommandExpression.builder()
					.withSource("source", "sourceXMI")
					.withTarget("target", "targetXMI")
					.withMetadata(null)
					.build())
				.build()

		assert "ADD source=sourceXMI COMMAND_EXPRESSION target=targetXMI" == c.toString()
	}
	
	@Test
	void testAddCommandWithEmptyMetadata() {
		CommandControl c = CommandControl.builder(CommandAction.ADD)
				.withExpression(CommandExpression.builder()
					.withSource("source", "sourceXMI")
					.withTarget("target", "targetXMI")
					.withMetadata(CommandExpressionMetadata.builder()
						.withInteraction(null)
						.withArising(null)
						.withCardinality(null)
						.withCoordination(null)
						.build())
					.build())
				.build()

		assert "ADD source=sourceXMI COMMAND_EXPRESSION target=targetXMI" == c.toString()
	}
	
	@Test
	void testAddCommandWithSingleElement() {
		CommandControl c = CommandControl.builder(CommandAction.ADD)
				.withExpression(CommandExpression.builder()
					.withElement("element", "elementXMI")
					.build())
				.build()

		assert "ADD element=elementXMI" == c.toString()
	}
	
	@Test
	void testAddCommandWithSingleElementAndSourceTarget() {
		CommandControl c = CommandControl.builder(CommandAction.ADD)
				.withExpression(CommandExpression.builder()
					.withElement("element", "elementXMI")
					.withSource("source", "sourceXMI")
					.withTarget("target", "targetXMI")
					.build())
				.build()

		assert "ADD element=elementXMI" == c.toString()
	}
	
	@Test
	void testAddCommandWithMetadata() {
		CommandControl c = CommandControl.builder(CommandAction.ADD)
				.withExpression(CommandExpression.builder()
					.withSource("source", "sourceXMI")
					.withTarget("target", "targetXMI")
					.withMetadata(CommandExpressionMetadata.builder()
						.withInteraction(EInteractionBehavior.SYNC)
						.withCardinality(ECardinality.MANY)
						.withCoordination(ECoordinationBehavior.DISTRIBUTED)
						.build())
					.build())
				.build()
				
		assert "ADD source=sourceXMI COMMAND_EXPRESSION target=targetXMI with cardinality=MANY coordination=DISTRIBUTED interaction=SYNC" == c.toString()
	}

	@Test
	void testDelCommand() {
		CommandControl c = CommandControl.builder(CommandAction.DELETE)
				.withExpression(CommandExpression.builder()
					.withSource("source", "sourceXMI")
					.withTarget("target", "targetXMI")
					.build())
				.build()

		assert "DELETE source=sourceXMI COMMAND_EXPRESSION target=targetXMI" == c.toString()
	}
	
	@Test
	void testDelCommandWithMetadataAndFail() {
		CommandControl c = CommandControl.builder(CommandAction.DELETE)
				.withExpression(CommandExpression.builder()
					.withSource("source", "sourceXMI")
					.withTarget("target", "targetXMI")
					.withMetadata(CommandExpressionMetadata.builder()
						.withInteraction(EInteractionBehavior.SYNC)
						.withCardinality(ECardinality.MANY)
						.withCoordination(ECoordinationBehavior.DISTRIBUTED)
						.build())
					.build())
				.build()

		assert "DELETE source=sourceXMI COMMAND_EXPRESSION target=targetXMI with interaction=SYNC cardinality=MANY coordination=DISTRIBUTED" != c.toString()
	}
	
	@Test
	void testDelCommandWithMetadata() {
		CommandControl c = CommandControl.builder(CommandAction.DELETE)
				.withExpression(CommandExpression.builder()
					.withSource("source", "sourceXMI")
					.withTarget("target", "targetXMI")
					.withMetadata(CommandExpressionMetadata.builder()
						.withInteraction(EInteractionBehavior.SYNC)
						.withCardinality(ECardinality.MANY)
						.withCoordination(ECoordinationBehavior.DISTRIBUTED)
						.build())
					.build())
				.build()

		assert "DELETE source=sourceXMI COMMAND_EXPRESSION target=targetXMI" == c.toString()
	}
	
	@Test
	void testChangeCommand() {
		CommandControl c = CommandControl.builder(CommandAction.CHANGE)
				.withAttribute("key", "value")
				.withTarget("target", "targetXMI")
				.build()

		assert "CHANGE key=value in target=targetXMI" == c.toString()
	}

}
