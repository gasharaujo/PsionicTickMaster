package hellisheden.trick.block;

import vazkii.psi.api.spell.Spell;
import vazkii.psi.api.spell.SpellContext;
import vazkii.psi.api.spell.SpellRuntimeException;
import vazkii.psi.api.spell.piece.PieceTrick;

/**
 * A simple Psi trick that currently does nothing.
 */
public class PieceTrickTick extends PieceTrick {

    public PieceTrickTick(Spell spell) {
        super(spell);
    }

    @Override
    public Object execute(SpellContext context) throws SpellRuntimeException {
        // No operation for now
        return null;
    }
}
