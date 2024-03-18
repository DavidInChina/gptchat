package Rh;

import Qh.AbstractC1239q;
import th.AbstractC5806n;
import yh.AbstractC6591a;

/* loaded from: classes2.dex */
public final class O0 extends AbstractC6591a {

    /* renamed from: Y  reason: collision with root package name */
    public final p1 f15683Y;

    /* renamed from: Z  reason: collision with root package name */
    public final String f15684Z;

    public O0(p1 p1Var, String str) {
        this.f15683Y = p1Var;
        this.f15684Z = str;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [th.n, Qh.q] */
    @Override // th.AbstractC5808p
    public final AbstractC5806n getDeclaredAnnotations() {
        o1 a5 = this.f15683Y.a(this.f15684Z + ".package-info");
        if (a5.b()) {
            return a5.a().getDeclaredAnnotations();
        }
        return new AbstractC1239q(1);
    }

    @Override // sh.AbstractC5637i.b
    public final String getName() {
        return this.f15684Z;
    }
}
