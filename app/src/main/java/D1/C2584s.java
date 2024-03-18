package d1;

import Df.H;
import E0.AbstractC0461u;
import H0.AbstractC0666a;
import H0.Z0;
import K4.J;
import Z.AbstractC1725n;
import Z.AbstractC1738u;
import Z.C1724m0;
import Z.C1741v0;
import Z.I;
import Z.o1;
import android.graphics.Rect;
import android.os.Build;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import c1.AbstractC2279d;
import com.openai.chatgpt.R;
import id.AbstractC3557B;
import j0.AbstractC3893i;
import j0.C3876A;
import j0.C3892h;
import java.util.UUID;
import l8.AbstractC4344b;
import nf.AbstractC4828h;
import q0.C5251c;
import q1.AbstractC5260f;
import wf.AbstractC6216a;
import z.C6675O;

/* renamed from: d1.s */
/* loaded from: classes.dex */
public final class C2584s extends AbstractC0666a {

    /* renamed from: A0 */
    public Z0.j f27899A0;

    /* renamed from: B0 */
    public final I f27900B0;

    /* renamed from: C0 */
    public final Rect f27901C0;

    /* renamed from: D0 */
    public final C3876A f27902D0;

    /* renamed from: E0 */
    public final C1724m0 f27903E0;

    /* renamed from: F0 */
    public boolean f27904F0;

    /* renamed from: G0 */
    public final int[] f27905G0;

    /* renamed from: p0 */
    public AbstractC6216a f27906p0;

    /* renamed from: q0 */
    public C2587v f27907q0;

    /* renamed from: r0 */
    public String f27908r0;

    /* renamed from: s0 */
    public final View f27909s0;

    /* renamed from: t0 */
    public final P5.c f27910t0;

    /* renamed from: u0 */
    public final WindowManager f27911u0;

    /* renamed from: v0 */
    public final WindowManager.LayoutParams f27912v0;

    /* renamed from: w0 */
    public AbstractC2586u f27913w0;

    /* renamed from: x0 */
    public Z0.l f27914x0;

    /* renamed from: y0 */
    public final C1724m0 f27915y0;

    /* renamed from: z0 */
    public final C1724m0 f27916z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C2584s(AbstractC6216a abstractC6216a, C2587v c2587v, String str, View view, Z0.b bVar, AbstractC2586u abstractC2586u, UUID uuid) {
        super(view.getContext());
        P5.c cVar;
        if (Build.VERSION.SDK_INT >= 29) {
            cVar = new Object();
        } else {
            cVar = new Object();
        }
        this.f27906p0 = abstractC6216a;
        this.f27907q0 = c2587v;
        this.f27908r0 = str;
        this.f27909s0 = view;
        this.f27910t0 = cVar;
        Object systemService = view.getContext().getSystemService("window");
        AbstractC3557B.a0("null cannot be cast to non-null type android.view.WindowManager", systemService);
        this.f27911u0 = (WindowManager) systemService;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.gravity = 8388659;
        layoutParams.flags = (layoutParams.flags & (-8552473)) | 262144;
        layoutParams.type = 1002;
        layoutParams.token = view.getApplicationWindowToken();
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.setTitle(view.getContext().getResources().getString(R.string.default_popup_window_title));
        this.f27912v0 = layoutParams;
        this.f27913w0 = abstractC2586u;
        this.f27914x0 = Z0.l.f22805Y;
        o1 o1Var = o1.f22665a;
        this.f27915y0 = AbstractC4828h.Z(null, o1Var);
        this.f27916z0 = AbstractC4828h.Z(null, o1Var);
        this.f27900B0 = AbstractC4828h.E(new X0.b(1, this));
        this.f27901C0 = new Rect();
        this.f27902D0 = new C3876A(new C2574i(this, 2));
        setId(16908290);
        J.Z(this, J.A(view));
        AbstractC2279d.w(this, AbstractC2279d.n(view));
        AbstractC5260f.N(this, AbstractC5260f.t(view));
        setTag(R.id.compose_view_saveable_id_tag, "Popup:" + uuid);
        setClipChildren(false);
        setElevation(bVar.R((float) 8));
        setOutlineProvider(new Z0(2));
        this.f27903E0 = AbstractC4828h.Z(AbstractC2578m.f27879a, o1Var);
        this.f27905G0 = new int[2];
    }

    private final wf.n getContent() {
        return (wf.n) this.f27903E0.getValue();
    }

    private final int getDisplayHeight() {
        return AbstractC4344b.Y0(getContext().getResources().getConfiguration().screenHeightDp * getContext().getResources().getDisplayMetrics().density);
    }

    private final int getDisplayWidth() {
        return AbstractC4344b.Y0(getContext().getResources().getConfiguration().screenWidthDp * getContext().getResources().getDisplayMetrics().density);
    }

    public final AbstractC0461u getParentLayoutCoordinates() {
        return (AbstractC0461u) this.f27916z0.getValue();
    }

    public static final /* synthetic */ AbstractC0461u h(C2584s c2584s) {
        return c2584s.getParentLayoutCoordinates();
    }

    private final void setClippingEnabled(boolean z10) {
        int i10;
        WindowManager.LayoutParams layoutParams = this.f27912v0;
        if (z10) {
            i10 = layoutParams.flags & (-513);
        } else {
            i10 = layoutParams.flags | 512;
        }
        layoutParams.flags = i10;
        this.f27910t0.getClass();
        this.f27911u0.updateViewLayout(this, layoutParams);
    }

    private final void setContent(wf.n nVar) {
        this.f27903E0.setValue(nVar);
    }

    private final void setIsFocusable(boolean z10) {
        int i10;
        WindowManager.LayoutParams layoutParams = this.f27912v0;
        if (!z10) {
            i10 = layoutParams.flags | 8;
        } else {
            i10 = layoutParams.flags & (-9);
        }
        layoutParams.flags = i10;
        this.f27910t0.getClass();
        this.f27911u0.updateViewLayout(this, layoutParams);
    }

    private final void setParentLayoutCoordinates(AbstractC0461u abstractC0461u) {
        this.f27916z0.setValue(abstractC0461u);
    }

    private final void setSecurePolicy(EnumC2588w enumC2588w) {
        int i10;
        boolean b10 = AbstractC2575j.b(this.f27909s0);
        int ordinal = enumC2588w.ordinal();
        if (ordinal != 0) {
            b10 = true;
            if (ordinal != 1) {
                if (ordinal == 2) {
                    b10 = false;
                } else {
                    throw new RuntimeException();
                }
            }
        }
        WindowManager.LayoutParams layoutParams = this.f27912v0;
        if (b10) {
            i10 = layoutParams.flags | 8192;
        } else {
            i10 = layoutParams.flags & (-8193);
        }
        layoutParams.flags = i10;
        this.f27910t0.getClass();
        this.f27911u0.updateViewLayout(this, layoutParams);
    }

    @Override // H0.AbstractC0666a
    public final void a(AbstractC1725n abstractC1725n, int i10) {
        Z.r rVar = (Z.r) abstractC1725n;
        rVar.X(-857613600);
        getContent().invoke(rVar, 0);
        C1741v0 v10 = rVar.v();
        if (v10 != null) {
            v10.f22739d = new C6675O(this, i10, 8);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        KeyEvent.DispatcherState keyDispatcherState;
        if (keyEvent.getKeyCode() == 4 && this.f27907q0.f27918b) {
            if (getKeyDispatcherState() == null) {
                return super.dispatchKeyEvent(keyEvent);
            }
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                if (keyDispatcherState2 != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                }
                return true;
            } else if (keyEvent.getAction() == 1 && (keyDispatcherState = getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent) && !keyEvent.isCanceled()) {
                AbstractC6216a abstractC6216a = this.f27906p0;
                if (abstractC6216a != null) {
                    abstractC6216a.mo122invoke();
                }
                return true;
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // H0.AbstractC0666a
    public final void e(int i10, int i11, int i12, int i13, boolean z10) {
        super.e(i10, i11, i12, i13, z10);
        this.f27907q0.getClass();
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        WindowManager.LayoutParams layoutParams = this.f27912v0;
        layoutParams.width = childAt.getMeasuredWidth();
        layoutParams.height = childAt.getMeasuredHeight();
        this.f27910t0.getClass();
        this.f27911u0.updateViewLayout(this, layoutParams);
    }

    @Override // H0.AbstractC0666a
    public final void f(int i10, int i11) {
        this.f27907q0.getClass();
        super.f(View.MeasureSpec.makeMeasureSpec(getDisplayWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getDisplayHeight(), Integer.MIN_VALUE));
    }

    public final boolean getCanCalculatePosition() {
        return ((Boolean) this.f27900B0.getValue()).booleanValue();
    }

    public final WindowManager.LayoutParams getParams$ui_release() {
        return this.f27912v0;
    }

    public final Z0.l getParentLayoutDirection() {
        return this.f27914x0;
    }

    /* renamed from: getPopupContentSize-bOM6tXw */
    public final Z0.k m71getPopupContentSizebOM6tXw() {
        return (Z0.k) this.f27915y0.getValue();
    }

    public final AbstractC2586u getPositionProvider() {
        return this.f27913w0;
    }

    @Override // H0.AbstractC0666a
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.f27904F0;
    }

    public final String getTestTag() {
        return this.f27908r0;
    }

    public /* bridge */ /* synthetic */ View getViewRoot() {
        return null;
    }

    public final void i(AbstractC1738u abstractC1738u, wf.n nVar) {
        setParentCompositionContext(abstractC1738u);
        setContent(nVar);
        this.f27904F0 = true;
    }

    public final void j(AbstractC6216a abstractC6216a, C2587v c2587v, String str, Z0.l lVar) {
        int i10;
        this.f27906p0 = abstractC6216a;
        c2587v.getClass();
        this.f27907q0 = c2587v;
        this.f27908r0 = str;
        setIsFocusable(c2587v.f27917a);
        setSecurePolicy(c2587v.f27920d);
        setClippingEnabled(c2587v.f27922f);
        int ordinal = lVar.ordinal();
        if (ordinal != 0) {
            i10 = 1;
            if (ordinal != 1) {
                throw new RuntimeException();
            }
        } else {
            i10 = 0;
        }
        super.setLayoutDirection(i10);
    }

    public final void k() {
        AbstractC0461u parentLayoutCoordinates = getParentLayoutCoordinates();
        if (parentLayoutCoordinates == null) {
            return;
        }
        long j6 = parentLayoutCoordinates.j();
        long d10 = parentLayoutCoordinates.d(C5251c.f43619b);
        Z0.j i10 = H.i(kotlin.jvm.internal.m.c(AbstractC4344b.Y0(C5251c.d(d10)), AbstractC4344b.Y0(C5251c.e(d10))), j6);
        if (!AbstractC3557B.K(i10, this.f27899A0)) {
            this.f27899A0 = i10;
            m();
        }
    }

    public final void l(AbstractC0461u abstractC0461u) {
        setParentLayoutCoordinates(abstractC0461u);
        k();
    }

    /* JADX WARN: Type inference failed for: r11v0, types: [kotlin.jvm.internal.A, java.lang.Object] */
    public final void m() {
        Z0.k m71getPopupContentSizebOM6tXw;
        Z0.j jVar = this.f27899A0;
        if (jVar != null && (m71getPopupContentSizebOM6tXw = m71getPopupContentSizebOM6tXw()) != null) {
            P5.c cVar = this.f27910t0;
            cVar.getClass();
            View view = this.f27909s0;
            Rect rect = this.f27901C0;
            view.getWindowVisibleDisplayFrame(rect);
            long c10 = Ng.H.c(rect.right - rect.left, rect.bottom - rect.top);
            ?? obj = new Object();
            int i10 = Z0.i.f22798c;
            obj.f37621Y = Z0.i.f22797b;
            this.f27902D0.c(this, C2567b.f27852l0, new C2583r(obj, this, jVar, c10, m71getPopupContentSizebOM6tXw.f22804a));
            WindowManager.LayoutParams layoutParams = this.f27912v0;
            long j6 = obj.f37621Y;
            layoutParams.x = (int) (j6 >> 32);
            layoutParams.y = (int) (j6 & 4294967295L);
            if (this.f27907q0.f27921e) {
                cVar.O(this, (int) (c10 >> 32), (int) (c10 & 4294967295L));
            }
            cVar.getClass();
            this.f27911u0.updateViewLayout(this, layoutParams);
        }
    }

    @Override // H0.AbstractC0666a, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        C3876A c3876a = this.f27902D0;
        c3876a.getClass();
        int i10 = AbstractC3893i.f35891e;
        c3876a.f35832g = io.sentry.hints.i.f(c3876a.f35829d);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C3876A c3876a = this.f27902D0;
        C3892h c3892h = c3876a.f35832g;
        if (c3892h != null) {
            c3892h.a();
        }
        c3876a.b();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f27907q0.f27919c) {
            return super.onTouchEvent(motionEvent);
        }
        if (motionEvent != null && motionEvent.getAction() == 0 && (motionEvent.getX() < 0.0f || motionEvent.getX() >= getWidth() || motionEvent.getY() < 0.0f || motionEvent.getY() >= getHeight())) {
            AbstractC6216a abstractC6216a = this.f27906p0;
            if (abstractC6216a != null) {
                abstractC6216a.mo122invoke();
            }
            return true;
        } else if (motionEvent != null && motionEvent.getAction() == 4) {
            AbstractC6216a abstractC6216a2 = this.f27906p0;
            if (abstractC6216a2 != null) {
                abstractC6216a2.mo122invoke();
            }
            return true;
        } else {
            return super.onTouchEvent(motionEvent);
        }
    }

    public final void setParentLayoutDirection(Z0.l lVar) {
        this.f27914x0 = lVar;
    }

    /* renamed from: setPopupContentSize-fhxjrPA */
    public final void m72setPopupContentSizefhxjrPA(Z0.k kVar) {
        this.f27915y0.setValue(kVar);
    }

    public final void setPositionProvider(AbstractC2586u abstractC2586u) {
        this.f27913w0 = abstractC2586u;
    }

    public final void setTestTag(String str) {
        this.f27908r0 = str;
    }

    public static /* synthetic */ void getParams$ui_release$annotations() {
    }

    public AbstractC0666a getSubCompositionView() {
        return this;
    }

    @Override // android.view.View
    public void setLayoutDirection(int i10) {
    }
}
