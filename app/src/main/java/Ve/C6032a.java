package ve;

import he.C3418c;
import io.ktor.utils.io.w;
import io.ktor.utils.io.x;
import nf.AbstractC4831k;
import te.C5764h;
import xe.AbstractC6432u;
import xe.C6397B;
import xe.C6398C;

/* renamed from: ve.a  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6032a extends AbstractC6034c {

    /* renamed from: Y  reason: collision with root package name */
    public final C3418c f47478Y;

    /* renamed from: Z  reason: collision with root package name */
    public final AbstractC4831k f47479Z;

    /* renamed from: h0  reason: collision with root package name */
    public final C6398C f47480h0;

    /* renamed from: i0  reason: collision with root package name */
    public final C6397B f47481i0;

    /* renamed from: j0  reason: collision with root package name */
    public final He.b f47482j0;

    /* renamed from: k0  reason: collision with root package name */
    public final He.b f47483k0;

    /* renamed from: l0  reason: collision with root package name */
    public final x f47484l0;

    /* renamed from: m0  reason: collision with root package name */
    public final AbstractC6432u f47485m0;

    public C6032a(C3418c c3418c, C5764h c5764h) {
        x xVar;
        this.f47478Y = c3418c;
        this.f47479Z = c5764h.f46151f;
        this.f47480h0 = c5764h.f46146a;
        this.f47481i0 = c5764h.f46149d;
        this.f47482j0 = c5764h.f46147b;
        this.f47483k0 = c5764h.f46152g;
        Object obj = c5764h.f46150e;
        if (obj instanceof x) {
            xVar = (x) obj;
        } else {
            xVar = null;
        }
        if (xVar == null) {
            x.f33593a.getClass();
            xVar = (x) w.f33592b.getValue();
        }
        this.f47484l0 = xVar;
        this.f47485m0 = c5764h.f46148c;
    }

    @Override // xe.AbstractC6436y
    public final AbstractC6432u a() {
        return this.f47485m0;
    }

    @Override // ve.AbstractC6034c
    public final C3418c b() {
        return this.f47478Y;
    }

    @Override // ve.AbstractC6034c
    public final x c() {
        return this.f47484l0;
    }

    @Override // ve.AbstractC6034c
    public final He.b d() {
        return this.f47482j0;
    }

    @Override // ve.AbstractC6034c
    public final He.b e() {
        return this.f47483k0;
    }

    @Override // ve.AbstractC6034c
    public final C6398C f() {
        return this.f47480h0;
    }

    @Override // ve.AbstractC6034c
    public final C6397B g() {
        return this.f47481i0;
    }

    @Override // Ng.F
    public final AbstractC4831k i() {
        return this.f47479Z;
    }
}
