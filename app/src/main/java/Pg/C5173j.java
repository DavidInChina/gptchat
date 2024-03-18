package pg;

import Bg.A;
import Mf.B;
import id.AbstractC3557B;

/* renamed from: pg.j  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5173j extends AbstractC5170g {

    /* renamed from: b  reason: collision with root package name */
    public final String f43148b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5173j(String str) {
        super(jf.y.f36177a);
        AbstractC3557B.c0("message", str);
        this.f43148b = str;
    }

    @Override // pg.AbstractC5170g
    public final A a(B b10) {
        AbstractC3557B.c0("module", b10);
        return Dg.m.c(Dg.l.f3705y0, this.f43148b);
    }

    @Override // pg.AbstractC5170g
    public final Object b() {
        throw new UnsupportedOperationException();
    }

    @Override // pg.AbstractC5170g
    public final String toString() {
        return this.f43148b;
    }
}
