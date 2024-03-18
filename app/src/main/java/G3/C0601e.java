package G3;

import android.view.ViewGroup;

/* renamed from: G3.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0601e extends t {

    /* renamed from: a  reason: collision with root package name */
    public boolean f5905a = false;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ViewGroup f5906b;

    public C0601e(ViewGroup viewGroup) {
        this.f5906b = viewGroup;
    }

    @Override // G3.t, G3.r
    public final void a() {
        L4.a.T0(this.f5906b, false);
    }

    @Override // G3.t, G3.r
    public final void b() {
        L4.a.T0(this.f5906b, false);
        this.f5905a = true;
    }

    @Override // G3.r
    public final void d(s sVar) {
        if (!this.f5905a) {
            L4.a.T0(this.f5906b, false);
        }
        sVar.w(this);
    }

    @Override // G3.t, G3.r
    public final void e() {
        L4.a.T0(this.f5906b, true);
    }
}
