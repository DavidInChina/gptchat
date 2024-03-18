package kotlin.jvm.internal;

import id.AbstractC3557B;
import java.io.Serializable;

/* loaded from: classes.dex */
public abstract class o implements i, Serializable {
    private final int arity;

    public o(int i10) {
        this.arity = i10;
    }

    @Override // kotlin.jvm.internal.i
    public int getArity() {
        return this.arity;
    }

    public String toString() {
        String j6 = C.f37623a.j(this);
        AbstractC3557B.b0("renderLambdaToString(...)", j6);
        return j6;
    }
}
