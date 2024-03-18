package Gf;

import Df.AbstractC0408g;

/* loaded from: classes2.dex */
public abstract class j0 extends AbstractC0644s implements AbstractC0408g {
    @Override // Df.AbstractC0408g
    public final boolean isExternal() {
        return ((Pf.M) w()).f14017k0;
    }

    @Override // Df.AbstractC0408g
    public final boolean isInfix() {
        w();
        return false;
    }

    @Override // Df.AbstractC0408g
    public final boolean isInline() {
        return ((Pf.M) w()).f14020n0;
    }

    @Override // Df.AbstractC0408g
    public final boolean isOperator() {
        w();
        return false;
    }

    @Override // Df.AbstractC0404c
    public final boolean isSuspend() {
        w();
        return false;
    }

    @Override // Gf.AbstractC0644s
    public final H j() {
        return x().f6448l0;
    }

    @Override // Gf.AbstractC0644s
    public final Hf.g m() {
        return null;
    }

    @Override // Gf.AbstractC0644s
    public final boolean v() {
        return x().v();
    }

    public abstract Mf.O w();

    public abstract p0 x();
}
