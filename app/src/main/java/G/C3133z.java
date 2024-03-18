package g;

import androidx.lifecycle.AbstractC2084t;
import androidx.lifecycle.AbstractC2086v;
import androidx.lifecycle.EnumC2081p;
import androidx.lifecycle.S;
import id.AbstractC3557B;

/* renamed from: g.z  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3133z implements AbstractC2084t, AbstractC3110c {

    /* renamed from: Y  reason: collision with root package name */
    public final S f31010Y;

    /* renamed from: Z  reason: collision with root package name */
    public final AbstractC3126s f31011Z;

    /* renamed from: h0  reason: collision with root package name */
    public AbstractC3110c f31012h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ C3104C f31013i0;

    public C3133z(C3104C c3104c, S s10, AbstractC3126s abstractC3126s) {
        AbstractC3557B.c0("onBackPressedCallback", abstractC3126s);
        this.f31013i0 = c3104c;
        this.f31010Y = s10;
        this.f31011Z = abstractC3126s;
        s10.a(this);
    }

    @Override // androidx.lifecycle.AbstractC2084t
    public final void b(AbstractC2086v abstractC2086v, EnumC2081p enumC2081p) {
        if (enumC2081p == EnumC2081p.ON_START) {
            this.f31012h0 = this.f31013i0.b(this.f31011Z);
        } else if (enumC2081p == EnumC2081p.ON_STOP) {
            AbstractC3110c abstractC3110c = this.f31012h0;
            if (abstractC3110c != null) {
                abstractC3110c.cancel();
            }
        } else if (enumC2081p == EnumC2081p.ON_DESTROY) {
            cancel();
        }
    }

    @Override // g.AbstractC3110c
    public final void cancel() {
        this.f31010Y.g(this);
        AbstractC3126s abstractC3126s = this.f31011Z;
        abstractC3126s.getClass();
        abstractC3126s.f30996b.remove(this);
        AbstractC3110c abstractC3110c = this.f31012h0;
        if (abstractC3110c != null) {
            abstractC3110c.cancel();
        }
        this.f31012h0 = null;
    }
}
