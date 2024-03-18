package re;

import he.C3418c;
import id.AbstractC3557B;
import io.ktor.utils.io.x;
import nf.AbstractC4831k;
import ve.AbstractC6034c;
import xe.AbstractC6432u;
import xe.C6397B;
import xe.C6398C;

/* renamed from: re.b  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5484b extends AbstractC6034c {

    /* renamed from: Y  reason: collision with root package name */
    public final C3418c f44962Y;

    /* renamed from: Z  reason: collision with root package name */
    public final x f44963Z;

    /* renamed from: h0  reason: collision with root package name */
    public final AbstractC6034c f44964h0;

    /* renamed from: i0  reason: collision with root package name */
    public final AbstractC4831k f44965i0;

    public C5484b(C5483a c5483a, x xVar, AbstractC6034c abstractC6034c) {
        AbstractC3557B.c0("content", xVar);
        this.f44962Y = c5483a;
        this.f44963Z = xVar;
        this.f44964h0 = abstractC6034c;
        this.f44965i0 = abstractC6034c.i();
    }

    @Override // xe.AbstractC6436y
    public final AbstractC6432u a() {
        return this.f44964h0.a();
    }

    @Override // ve.AbstractC6034c
    public final C3418c b() {
        return this.f44962Y;
    }

    @Override // ve.AbstractC6034c
    public final x c() {
        return this.f44963Z;
    }

    @Override // ve.AbstractC6034c
    public final He.b d() {
        return this.f44964h0.d();
    }

    @Override // ve.AbstractC6034c
    public final He.b e() {
        return this.f44964h0.e();
    }

    @Override // ve.AbstractC6034c
    public final C6398C f() {
        return this.f44964h0.f();
    }

    @Override // ve.AbstractC6034c
    public final C6397B g() {
        return this.f44964h0.g();
    }

    @Override // Ng.F
    public final AbstractC4831k i() {
        return this.f44965i0;
    }
}
