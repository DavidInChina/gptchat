package H0;

import Z.AbstractC1725n;
import Z.C1724m0;
import Z.C1741v0;
import android.content.Context;
import nf.AbstractC4828h;
import z.C6675O;

/* renamed from: H0.q0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0700q0 extends AbstractC0666a {

    /* renamed from: p0  reason: collision with root package name */
    public final C1724m0 f6991p0 = AbstractC4828h.Z(null, Z.o1.f22665a);

    /* renamed from: q0  reason: collision with root package name */
    public boolean f6992q0;

    public C0700q0(Context context) {
        super(context, null, 0);
    }

    @Override // H0.AbstractC0666a
    public final void a(AbstractC1725n abstractC1725n, int i10) {
        Z.r rVar = (Z.r) abstractC1725n;
        rVar.X(420213850);
        wf.n nVar = (wf.n) this.f6991p0.getValue();
        if (nVar != null) {
            nVar.invoke(rVar, 0);
        }
        C1741v0 v10 = rVar.v();
        if (v10 != null) {
            v10.f22739d = new C6675O(this, i10, 6);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return C0700q0.class.getName();
    }

    @Override // H0.AbstractC0666a
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.f6992q0;
    }

    public final void setContent(wf.n nVar) {
        this.f6992q0 = true;
        this.f6991p0.setValue(nVar);
        if (isAttachedToWindow()) {
            if (this.f6897k0 == null && !isAttachedToWindow()) {
                throw new IllegalStateException("createComposition requires either a parent reference or the View to be attachedto a window. Attach the View or call setParentCompositionReference.".toString());
            }
            d();
        }
    }

    public static /* synthetic */ void getShouldCreateCompositionOnAttachedToWindow$annotations() {
    }
}
