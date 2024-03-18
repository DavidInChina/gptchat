package he;

import Ad.l;
import Ng.C1079o0;
import id.AbstractC3557B;
import io.ktor.utils.io.t;
import io.ktor.utils.io.x;
import nf.AbstractC4831k;
import ve.AbstractC6034c;
import xe.AbstractC6432u;
import xe.C6397B;
import xe.C6398C;

/* loaded from: classes.dex */
public final class g extends AbstractC6034c {

    /* renamed from: Y  reason: collision with root package name */
    public final C3420e f32280Y;

    /* renamed from: Z  reason: collision with root package name */
    public final C6398C f32281Z;

    /* renamed from: h0  reason: collision with root package name */
    public final C6397B f32282h0;

    /* renamed from: i0  reason: collision with root package name */
    public final He.b f32283i0;

    /* renamed from: j0  reason: collision with root package name */
    public final He.b f32284j0;

    /* renamed from: k0  reason: collision with root package name */
    public final AbstractC6432u f32285k0;

    /* renamed from: l0  reason: collision with root package name */
    public final AbstractC4831k f32286l0;

    /* renamed from: m0  reason: collision with root package name */
    public final t f32287m0;

    public g(C3420e c3420e, byte[] bArr, AbstractC6034c abstractC6034c) {
        AbstractC3557B.c0("call", c3420e);
        this.f32280Y = c3420e;
        C1079o0 n10 = l.n();
        this.f32281Z = abstractC6034c.f();
        this.f32282h0 = abstractC6034c.g();
        this.f32283i0 = abstractC6034c.d();
        this.f32284j0 = abstractC6034c.e();
        this.f32285k0 = abstractC6034c.a();
        this.f32286l0 = abstractC6034c.i().plus(n10);
        this.f32287m0 = AbstractC3557B.F(bArr);
    }

    @Override // xe.AbstractC6436y
    public final AbstractC6432u a() {
        return this.f32285k0;
    }

    @Override // ve.AbstractC6034c
    public final C3418c b() {
        return this.f32280Y;
    }

    @Override // ve.AbstractC6034c
    public final x c() {
        return this.f32287m0;
    }

    @Override // ve.AbstractC6034c
    public final He.b d() {
        return this.f32283i0;
    }

    @Override // ve.AbstractC6034c
    public final He.b e() {
        return this.f32284j0;
    }

    @Override // ve.AbstractC6034c
    public final C6398C f() {
        return this.f32281Z;
    }

    @Override // ve.AbstractC6034c
    public final C6397B g() {
        return this.f32282h0;
    }

    @Override // Ng.F
    public final AbstractC4831k i() {
        return this.f32286l0;
    }
}
