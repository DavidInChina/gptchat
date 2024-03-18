package pf;

import id.AbstractC3557B;
import kotlin.jvm.internal.C;
import nf.AbstractC4825e;

/* renamed from: pf.h  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5161h extends AbstractC5160g implements kotlin.jvm.internal.i, AbstractC5162i {

    /* renamed from: Y  reason: collision with root package name */
    public final int f43139Y;

    public AbstractC5161h(int i10, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f43139Y = i10;
    }

    @Override // kotlin.jvm.internal.i
    public final int getArity() {
        return this.f43139Y;
    }

    @Override // pf.AbstractC5154a
    public final String toString() {
        if (getCompletion() == null) {
            String i10 = C.f37623a.i(this);
            AbstractC3557B.b0("renderLambdaToString(...)", i10);
            return i10;
        }
        return super.toString();
    }
}
