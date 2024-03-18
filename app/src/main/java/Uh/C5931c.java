package uh;

import yh.l1;

/* renamed from: uh.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5931c extends AbstractC5929a {

    /* renamed from: Z  reason: collision with root package name */
    public final l1 f46816Z;

    /* renamed from: h0  reason: collision with root package name */
    public final String f46817h0;

    public C5931c(String str, l1 l1Var) {
        this.f46816Z = l1Var;
        this.f46817h0 = str;
    }

    @Override // uh.AbstractC5929a
    public final l1 b() {
        return this.f46816Z;
    }

    @Override // uh.AbstractC5929a
    public final String d() {
        return this.f46817h0;
    }

    @Override // uh.AbstractC5929a
    public final Enum e(Class cls) {
        l1 l1Var = this.f46816Z;
        if (l1Var.H(cls)) {
            return Enum.valueOf(cls, this.f46817h0);
        }
        throw new IllegalArgumentException(cls + " does not represent " + l1Var);
    }
}
