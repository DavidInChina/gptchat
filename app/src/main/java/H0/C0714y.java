package H0;

import B0.C0190g;
import D1.AbstractC0340a0;
import D1.AbstractC0344c0;
import G0.AbstractC0579h;
import G0.AbstractC0587p;
import G0.C0572a0;
import G0.C0593w;
import S0.AbstractC1355p;
import Z.C1724m0;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.util.Log;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.AnimationUtils;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.semantics.EmptySemanticsElement;
import androidx.lifecycle.AbstractC2072g;
import androidx.lifecycle.AbstractC2086v;
import androidx.lifecycle.DefaultLifecycleObserver;
import b0.C2104h;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import g.RunnableC3111d;
import g.RunnableC3118k;
import h.C3280f;
import id.AbstractC3557B;
import io.sentry.android.core.AbstractC3612c;
import j0.AbstractC3893i;
import j0.C3876A;
import j0.C3892h;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import k6.AbstractC4194d;
import l0.AbstractC4325q;
import l0.AbstractC4326r;
import l0.C4323o;
import l8.AbstractC4344b;
import m0.C4543a;
import n0.AbstractC4704c;
import nf.AbstractC4828h;
import nf.AbstractC4831k;
import q0.C5251c;
import q0.C5252d;
import q1.AbstractC5260f;
import r0.C5335B;
import r0.C5339c;
import w.C6071r;
import wf.AbstractC6216a;
import x0.AbstractC6263a;
import x0.C6264b;
import y0.AbstractC6489b;
import y0.C6488a;
import y0.C6490c;
import z0.AbstractC6740c;

/* renamed from: H0.y  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0714y extends ViewGroup implements Owner, G0.u0, B0.G, DefaultLifecycleObserver {

    /* renamed from: A1  reason: collision with root package name */
    public static Method f7070A1;

    /* renamed from: z1  reason: collision with root package name */
    public static Class f7071z1;

    /* renamed from: B0  reason: collision with root package name */
    public final C4543a f7073B0;

    /* renamed from: C0  reason: collision with root package name */
    public boolean f7074C0;

    /* renamed from: D0  reason: collision with root package name */
    public final C0689l f7075D0;

    /* renamed from: E0  reason: collision with root package name */
    public final C0687k f7076E0;

    /* renamed from: F0  reason: collision with root package name */
    public final G0.r0 f7077F0;

    /* renamed from: G0  reason: collision with root package name */
    public boolean f7078G0;

    /* renamed from: H0  reason: collision with root package name */
    public C0686j0 f7079H0;

    /* renamed from: I0  reason: collision with root package name */
    public C0713x0 f7080I0;

    /* renamed from: J0  reason: collision with root package name */
    public Z0.a f7081J0;

    /* renamed from: K0  reason: collision with root package name */
    public boolean f7082K0;

    /* renamed from: L0  reason: collision with root package name */
    public final G0.V f7083L0;

    /* renamed from: M0  reason: collision with root package name */
    public final C0684i0 f7084M0;

    /* renamed from: N0  reason: collision with root package name */
    public long f7085N0;

    /* renamed from: O0  reason: collision with root package name */
    public final int[] f7086O0;

    /* renamed from: P0  reason: collision with root package name */
    public final float[] f7087P0;

    /* renamed from: Q0  reason: collision with root package name */
    public final float[] f7088Q0;

    /* renamed from: R0  reason: collision with root package name */
    public final float[] f7089R0;

    /* renamed from: S0  reason: collision with root package name */
    public long f7090S0;

    /* renamed from: T0  reason: collision with root package name */
    public boolean f7091T0;

    /* renamed from: U0  reason: collision with root package name */
    public long f7092U0;

    /* renamed from: V0  reason: collision with root package name */
    public boolean f7093V0;

    /* renamed from: W0  reason: collision with root package name */
    public final C1724m0 f7094W0;

    /* renamed from: X0  reason: collision with root package name */
    public final Z.I f7095X0;

    /* renamed from: Y0  reason: collision with root package name */
    public wf.k f7096Y0;

    /* renamed from: Z0  reason: collision with root package name */
    public final ViewTreeObserver$OnGlobalLayoutListenerC0691m f7097Z0;

    /* renamed from: a1  reason: collision with root package name */
    public final ViewTreeObserver$OnScrollChangedListenerC0693n f7098a1;
    public final ViewTreeObserver$OnTouchModeChangeListenerC0695o b1;

    /* renamed from: c1  reason: collision with root package name */
    public final T0.D f7099c1;

    /* renamed from: d1  reason: collision with root package name */
    public final T0.A f7100d1;

    /* renamed from: e1  reason: collision with root package name */
    public final AtomicReference f7101e1;

    /* renamed from: f1  reason: collision with root package name */
    public final C0705t0 f7102f1;
    public final B0 g1;

    /* renamed from: h0  reason: collision with root package name */
    public final AbstractC4831k f7103h0;

    /* renamed from: h1  reason: collision with root package name */
    public final C1724m0 f7104h1;

    /* renamed from: i1  reason: collision with root package name */
    public int f7106i1;

    /* renamed from: j1  reason: collision with root package name */
    public final C1724m0 f7108j1;

    /* renamed from: k1  reason: collision with root package name */
    public final C6264b f7110k1;

    /* renamed from: l0  reason: collision with root package name */
    public Z0.d f7111l0;

    /* renamed from: l1  reason: collision with root package name */
    public final C6490c f7112l1;

    /* renamed from: m1  reason: collision with root package name */
    public final F0.e f7114m1;

    /* renamed from: n0  reason: collision with root package name */
    public final View$OnDragListenerC0711w0 f7115n0;

    /* renamed from: n1  reason: collision with root package name */
    public final C0667a0 f7116n1;

    /* renamed from: o1  reason: collision with root package name */
    public MotionEvent f7118o1;

    /* renamed from: p1  reason: collision with root package name */
    public long f7120p1;

    /* renamed from: q0  reason: collision with root package name */
    public final androidx.compose.ui.node.a f7121q0;

    /* renamed from: q1  reason: collision with root package name */
    public final g1 f7122q1;

    /* renamed from: r1  reason: collision with root package name */
    public final C2104h f7124r1;

    /* renamed from: s1  reason: collision with root package name */
    public final RunnableC3118k f7126s1;

    /* renamed from: t0  reason: collision with root package name */
    public final O f7127t0;

    /* renamed from: t1  reason: collision with root package name */
    public final RunnableC3111d f7128t1;

    /* renamed from: u1  reason: collision with root package name */
    public boolean f7130u1;

    /* renamed from: v1  reason: collision with root package name */
    public final C0710w f7132v1;

    /* renamed from: w0  reason: collision with root package name */
    public ArrayList f7133w0;

    /* renamed from: w1  reason: collision with root package name */
    public final AbstractC0690l0 f7134w1;

    /* renamed from: x0  reason: collision with root package name */
    public boolean f7135x0;

    /* renamed from: x1  reason: collision with root package name */
    public boolean f7136x1;

    /* renamed from: y1  reason: collision with root package name */
    public final C0708v f7138y1;

    /* renamed from: i0  reason: collision with root package name */
    public long f7105i0 = C5251c.f43621d;

    /* renamed from: j0  reason: collision with root package name */
    public final boolean f7107j0 = true;

    /* renamed from: k0  reason: collision with root package name */
    public final G0.J f7109k0 = new G0.J();

    /* renamed from: m0  reason: collision with root package name */
    public final p0.g f7113m0 = new p0.g(new r(this, 1));

    /* renamed from: o0  reason: collision with root package name */
    public final i1 f7117o0 = new i1();

    /* renamed from: p0  reason: collision with root package name */
    public final F4.a f7119p0 = new F4.a(7);

    /* renamed from: r0  reason: collision with root package name */
    public final C0714y f7123r0 = this;

    /* renamed from: s0  reason: collision with root package name */
    public final L0.p f7125s0 = new L0.p(getRoot());

    /* renamed from: u0  reason: collision with root package name */
    public final m0.i f7129u0 = new m0.i();

    /* renamed from: v0  reason: collision with root package name */
    public final ArrayList f7131v0 = new ArrayList();

    /* renamed from: y0  reason: collision with root package name */
    public final C0190g f7137y0 = new C0190g();

    /* renamed from: z0  reason: collision with root package name */
    public final B0.y f7139z0 = new B0.y(getRoot());

    /* renamed from: A0  reason: collision with root package name */
    public wf.k f7072A0 = C0702s.f7024h0;

    /* JADX WARN: Type inference failed for: r3v8, types: [H0.B0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v6, types: [H0.n] */
    /* JADX WARN: Type inference failed for: r6v7, types: [H0.o] */
    public C0714y(Context context, AbstractC4831k abstractC4831k) {
        super(context);
        C4543a c4543a;
        int i10;
        AbstractC0690l0 abstractC0690l0;
        this.f7103h0 = abstractC4831k;
        this.f7111l0 = R4.b.j(context);
        EmptySemanticsElement emptySemanticsElement = EmptySemanticsElement.f24868b;
        View$OnDragListenerC0711w0 view$OnDragListenerC0711w0 = new View$OnDragListenerC0711w0();
        this.f7115n0 = view$OnDragListenerC0711w0;
        int i11 = 2;
        AbstractC4326r d10 = androidx.compose.ui.input.key.a.d(C4323o.f37719b, new r(this, 2));
        AbstractC4326r a5 = androidx.compose.ui.input.rotary.a.a();
        androidx.compose.ui.node.a aVar = new androidx.compose.ui.node.a(3, false, 0);
        aVar.v0(E0.i0.f4067b);
        aVar.t0(getDensity());
        emptySemanticsElement.getClass();
        aVar.w0(AbstractC4194d.a(emptySemanticsElement, a5).g(((p0.g) getFocusOwner()).f41684d).g(d10).g(view$OnDragListenerC0711w0.f7061c));
        this.f7121q0 = aVar;
        O o10 = new O(this);
        this.f7127t0 = o10;
        if (d()) {
            c4543a = new C4543a(this, getAutofillTree());
        } else {
            c4543a = null;
        }
        this.f7073B0 = c4543a;
        this.f7075D0 = new C0689l(context);
        this.f7076E0 = new C0687k(context);
        this.f7077F0 = new G0.r0(new r(this, 3));
        this.f7083L0 = new G0.V(getRoot());
        this.f7084M0 = new C0684i0(ViewConfiguration.get(context));
        this.f7085N0 = kotlin.jvm.internal.m.c(Integer.MAX_VALUE, Integer.MAX_VALUE);
        this.f7086O0 = new int[]{0, 0};
        float[] a10 = C5335B.a();
        this.f7087P0 = a10;
        this.f7088Q0 = C5335B.a();
        this.f7089R0 = C5335B.a();
        this.f7090S0 = -1L;
        this.f7092U0 = C5251c.f43620c;
        this.f7093V0 = true;
        Z.o1 o1Var = Z.o1.f22665a;
        this.f7094W0 = AbstractC4828h.Z(null, o1Var);
        this.f7095X0 = AbstractC4828h.E(new C0710w(this, 1));
        this.f7097Z0 = new ViewTreeObserver$OnGlobalLayoutListenerC0691m(0, this);
        this.f7098a1 = new ViewTreeObserver.OnScrollChangedListener() { // from class: H0.n
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                C0714y.this.A();
            }
        };
        this.b1 = new ViewTreeObserver.OnTouchModeChangeListener() { // from class: H0.o
            @Override // android.view.ViewTreeObserver.OnTouchModeChangeListener
            public final void onTouchModeChanged(boolean z10) {
                int i12;
                C6490c c6490c = C0714y.this.f7112l1;
                if (z10) {
                    i12 = 1;
                } else {
                    i12 = 2;
                }
                c6490c.getClass();
                c6490c.f50320a.setValue(new C6488a(i12));
            }
        };
        T0.D d11 = new T0.D(getView(), this);
        this.f7099c1 = d11;
        this.f7100d1 = new T0.A((T0.u) C0702s.f7029m0.invoke(d11));
        this.f7101e1 = new AtomicReference(null);
        this.f7102f1 = new C0705t0(getTextInputService());
        this.g1 = new Object();
        this.f7104h1 = AbstractC4828h.Z(kotlin.jvm.internal.m.t(context), Z.F0.f22489a);
        Configuration configuration = context.getResources().getConfiguration();
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 31) {
            i10 = A1.b.a(configuration);
        } else {
            i10 = 0;
        }
        this.f7106i1 = i10;
        int layoutDirection = context.getResources().getConfiguration().getLayoutDirection();
        Z0.l lVar = Z0.l.f22805Y;
        if (layoutDirection != 0 && layoutDirection == 1) {
            lVar = Z0.l.f22806Z;
        }
        this.f7108j1 = AbstractC4828h.Z(lVar, o1Var);
        this.f7110k1 = new C6264b(this);
        this.f7112l1 = new C6490c(isInTouchMode() ? 1 : i11);
        this.f7114m1 = new F0.e(this);
        this.f7116n1 = new C0667a0(this);
        this.f7122q1 = new g1();
        this.f7124r1 = new C2104h(new AbstractC6216a[16]);
        this.f7126s1 = new RunnableC3118k(4, this);
        this.f7128t1 = new RunnableC3111d(5, this);
        this.f7132v1 = new C0710w(this, 0);
        if (i12 >= 29) {
            abstractC0690l0 = new C0694n0();
        } else {
            abstractC0690l0 = new C0692m0(a10);
        }
        this.f7134w1 = abstractC0690l0;
        setWillNotDraw(false);
        setFocusable(true);
        if (i12 >= 26) {
            X.f6884a.a(this, 1, false);
        }
        setFocusableInTouchMode(true);
        setClipChildren(false);
        D1.Z.l(this, o10);
        setOnDragListener(view$OnDragListenerC0711w0);
        getRoot().c(this);
        if (i12 >= 29) {
            S.f6877a.a(this);
        }
        this.f7138y1 = new C0708v(this);
    }

    public static final void a(C0714y c0714y, int i10, AccessibilityNodeInfo accessibilityNodeInfo, String str) {
        Integer num;
        O o10 = c0714y.f7127t0;
        if (AbstractC3557B.K(str, o10.f6808L0)) {
            Integer num2 = (Integer) o10.f6806J0.get(Integer.valueOf(i10));
            if (num2 != null) {
                accessibilityNodeInfo.getExtras().putInt(str, num2.intValue());
            }
        } else if (AbstractC3557B.K(str, o10.f6809M0) && (num = (Integer) o10.f6807K0.get(Integer.valueOf(i10))) != null) {
            accessibilityNodeInfo.getExtras().putInt(str, num.intValue());
        }
    }

    public static boolean d() {
        if (Build.VERSION.SDK_INT >= 26) {
            return true;
        }
        return false;
    }

    public static void e(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if (childAt instanceof C0714y) {
                ((C0714y) childAt).r();
            } else if (childAt instanceof ViewGroup) {
                e((ViewGroup) childAt);
            }
        }
    }

    public static long f(int i10) {
        long j6;
        long j10;
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode == 1073741824) {
                    j10 = size;
                    j6 = j10 << 32;
                    return j6 | j10;
                }
                throw new IllegalStateException();
            }
            j6 = 0 << 32;
            size = Integer.MAX_VALUE;
        } else {
            j6 = 0 << 32;
        }
        j10 = size;
        return j6 | j10;
    }

    public static View g(View view, int i10) {
        if (Build.VERSION.SDK_INT < 29) {
            Method declaredMethod = View.class.getDeclaredMethod("getAccessibilityViewId", new Class[0]);
            declaredMethod.setAccessible(true);
            if (AbstractC3557B.K(declaredMethod.invoke(view, new Object[0]), Integer.valueOf(i10))) {
                return view;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View g10 = g(viewGroup.getChildAt(i11), i10);
                    if (g10 != null) {
                        return g10;
                    }
                }
                return null;
            }
            return null;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C0699q get_viewTreeOwners() {
        return (C0699q) this.f7094W0.getValue();
    }

    public static void i(androidx.compose.ui.node.a aVar) {
        aVar.N();
        C2104h J10 = aVar.J();
        int i10 = J10.f25569h0;
        if (i10 > 0) {
            Object[] objArr = J10.f25567Y;
            int i11 = 0;
            do {
                i((androidx.compose.ui.node.a) objArr[i11]);
                i11++;
            } while (i11 < i10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0082 A[LOOP:0: B:22:0x004c->B:38:0x0082, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0085 A[EDGE_INSN: B:40:0x0085->B:39:0x0085 ?: BREAK  , SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean k(MotionEvent motionEvent) {
        boolean z10;
        float x10 = motionEvent.getX();
        if (!Float.isInfinite(x10) && !Float.isNaN(x10)) {
            float y10 = motionEvent.getY();
            if (!Float.isInfinite(y10) && !Float.isNaN(y10)) {
                float rawX = motionEvent.getRawX();
                if (!Float.isInfinite(rawX) && !Float.isNaN(rawX)) {
                    float rawY = motionEvent.getRawY();
                    if (!Float.isInfinite(rawY) && !Float.isNaN(rawY)) {
                        z10 = false;
                        if (!z10) {
                            int pointerCount = motionEvent.getPointerCount();
                            for (int i10 = 1; i10 < pointerCount; i10++) {
                                float x11 = motionEvent.getX(i10);
                                if (!Float.isInfinite(x11) && !Float.isNaN(x11)) {
                                    float y11 = motionEvent.getY(i10);
                                    if (!Float.isInfinite(y11) && !Float.isNaN(y11) && (Build.VERSION.SDK_INT < 29 || H0.f6740a.a(motionEvent, i10))) {
                                        z10 = false;
                                        if (!z10) {
                                            break;
                                        }
                                    }
                                }
                                z10 = true;
                                if (!z10) {
                                }
                            }
                        }
                        return z10;
                    }
                }
            }
        }
        z10 = true;
        if (!z10) {
        }
        return z10;
    }

    private void setFontFamilyResolver(S0.r rVar) {
        this.f7104h1.setValue(rVar);
    }

    private void setLayoutDirection(Z0.l lVar) {
        this.f7108j1.setValue(lVar);
    }

    private final void set_viewTreeOwners(C0699q c0699q) {
        this.f7094W0.setValue(c0699q);
    }

    public final void A() {
        int[] iArr = this.f7086O0;
        getLocationOnScreen(iArr);
        long j6 = this.f7085N0;
        int i10 = Z0.i.f22798c;
        int i11 = (int) (j6 >> 32);
        int i12 = (int) (j6 & 4294967295L);
        boolean z10 = false;
        int i13 = iArr[0];
        if (i11 != i13 || i12 != iArr[1]) {
            this.f7085N0 = kotlin.jvm.internal.m.c(i13, iArr[1]);
            if (i11 != Integer.MAX_VALUE && i12 != Integer.MAX_VALUE) {
                getRoot().t().f5661o.p0();
                z10 = true;
            }
        }
        this.f7083L0.b(z10);
    }

    @Override // android.view.View
    public final void autofill(SparseArray sparseArray) {
        C4543a c4543a;
        wf.k kVar;
        if (d() && (c4543a = this.f7073B0) != null) {
            int size = sparseArray.size();
            for (int i10 = 0; i10 < size; i10++) {
                int keyAt = sparseArray.keyAt(i10);
                AutofillValue k10 = Wd.j.k(sparseArray.get(keyAt));
                m0.f fVar = m0.f.f38804a;
                if (fVar.d(k10)) {
                    String obj = fVar.i(k10).toString();
                    m0.h hVar = (m0.h) c4543a.f38800b.f38812a.get(Integer.valueOf(keyAt));
                    if (hVar != null && (kVar = hVar.f38810c) != null) {
                        kVar.invoke(obj);
                    }
                } else if (!fVar.b(k10)) {
                    if (!fVar.c(k10)) {
                        if (fVar.e(k10)) {
                            throw new Lc.l("An operation is not implemented: b/138604541:  Add onFill() callback for toggle", 1);
                        }
                    } else {
                        throw new Lc.l("An operation is not implemented: b/138604541: Add onFill() callback for list", 1);
                    }
                } else {
                    throw new Lc.l("An operation is not implemented: b/138604541: Add onFill() callback for date", 1);
                }
            }
        }
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i10) {
        return this.f7127t0.n(i10, this.f7105i0, false);
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i10) {
        return this.f7127t0.n(i10, this.f7105i0, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (!isAttachedToWindow()) {
            i(getRoot());
        }
        int i10 = G0.o0.f5814a;
        o(true);
        int i11 = AbstractC3893i.f35891e;
        io.sentry.hints.i.h();
        this.f7135x0 = true;
        F4.a aVar = this.f7119p0;
        C5339c c5339c = (C5339c) aVar.f5033Z;
        Canvas canvas2 = c5339c.f44230a;
        c5339c.f44230a = canvas;
        getRoot().j(c5339c);
        ((C5339c) aVar.f5033Z).f44230a = canvas2;
        ArrayList arrayList = this.f7131v0;
        if (true ^ arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i12 = 0; i12 < size; i12++) {
                ((G0.n0) arrayList.get(i12)).k();
            }
        }
        if (c1.f6911A0) {
            int save = canvas.save();
            canvas.clipRect(0.0f, 0.0f, 0.0f, 0.0f);
            super.dispatchDraw(canvas);
            canvas.restoreToCount(save);
        }
        arrayList.clear();
        this.f7135x0 = false;
        ArrayList arrayList2 = this.f7133w0;
        if (arrayList2 != null) {
            arrayList.addAll(arrayList2);
            arrayList2.clear();
        }
    }

    @Override // android.view.View
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        float f6;
        float f10;
        D0.a aVar;
        int i10;
        C0572a0 c0572a0;
        AbstractC4325q abstractC4325q;
        C0572a0 c0572a02;
        if (motionEvent.getActionMasked() == 8) {
            if (motionEvent.isFromSource(4194304)) {
                ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
                float f11 = -motionEvent.getAxisValue(26);
                Context context = getContext();
                int i11 = Build.VERSION.SDK_INT;
                if (i11 >= 26) {
                    Method method = AbstractC0344c0.f3257a;
                    f6 = AbstractC0340a0.b(viewConfiguration);
                } else {
                    f6 = AbstractC0344c0.a(viewConfiguration, context);
                }
                float f12 = f6 * f11;
                Context context2 = getContext();
                if (i11 >= 26) {
                    f10 = AbstractC0340a0.a(viewConfiguration);
                } else {
                    f10 = AbstractC0344c0.a(viewConfiguration, context2);
                }
                D0.c cVar = new D0.c(f12, f10 * f11, motionEvent.getEventTime(), motionEvent.getDeviceId());
                p0.q f13 = androidx.compose.ui.focus.a.f(((p0.g) getFocusOwner()).f41681a);
                if (f13 != null) {
                    AbstractC4325q abstractC4325q2 = f13.f37720Y;
                    if (abstractC4325q2.f37732r0) {
                        AbstractC4325q abstractC4325q3 = abstractC4325q2.f37724j0;
                        androidx.compose.ui.node.a A10 = AbstractC0579h.A(f13);
                        loop0: while (true) {
                            if (A10 != null) {
                                if ((A10.f24831B0.f5704e.f37723i0 & 16384) != 0) {
                                    while (abstractC4325q3 != null) {
                                        if ((abstractC4325q3.f37722h0 & 16384) != 0) {
                                            C2104h c2104h = null;
                                            abstractC4325q = abstractC4325q3;
                                            while (abstractC4325q != null) {
                                                if (abstractC4325q instanceof D0.a) {
                                                    break loop0;
                                                }
                                                if ((abstractC4325q.f37722h0 & 16384) != 0 && (abstractC4325q instanceof AbstractC0587p)) {
                                                    int i12 = 0;
                                                    for (AbstractC4325q abstractC4325q4 = ((AbstractC0587p) abstractC4325q).f5816t0; abstractC4325q4 != null; abstractC4325q4 = abstractC4325q4.f37725k0) {
                                                        if ((abstractC4325q4.f37722h0 & 16384) != 0) {
                                                            i12++;
                                                            if (i12 == 1) {
                                                                abstractC4325q = abstractC4325q4;
                                                            } else {
                                                                if (c2104h == null) {
                                                                    c2104h = new C2104h(new AbstractC4325q[16]);
                                                                }
                                                                if (abstractC4325q != null) {
                                                                    c2104h.b(abstractC4325q);
                                                                    abstractC4325q = null;
                                                                }
                                                                c2104h.b(abstractC4325q4);
                                                            }
                                                        }
                                                    }
                                                    if (i12 == 1) {
                                                    }
                                                }
                                                abstractC4325q = AbstractC0579h.f(c2104h);
                                            }
                                            continue;
                                        }
                                        abstractC4325q3 = abstractC4325q3.f37724j0;
                                    }
                                }
                                A10 = A10.E();
                                if (A10 != null && (c0572a02 = A10.f24831B0) != null) {
                                    abstractC4325q3 = c0572a02.f5703d;
                                } else {
                                    abstractC4325q3 = null;
                                }
                            } else {
                                abstractC4325q = null;
                                break;
                            }
                        }
                        aVar = (D0.a) abstractC4325q;
                    } else {
                        throw new IllegalStateException("visitAncestors called on an unattached node".toString());
                    }
                } else {
                    aVar = null;
                }
                if (aVar == null) {
                    return false;
                }
                AbstractC4325q abstractC4325q5 = (AbstractC4325q) aVar;
                AbstractC4325q abstractC4325q6 = abstractC4325q5.f37720Y;
                if (abstractC4325q6.f37732r0) {
                    AbstractC4325q abstractC4325q7 = abstractC4325q6.f37724j0;
                    androidx.compose.ui.node.a A11 = AbstractC0579h.A(aVar);
                    ArrayList arrayList = null;
                    while (A11 != null) {
                        if ((A11.f24831B0.f5704e.f37723i0 & 16384) != 0) {
                            while (abstractC4325q7 != null) {
                                if ((abstractC4325q7.f37722h0 & 16384) != 0) {
                                    AbstractC4325q abstractC4325q8 = abstractC4325q7;
                                    C2104h c2104h2 = null;
                                    while (abstractC4325q8 != null) {
                                        if (abstractC4325q8 instanceof D0.a) {
                                            if (arrayList == null) {
                                                arrayList = new ArrayList();
                                            }
                                            arrayList.add(abstractC4325q8);
                                        } else if ((abstractC4325q8.f37722h0 & 16384) != 0 && (abstractC4325q8 instanceof AbstractC0587p)) {
                                            int i13 = 0;
                                            for (AbstractC4325q abstractC4325q9 = ((AbstractC0587p) abstractC4325q8).f5816t0; abstractC4325q9 != null; abstractC4325q9 = abstractC4325q9.f37725k0) {
                                                if ((abstractC4325q9.f37722h0 & 16384) != 0) {
                                                    i13++;
                                                    if (i13 == 1) {
                                                        abstractC4325q8 = abstractC4325q9;
                                                    } else {
                                                        if (c2104h2 == null) {
                                                            c2104h2 = new C2104h(new AbstractC4325q[16]);
                                                        }
                                                        if (abstractC4325q8 != null) {
                                                            c2104h2.b(abstractC4325q8);
                                                            abstractC4325q8 = null;
                                                        }
                                                        c2104h2.b(abstractC4325q9);
                                                    }
                                                }
                                            }
                                            if (i13 == 1) {
                                            }
                                        }
                                        abstractC4325q8 = AbstractC0579h.f(c2104h2);
                                    }
                                }
                                abstractC4325q7 = abstractC4325q7.f37724j0;
                            }
                        }
                        A11 = A11.E();
                        if (A11 != null && (c0572a0 = A11.f24831B0) != null) {
                            abstractC4325q7 = c0572a0.f5703d;
                        } else {
                            abstractC4325q7 = null;
                        }
                    }
                    if (arrayList != null && arrayList.size() - 1 >= 0) {
                        while (true) {
                            int i14 = i10 - 1;
                            wf.k kVar = ((D0.b) ((D0.a) arrayList.get(i10))).f3198t0;
                            if (kVar != null && ((Boolean) kVar.invoke(cVar)).booleanValue()) {
                                break;
                            } else if (i14 < 0) {
                                break;
                            } else {
                                i10 = i14;
                            }
                        }
                    }
                    AbstractC4325q abstractC4325q10 = abstractC4325q5.f37720Y;
                    C2104h c2104h3 = null;
                    while (true) {
                        if (abstractC4325q10 != null) {
                            if (abstractC4325q10 instanceof D0.a) {
                                wf.k kVar2 = ((D0.b) ((D0.a) abstractC4325q10)).f3198t0;
                                if (kVar2 != null && ((Boolean) kVar2.invoke(cVar)).booleanValue()) {
                                    break;
                                }
                            } else if ((abstractC4325q10.f37722h0 & 16384) != 0 && (abstractC4325q10 instanceof AbstractC0587p)) {
                                int i15 = 0;
                                for (AbstractC4325q abstractC4325q11 = ((AbstractC0587p) abstractC4325q10).f5816t0; abstractC4325q11 != null; abstractC4325q11 = abstractC4325q11.f37725k0) {
                                    if ((abstractC4325q11.f37722h0 & 16384) != 0) {
                                        i15++;
                                        if (i15 == 1) {
                                            abstractC4325q10 = abstractC4325q11;
                                        } else {
                                            if (c2104h3 == null) {
                                                c2104h3 = new C2104h(new AbstractC4325q[16]);
                                            }
                                            if (abstractC4325q10 != null) {
                                                c2104h3.b(abstractC4325q10);
                                                abstractC4325q10 = null;
                                            }
                                            c2104h3.b(abstractC4325q11);
                                        }
                                    }
                                }
                                if (i15 == 1) {
                                }
                            }
                            abstractC4325q10 = AbstractC0579h.f(c2104h3);
                        } else {
                            AbstractC4325q abstractC4325q12 = abstractC4325q5.f37720Y;
                            C2104h c2104h4 = null;
                            while (true) {
                                if (abstractC4325q12 != null) {
                                    if (abstractC4325q12 instanceof D0.a) {
                                        wf.k kVar3 = ((D0.b) ((D0.a) abstractC4325q12)).f3197s0;
                                        if (kVar3 != null && ((Boolean) kVar3.invoke(cVar)).booleanValue()) {
                                            break;
                                        }
                                    } else if ((abstractC4325q12.f37722h0 & 16384) != 0 && (abstractC4325q12 instanceof AbstractC0587p)) {
                                        int i16 = 0;
                                        for (AbstractC4325q abstractC4325q13 = ((AbstractC0587p) abstractC4325q12).f5816t0; abstractC4325q13 != null; abstractC4325q13 = abstractC4325q13.f37725k0) {
                                            if ((abstractC4325q13.f37722h0 & 16384) != 0) {
                                                i16++;
                                                if (i16 == 1) {
                                                    abstractC4325q12 = abstractC4325q13;
                                                } else {
                                                    if (c2104h4 == null) {
                                                        c2104h4 = new C2104h(new AbstractC4325q[16]);
                                                    }
                                                    if (abstractC4325q12 != null) {
                                                        c2104h4.b(abstractC4325q12);
                                                        abstractC4325q12 = null;
                                                    }
                                                    c2104h4.b(abstractC4325q13);
                                                }
                                            }
                                        }
                                        if (i16 == 1) {
                                        }
                                    }
                                    abstractC4325q12 = AbstractC0579h.f(c2104h4);
                                } else if (arrayList == null) {
                                    return false;
                                } else {
                                    int size = arrayList.size();
                                    for (int i17 = 0; i17 < size; i17++) {
                                        wf.k kVar4 = ((D0.b) ((D0.a) arrayList.get(i17))).f3197s0;
                                        if (kVar4 == null || !((Boolean) kVar4.invoke(cVar)).booleanValue()) {
                                        }
                                    }
                                    return false;
                                }
                            }
                        }
                    }
                } else {
                    throw new IllegalStateException("visitAncestors called on an unattached node".toString());
                }
            } else if (!k(motionEvent) && isAttachedToWindow()) {
                if ((h(motionEvent) & 1) == 0) {
                    return false;
                }
            } else {
                return super.dispatchGenericMotionEvent(motionEvent);
            }
            return true;
        }
        return super.dispatchGenericMotionEvent(motionEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00fc  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        boolean z10;
        androidx.compose.ui.node.a aVar;
        int i10;
        int i11;
        C0572a0 c0572a0;
        L0.o s10;
        G0.g0 c10;
        boolean z11 = this.f7130u1;
        RunnableC3111d runnableC3111d = this.f7128t1;
        if (z11) {
            removeCallbacks(runnableC3111d);
            runnableC3111d.run();
        }
        if (k(motionEvent) || !isAttachedToWindow()) {
            return false;
        }
        O o10 = this.f7127t0;
        AccessibilityManager accessibilityManager = o10.f6821l0;
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            int action = motionEvent.getAction();
            C0714y c0714y = o10.f6818i0;
            if (action != 7 && action != 9) {
                if (action == 10) {
                    int i12 = o10.f6819j0;
                    if (i12 != Integer.MIN_VALUE) {
                        if (i12 != Integer.MIN_VALUE) {
                            o10.f6819j0 = Integer.MIN_VALUE;
                            O.M(o10, Integer.MIN_VALUE, 128, null, 12);
                            O.M(o10, i12, 256, null, 12);
                        }
                    } else {
                        c0714y.getAndroidViewsHandler$ui_release().dispatchGenericMotionEvent(motionEvent);
                    }
                }
            } else {
                float x10 = motionEvent.getX();
                float y10 = motionEvent.getY();
                int i13 = G0.o0.f5814a;
                c0714y.o(true);
                C0593w c0593w = new C0593w();
                androidx.compose.ui.node.a root = c0714y.getRoot();
                long r10 = R4.b.r(x10, y10);
                C0572a0 c0572a02 = root.f24831B0;
                c0572a02.f5702c.J0(G0.g0.f5763K0, c0572a02.f5702c.D0(r10), c0593w, true, true);
                AbstractC4325q abstractC4325q = (AbstractC4325q) kf.t.p2(c0593w);
                if (abstractC4325q != null) {
                    aVar = AbstractC0579h.A(abstractC4325q);
                } else {
                    aVar = null;
                }
                if (aVar != null && (c0572a0 = aVar.f24831B0) != null && c0572a0.d(8) && ((c10 = (s10 = R4.b.s(aVar, false)).c()) == null || !c10.M0())) {
                    if (!s10.f10421d.f10409Y.containsKey(L0.r.f10458n) && c0714y.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().get(aVar) == null) {
                        i10 = o10.G(aVar.f24843Z);
                        c0714y.getAndroidViewsHandler$ui_release().dispatchGenericMotionEvent(motionEvent);
                        i11 = o10.f6819j0;
                        if (i11 != i10) {
                            o10.f6819j0 = i10;
                            O.M(o10, i10, 128, null, 12);
                            O.M(o10, i11, 256, null, 12);
                        }
                    }
                }
                i10 = Integer.MIN_VALUE;
                c0714y.getAndroidViewsHandler$ui_release().dispatchGenericMotionEvent(motionEvent);
                i11 = o10.f6819j0;
                if (i11 != i10) {
                }
            }
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 7) {
            if (actionMasked == 10 && l(motionEvent)) {
                if (motionEvent.getToolType(0) == 3 && motionEvent.getButtonState() != 0) {
                    return false;
                }
                MotionEvent motionEvent2 = this.f7118o1;
                if (motionEvent2 != null) {
                    motionEvent2.recycle();
                }
                this.f7118o1 = MotionEvent.obtainNoHistory(motionEvent);
                this.f7130u1 = true;
                post(runnableC3111d);
                return false;
            }
        } else if (!m(motionEvent)) {
            return false;
        }
        if ((h(motionEvent) & 1) == 0) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00bf, code lost:
        if (((((~r13) << 6) & r13) & (-9187201950435737472L)) == 0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00c1, code lost:
        r5 = r6.c(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00c7, code lost:
        if (r6.f47624e != 0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00dc, code lost:
        if (((r6.f47620a[r5 >> 3] >> ((r5 & 7) << 3)) & 255) != 254) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00df, code lost:
        r5 = r6.f47622c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00e3, code lost:
        if (r5 <= 8) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00f7, code lost:
        if (java.lang.Long.compare((r6.f47623d * 32) ^ Long.MIN_VALUE, (r5 * 25) ^ Long.MIN_VALUE) > 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00f9, code lost:
        r6.f(w.AbstractC6076w.b(r6.f47622c));
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0103, code lost:
        r6.f(w.AbstractC6076w.b(r6.f47622c));
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x010c, code lost:
        r5 = r6.c(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0110, code lost:
        r9 = r5;
        r6.f47623d++;
        r5 = r6.f47624e;
        r8 = r6.f47620a;
        r10 = r9 >> 3;
        r11 = r8[r10];
        r13 = (r9 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x012d, code lost:
        if (((r11 >> r13) & 255) != 128) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x012f, code lost:
        r14 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0131, code lost:
        r14 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0132, code lost:
        r6.f47624e = r5 - r14;
        r8[r10] = ((~(255 << r13)) & r11) | (r8 << r13);
        r7 = r6.f47622c;
        r8 = ((r9 - 7) & r7) + (r7 & 7);
        r7 = r8 >> 3;
        r8 = (r8 & 7) << 3;
        r8[r7] = (r8[r7] & (~(255 << r8))) | (r8 << r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x01db, code lost:
        if (((r11 & ((~r11) << 6)) & (-9187201950435737472L)) == 0) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x01dd, code lost:
        r26 = -1;
     */
    /* JADX WARN: Removed duplicated region for block: B:239:0x045c A[RETURN, SYNTHETIC] */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z10;
        AbstractC4325q abstractC4325q;
        int i10;
        C0572a0 c0572a0;
        AbstractC4325q abstractC4325q2;
        C0572a0 c0572a02;
        int i11;
        int i12;
        if (isFocused()) {
            int metaState = keyEvent.getMetaState();
            this.f7117o0.getClass();
            i1.f6962b.setValue(new B0.F(metaState));
            p0.g gVar = (p0.g) getFocusOwner();
            gVar.getClass();
            long a5 = androidx.compose.ui.input.key.a.a(keyEvent.getKeyCode());
            int c10 = androidx.compose.ui.input.key.a.c(keyEvent);
            if (r.f.w(c10, 2)) {
                C6071r c6071r = gVar.f41686f;
                if (c6071r == null) {
                    c6071r = new C6071r(3);
                    gVar.f41686f = c6071r;
                }
                C6071r c6071r2 = c6071r;
                int i13 = ((int) (a5 ^ (a5 >>> 32))) * (-862048943);
                int i14 = i13 ^ (i13 << 16);
                int i15 = i14 >>> 7;
                int i16 = i14 & 127;
                int i17 = c6071r2.f47622c;
                int i18 = i15 & i17;
                int i19 = 0;
                loop0: while (true) {
                    long[] jArr = c6071r2.f47620a;
                    int i20 = i18 >> 3;
                    int i21 = (i18 & 7) << 3;
                    long j6 = (jArr[i20] >>> i21) | ((jArr[i20 + 1] << (64 - i21)) & ((-i21) >> 63));
                    long j10 = i16;
                    long j11 = j6 ^ (j10 * 72340172838076673L);
                    long j12 = (j11 - 72340172838076673L) & (~j11) & (-9187201950435737472L);
                    while (true) {
                        if (j12 == 0) {
                            break;
                        }
                        i12 = ((Long.numberOfTrailingZeros(j12) >> 3) + i18) & i17;
                        if (c6071r2.f47621b[i12] == a5) {
                            break loop0;
                        }
                        j12 &= j12 - 1;
                    }
                    i19 += 8;
                    i18 = (i18 + i19) & i17;
                }
                c6071r2.f47621b[i12] = a5;
            } else if (r.f.w(c10, 1)) {
                C6071r c6071r3 = gVar.f41686f;
                if (c6071r3 != null && c6071r3.a(a5)) {
                    C6071r c6071r4 = gVar.f41686f;
                    if (c6071r4 != null) {
                        int i22 = ((int) ((a5 >>> 32) ^ a5)) * (-862048943);
                        int i23 = i22 ^ (i22 << 16);
                        int i24 = i23 & 127;
                        int i25 = c6071r4.f47622c;
                        int i26 = (i23 >>> 7) & i25;
                        int i27 = 0;
                        loop2: while (true) {
                            long[] jArr2 = c6071r4.f47620a;
                            int i28 = i26 >> 3;
                            int i29 = (i26 & 7) << 3;
                            long j13 = (jArr2[i28] >>> i29) | ((jArr2[i28 + 1] << (64 - i29)) & ((-i29) >> 63));
                            long j14 = (i24 * 72340172838076673L) ^ j13;
                            long j15 = (j14 - 72340172838076673L) & (~j14) & (-9187201950435737472L);
                            while (true) {
                                if (j15 == 0) {
                                    break;
                                }
                                i11 = (i26 + (Long.numberOfTrailingZeros(j15) >> 3)) & i25;
                                if (c6071r4.f47621b[i11] == a5) {
                                    break loop2;
                                }
                                j15 &= j15 - 1;
                            }
                            i27 += 8;
                            i26 = (i26 + i27) & i25;
                        }
                        if (i11 >= 0) {
                            c6071r4.f47623d--;
                            long[] jArr3 = c6071r4.f47620a;
                            int i30 = i11 >> 3;
                            int i31 = (i11 & 7) << 3;
                            jArr3[i30] = (jArr3[i30] & (~(255 << i31))) | (254 << i31);
                            int i32 = c6071r4.f47622c;
                            int i33 = ((i11 - 7) & i32) + (i32 & 7);
                            int i34 = i33 >> 3;
                            int i35 = (i33 & 7) << 3;
                            jArr3[i34] = (254 << i35) | (jArr3[i34] & (~(255 << i35)));
                        }
                    }
                }
                z10 = true;
                if (!super.dispatchKeyEvent(keyEvent)) {
                    return false;
                }
                return z10;
            }
            p0.q f6 = androidx.compose.ui.focus.a.f(gVar.f41681a);
            if (f6 != null) {
                AbstractC4325q abstractC4325q3 = f6.f37720Y;
                if (abstractC4325q3.f37732r0) {
                    if ((abstractC4325q3.f37723i0 & 9216) != 0) {
                        abstractC4325q = null;
                        for (AbstractC4325q abstractC4325q4 = abstractC4325q3.f37725k0; abstractC4325q4 != null; abstractC4325q4 = abstractC4325q4.f37725k0) {
                            int i36 = abstractC4325q4.f37722h0;
                            if ((i36 & 9216) != 0) {
                                if ((i36 & 1024) != 0) {
                                    break;
                                }
                                abstractC4325q = abstractC4325q4;
                            }
                        }
                    } else {
                        abstractC4325q = null;
                    }
                    if (abstractC4325q == null) {
                        AbstractC4325q abstractC4325q5 = f6.f37720Y;
                        if (abstractC4325q5.f37732r0) {
                            AbstractC4325q abstractC4325q6 = abstractC4325q5.f37724j0;
                            androidx.compose.ui.node.a A10 = AbstractC0579h.A(f6);
                            loop5: while (true) {
                                if (A10 != null) {
                                    if ((A10.f24831B0.f5704e.f37723i0 & 8192) != 0) {
                                        while (abstractC4325q6 != null) {
                                            if ((abstractC4325q6.f37722h0 & 8192) != 0) {
                                                abstractC4325q2 = abstractC4325q6;
                                                C2104h c2104h = null;
                                                while (abstractC4325q2 != null) {
                                                    if (abstractC4325q2 instanceof AbstractC6740c) {
                                                        break loop5;
                                                    }
                                                    if ((abstractC4325q2.f37722h0 & 8192) != 0 && (abstractC4325q2 instanceof AbstractC0587p)) {
                                                        int i37 = 0;
                                                        for (AbstractC4325q abstractC4325q7 = ((AbstractC0587p) abstractC4325q2).f5816t0; abstractC4325q7 != null; abstractC4325q7 = abstractC4325q7.f37725k0) {
                                                            if ((abstractC4325q7.f37722h0 & 8192) != 0) {
                                                                i37++;
                                                                if (i37 == 1) {
                                                                    abstractC4325q2 = abstractC4325q7;
                                                                } else {
                                                                    if (c2104h == null) {
                                                                        c2104h = new C2104h(new AbstractC4325q[16]);
                                                                    }
                                                                    if (abstractC4325q2 != null) {
                                                                        c2104h.b(abstractC4325q2);
                                                                        abstractC4325q2 = null;
                                                                    }
                                                                    c2104h.b(abstractC4325q7);
                                                                }
                                                            }
                                                        }
                                                        if (i37 == 1) {
                                                        }
                                                    }
                                                    abstractC4325q2 = AbstractC0579h.f(c2104h);
                                                }
                                                continue;
                                            }
                                            abstractC4325q6 = abstractC4325q6.f37724j0;
                                        }
                                    }
                                    A10 = A10.E();
                                    if (A10 != null && (c0572a02 = A10.f24831B0) != null) {
                                        abstractC4325q6 = c0572a02.f5703d;
                                    } else {
                                        abstractC4325q6 = null;
                                    }
                                } else {
                                    abstractC4325q2 = null;
                                    break;
                                }
                            }
                            AbstractC6740c abstractC6740c = (AbstractC6740c) abstractC4325q2;
                            if (abstractC6740c != null) {
                                abstractC4325q = ((AbstractC4325q) abstractC6740c).f37720Y;
                            } else {
                                abstractC4325q = null;
                            }
                        } else {
                            throw new IllegalStateException("visitAncestors called on an unattached node".toString());
                        }
                    }
                    if (abstractC4325q != null) {
                        AbstractC4325q abstractC4325q8 = abstractC4325q.f37720Y;
                        if (abstractC4325q8.f37732r0) {
                            AbstractC4325q abstractC4325q9 = abstractC4325q8.f37724j0;
                            androidx.compose.ui.node.a A11 = AbstractC0579h.A(abstractC4325q);
                            ArrayList arrayList = null;
                            while (A11 != null) {
                                if ((A11.f24831B0.f5704e.f37723i0 & 8192) != 0) {
                                    while (abstractC4325q9 != null) {
                                        if ((abstractC4325q9.f37722h0 & 8192) != 0) {
                                            AbstractC4325q abstractC4325q10 = abstractC4325q9;
                                            C2104h c2104h2 = null;
                                            while (abstractC4325q10 != null) {
                                                if (abstractC4325q10 instanceof AbstractC6740c) {
                                                    if (arrayList == null) {
                                                        arrayList = new ArrayList();
                                                    }
                                                    arrayList.add(abstractC4325q10);
                                                } else if ((abstractC4325q10.f37722h0 & 8192) != 0 && (abstractC4325q10 instanceof AbstractC0587p)) {
                                                    int i38 = 0;
                                                    for (AbstractC4325q abstractC4325q11 = ((AbstractC0587p) abstractC4325q10).f5816t0; abstractC4325q11 != null; abstractC4325q11 = abstractC4325q11.f37725k0) {
                                                        if ((abstractC4325q11.f37722h0 & 8192) != 0) {
                                                            i38++;
                                                            if (i38 == 1) {
                                                                abstractC4325q10 = abstractC4325q11;
                                                            } else {
                                                                if (c2104h2 == null) {
                                                                    c2104h2 = new C2104h(new AbstractC4325q[16]);
                                                                }
                                                                if (abstractC4325q10 != null) {
                                                                    c2104h2.b(abstractC4325q10);
                                                                    abstractC4325q10 = null;
                                                                }
                                                                c2104h2.b(abstractC4325q11);
                                                            }
                                                        }
                                                    }
                                                    if (i38 == 1) {
                                                    }
                                                }
                                                abstractC4325q10 = AbstractC0579h.f(c2104h2);
                                            }
                                        }
                                        abstractC4325q9 = abstractC4325q9.f37724j0;
                                    }
                                }
                                A11 = A11.E();
                                if (A11 != null && (c0572a0 = A11.f24831B0) != null) {
                                    abstractC4325q9 = c0572a0.f5703d;
                                } else {
                                    abstractC4325q9 = null;
                                }
                            }
                            if (arrayList != null && arrayList.size() - 1 >= 0) {
                                while (true) {
                                    int i39 = i10 - 1;
                                    if (((AbstractC6740c) arrayList.get(i10)).j(keyEvent)) {
                                        break;
                                    } else if (i39 < 0) {
                                        break;
                                    } else {
                                        i10 = i39;
                                    }
                                }
                            }
                            AbstractC4325q abstractC4325q12 = abstractC4325q.f37720Y;
                            C2104h c2104h3 = null;
                            while (true) {
                                if (abstractC4325q12 != null) {
                                    if (abstractC4325q12 instanceof AbstractC6740c) {
                                        if (((AbstractC6740c) abstractC4325q12).j(keyEvent)) {
                                            break;
                                        }
                                    } else if ((abstractC4325q12.f37722h0 & 8192) != 0 && (abstractC4325q12 instanceof AbstractC0587p)) {
                                        int i40 = 0;
                                        for (AbstractC4325q abstractC4325q13 = ((AbstractC0587p) abstractC4325q12).f5816t0; abstractC4325q13 != null; abstractC4325q13 = abstractC4325q13.f37725k0) {
                                            if ((abstractC4325q13.f37722h0 & 8192) != 0) {
                                                i40++;
                                                if (i40 == 1) {
                                                    abstractC4325q12 = abstractC4325q13;
                                                } else {
                                                    if (c2104h3 == null) {
                                                        c2104h3 = new C2104h(new AbstractC4325q[16]);
                                                    }
                                                    if (abstractC4325q12 != null) {
                                                        c2104h3.b(abstractC4325q12);
                                                        abstractC4325q12 = null;
                                                    }
                                                    c2104h3.b(abstractC4325q13);
                                                }
                                            }
                                        }
                                        if (i40 == 1) {
                                        }
                                    }
                                    abstractC4325q12 = AbstractC0579h.f(c2104h3);
                                } else {
                                    AbstractC4325q abstractC4325q14 = abstractC4325q.f37720Y;
                                    C2104h c2104h4 = null;
                                    while (abstractC4325q14 != null) {
                                        if (abstractC4325q14 instanceof AbstractC6740c) {
                                            if (((AbstractC6740c) abstractC4325q14).x(keyEvent)) {
                                            }
                                        } else if ((abstractC4325q14.f37722h0 & 8192) != 0 && (abstractC4325q14 instanceof AbstractC0587p)) {
                                            int i41 = 0;
                                            for (AbstractC4325q abstractC4325q15 = ((AbstractC0587p) abstractC4325q14).f5816t0; abstractC4325q15 != null; abstractC4325q15 = abstractC4325q15.f37725k0) {
                                                if ((abstractC4325q15.f37722h0 & 8192) != 0) {
                                                    i41++;
                                                    if (i41 == 1) {
                                                        abstractC4325q14 = abstractC4325q15;
                                                    } else {
                                                        if (c2104h4 == null) {
                                                            c2104h4 = new C2104h(new AbstractC4325q[16]);
                                                        }
                                                        if (abstractC4325q14 != null) {
                                                            c2104h4.b(abstractC4325q14);
                                                            abstractC4325q14 = null;
                                                        }
                                                        c2104h4.b(abstractC4325q15);
                                                    }
                                                }
                                            }
                                            if (i41 != 1) {
                                                abstractC4325q14 = AbstractC0579h.f(c2104h4);
                                            }
                                        }
                                        abstractC4325q14 = AbstractC0579h.f(c2104h4);
                                    }
                                    z10 = true;
                                    if (arrayList != null) {
                                        int size = arrayList.size();
                                        for (int i42 = 0; i42 < size; i42++) {
                                            if (((AbstractC6740c) arrayList.get(i42)).x(keyEvent)) {
                                                break;
                                            }
                                        }
                                    }
                                }
                            }
                            z10 = true;
                            return z10;
                        }
                        throw new IllegalStateException("visitAncestors called on an unattached node".toString());
                    }
                    z10 = true;
                    if (!super.dispatchKeyEvent(keyEvent)) {
                    }
                    return z10;
                }
                throw new IllegalStateException("visitLocalDescendants called on an unattached node".toString());
            }
            throw new IllegalStateException("Event can't be processed because we do not have an active focus target.".toString());
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        p0.q f6;
        C0572a0 c0572a0;
        if (isFocused() && (f6 = androidx.compose.ui.focus.a.f(((p0.g) getFocusOwner()).f41681a)) != null) {
            AbstractC4325q abstractC4325q = f6.f37720Y;
            if (abstractC4325q.f37732r0) {
                AbstractC4325q abstractC4325q2 = abstractC4325q.f37724j0;
                androidx.compose.ui.node.a A10 = AbstractC0579h.A(f6);
                while (A10 != null) {
                    if ((A10.f24831B0.f5704e.f37723i0 & 131072) != 0) {
                        while (abstractC4325q2 != null) {
                            if ((abstractC4325q2.f37722h0 & 131072) != 0) {
                                AbstractC4325q abstractC4325q3 = abstractC4325q2;
                                C2104h c2104h = null;
                                while (abstractC4325q3 != null) {
                                    if ((abstractC4325q3.f37722h0 & 131072) != 0 && (abstractC4325q3 instanceof AbstractC0587p)) {
                                        int i10 = 0;
                                        for (AbstractC4325q abstractC4325q4 = ((AbstractC0587p) abstractC4325q3).f5816t0; abstractC4325q4 != null; abstractC4325q4 = abstractC4325q4.f37725k0) {
                                            if ((abstractC4325q4.f37722h0 & 131072) != 0) {
                                                i10++;
                                                if (i10 == 1) {
                                                    abstractC4325q3 = abstractC4325q4;
                                                } else {
                                                    if (c2104h == null) {
                                                        c2104h = new C2104h(new AbstractC4325q[16]);
                                                    }
                                                    if (abstractC4325q3 != null) {
                                                        c2104h.b(abstractC4325q3);
                                                        abstractC4325q3 = null;
                                                    }
                                                    c2104h.b(abstractC4325q4);
                                                }
                                            }
                                        }
                                        if (i10 == 1) {
                                        }
                                    }
                                    abstractC4325q3 = AbstractC0579h.f(c2104h);
                                }
                            }
                            abstractC4325q2 = abstractC4325q2.f37724j0;
                        }
                    }
                    A10 = A10.E();
                    if (A10 != null && (c0572a0 = A10.f24831B0) != null) {
                        abstractC4325q2 = c0572a0.f5703d;
                    } else {
                        abstractC4325q2 = null;
                    }
                }
            } else {
                throw new IllegalStateException("visitAncestors called on an unattached node".toString());
            }
        }
        return super.dispatchKeyEventPreIme(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f7130u1) {
            RunnableC3111d runnableC3111d = this.f7128t1;
            removeCallbacks(runnableC3111d);
            MotionEvent motionEvent2 = this.f7118o1;
            AbstractC3557B.Z(motionEvent2);
            if (motionEvent.getActionMasked() == 0 && motionEvent2.getSource() == motionEvent.getSource() && motionEvent2.getToolType(0) == motionEvent.getToolType(0)) {
                this.f7130u1 = false;
            } else {
                runnableC3111d.run();
            }
        }
        if (k(motionEvent) || !isAttachedToWindow()) {
            return false;
        }
        if (motionEvent.getActionMasked() == 2 && !m(motionEvent)) {
            return false;
        }
        int h10 = h(motionEvent);
        if ((h10 & 2) != 0) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        if ((h10 & 1) == 0) {
            return false;
        }
        return true;
    }

    public final View findViewByAccessibilityIdTraversal(int i10) {
        View view = null;
        try {
            if (Build.VERSION.SDK_INT >= 29) {
                Method declaredMethod = View.class.getDeclaredMethod("findViewByAccessibilityIdTraversal", Integer.TYPE);
                declaredMethod.setAccessible(true);
                Object invoke = declaredMethod.invoke(this, Integer.valueOf(i10));
                if (invoke instanceof View) {
                    view = (View) invoke;
                }
            } else {
                view = g(this, i10);
            }
        } catch (NoSuchMethodException unused) {
        }
        return view;
    }

    public final C0686j0 getAndroidViewsHandler$ui_release() {
        if (this.f7079H0 == null) {
            C0686j0 c0686j0 = new C0686j0(getContext());
            this.f7079H0 = c0686j0;
            addView(c0686j0);
        }
        C0686j0 c0686j02 = this.f7079H0;
        AbstractC3557B.Z(c0686j02);
        return c0686j02;
    }

    public m0.c getAutofill() {
        return this.f7073B0;
    }

    public m0.i getAutofillTree() {
        return this.f7129u0;
    }

    public final wf.k getConfigurationChangeObserver() {
        return this.f7072A0;
    }

    public AbstractC4831k getCoroutineContext() {
        return this.f7103h0;
    }

    public Z0.b getDensity() {
        return this.f7111l0;
    }

    public AbstractC4704c getDragAndDropManager() {
        return this.f7115n0;
    }

    public p0.f getFocusOwner() {
        return this.f7113m0;
    }

    @Override // android.view.View
    public final void getFocusedRect(Rect rect) {
        C5252d c5252d;
        p0.q f6 = androidx.compose.ui.focus.a.f(((p0.g) getFocusOwner()).f41681a);
        jf.y yVar = null;
        if (f6 != null) {
            c5252d = androidx.compose.ui.focus.a.i(f6);
        } else {
            c5252d = null;
        }
        if (c5252d != null) {
            rect.left = AbstractC4344b.Y0(c5252d.f43625a);
            rect.top = AbstractC4344b.Y0(c5252d.f43626b);
            rect.right = AbstractC4344b.Y0(c5252d.f43627c);
            rect.bottom = AbstractC4344b.Y0(c5252d.f43628d);
            yVar = jf.y.f36177a;
        }
        if (yVar == null) {
            super.getFocusedRect(rect);
        }
    }

    public S0.r getFontFamilyResolver() {
        return (S0.r) this.f7104h1.getValue();
    }

    public AbstractC1355p getFontLoader() {
        return this.g1;
    }

    public AbstractC6263a getHapticFeedBack() {
        return this.f7110k1;
    }

    public boolean getHasPendingMeasureOrLayout() {
        return this.f7083L0.f5683b.b();
    }

    public AbstractC6489b getInputModeManager() {
        return this.f7112l1;
    }

    public final long getLastMatrixRecalculationAnimationTime$ui_release() {
        return this.f7090S0;
    }

    @Override // android.view.View, android.view.ViewParent
    public Z0.l getLayoutDirection() {
        return (Z0.l) this.f7108j1.getValue();
    }

    public long getMeasureIteration() {
        G0.V v10 = this.f7083L0;
        if (v10.f5684c) {
            return v10.f5687f;
        }
        throw new IllegalArgumentException("measureIteration should be only used during the measure/layout pass".toString());
    }

    public F0.e getModifierLocalManager() {
        return this.f7114m1;
    }

    public E0.c0 getPlacementScope() {
        int i10 = E0.f0.f4062b;
        return new E0.K(1, this);
    }

    public B0.r getPointerIconService() {
        return this.f7138y1;
    }

    public androidx.compose.ui.node.a getRoot() {
        return this.f7121q0;
    }

    public G0.u0 getRootForTest() {
        return this.f7123r0;
    }

    public L0.p getSemanticsOwner() {
        return this.f7125s0;
    }

    public G0.J getSharedDrawScope() {
        return this.f7109k0;
    }

    public boolean getShowLayoutBounds() {
        return this.f7078G0;
    }

    public G0.r0 getSnapshotObserver() {
        return this.f7077F0;
    }

    public T0 getSoftwareKeyboardController() {
        return this.f7102f1;
    }

    public T0.A getTextInputService() {
        return this.f7100d1;
    }

    public U0 getTextToolbar() {
        return this.f7116n1;
    }

    public Y0 getViewConfiguration() {
        return this.f7084M0;
    }

    public final C0699q getViewTreeOwners() {
        return (C0699q) this.f7095X0.getValue();
    }

    public h1 getWindowInfo() {
        return this.f7117o0;
    }

    public final int h(MotionEvent motionEvent) {
        boolean z10;
        int actionMasked;
        float[] fArr = this.f7088Q0;
        removeCallbacks(this.f7126s1);
        try {
            this.f7090S0 = AnimationUtils.currentAnimationTimeMillis();
            this.f7134w1.a(this, fArr);
            Df.H.Z(fArr, this.f7089R0);
            long b10 = C5335B.b(R4.b.r(motionEvent.getX(), motionEvent.getY()), fArr);
            this.f7092U0 = R4.b.r(motionEvent.getRawX() - C5251c.d(b10), motionEvent.getRawY() - C5251c.e(b10));
            boolean z11 = true;
            this.f7091T0 = true;
            o(false);
            Trace.beginSection("AndroidOwner:onTouch");
            int actionMasked2 = motionEvent.getActionMasked();
            MotionEvent motionEvent2 = this.f7118o1;
            if (motionEvent2 != null && motionEvent2.getToolType(0) == 3) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (motionEvent2 != null && (motionEvent2.getSource() != motionEvent.getSource() || motionEvent2.getToolType(0) != motionEvent.getToolType(0))) {
                if (motionEvent2.getButtonState() == 0 && (actionMasked = motionEvent2.getActionMasked()) != 0 && actionMasked != 2 && actionMasked != 6) {
                    if (motionEvent2.getActionMasked() != 10 && z10) {
                        z(motionEvent2, 10, motionEvent2.getEventTime(), true);
                    }
                }
                this.f7139z0.b();
            }
            if (motionEvent.getToolType(0) != 3) {
                z11 = false;
            }
            if (!z10 && z11 && actionMasked2 != 3 && actionMasked2 != 9 && l(motionEvent)) {
                z(motionEvent, 9, motionEvent.getEventTime(), true);
            }
            if (motionEvent2 != null) {
                motionEvent2.recycle();
            }
            this.f7118o1 = MotionEvent.obtainNoHistory(motionEvent);
            int y10 = y(motionEvent);
            Trace.endSection();
            return y10;
        } finally {
            this.f7091T0 = false;
        }
    }

    public final void j(androidx.compose.ui.node.a aVar) {
        int i10 = 0;
        this.f7083L0.r(aVar, false);
        C2104h J10 = aVar.J();
        int i11 = J10.f25569h0;
        if (i11 > 0) {
            Object[] objArr = J10.f25567Y;
            do {
                j((androidx.compose.ui.node.a) objArr[i10]);
                i10++;
            } while (i10 < i11);
        }
    }

    public final boolean l(MotionEvent motionEvent) {
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        if (0.0f <= x10 && x10 <= getWidth() && 0.0f <= y10 && y10 <= getHeight()) {
            return true;
        }
        return false;
    }

    public final boolean m(MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        if (motionEvent.getPointerCount() != 1 || (motionEvent2 = this.f7118o1) == null || motionEvent2.getPointerCount() != motionEvent.getPointerCount() || motionEvent.getRawX() != motionEvent2.getRawX() || motionEvent.getRawY() != motionEvent2.getRawY()) {
            return true;
        }
        return false;
    }

    public final long n(long j6) {
        v();
        long b10 = C5335B.b(j6, this.f7088Q0);
        return R4.b.r(C5251c.d(this.f7092U0) + C5251c.d(b10), C5251c.e(this.f7092U0) + C5251c.e(b10));
    }

    public final void o(boolean z10) {
        C0710w c0710w;
        G0.V v10 = this.f7083L0;
        if (v10.f5683b.b() || v10.f5685d.f5812a.l()) {
            Trace.beginSection("AndroidOwner:measureAndLayout");
            if (z10) {
                try {
                    c0710w = this.f7132v1;
                } catch (Throwable th2) {
                    Trace.endSection();
                    throw th2;
                }
            } else {
                c0710w = null;
            }
            if (v10.i(c0710w)) {
                requestLayout();
            }
            v10.b(false);
            Trace.endSection();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [android.view.translation.ViewTranslationCallback, java.lang.Object] */
    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        int i10;
        AbstractC2086v abstractC2086v;
        androidx.lifecycle.S h10;
        AbstractC2086v abstractC2086v2;
        C4543a c4543a;
        super.onAttachedToWindow();
        j(getRoot());
        i(getRoot());
        C3876A c3876a = getSnapshotObserver().f5821a;
        c3876a.getClass();
        int i11 = AbstractC3893i.f35891e;
        c3876a.f35832g = io.sentry.hints.i.f(c3876a.f35829d);
        if (d() && (c4543a = this.f7073B0) != null) {
            m0.g.f38805a.a(c4543a);
        }
        AbstractC2086v A10 = K4.J.A(this);
        A3.f t10 = AbstractC5260f.t(this);
        C0699q viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners == null || (A10 != null && t10 != null && (A10 != (abstractC2086v2 = viewTreeOwners.f6989a) || t10 != abstractC2086v2))) {
            if (A10 != null) {
                if (t10 != null) {
                    if (viewTreeOwners != null && (abstractC2086v = viewTreeOwners.f6989a) != null && (h10 = abstractC2086v.h()) != null) {
                        h10.g(this);
                    }
                    A10.h().a(this);
                    C0699q c0699q = new C0699q(A10, t10);
                    set_viewTreeOwners(c0699q);
                    wf.k kVar = this.f7096Y0;
                    if (kVar != null) {
                        kVar.invoke(c0699q);
                    }
                    this.f7096Y0 = null;
                } else {
                    throw new IllegalStateException("Composed into the View which doesn't propagateViewTreeSavedStateRegistryOwner!");
                }
            } else {
                throw new IllegalStateException("Composed into the View which doesn't propagate ViewTreeLifecycleOwner!");
            }
        }
        if (isInTouchMode()) {
            i10 = 1;
        } else {
            i10 = 2;
        }
        C6490c c6490c = this.f7112l1;
        c6490c.getClass();
        c6490c.f50320a.setValue(new C6488a(i10));
        C0699q viewTreeOwners2 = getViewTreeOwners();
        AbstractC3557B.Z(viewTreeOwners2);
        viewTreeOwners2.f6989a.h().a(this);
        C0699q viewTreeOwners3 = getViewTreeOwners();
        AbstractC3557B.Z(viewTreeOwners3);
        viewTreeOwners3.f6989a.h().a(this.f7127t0);
        getViewTreeObserver().addOnGlobalLayoutListener(this.f7097Z0);
        getViewTreeObserver().addOnScrollChangedListener(this.f7098a1);
        getViewTreeObserver().addOnTouchModeChangeListener(this.b1);
        if (Build.VERSION.SDK_INT >= 31) {
            V.f6881a.b(this, new Object());
        }
    }

    @Override // android.view.View
    public final boolean onCheckIsTextEditor() {
        AbstractC2469q0.p(this.f7101e1.get());
        return this.f7099c1.f16741d;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        int i10;
        super.onConfigurationChanged(configuration);
        this.f7111l0 = R4.b.j(getContext());
        int i11 = Build.VERSION.SDK_INT;
        int i12 = 0;
        if (i11 >= 31) {
            i10 = A1.b.a(configuration);
        } else {
            i10 = 0;
        }
        if (i10 != this.f7106i1) {
            if (i11 >= 31) {
                i12 = A1.b.a(configuration);
            }
            this.f7106i1 = i12;
            setFontFamilyResolver(kotlin.jvm.internal.m.t(getContext()));
        }
        this.f7072A0.invoke(configuration);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onCreate(AbstractC2086v abstractC2086v) {
        AbstractC2072g.a(this, abstractC2086v);
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0028, code lost:
        if (r13 != false) goto L8;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        AbstractC2469q0.p(this.f7101e1.get());
        T0.D d10 = this.f7099c1;
        if (!d10.f16741d) {
            return null;
        }
        T0.o oVar = d10.f16745h;
        T0.z zVar = d10.f16744g;
        int i10 = oVar.f16807e;
        boolean a5 = T0.n.a(i10, 1);
        int i11 = 0;
        boolean z10 = oVar.f16803a;
        if (!a5) {
            if (T0.n.a(i10, 0)) {
                i11 = 1;
            } else if (T0.n.a(i10, 2)) {
                i11 = 2;
            } else if (T0.n.a(i10, 6)) {
                i11 = 5;
            } else if (T0.n.a(i10, 5)) {
                i11 = 7;
            } else if (T0.n.a(i10, 3)) {
                i11 = 3;
            } else if (T0.n.a(i10, 4)) {
                i11 = 4;
            } else {
                if (!T0.n.a(i10, 7)) {
                    throw new IllegalStateException("invalid ImeAction".toString());
                }
                i11 = 6;
            }
            editorInfo.imeOptions = i11;
            int i12 = oVar.f16806d;
            if (AbstractC5260f.r(i12, 1)) {
                editorInfo.inputType = 1;
            } else if (AbstractC5260f.r(i12, 2)) {
                editorInfo.inputType = 1;
                editorInfo.imeOptions |= Integer.MIN_VALUE;
            } else if (AbstractC5260f.r(i12, 3)) {
                editorInfo.inputType = 2;
            } else if (AbstractC5260f.r(i12, 4)) {
                editorInfo.inputType = 3;
            } else if (AbstractC5260f.r(i12, 5)) {
                editorInfo.inputType = 17;
            } else if (AbstractC5260f.r(i12, 6)) {
                editorInfo.inputType = 33;
            } else if (AbstractC5260f.r(i12, 7)) {
                editorInfo.inputType = 129;
            } else if (AbstractC5260f.r(i12, 8)) {
                editorInfo.inputType = 18;
            } else if (AbstractC5260f.r(i12, 9)) {
                editorInfo.inputType = 8194;
            } else {
                throw new IllegalStateException("Invalid Keyboard Type".toString());
            }
            if (!z10) {
                int i13 = editorInfo.inputType;
                if ((i13 & 1) == 1) {
                    editorInfo.inputType = i13 | 131072;
                    if (T0.n.a(oVar.f16807e, 1)) {
                        editorInfo.imeOptions |= 1073741824;
                    }
                }
            }
            if ((editorInfo.inputType & 1) == 1) {
                int i14 = oVar.f16804b;
                if (AbstractC4828h.G(i14, 1)) {
                    editorInfo.inputType |= 4096;
                } else if (AbstractC4828h.G(i14, 2)) {
                    editorInfo.inputType |= 8192;
                } else if (AbstractC4828h.G(i14, 3)) {
                    editorInfo.inputType |= 16384;
                }
                if (oVar.f16805c) {
                    editorInfo.inputType |= 32768;
                }
            }
            long j6 = zVar.f16831b;
            int i15 = N0.D.f12484c;
            editorInfo.initialSelStart = (int) (j6 >> 32);
            editorInfo.initialSelEnd = (int) (j6 & 4294967295L);
            G1.c.a(editorInfo, zVar.f16830a.f12512Y);
            editorInfo.imeOptions |= 33554432;
            if (Q1.l.c()) {
                Q1.l a10 = Q1.l.a();
                if (a10.b() == 1) {
                    if (editorInfo.extras == null) {
                        editorInfo.extras = new Bundle();
                    }
                    a10.f14331e.M(editorInfo);
                }
            }
            T0.v vVar = new T0.v(d10.f16744g, new T0.C(d10), d10.f16745h.f16805c);
            d10.f16746i.add(new WeakReference(vVar));
            return vVar;
        }
    }

    @Override // android.view.View
    public final void onCreateVirtualViewTranslationRequests(long[] jArr, int[] iArr, Consumer consumer) {
        O o10 = this.f7127t0;
        o10.getClass();
        J.f6759a.b(o10, jArr, iArr, consumer);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onDestroy(AbstractC2086v abstractC2086v) {
        AbstractC2072g.b(this, abstractC2086v);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        C4543a c4543a;
        AbstractC2086v abstractC2086v;
        androidx.lifecycle.S h10;
        AbstractC2086v abstractC2086v2;
        androidx.lifecycle.S h11;
        super.onDetachedFromWindow();
        C3876A c3876a = getSnapshotObserver().f5821a;
        C3892h c3892h = c3876a.f35832g;
        if (c3892h != null) {
            c3892h.a();
        }
        c3876a.b();
        C0699q viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners != null && (abstractC2086v2 = viewTreeOwners.f6989a) != null && (h11 = abstractC2086v2.h()) != null) {
            h11.g(this);
        }
        C0699q viewTreeOwners2 = getViewTreeOwners();
        if (viewTreeOwners2 != null && (abstractC2086v = viewTreeOwners2.f6989a) != null && (h10 = abstractC2086v.h()) != null) {
            h10.g(this.f7127t0);
        }
        if (d() && (c4543a = this.f7073B0) != null) {
            m0.g.f38805a.b(c4543a);
        }
        getViewTreeObserver().removeOnGlobalLayoutListener(this.f7097Z0);
        getViewTreeObserver().removeOnScrollChangedListener(this.f7098a1);
        getViewTreeObserver().removeOnTouchModeChangeListener(this.b1);
        if (Build.VERSION.SDK_INT >= 31) {
            V.f6881a.a(this);
        }
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z10, int i10, Rect rect) {
        super.onFocusChanged(z10, i10, rect);
        Log.d("Compose Focus", "Owner FocusChanged(" + z10 + ')');
        p0.r rVar = ((p0.g) getFocusOwner()).f41683c;
        rVar.f41715b.b(new C3280f(z10, this, 2));
        boolean z11 = rVar.f41716c;
        p0.p pVar = p0.p.f41707Y;
        p0.p pVar2 = p0.p.f41709h0;
        if (z11) {
            if (z10) {
                p0.q qVar = ((p0.g) getFocusOwner()).f41681a;
                if (qVar.B0() == pVar2) {
                    qVar.E0(pVar);
                    return;
                }
                return;
            }
            androidx.compose.ui.focus.a.d(((p0.g) getFocusOwner()).f41681a, true, true);
            return;
        }
        try {
            rVar.f41716c = true;
            if (z10) {
                p0.q qVar2 = ((p0.g) getFocusOwner()).f41681a;
                if (qVar2.B0() == pVar2) {
                    qVar2.E0(pVar);
                }
            } else {
                androidx.compose.ui.focus.a.d(((p0.g) getFocusOwner()).f41681a, true, true);
            }
            p0.r.b(rVar);
        } catch (Throwable th2) {
            p0.r.b(rVar);
            throw th2;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        this.f7083L0.i(this.f7132v1);
        this.f7081J0 = null;
        A();
        if (this.f7079H0 != null) {
            getAndroidViewsHandler$ui_release().layout(0, 0, i12 - i10, i13 - i11);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        G0.V v10 = this.f7083L0;
        Trace.beginSection("AndroidOwner:onMeasure");
        try {
            if (!isAttachedToWindow()) {
                j(getRoot());
            }
            long f6 = f(i10);
            long f10 = f(i11);
            long m10 = A7.b.m((int) (f6 >>> 32), (int) (f6 & 4294967295L), (int) (f10 >>> 32), (int) (4294967295L & f10));
            Z0.a aVar = this.f7081J0;
            if (aVar == null) {
                this.f7081J0 = new Z0.a(m10);
                this.f7082K0 = false;
            } else if (!Z0.a.b(aVar.f22782a, m10)) {
                this.f7082K0 = true;
            }
            v10.s(m10);
            v10.k();
            setMeasuredDimension(getRoot().G(), getRoot().s());
            if (this.f7079H0 != null) {
                getAndroidViewsHandler$ui_release().measure(View.MeasureSpec.makeMeasureSpec(getRoot().G(), 1073741824), View.MeasureSpec.makeMeasureSpec(getRoot().s(), 1073741824));
            }
            Trace.endSection();
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onPause(AbstractC2086v abstractC2086v) {
        AbstractC2072g.c(this, abstractC2086v);
    }

    @Override // android.view.View
    public final void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i10) {
        C4543a c4543a;
        if (d() && viewStructure != null && (c4543a = this.f7073B0) != null) {
            m0.d dVar = m0.d.f38803a;
            m0.i iVar = c4543a.f38800b;
            int a5 = dVar.a(viewStructure, iVar.f38812a.size());
            int i11 = a5;
            for (Map.Entry entry : iVar.f38812a.entrySet()) {
                int intValue = ((Number) entry.getKey()).intValue();
                m0.h hVar = (m0.h) entry.getValue();
                ViewStructure b10 = dVar.b(viewStructure, i11);
                if (b10 != null) {
                    m0.f fVar = m0.f.f38804a;
                    AutofillId a10 = fVar.a(viewStructure);
                    AbstractC3557B.Z(a10);
                    fVar.g(b10, a10, intValue);
                    dVar.d(b10, intValue, c4543a.f38799a.getContext().getPackageName(), null, null);
                    fVar.h(b10, 1);
                    List list = hVar.f38808a;
                    ArrayList arrayList = new ArrayList(list.size());
                    int size = list.size();
                    for (int i12 = 0; i12 < size; i12++) {
                        String str = (String) m0.b.f38802a.get((m0.j) list.get(i12));
                        if (str != null) {
                            arrayList.add(str);
                        } else {
                            throw new IllegalArgumentException("Unsupported autofill type".toString());
                        }
                    }
                    fVar.f(b10, (String[]) arrayList.toArray(new String[0]));
                    C5252d c5252d = hVar.f38809b;
                    if (c5252d == null) {
                        AbstractC3612c.r("Autofill Warning", "Bounding box not set.\n                        Did you call perform autofillTree before the component was positioned? ");
                    } else {
                        int Y02 = AbstractC4344b.Y0(c5252d.f43625a);
                        int Y03 = AbstractC4344b.Y0(c5252d.f43626b);
                        dVar.c(b10, Y02, Y03, 0, 0, AbstractC4344b.Y0(c5252d.f43627c) - Y02, AbstractC4344b.Y0(c5252d.f43628d) - Y03);
                    }
                }
                i11++;
            }
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onResume(AbstractC2086v abstractC2086v) {
        setShowLayoutBounds(B0.a());
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i10) {
        if (this.f7107j0) {
            Z0.l lVar = Z0.l.f22805Y;
            if (i10 != 0 && i10 == 1) {
                lVar = Z0.l.f22806Z;
            }
            setLayoutDirection(lVar);
            ((p0.g) getFocusOwner()).f41685e = lVar;
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onStart(AbstractC2086v abstractC2086v) {
        AbstractC2072g.e(this, abstractC2086v);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onStop(AbstractC2086v abstractC2086v) {
        AbstractC2072g.f(this, abstractC2086v);
    }

    @Override // android.view.View
    public final void onVirtualViewTranslationResponses(LongSparseArray longSparseArray) {
        O o10 = this.f7127t0;
        o10.getClass();
        J.f6759a.c(o10, longSparseArray);
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z10) {
        boolean a5;
        this.f7117o0.f6963a.setValue(Boolean.valueOf(z10));
        this.f7136x1 = true;
        super.onWindowFocusChanged(z10);
        if (z10 && getShowLayoutBounds() != (a5 = B0.a())) {
            setShowLayoutBounds(a5);
            i(getRoot());
        }
    }

    public final void p(androidx.compose.ui.node.a aVar, long j6) {
        G0.V v10 = this.f7083L0;
        Trace.beginSection("AndroidOwner:measureAndLayout");
        try {
            v10.j(aVar, j6);
            if (!v10.f5683b.b()) {
                v10.b(false);
            }
        } finally {
            Trace.endSection();
        }
    }

    public final void q(G0.n0 n0Var, boolean z10) {
        ArrayList arrayList = this.f7131v0;
        if (!z10) {
            if (!this.f7135x0) {
                arrayList.remove(n0Var);
                ArrayList arrayList2 = this.f7133w0;
                if (arrayList2 != null) {
                    arrayList2.remove(n0Var);
                }
            }
        } else if (!this.f7135x0) {
            arrayList.add(n0Var);
        } else {
            ArrayList arrayList3 = this.f7133w0;
            if (arrayList3 == null) {
                arrayList3 = new ArrayList();
                this.f7133w0 = arrayList3;
            }
            arrayList3.add(n0Var);
        }
    }

    public final void r() {
        boolean z10;
        if (this.f7074C0) {
            C3876A c3876a = getSnapshotObserver().f5821a;
            synchronized (c3876a.f35831f) {
                try {
                    C2104h c2104h = c3876a.f35831f;
                    int i10 = c2104h.f25569h0;
                    int i11 = 0;
                    for (int i12 = 0; i12 < i10; i12++) {
                        j0.z zVar = (j0.z) c2104h.f25567Y[i12];
                        zVar.e();
                        if (zVar.f35947f.f47635e != 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (!z10) {
                            i11++;
                        } else if (i11 > 0) {
                            Object[] objArr = c2104h.f25567Y;
                            objArr[i12 - i11] = objArr[i12];
                        }
                    }
                    int i13 = i10 - i11;
                    kf.q.d3(i13, i10, null, c2104h.f25567Y);
                    c2104h.f25569h0 = i13;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            this.f7074C0 = false;
        }
        C0686j0 c0686j0 = this.f7079H0;
        if (c0686j0 != null) {
            e(c0686j0);
        }
        while (this.f7124r1.l()) {
            int i14 = this.f7124r1.f25569h0;
            for (int i15 = 0; i15 < i14; i15++) {
                C2104h c2104h2 = this.f7124r1;
                AbstractC6216a abstractC6216a = (AbstractC6216a) c2104h2.f25567Y[i15];
                c2104h2.p(i15, null);
                if (abstractC6216a != null) {
                    abstractC6216a.mo122invoke();
                }
            }
            this.f7124r1.o(0, i14);
        }
    }

    public final void s(androidx.compose.ui.node.a aVar) {
        O o10 = this.f7127t0;
        o10.f6799C0 = true;
        if (o10.z() || o10.f6800D0 != null) {
            o10.C(aVar);
        }
    }

    public final void setConfigurationChangeObserver(wf.k kVar) {
        this.f7072A0 = kVar;
    }

    public final void setLastMatrixRecalculationAnimationTime$ui_release(long j6) {
        this.f7090S0 = j6;
    }

    public final void setOnViewTreeOwnersAvailable(wf.k kVar) {
        C0699q viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners != null) {
            kVar.invoke(viewTreeOwners);
        }
        if (!isAttachedToWindow()) {
            this.f7096Y0 = kVar;
        }
    }

    public void setShowLayoutBounds(boolean z10) {
        this.f7078G0 = z10;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public final void t(androidx.compose.ui.node.a aVar, boolean z10, boolean z11, boolean z12) {
        G0.V v10 = this.f7083L0;
        if (z10) {
            if (v10.p(aVar, z11) && z12) {
                w(aVar);
            }
        } else if (v10.r(aVar, z11) && z12) {
            w(aVar);
        }
    }

    public final void u() {
        O o10 = this.f7127t0;
        o10.f6799C0 = true;
        if ((o10.z() || o10.f6800D0 != null) && !o10.f6813Q0) {
            o10.f6813Q0 = true;
            o10.f6825p0.post(o10.f6814R0);
        }
    }

    public final void v() {
        if (!this.f7091T0) {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            if (currentAnimationTimeMillis != this.f7090S0) {
                this.f7090S0 = currentAnimationTimeMillis;
                AbstractC0690l0 abstractC0690l0 = this.f7134w1;
                float[] fArr = this.f7088Q0;
                abstractC0690l0.a(this, fArr);
                Df.H.Z(fArr, this.f7089R0);
                ViewParent parent = getParent();
                View view = this;
                while (parent instanceof ViewGroup) {
                    view = (View) parent;
                    parent = ((ViewGroup) view).getParent();
                }
                int[] iArr = this.f7086O0;
                view.getLocationOnScreen(iArr);
                view.getLocationInWindow(iArr);
                this.f7092U0 = R4.b.r(iArr[0] - iArr[0], iArr[1] - iArr[1]);
            }
        }
    }

    public final void w(androidx.compose.ui.node.a aVar) {
        if (!isLayoutRequested() && isAttachedToWindow()) {
            if (aVar != null) {
                while (aVar != null && aVar.B() == 1) {
                    if (!this.f7082K0) {
                        androidx.compose.ui.node.a E10 = aVar.E();
                        if (E10 == null) {
                            break;
                        }
                        long j6 = E10.f24831B0.f5701b.f4056i0;
                        if (Z0.a.f(j6) && Z0.a.e(j6)) {
                            break;
                        }
                    }
                    aVar = aVar.E();
                }
                if (aVar == getRoot()) {
                    requestLayout();
                    return;
                }
            }
            if (getWidth() != 0 && getHeight() != 0) {
                invalidate();
            } else {
                requestLayout();
            }
        }
    }

    public final long x(long j6) {
        v();
        float d10 = C5251c.d(j6) - C5251c.d(this.f7092U0);
        float e10 = C5251c.e(j6) - C5251c.e(this.f7092U0);
        return C5335B.b(R4.b.r(d10, e10), this.f7089R0);
    }

    public final int y(MotionEvent motionEvent) {
        Object obj;
        int i10 = 0;
        if (this.f7136x1) {
            this.f7136x1 = false;
            int metaState = motionEvent.getMetaState();
            this.f7117o0.getClass();
            i1.f6962b.setValue(new B0.F(metaState));
        }
        C0190g c0190g = this.f7137y0;
        B0.w a5 = c0190g.a(motionEvent, this);
        B0.y yVar = this.f7139z0;
        if (a5 != null) {
            List list = a5.f1686a;
            int size = list.size() - 1;
            if (size >= 0) {
                while (true) {
                    int i11 = size - 1;
                    obj = list.get(size);
                    if (((B0.x) obj).f1692e) {
                        break;
                    } else if (i11 < 0) {
                        break;
                    } else {
                        size = i11;
                    }
                }
            }
            obj = null;
            B0.x xVar = (B0.x) obj;
            if (xVar != null) {
                this.f7105i0 = xVar.f1691d;
            }
            i10 = yVar.a(a5, this, l(motionEvent));
            int actionMasked = motionEvent.getActionMasked();
            if ((actionMasked == 0 || actionMasked == 5) && (i10 & 1) == 0) {
                int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
                c0190g.f1638c.delete(pointerId);
                c0190g.f1637b.delete(pointerId);
            }
        } else {
            yVar.b();
        }
        return i10;
    }

    public final void z(MotionEvent motionEvent, int i10, long j6, boolean z10) {
        int i11;
        int i12;
        long j10;
        int i13;
        int actionMasked = motionEvent.getActionMasked();
        int i14 = -1;
        if (actionMasked != 1) {
            if (actionMasked == 6) {
                i14 = motionEvent.getActionIndex();
            }
        } else if (i10 != 9 && i10 != 10) {
            i14 = 0;
        }
        int pointerCount = motionEvent.getPointerCount();
        if (i14 >= 0) {
            i11 = 1;
        } else {
            i11 = 0;
        }
        int i15 = pointerCount - i11;
        if (i15 == 0) {
            return;
        }
        MotionEvent.PointerProperties[] pointerPropertiesArr = new MotionEvent.PointerProperties[i15];
        for (int i16 = 0; i16 < i15; i16++) {
            pointerPropertiesArr[i16] = new MotionEvent.PointerProperties();
        }
        MotionEvent.PointerCoords[] pointerCoordsArr = new MotionEvent.PointerCoords[i15];
        for (int i17 = 0; i17 < i15; i17++) {
            pointerCoordsArr[i17] = new MotionEvent.PointerCoords();
        }
        for (int i18 = 0; i18 < i15; i18++) {
            if (i14 >= 0 && i18 >= i14) {
                i13 = 1;
            } else {
                i13 = 0;
            }
            int i19 = i13 + i18;
            motionEvent.getPointerProperties(i19, pointerPropertiesArr[i18]);
            MotionEvent.PointerCoords pointerCoords = pointerCoordsArr[i18];
            motionEvent.getPointerCoords(i19, pointerCoords);
            long n10 = n(R4.b.r(pointerCoords.x, pointerCoords.y));
            pointerCoords.x = C5251c.d(n10);
            pointerCoords.y = C5251c.e(n10);
        }
        if (z10) {
            i12 = 0;
        } else {
            i12 = motionEvent.getButtonState();
        }
        if (motionEvent.getDownTime() == motionEvent.getEventTime()) {
            j10 = j6;
        } else {
            j10 = motionEvent.getDownTime();
        }
        MotionEvent obtain = MotionEvent.obtain(j10, j6, i10, i15, pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), i12, motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags());
        B0.w a5 = this.f7137y0.a(obtain, this);
        AbstractC3557B.Z(a5);
        this.f7139z0.a(a5, this, true);
        obtain.recycle();
    }

    public C0687k getAccessibilityManager() {
        return this.f7076E0;
    }

    public C0689l getClipboardManager() {
        return this.f7075D0;
    }

    public static /* synthetic */ void getFontLoader$annotations() {
    }

    public static /* synthetic */ void getLastMatrixRecalculationAnimationTime$ui_release$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    public View getView() {
        return this;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
    }
}
