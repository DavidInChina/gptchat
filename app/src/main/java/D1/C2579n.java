package d1;

import H0.AbstractC0666a;
import Z.AbstractC1725n;
import Z.C1724m0;
import Z.C1741v0;
import Z.o1;
import android.content.Context;
import android.view.View;
import android.view.Window;
import l8.AbstractC4344b;
import nf.AbstractC4828h;
import z.C6675O;

/* renamed from: d1.n  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2579n extends AbstractC0666a implements AbstractC2581p {

    /* renamed from: p0  reason: collision with root package name */
    public final Window f27880p0;

    /* renamed from: q0  reason: collision with root package name */
    public final C1724m0 f27881q0 = AbstractC4828h.Z(AbstractC2577l.f27878a, o1.f22665a);

    /* renamed from: r0  reason: collision with root package name */
    public boolean f27882r0;

    /* renamed from: s0  reason: collision with root package name */
    public boolean f27883s0;

    public C2579n(Context context, Window window) {
        super(context);
        this.f27880p0 = window;
    }

    @Override // H0.AbstractC0666a
    public final void a(AbstractC1725n abstractC1725n, int i10) {
        Z.r rVar = (Z.r) abstractC1725n;
        rVar.X(1735448596);
        ((wf.n) this.f27881q0.getValue()).invoke(rVar, 0);
        C1741v0 v10 = rVar.v();
        if (v10 != null) {
            v10.f22739d = new C6675O(this, i10, 7);
        }
    }

    @Override // H0.AbstractC0666a
    public final void e(int i10, int i11, int i12, int i13, boolean z10) {
        View childAt;
        super.e(i10, i11, i12, i13, z10);
        if (this.f27882r0 || (childAt = getChildAt(0)) == null) {
            return;
        }
        this.f27880p0.setLayout(childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
    }

    @Override // H0.AbstractC0666a
    public final void f(int i10, int i11) {
        if (this.f27882r0) {
            super.f(i10, i11);
            return;
        }
        super.f(View.MeasureSpec.makeMeasureSpec(AbstractC4344b.Y0(getContext().getResources().getConfiguration().screenWidthDp * getContext().getResources().getDisplayMetrics().density), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AbstractC4344b.Y0(getContext().getResources().getConfiguration().screenHeightDp * getContext().getResources().getDisplayMetrics().density), Integer.MIN_VALUE));
    }

    @Override // H0.AbstractC0666a
    public final boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.f27883s0;
    }
}
