package H0;

import A.C0043t;
import Z.AbstractC1736t;
import Z.C1744x;
import androidx.lifecycle.AbstractC2084t;
import androidx.lifecycle.AbstractC2086v;
import androidx.lifecycle.EnumC2081p;
import com.openai.chatgpt.R;

/* loaded from: classes.dex */
public final class y1 implements AbstractC1736t, AbstractC2084t {

    /* renamed from: Y  reason: collision with root package name */
    public final C0714y f7144Y;

    /* renamed from: Z  reason: collision with root package name */
    public final AbstractC1736t f7145Z;

    /* renamed from: h0  reason: collision with root package name */
    public boolean f7146h0;

    /* renamed from: i0  reason: collision with root package name */
    public androidx.lifecycle.S f7147i0;

    /* renamed from: j0  reason: collision with root package name */
    public wf.n f7148j0 = AbstractC0698p0.f6986a;

    public y1(C0714y c0714y, C1744x c1744x) {
        this.f7144Y = c0714y;
        this.f7145Z = c1744x;
    }

    @Override // androidx.lifecycle.AbstractC2084t
    public final void b(AbstractC2086v abstractC2086v, EnumC2081p enumC2081p) {
        if (enumC2081p == EnumC2081p.ON_DESTROY) {
            dispose();
        } else if (enumC2081p == EnumC2081p.ON_CREATE && !this.f7146h0) {
            d(this.f7148j0);
        }
    }

    @Override // Z.AbstractC1736t
    public final void d(wf.n nVar) {
        this.f7144Y.setOnViewTreeOwnersAvailable(new C0043t(this, 23, nVar));
    }

    @Override // Z.AbstractC1736t
    public final void dispose() {
        if (!this.f7146h0) {
            this.f7146h0 = true;
            this.f7144Y.getView().setTag(R.id.wrapped_composition_tag, null);
            androidx.lifecycle.S s10 = this.f7147i0;
            if (s10 != null) {
                s10.g(this);
            }
        }
        this.f7145Z.dispose();
    }
}
