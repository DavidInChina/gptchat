package Cg;

import Bg.AbstractC0210c;
import Bg.D;
import Bg.X;
import Bg.j0;
import Bg.p0;
import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class a extends AbstractC0210c {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ b f3123a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ j0 f3124b;

    public a(b bVar, j0 j0Var) {
        this.f3123a = bVar;
        this.f3124b = j0Var;
    }

    @Override // Bg.AbstractC0210c
    public final Eg.g e(X x10, Eg.f fVar) {
        AbstractC3557B.c0("state", x10);
        AbstractC3557B.c0("type", fVar);
        b bVar = this.f3123a;
        D Z10 = bVar.Z(this.f3124b.h(bVar.d(fVar), p0.f2146h0));
        AbstractC3557B.Z(Z10);
        return Z10;
    }
}
