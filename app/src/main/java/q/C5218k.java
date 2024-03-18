package q;

import android.view.View;

/* renamed from: q.k  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5218k extends D0 {

    /* renamed from: o0  reason: collision with root package name */
    public final /* synthetic */ int f43445o0;

    /* renamed from: p0  reason: collision with root package name */
    public final /* synthetic */ Object f43446p0;

    /* renamed from: q0  reason: collision with root package name */
    public final /* synthetic */ View f43447q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5218k(View view, View view2, Object obj, int i10) {
        super(view2);
        this.f43445o0 = i10;
        this.f43447q0 = view;
        this.f43446p0 = obj;
    }

    @Override // q.D0
    public final p.G b() {
        switch (this.f43445o0) {
            case 0:
                C5212h c5212h = ((C5220l) this.f43447q0).f43449k0.f43471x0;
                if (c5212h == null) {
                    return null;
                }
                return c5212h.a();
            default:
                return (T) this.f43446p0;
        }
    }

    @Override // q.D0
    public final boolean c() {
        int i10 = this.f43445o0;
        View view = this.f43447q0;
        switch (i10) {
            case 0:
                ((C5220l) view).f43449k0.l();
                return true;
            default:
                W w10 = (W) view;
                if (!w10.getInternalPopup().a()) {
                    w10.f43369m0.m(N.b(w10), N.a(w10));
                }
                return true;
        }
    }

    @Override // q.D0
    public final boolean d() {
        switch (this.f43445o0) {
            case 0:
                C5222m c5222m = ((C5220l) this.f43447q0).f43449k0;
                if (c5222m.f43473z0 != null) {
                    return false;
                }
                c5222m.f();
                return true;
            default:
                super.d();
                return true;
        }
    }
}
