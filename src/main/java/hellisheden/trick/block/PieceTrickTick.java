package hellisheden.trick.block;

import vazkii.psi.api.internal.Vector3;
import vazkii.psi.api.spell.*;
import vazkii.psi.api.spell.param.ParamNumber;
import vazkii.psi.api.spell.param.ParamVector;
import vazkii.psi.api.spell.piece.PieceTrick;

public class PieceTrickTick extends PieceTrick {
    SpellParam<Vector3> position;
    SpellParam<Number> time;
    public PieceTrickTick(Spell spell) {
        super(spell);
        setStatLabel(EnumSpellStat.POTENCY, new StatLabel(15));
        setStatLabel(EnumSpellStat.COST, new StatLabel(20));
    }

    @Override
    public void initParams() {
        addParam(position = new ParamVector(SpellParam.GENERIC_NAME_POSITION, SpellParam.BLUE, false, false));
        addParam(time = new ParamNumber(SpellParam.GENERIC_NAME_TIME, SpellParam.RED, true, false));
    }
    @Override
    public Object execute(SpellContext context) throws SpellRuntimeException {
        
        return null;
    }
}
