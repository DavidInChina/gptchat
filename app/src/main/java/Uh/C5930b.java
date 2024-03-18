package uh;

import yh.C6641v;
import yh.l1;

/* renamed from: uh.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5930b extends AbstractC5929a {

    /* renamed from: Z  reason: collision with root package name */
    public final Enum f46815Z;

    public C5930b(Enum r12) {
        this.f46815Z = r12;
    }

    @Override // uh.AbstractC5929a
    public final l1 b() {
        return C6641v.l1(this.f46815Z.getDeclaringClass());
    }

    @Override // uh.AbstractC5929a
    public final String d() {
        return this.f46815Z.name();
    }

    @Override // uh.AbstractC5929a
    public final Enum e(Class cls) {
        Enum r02 = this.f46815Z;
        if (r02.getDeclaringClass() != cls) {
            return Enum.valueOf(cls, r02.name());
        }
        return r02;
    }
}
