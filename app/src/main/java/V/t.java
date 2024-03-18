package V;

import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.animation.AnimationUtils;
import com.google.android.gms.internal.play_billing.N;
import g.RunnableC3111d;
import id.AbstractC3557B;
import l8.AbstractC4344b;
import q0.C5251c;
import q0.C5254f;
import wf.AbstractC6216a;
import z.C6672L;

/* loaded from: classes2.dex */
public final class t extends View {

    /* renamed from: m0 */
    public static final int[] f17972m0 = {16842919, 16842910};

    /* renamed from: n0 */
    public static final int[] f17973n0 = new int[0];

    /* renamed from: h0 */
    public D f17974h0;

    /* renamed from: i0 */
    public Boolean f17975i0;

    /* renamed from: j0 */
    public Long f17976j0;

    /* renamed from: k0 */
    public RunnableC3111d f17977k0;

    /* renamed from: l0 */
    public AbstractC6216a f17978l0;

    public static /* synthetic */ void a(t tVar) {
        setRippleState$lambda$2(tVar);
    }

    private final void setRippleState(boolean z10) {
        long j6;
        int[] iArr;
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        Runnable runnable = this.f17977k0;
        if (runnable != null) {
            removeCallbacks(runnable);
            runnable.run();
        }
        Long l10 = this.f17976j0;
        if (l10 != null) {
            j6 = l10.longValue();
        } else {
            j6 = 0;
        }
        long j10 = currentAnimationTimeMillis - j6;
        if (!z10 && j10 < 5) {
            RunnableC3111d runnableC3111d = new RunnableC3111d(4, this);
            this.f17977k0 = runnableC3111d;
            postDelayed(runnableC3111d, 50L);
        } else {
            if (z10) {
                iArr = f17972m0;
            } else {
                iArr = f17973n0;
            }
            D d10 = this.f17974h0;
            if (d10 != null) {
                d10.setState(iArr);
            }
        }
        this.f17976j0 = Long.valueOf(currentAnimationTimeMillis);
    }

    public static final void setRippleState$lambda$2(t tVar) {
        D d10 = tVar.f17974h0;
        if (d10 != null) {
            d10.setState(f17973n0);
        }
        tVar.f17977k0 = null;
    }

    public final void b(D.p pVar, boolean z10, long j6, int i10, long j10, float f6, C6672L c6672l) {
        if (this.f17974h0 == null || !AbstractC3557B.K(Boolean.valueOf(z10), this.f17975i0)) {
            D d10 = new D(z10);
            setBackground(d10);
            this.f17974h0 = d10;
            this.f17975i0 = Boolean.valueOf(z10);
        }
        D d11 = this.f17974h0;
        AbstractC3557B.Z(d11);
        this.f17978l0 = c6672l;
        e(j6, i10, j10, f6);
        if (z10) {
            d11.setHotspot(C5251c.d(pVar.f3192a), C5251c.e(pVar.f3192a));
        } else {
            d11.setHotspot(d11.getBounds().centerX(), d11.getBounds().centerY());
        }
        setRippleState(true);
    }

    public final void c() {
        this.f17978l0 = null;
        RunnableC3111d runnableC3111d = this.f17977k0;
        if (runnableC3111d != null) {
            removeCallbacks(runnableC3111d);
            RunnableC3111d runnableC3111d2 = this.f17977k0;
            AbstractC3557B.Z(runnableC3111d2);
            runnableC3111d2.run();
        } else {
            D d10 = this.f17974h0;
            if (d10 != null) {
                d10.setState(f17973n0);
            }
        }
        D d11 = this.f17974h0;
        if (d11 == null) {
            return;
        }
        d11.setVisible(false, false);
        unscheduleDrawable(d11);
    }

    public final void d() {
        setRippleState(false);
    }

    public final void e(long j6, int i10, long j10, float f6) {
        D d10 = this.f17974h0;
        if (d10 == null) {
            return;
        }
        Integer num = d10.f17902h0;
        if (num == null || num.intValue() != i10) {
            d10.f17902h0 = Integer.valueOf(i10);
            C.f17899a.a(d10, i10);
        }
        if (Build.VERSION.SDK_INT < 28) {
            f6 *= 2;
        }
        long b10 = r0.r.b(j10, N.l(f6, 1.0f));
        r0.r rVar = d10.f17901Z;
        if (rVar == null || !r0.r.c(rVar.f44265a, b10)) {
            d10.f17901Z = new r0.r(b10);
            d10.setColor(ColorStateList.valueOf(androidx.compose.ui.graphics.a.s(b10)));
        }
        Rect rect = new Rect(0, 0, AbstractC4344b.Y0(C5254f.d(j6)), AbstractC4344b.Y0(C5254f.b(j6)));
        setLeft(rect.left);
        setTop(rect.top);
        setRight(rect.right);
        setBottom(rect.bottom);
        d10.setBounds(rect);
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        AbstractC6216a abstractC6216a = this.f17978l0;
        if (abstractC6216a != null) {
            abstractC6216a.mo122invoke();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
    }

    @Override // android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
    }
}
