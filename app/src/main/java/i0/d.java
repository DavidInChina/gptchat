package i0;

import Z.C1712g0;
import Z.F0;
import Z.G0;
import Z.o1;

/* loaded from: classes.dex */
public final class d implements G0 {

    /* renamed from: Y  reason: collision with root package name */
    public q f32402Y;

    /* renamed from: Z  reason: collision with root package name */
    public m f32403Z;

    /* renamed from: h0  reason: collision with root package name */
    public String f32404h0;

    /* renamed from: i0  reason: collision with root package name */
    public Object f32405i0;

    /* renamed from: j0  reason: collision with root package name */
    public Object[] f32406j0;

    /* renamed from: k0  reason: collision with root package name */
    public l f32407k0;

    /* renamed from: l0  reason: collision with root package name */
    public final c f32408l0 = new c(this);

    public d(q qVar, m mVar, String str, Object obj, Object[] objArr) {
        this.f32402Y = qVar;
        this.f32403Z = mVar;
        this.f32404h0 = str;
        this.f32405i0 = obj;
        this.f32406j0 = objArr;
    }

    @Override // Z.G0
    public final void a() {
        l lVar = this.f32407k0;
        if (lVar != null) {
            ((n) lVar).a();
        }
    }

    public final void b() {
        String str;
        m mVar = this.f32403Z;
        if (this.f32407k0 == null) {
            if (mVar != null) {
                c cVar = this.f32408l0;
                Object mo122invoke = cVar.mo122invoke();
                if (mo122invoke != null && !mVar.a(mo122invoke)) {
                    if (mo122invoke instanceof j0.s) {
                        j0.s sVar = (j0.s) mo122invoke;
                        if (sVar.c() != C1712g0.f22623a && sVar.c() != o1.f22665a && sVar.c() != F0.f22489a) {
                            str = "If you use a custom SnapshotMutationPolicy for your MutableState you have to write a custom Saver";
                        } else {
                            str = "MutableState containing " + sVar.getValue() + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it as a stateSaver parameter to rememberSaveable().";
                        }
                    } else {
                        str = mo122invoke + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it to rememberSaveable().";
                    }
                    throw new IllegalArgumentException(str);
                }
                this.f32407k0 = mVar.d(this.f32404h0, cVar);
                return;
            }
            return;
        }
        throw new IllegalArgumentException(("entry(" + this.f32407k0 + ") is not null").toString());
    }

    @Override // Z.G0
    public final void c() {
        l lVar = this.f32407k0;
        if (lVar != null) {
            ((n) lVar).a();
        }
    }

    @Override // Z.G0
    public final void d() {
        b();
    }
}
