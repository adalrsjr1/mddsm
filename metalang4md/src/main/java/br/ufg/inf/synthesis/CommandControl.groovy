package br.ufg.inf.synthesis

import groovy.transform.builder.Builder
import br.ufg.inf.metalang4md.EArising
import br.ufg.inf.metalang4md.ECardinality
import br.ufg.inf.metalang4md.ECoordinationBehavior
import br.ufg.inf.metalang4md.EInteractionBehavior

import javax.naming.OperationNotSupportedException

abstract class CommandControl {
    final protected CommandAction action

    protected CommandControl(CommandAction action) {
        this.action = action
    }

    static def builder(CommandAction action) {
        new CommandControlBuilder(action).build()
    }

    private static class CommandControlBuilder {
        private CommandAction action

        CommandControlBuilder(CommandAction action) {
            this.action = action
        }

        def build() {
            switch (this.action) {
                case CommandAction.ADD: return CommandControlAdd.builder()
                    break
                case CommandAction.DELETE: return CommandControlDelete.builder()
                    break
                case CommandAction.CHANGE: return CommandControlChange.builder()
                    break
                default:
                    throw new OperationNotSupportedException("There is no builder for $action")
                    break
            }
        }

    }

}

@Builder(prefix = "with")
class CommandControlChange extends CommandControl {
    Tuple2<String, String> attribute
    Tuple2<String, String> target

    CommandControlChange() { super(CommandAction.CHANGE) }

    String toString() {
        "${action} ${attribute[0]}=${attribute[1]} in ${target[0]}=${target[1]}"
    }
}

@Builder(prefix = "with")
class CommandControlAdd extends CommandControl {
    CommandExpression expression

    CommandControlAdd() { super(CommandAction.ADD) }

    String toString() {
        "${super.action} ${expression.toString(true, "to")}"
    }
}

@Builder(prefix = "with")
class CommandControlDelete extends CommandControl {
    CommandExpression expression

    CommandControlDelete() { super(CommandAction.DELETE) }

    String toString() {
        "${super.action} ${expression.toString(false, "from")}"
    }
}

@Builder(prefix = "with")
class CommandExpression {
    Tuple2<String, String> source
    Tuple2<String, String> target
    Tuple2<String, String> element

    CommandExpressionMetadata metadata

    String toString() {
        toString(true, "")
    }

    String toString(boolean  withMetadata, String commandExpression) {
        def elemStr = element ? "${element[0]}=${element[1]}" : ""
        def srcStr = source ? "${source[0]}=${source[1]}" : ""
        def tgtStr = target ? "${target[0]}=${target[1]}" : ""
        def metaStr = metadata ?: ""

        def srcTgt = "$srcStr $commandExpression $tgtStr"
        if(element) {
            srcTgt = elemStr
        }

        if(withMetadata) {
            return "$srcTgt $metaStr".strip()
        }
        return "$srcTgt".strip()


    }

}

@Builder(prefix = "with")
class CommandExpressionMetadata {
    EArising arising
    EInteractionBehavior interaction
    ECardinality cardinality
    ECoordinationBehavior coordination

    String toString() {
        def card = cardinality ? " cardinality=$cardinality " : ""
        def coord = coordination ? " coordination=$coordination " : ""
        def inter = interaction ? " interaction=$interaction ": ""
        def aris = arising ? " arising=$arising " : ""

        def all = "$card$coord$inter$aris".replaceAll("  ", " ").strip()

        if(all) {
            return "with $all".strip()
        }
        return ""
    }
}

enum CommandAction{
    ADD, DELETE, CHANGE
}