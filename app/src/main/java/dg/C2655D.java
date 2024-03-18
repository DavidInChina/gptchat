package dg;

import Sf.AbstractC1385d;
import zg.AbstractC6864k;
import zg.EnumC6863j;

/* renamed from: dg.D  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2655D implements AbstractC6864k {

    /* renamed from: b  reason: collision with root package name */
    public final AbstractC2653B f28290b;

    public C2655D(AbstractC2653B abstractC2653B, EnumC6863j enumC6863j) {
        this.f28290b = abstractC2653B;
    }

    @Override // zg.AbstractC6864k
    public final String a() {
        return "Class '" + AbstractC1385d.a(((Rf.c) this.f28290b).f15499a).b().b() + '\'';
    }

    public final String toString() {
        return C2655D.class.getSimpleName() + ": " + this.f28290b;
    }
}
