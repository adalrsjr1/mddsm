package br.inf.ufg.metlang4md.tests.tools.parser

import br.ufg.inf.synthesis.CommandAction
import br.ufg.inf.synthesis.CommandControl
import br.ufg.inf.synthesis.CommandControlAdd
import br.ufg.inf.synthesis.CommandControlChange
import br.ufg.inf.synthesis.CommandExpression
import br.ufg.inf.synthesis.CommandExpressionMetadata
import metalang4md.EArising
import metalang4md.ECardinality
import metalang4md.ECoordinationBehavior
import metalang4md.EInteractionBehavior
import org.junit.jupiter.api.Test

class TestCommand {

	@Test
	void testAddCommand() {
		CommandControl c = CommandControl.builder(CommandAction.ADD)
				.withExpression(CommandExpression.builder()
					.withSource(new Tuple2("source", "sourceXMI"))
					.withTarget(new Tuple2("target", "targetXMI"))
					.build())
				.build()


		assert "ADD source=sourceXMI to target=targetXMI" == c.toString()
	}
	
	@Test
	void testAddItemCommand() {
		CommandControl c = CommandControl.builder(CommandAction.ADD)
				.withExpression(CommandExpression.builder()
					.withElement(new Tuple2("element", "elementXMI"))
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
					.withSource(new Tuple2("source", "sourceXMI"))
					.withTarget(new Tuple2("target", "targetXMI"))
					.withMetadata(null)
					.build())
				.build()

		assert "ADD source=sourceXMI to target=targetXMI" == c.toString()
	}
	
	@Test
	void testAddCommandWithEmptyMetadata() {
		CommandControl c = CommandControl.builder(CommandAction.ADD)
				.withExpression(CommandExpression.builder()
					.withSource(new Tuple2("source", "sourceXMI"))
					.withTarget(new Tuple2("target", "targetXMI"))
					.withMetadata(CommandExpressionMetadata.builder()
						.withInteraction(null)
						.withArising(null)
						.withCardinality(null)
						.withCoordination(null)
						.build())
					.build())
				.build()

		assert "ADD source=sourceXMI to target=targetXMI" == c.toString()
	}
	
	@Test
	void testAddCommandWithSingleElement() {
		CommandControl c = CommandControl.builder(CommandAction.ADD)
				.withExpression(CommandExpression.builder()
					.withElement(new Tuple2("element", "elementXMI"))
					.build())
				.build()

		assert "ADD element=elementXMI" == c.toString()
	}
	
	@Test
	void testAddCommandWithSingleElementAndSourceTarget() {
		CommandControl c = CommandControl.builder(CommandAction.ADD)
				.withExpression(CommandExpression.builder()
					.withElement(new Tuple2("element", "elementXMI"))
					.withSource(new Tuple2("source", "sourceXMI"))
					.withTarget(new Tuple2("target", "targetXMI"))
					.build())
				.build()

		assert "ADD element=elementXMI" == c.toString()
	}
	
	@Test
	void testAddCommandWithMetadata() {
		CommandControl c = CommandControl.builder(CommandAction.ADD)
				.withExpression(CommandExpression.builder()
					.withSource(new Tuple2("source", "sourceXMI"))
					.withTarget(new Tuple2("target", "targetXMI"))
					.withMetadata(CommandExpressionMetadata.builder()
						.withInteraction(EInteractionBehavior.SYNC)
						.withCardinality(ECardinality.MANY)
						.withCoordination(ECoordinationBehavior.DISTRIBUTED)
						.build())
					.build())
				.build()
				
		assert "ADD source=sourceXMI to target=targetXMI with cardinality=MANY coordination=DISTRIBUTED interaction=SYNC" == c.toString()
	}

	@Test
	void testDelCommand() {
		CommandControl c = CommandControl.builder(CommandAction.DELETE)
				.withExpression(CommandExpression.builder()
					.withSource(new Tuple2("source", "sourceXMI"))
					.withTarget(new Tuple2("target", "targetXMI"))
					.build())
				.build()

		assert "DELETE source=sourceXMI from target=targetXMI" == c.toString()
	}
	
	@Test
	void testDelCommandWithMetadataAndFail() {
		CommandControl c = CommandControl.builder(CommandAction.DELETE)
				.withExpression(CommandExpression.builder()
					.withSource(new Tuple2("source", "sourceXMI"))
					.withTarget(new Tuple2("target", "targetXMI"))
					.withMetadata(CommandExpressionMetadata.builder()
						.withInteraction(EInteractionBehavior.SYNC)
						.withCardinality(ECardinality.MANY)
						.withCoordination(ECoordinationBehavior.DISTRIBUTED)
						.build())
					.build())
				.build()

		assert "DELETE source=sourceXMI from target=targetXMI with interaction=SYNC cardinality=MANY coordination=DISTRIBUTED" != c.toString()
	}
	
	@Test
	void testDelCommandWithMetadata() {
		CommandControl c = CommandControl.builder(CommandAction.DELETE)
				.withExpression(CommandExpression.builder()
					.withSource(new Tuple2("source", "sourceXMI"))
					.withTarget(new Tuple2("target", "targetXMI"))
					.withMetadata(CommandExpressionMetadata.builder()
						.withInteraction(EInteractionBehavior.SYNC)
						.withCardinality(ECardinality.MANY)
						.withCoordination(ECoordinationBehavior.DISTRIBUTED)
						.build())
					.build())
				.build()

		assert "DELETE source=sourceXMI from target=targetXMI" == c.toString()
	}
	
	@Test
	void testChangeCommand() {
		CommandControl c = CommandControl.builder(CommandAction.CHANGE)
				.withAttribute(new Tuple2("key", "value"))
				.withTarget(new Tuple2("target", "targetXMI"))
				.build()

		assert "CHANGE key=value in target=targetXMI" == c.toString()
	}

}
