package pf;

import id.AbstractC3557B;
import kotlin.jvm.internal.C;
import nf.AbstractC4825e;

/* renamed from: pf.j  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5163j extends AbstractC5156c implements kotlin.jvm.internal.i, AbstractC5162i {
    private final int arity;

    public AbstractC5163j(int i10, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.arity = i10;
    }

    @Override // kotlin.jvm.internal.i
    public int getArity() {
        return this.arity;
    }

    @Override // pf.AbstractC5154a
    public String toString() {
        if (getCompletion() == null) {
            String i10 = C.f37623a.i(this);
            AbstractC3557B.b0("renderLambdaToString(...)", i10);
            return i10;
        }
        return super.toString();
    }
}
