package c1;

import A.C0043t;
import B0.D;
import B0.E;
import B0.H;
import D1.AbstractC0372s;
import D1.C0373t;
import G0.C0571a;
import G0.q0;
import G0.r0;
import H0.C0714y;
import H0.RunnableC0712x;
import H0.v1;
import K4.J;
import Z.AbstractC1719k;
import Z.AbstractC1738u;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.Region;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.ui.node.Owner;
import androidx.lifecycle.AbstractC2086v;
import b0.C2104h;
import com.google.android.gms.internal.play_billing.N;
import com.openai.chatgpt.R;
import h.C3281g;
import j0.C3876A;
import j0.z;
import java.util.LinkedHashMap;
import l0.AbstractC4326r;
import l0.C4323o;
import nf.AbstractC4828h;
import q0.C5251c;
import q1.AbstractC5260f;
import w.C6072s;
import wf.AbstractC6216a;

/* loaded from: classes2.dex */
public abstract class l extends ViewGroup implements AbstractC0372s, AbstractC1719k, q0 {

    /* renamed from: D0  reason: collision with root package name */
    public static final /* synthetic */ int f26067D0 = 0;

    /* renamed from: A0  reason: collision with root package name */
    public final C0373t f26068A0;

    /* renamed from: B0  reason: collision with root package name */
    public boolean f26069B0;

    /* renamed from: C0  reason: collision with root package name */
    public final androidx.compose.ui.node.a f26070C0;

    /* renamed from: h0  reason: collision with root package name */
    public final A0.d f26071h0;

    /* renamed from: i0  reason: collision with root package name */
    public final View f26072i0;

    /* renamed from: j0  reason: collision with root package name */
    public final Owner f26073j0;

    /* renamed from: k0  reason: collision with root package name */
    public AbstractC6216a f26074k0;

    /* renamed from: l0  reason: collision with root package name */
    public boolean f26075l0;

    /* renamed from: m0  reason: collision with root package name */
    public AbstractC6216a f26076m0;

    /* renamed from: n0  reason: collision with root package name */
    public AbstractC6216a f26077n0;

    /* renamed from: o0  reason: collision with root package name */
    public AbstractC4326r f26078o0;

    /* renamed from: p0  reason: collision with root package name */
    public wf.k f26079p0;

    /* renamed from: q0  reason: collision with root package name */
    public Z0.b f26080q0;

    /* renamed from: r0  reason: collision with root package name */
    public wf.k f26081r0;

    /* renamed from: s0  reason: collision with root package name */
    public AbstractC2086v f26082s0;

    /* renamed from: t0  reason: collision with root package name */
    public A3.f f26083t0;

    /* renamed from: u0  reason: collision with root package name */
    public final k f26084u0;

    /* renamed from: v0  reason: collision with root package name */
    public final k f26085v0;

    /* renamed from: w0  reason: collision with root package name */
    public wf.k f26086w0;

    /* renamed from: x0  reason: collision with root package name */
    public final int[] f26087x0;

    /* renamed from: y0  reason: collision with root package name */
    public int f26088y0;

    /* renamed from: z0  reason: collision with root package name */
    public int f26089z0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, D1.t] */
    /* JADX WARN: Type inference failed for: r1v3, types: [B0.H, java.lang.Object, wf.k] */
    public l(Context context, AbstractC1738u abstractC1738u, int i10, A0.d dVar, View view, Owner owner) {
        super(context);
        this.f26071h0 = dVar;
        this.f26072i0 = view;
        this.f26073j0 = owner;
        if (abstractC1738u != null) {
            LinkedHashMap linkedHashMap = v1.f7056a;
            setTag(R.id.androidx_compose_ui_view_composition_context, abstractC1738u);
        }
        setSaveFromParentEnabled(false);
        addView(view);
        this.f26074k0 = j.f26064h0;
        this.f26076m0 = j.f26063Z;
        this.f26077n0 = j.f26062Y;
        C4323o c4323o = C4323o.f37719b;
        this.f26078o0 = c4323o;
        this.f26080q0 = new Z0.c(1.0f, 1.0f);
        q qVar = (q) this;
        this.f26084u0 = new k(qVar, 1);
        this.f26085v0 = new k(qVar, 0);
        this.f26087x0 = new int[2];
        this.f26088y0 = Integer.MIN_VALUE;
        this.f26089z0 = Integer.MIN_VALUE;
        this.f26068A0 = new Object();
        androidx.compose.ui.node.a aVar = new androidx.compose.ui.node.a(3, false, 0);
        aVar.f24851o0 = this;
        AbstractC4326r a5 = L0.l.a(androidx.compose.ui.input.nestedscroll.a.a(c4323o, AbstractC2279d.f26043a, dVar), true, e.f26046i0);
        D d10 = new D();
        d10.f1591b = new E(qVar, 0);
        ?? obj = new Object();
        H h10 = d10.f1592c;
        if (h10 != null) {
            h10.f1598Y = null;
        }
        d10.f1592c = obj;
        obj.f1598Y = d10;
        setOnRequestDisallowInterceptTouchEvent$ui_release(obj);
        AbstractC4326r j6 = androidx.compose.ui.layout.a.j(androidx.compose.ui.draw.a.d(a5.g(d10), new C3281g(this, aVar, this, 23)), new f(this, aVar, 2));
        aVar.w0(this.f26078o0.g(j6));
        this.f26079p0 = new C0043t(aVar, 28, j6);
        aVar.t0(this.f26080q0);
        this.f26081r0 = new C0571a(8, aVar);
        aVar.f24836G0 = new f(this, aVar, 0);
        aVar.f24837H0 = new E(qVar, 1);
        aVar.v0(new g(this, aVar, 0));
        this.f26070C0 = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final r0 getSnapshotObserver() {
        if (isAttachedToWindow()) {
            return ((C0714y) this.f26073j0).getSnapshotObserver();
        }
        throw new IllegalStateException("Expected AndroidViewHolder to be attached when observing reads.".toString());
    }

    public static final int k(l lVar, int i10, int i11, int i12) {
        lVar.getClass();
        if (i12 < 0 && i10 != i11) {
            if (i12 == -2 && i11 != Integer.MAX_VALUE) {
                return View.MeasureSpec.makeMeasureSpec(i11, Integer.MIN_VALUE);
            }
            if (i12 == -1 && i11 != Integer.MAX_VALUE) {
                return View.MeasureSpec.makeMeasureSpec(i11, 1073741824);
            }
            return View.MeasureSpec.makeMeasureSpec(0, 0);
        }
        return View.MeasureSpec.makeMeasureSpec(N.p(i12, i10, i11), 1073741824);
    }

    @Override // Z.AbstractC1719k
    public final void a() {
        this.f26077n0.mo122invoke();
    }

    @Override // Z.AbstractC1719k
    public final void b() {
        this.f26076m0.mo122invoke();
        removeAllViewsInLayout();
    }

    @Override // D1.AbstractC0372s
    public final void c(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        int i15;
        long j6;
        if (!this.f26072i0.isNestedScrollingEnabled()) {
            return;
        }
        float f6 = i10;
        float f10 = -1;
        long r10 = R4.b.r(f6 * f10, i11 * f10);
        long r11 = R4.b.r(i12 * f10, i13 * f10);
        if (i14 == 0) {
            i15 = 1;
        } else {
            i15 = 2;
        }
        A0.g d10 = this.f26071h0.d();
        if (d10 != null) {
            j6 = d10.u(r10, i15, r11);
        } else {
            j6 = C5251c.f43619b;
        }
        iArr[0] = M3.H.F(C5251c.d(j6));
        iArr[1] = M3.H.F(C5251c.e(j6));
    }

    @Override // D1.r
    public final void d(View view, int i10, int i11, int i12, int i13, int i14) {
        int i15;
        if (!this.f26072i0.isNestedScrollingEnabled()) {
            return;
        }
        float f6 = i10;
        float f10 = -1;
        long r10 = R4.b.r(f6 * f10, i11 * f10);
        long r11 = R4.b.r(i12 * f10, i13 * f10);
        if (i14 == 0) {
            i15 = 1;
        } else {
            i15 = 2;
        }
        int i16 = i15;
        A0.g d10 = this.f26071h0.d();
        if (d10 != null) {
            d10.u(r10, i16, r11);
        } else {
            int i17 = C5251c.f43622e;
        }
    }

    @Override // D1.r
    public final boolean e(View view, View view2, int i10, int i11) {
        if ((i10 & 2) != 0 || (i10 & 1) != 0) {
            return true;
        }
        return false;
    }

    @Override // D1.r
    public final void f(View view, View view2, int i10, int i11) {
        C0373t c0373t = this.f26068A0;
        if (i11 == 1) {
            c0373t.f3303b = i10;
        } else {
            c0373t.f3302a = i10;
        }
    }

    @Override // D1.r
    public final void g(View view, int i10) {
        C0373t c0373t = this.f26068A0;
        if (i10 == 1) {
            c0373t.f3303b = 0;
        } else {
            c0373t.f3302a = 0;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean gatherTransparentRegion(Region region) {
        if (region == null) {
            return true;
        }
        int[] iArr = this.f26087x0;
        getLocationInWindow(iArr);
        int i10 = iArr[0];
        region.op(i10, iArr[1], getWidth() + i10, getHeight() + iArr[1], Region.Op.DIFFERENCE);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return getClass().getName();
    }

    public final Z0.b getDensity() {
        return this.f26080q0;
    }

    public final View getInteropView() {
        return this.f26072i0;
    }

    public final androidx.compose.ui.node.a getLayoutNode() {
        return this.f26070C0;
    }

    @Override // android.view.View
    public ViewGroup.LayoutParams getLayoutParams() {
        ViewGroup.LayoutParams layoutParams = this.f26072i0.getLayoutParams();
        if (layoutParams == null) {
            return new ViewGroup.LayoutParams(-1, -1);
        }
        return layoutParams;
    }

    public final AbstractC2086v getLifecycleOwner() {
        return this.f26082s0;
    }

    public final AbstractC4326r getModifier() {
        return this.f26078o0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C0373t c0373t = this.f26068A0;
        return c0373t.f3303b | c0373t.f3302a;
    }

    public final wf.k getOnDensityChanged$ui_release() {
        return this.f26081r0;
    }

    public final wf.k getOnModifierChanged$ui_release() {
        return this.f26079p0;
    }

    public final wf.k getOnRequestDisallowInterceptTouchEvent$ui_release() {
        return this.f26086w0;
    }

    public final AbstractC6216a getRelease() {
        return this.f26077n0;
    }

    public final AbstractC6216a getReset() {
        return this.f26076m0;
    }

    public final A3.f getSavedStateRegistryOwner() {
        return this.f26083t0;
    }

    public final AbstractC6216a getUpdate() {
        return this.f26074k0;
    }

    public final View getView() {
        return this.f26072i0;
    }

    @Override // D1.r
    public final void h(View view, int i10, int i11, int[] iArr, int i12) {
        int i13;
        long j6;
        if (!this.f26072i0.isNestedScrollingEnabled()) {
            return;
        }
        float f6 = i10;
        float f10 = -1;
        long r10 = R4.b.r(f6 * f10, i11 * f10);
        if (i12 == 0) {
            i13 = 1;
        } else {
            i13 = 2;
        }
        A0.g d10 = this.f26071h0.d();
        if (d10 != null) {
            j6 = d10.F(i13, r10);
        } else {
            j6 = C5251c.f43619b;
        }
        iArr[0] = M3.H.F(C5251c.d(j6));
        iArr[1] = M3.H.F(C5251c.e(j6));
    }

    @Override // Z.AbstractC1719k
    public final void i() {
        View view = this.f26072i0;
        if (view.getParent() != this) {
            addView(view);
        } else {
            this.f26076m0.mo122invoke();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        super.invalidateChildInParent(iArr, rect);
        if (this.f26069B0) {
            this.f26072i0.postOnAnimation(new RunnableC0712x(this.f26085v0, 1));
            return null;
        }
        this.f26070C0.M();
        return null;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.f26072i0.isNestedScrollingEnabled();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f26084u0.mo122invoke();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onDescendantInvalidated(View view, View view2) {
        super.onDescendantInvalidated(view, view2);
        if (this.f26069B0) {
            this.f26072i0.postOnAnimation(new RunnableC0712x(this.f26085v0, 1));
            return;
        }
        this.f26070C0.M();
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0087 A[Catch: all -> 0x0095, TryCatch #0 {all -> 0x0095, blocks: (B:4:0x000e, B:6:0x0016, B:9:0x0029, B:12:0x0035, B:14:0x004a, B:16:0x0056, B:18:0x0060, B:19:0x006d, B:22:0x0075, B:23:0x007a, B:27:0x0084, B:29:0x0087, B:31:0x008c, B:34:0x0097, B:35:0x009b), top: B:39:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008a  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDetachedFromWindow() {
        int i10;
        boolean z10;
        super.onDetachedFromWindow();
        C3876A c3876a = getSnapshotObserver().f5821a;
        synchronized (c3876a.f35831f) {
            try {
                C2104h c2104h = c3876a.f35831f;
                int i11 = c2104h.f25569h0;
                int i12 = 0;
                int i13 = 0;
                while (i12 < i11) {
                    z zVar = (z) c2104h.f25567Y[i12];
                    C6072s c6072s = (C6072s) zVar.f35947f.i(this);
                    if (c6072s != null) {
                        Object[] objArr = c6072s.f47626b;
                        int[] iArr = c6072s.f47627c;
                        long[] jArr = c6072s.f47625a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i14 = 0;
                            while (true) {
                                long j6 = jArr[i14];
                                i10 = i12;
                                if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i15 = 8;
                                    int i16 = 8 - ((~(i14 - length)) >>> 31);
                                    for (int i17 = 0; i17 < i16; i17++) {
                                        if ((j6 & 255) < 128) {
                                            int i18 = (i14 << 3) + i17;
                                            Object obj = objArr[i18];
                                            int i19 = iArr[i18];
                                            zVar.d(this, obj);
                                            i15 = 8;
                                        }
                                        j6 >>= i15;
                                    }
                                    if (i16 != i15) {
                                        break;
                                    }
                                }
                                if (i14 == length) {
                                    break;
                                }
                                i14++;
                                i12 = i10;
                            }
                            if (zVar.f35947f.f47635e == 0) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (!(!z10)) {
                                i13++;
                            } else if (i13 > 0) {
                                Object[] objArr2 = c2104h.f25567Y;
                                objArr2[i10 - i13] = objArr2[i10];
                            }
                            i12 = i10 + 1;
                        }
                    }
                    i10 = i12;
                    if (zVar.f35947f.f47635e == 0) {
                    }
                    if (!(!z10)) {
                    }
                    i12 = i10 + 1;
                }
                int i20 = i11 - i13;
                kf.q.d3(i20, i11, null, c2104h.f25567Y);
                c2104h.f25569h0 = i20;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        this.f26072i0.layout(0, 0, i12 - i10, i13 - i11);
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        View view = this.f26072i0;
        if (view.getParent() != this) {
            setMeasuredDimension(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
        } else if (view.getVisibility() == 8) {
            setMeasuredDimension(0, 0);
        } else {
            view.measure(i10, i11);
            setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
            this.f26088y0 = i10;
            this.f26089z0 = i11;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f6, float f10, boolean z10) {
        if (!this.f26072i0.isNestedScrollingEnabled()) {
            return false;
        }
        Ad.l.O0(this.f26071h0.c(), null, null, new h(z10, this, AbstractC4828h.l(f6 * (-1.0f), f10 * (-1.0f)), null), 3);
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f6, float f10) {
        if (!this.f26072i0.isNestedScrollingEnabled()) {
            return false;
        }
        Ad.l.O0(this.f26071h0.c(), null, null, new i(this, AbstractC4828h.l(f6 * (-1.0f), f10 * (-1.0f)), null), 3);
        return false;
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
    }

    @Override // G0.q0
    public final boolean q() {
        return isAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        wf.k kVar = this.f26086w0;
        if (kVar != null) {
            kVar.invoke(Boolean.valueOf(z10));
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }

    public final void setDensity(Z0.b bVar) {
        if (bVar != this.f26080q0) {
            this.f26080q0 = bVar;
            wf.k kVar = this.f26081r0;
            if (kVar != null) {
                kVar.invoke(bVar);
            }
        }
    }

    public final void setLifecycleOwner(AbstractC2086v abstractC2086v) {
        if (abstractC2086v != this.f26082s0) {
            this.f26082s0 = abstractC2086v;
            J.Z(this, abstractC2086v);
        }
    }

    public final void setModifier(AbstractC4326r abstractC4326r) {
        if (abstractC4326r != this.f26078o0) {
            this.f26078o0 = abstractC4326r;
            wf.k kVar = this.f26079p0;
            if (kVar != null) {
                kVar.invoke(abstractC4326r);
            }
        }
    }

    public final void setOnDensityChanged$ui_release(wf.k kVar) {
        this.f26081r0 = kVar;
    }

    public final void setOnModifierChanged$ui_release(wf.k kVar) {
        this.f26079p0 = kVar;
    }

    public final void setOnRequestDisallowInterceptTouchEvent$ui_release(wf.k kVar) {
        this.f26086w0 = kVar;
    }

    public final void setRelease(AbstractC6216a abstractC6216a) {
        this.f26077n0 = abstractC6216a;
    }

    public final void setReset(AbstractC6216a abstractC6216a) {
        this.f26076m0 = abstractC6216a;
    }

    public final void setSavedStateRegistryOwner(A3.f fVar) {
        if (fVar != this.f26083t0) {
            this.f26083t0 = fVar;
            AbstractC5260f.N(this, fVar);
        }
    }

    public final void setUpdate(AbstractC6216a abstractC6216a) {
        this.f26074k0 = abstractC6216a;
        this.f26075l0 = true;
        this.f26084u0.mo122invoke();
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }
}
