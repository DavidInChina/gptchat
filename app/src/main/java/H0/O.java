package H0;

import D1.C0343c;
import G0.AbstractC0579h;
import N0.C1046e;
import Pg.C1171d;
import android.accessibilityservice.AccessibilityServiceInfo;
import android.gov.nist.core.Separators;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.SpannableString;
import android.view.View;
import android.view.ViewStructure;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import androidx.lifecycle.AbstractC2072g;
import androidx.lifecycle.AbstractC2086v;
import androidx.lifecycle.DefaultLifecycleObserver;
import com.openai.chatgpt.R;
import g.RunnableC3111d;
import id.AbstractC3557B;
import io.sentry.C3636c1;
import io.sentry.android.core.AbstractC3612c;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import jf.C3959i;
import l8.AbstractC4344b;
import nf.AbstractC4825e;
import of.EnumC5000a;
import p.View$OnAttachStateChangeListenerC5030f;
import q0.C5251c;
import q0.C5252d;
import w.C6049A;
import w.C6050B;
import w.C6059f;
import w.C6060g;
import wf.AbstractC6216a;

/* loaded from: classes2.dex */
public final class O extends C0343c implements DefaultLifecycleObserver {

    /* renamed from: V0 */
    public static final int[] f6796V0 = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};

    /* renamed from: D0 */
    public C3636c1 f6800D0;

    /* renamed from: G0 */
    public F f6803G0;

    /* renamed from: H0 */
    public Map f6804H0;

    /* renamed from: P0 */
    public H f6812P0;

    /* renamed from: Q0 */
    public boolean f6813Q0;

    /* renamed from: i0 */
    public final C0714y f6818i0;

    /* renamed from: l0 */
    public final AccessibilityManager f6821l0;

    /* renamed from: o0 */
    public List f6824o0;

    /* renamed from: s0 */
    public AccessibilityNodeInfo f6828s0;

    /* renamed from: t0 */
    public boolean f6829t0;

    /* renamed from: z0 */
    public Integer f6835z0;

    /* renamed from: j0 */
    public int f6819j0 = Integer.MIN_VALUE;

    /* renamed from: k0 */
    public final L f6820k0 = new L(this, 0);

    /* renamed from: m0 */
    public final accessibility.AccessibilityManager$AccessibilityStateChangeListenerC0716z f6822m0 = new AccessibilityManager.AccessibilityStateChangeListener() { // from class: H0.z
        @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
        public final void onAccessibilityStateChanged(boolean z10) {
            List<AccessibilityServiceInfo> list;
            O o10 = O.this;
            if (z10) {
                list = o10.f6821l0.getEnabledAccessibilityServiceList(-1);
            } else {
                list = kf.v.f37483Y;
            }
            o10.f6824o0 = list;
        }
    };

    /* renamed from: n0 */
    public final A f6823n0 = new AccessibilityManager.TouchExplorationStateChangeListener() { // from class: H0.A
        @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
        public final void onTouchExplorationStateChanged(boolean z10) {
            O o10 = O.this;
            o10.f6824o0 = o10.f6821l0.getEnabledAccessibilityServiceList(-1);
        }
    };

    /* renamed from: U0 */
    public int f6817U0 = 1;

    /* renamed from: p0 */
    public final Handler f6825p0 = new Handler(Looper.getMainLooper());

    /* renamed from: q0 */
    public final J0.a f6826q0 = new J0.a(new D(this));

    /* renamed from: r0 */
    public int f6827r0 = Integer.MIN_VALUE;

    /* renamed from: u0 */
    public final HashMap f6830u0 = new HashMap();

    /* renamed from: v0 */
    public final HashMap f6831v0 = new HashMap();

    /* renamed from: w0 */
    public final C6050B f6832w0 = new C6050B(0);

    /* renamed from: x0 */
    public final C6050B f6833x0 = new C6050B(0);

    /* renamed from: y0 */
    public int f6834y0 = -1;

    /* renamed from: A0 */
    public final C6060g f6797A0 = new C6060g(0);

    /* renamed from: B0 */
    public final Pg.k f6798B0 = Bi.c.d(1, null, 6);

    /* renamed from: C0 */
    public boolean f6799C0 = true;

    /* renamed from: E0 */
    public final C6059f f6801E0 = new C6049A(0);

    /* renamed from: F0 */
    public final C6060g f6802F0 = new C6060g(0);

    /* renamed from: I0 */
    public final C6060g f6805I0 = new C6060g(0);

    /* renamed from: J0 */
    public final HashMap f6806J0 = new HashMap();

    /* renamed from: K0 */
    public final HashMap f6807K0 = new HashMap();

    /* renamed from: L0 */
    public final String f6808L0 = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL";

    /* renamed from: M0 */
    public final String f6809M0 = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALAFTER_VAL";

    /* renamed from: N0 */
    public final V0.k f6810N0 = new V0.k();

    /* renamed from: O0 */
    public final LinkedHashMap f6811O0 = new LinkedHashMap();

    /* renamed from: R0 */
    public final RunnableC3111d f6814R0 = new RunnableC3111d(6, this);

    /* renamed from: S0 */
    public final ArrayList f6815S0 = new ArrayList();

    /* renamed from: T0 */
    public final L f6816T0 = new L(this, 1);

    /* JADX WARN: Type inference failed for: r0v8, types: [w.A, w.f] */
    /* JADX WARN: Type inference failed for: r3v2, types: [H0.z] */
    /* JADX WARN: Type inference failed for: r3v3, types: [H0.A] */
    public O(C0714y c0714y) {
        this.f6818i0 = c0714y;
        Object systemService = c0714y.getContext().getSystemService("accessibility");
        AbstractC3557B.a0("null cannot be cast to non-null type android.view.accessibility.AccessibilityManager", systemService);
        AccessibilityManager accessibilityManager = (AccessibilityManager) systemService;
        this.f6821l0 = accessibilityManager;
        this.f6824o0 = accessibilityManager.getEnabledAccessibilityServiceList(-1);
        kf.w wVar = kf.w.f37484Y;
        this.f6804H0 = wVar;
        this.f6812P0 = new H(c0714y.getSemanticsOwner().a(), wVar);
        c0714y.addOnAttachStateChangeListener(new View$OnAttachStateChangeListenerC5030f(2, this));
    }

    public static final boolean D(L0.h hVar, float f6) {
        int i10 = (f6 > 0.0f ? 1 : (f6 == 0.0f ? 0 : -1));
        AbstractC6216a abstractC6216a = hVar.f10381a;
        if ((i10 < 0 && ((Number) abstractC6216a.mo122invoke()).floatValue() > 0.0f) || (f6 > 0.0f && ((Number) abstractC6216a.mo122invoke()).floatValue() < ((Number) hVar.f10382b.mo122invoke()).floatValue())) {
            return true;
        }
        return false;
    }

    public static final boolean E(L0.h hVar) {
        AbstractC6216a abstractC6216a = hVar.f10381a;
        int i10 = (((Number) abstractC6216a.mo122invoke()).floatValue() > 0.0f ? 1 : (((Number) abstractC6216a.mo122invoke()).floatValue() == 0.0f ? 0 : -1));
        boolean z10 = hVar.f10383c;
        if ((i10 > 0 && !z10) || (((Number) abstractC6216a.mo122invoke()).floatValue() < ((Number) hVar.f10382b.mo122invoke()).floatValue() && z10)) {
            return true;
        }
        return false;
    }

    public static final boolean F(L0.h hVar) {
        AbstractC6216a abstractC6216a = hVar.f10381a;
        int i10 = (((Number) abstractC6216a.mo122invoke()).floatValue() > ((Number) hVar.f10382b.mo122invoke()).floatValue() ? 1 : (((Number) abstractC6216a.mo122invoke()).floatValue() == ((Number) hVar.f10382b.mo122invoke()).floatValue() ? 0 : -1));
        boolean z10 = hVar.f10383c;
        if ((i10 < 0 && !z10) || (((Number) abstractC6216a.mo122invoke()).floatValue() > 0.0f && z10)) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ void M(O o10, int i10, int i11, Integer num, int i12) {
        if ((i12 & 4) != 0) {
            num = null;
        }
        o10.L(i10, i11, num, null);
    }

    public static CharSequence T(CharSequence charSequence) {
        if (charSequence != null && charSequence.length() != 0) {
            int i10 = 100000;
            if (charSequence.length() > 100000) {
                if (Character.isHighSurrogate(charSequence.charAt(99999)) && Character.isLowSurrogate(charSequence.charAt(100000))) {
                    i10 = 99999;
                }
                CharSequence subSequence = charSequence.subSequence(0, i10);
                AbstractC3557B.a0("null cannot be cast to non-null type T of androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.trimToSize", subSequence);
                return subSequence;
            }
            return charSequence;
        }
        return charSequence;
    }

    public static boolean u(L0.o oVar) {
        boolean z10;
        M0.a aVar = (M0.a) U3.f.T(oVar.f10421d, L0.r.f10441C);
        L0.u uVar = L0.r.f10464t;
        L0.j jVar = oVar.f10421d;
        L0.g gVar = (L0.g) U3.f.T(jVar, uVar);
        boolean z11 = true;
        if (aVar != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        Object obj = jVar.f10409Y.get(L0.r.f10440B);
        if (obj == null) {
            obj = null;
        }
        if (((Boolean) obj) != null) {
            if (gVar != null && L0.g.a(gVar.f10380a, 4)) {
                z11 = z10;
            }
            return z11;
        }
        return z10;
    }

    public static String x(L0.o oVar) {
        C1046e c1046e;
        if (oVar == null) {
            return null;
        }
        L0.u uVar = L0.r.f10446b;
        L0.j jVar = oVar.f10421d;
        if (jVar.f10409Y.containsKey(uVar)) {
            return Gi.e.w((List) jVar.r(uVar), Separators.COMMA, null, 62);
        }
        L0.u uVar2 = L0.i.f10391h;
        LinkedHashMap linkedHashMap = jVar.f10409Y;
        if (linkedHashMap.containsKey(uVar2)) {
            C1046e c1046e2 = (C1046e) U3.f.T(jVar, L0.r.f10469y);
            if (c1046e2 == null) {
                return null;
            }
            return c1046e2.f12512Y;
        }
        Object obj = linkedHashMap.get(L0.r.f10466v);
        if (obj == null) {
            obj = null;
        }
        List list = (List) obj;
        if (list == null || (c1046e = (C1046e) kf.t.h2(list)) == null) {
            return null;
        }
        return c1046e.f12512Y;
    }

    public static N0.C y(L0.j jVar) {
        wf.k kVar;
        ArrayList arrayList = new ArrayList();
        L0.a aVar = (L0.a) U3.f.T(jVar, L0.i.f10384a);
        if (aVar == null || (kVar = (wf.k) aVar.f10369b) == null || !((Boolean) kVar.invoke(arrayList)).booleanValue()) {
            return null;
        }
        return (N0.C) arrayList.get(0);
    }

    public final boolean A(L0.o oVar) {
        String str;
        boolean z10;
        List list = (List) U3.f.T(oVar.f10421d, L0.r.f10446b);
        if (list != null) {
            str = (String) kf.t.h2(list);
        } else {
            str = null;
        }
        if (str == null && w(oVar) == null && v(oVar) == null && !u(oVar)) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!oVar.f10421d.f10410Z) {
            if (oVar.f10422e || !oVar.g(false, true).isEmpty()) {
                return false;
            }
            if (R4.b.u0(oVar.f10420c, L0.n.f10414Z) != null || !z10) {
                return false;
            }
        }
        return true;
    }

    public final void B() {
        C3636c1 c3636c1 = this.f6800D0;
        if (c3636c1 == null || Build.VERSION.SDK_INT < 29) {
            return;
        }
        C6059f c6059f = this.f6801E0;
        if (!c6059f.isEmpty()) {
            List K22 = kf.t.K2(c6059f.values());
            ArrayList arrayList = new ArrayList(K22.size());
            int size = K22.size();
            for (int i10 = 0; i10 < size; i10++) {
                arrayList.add(((J0.i) K22.get(i10)).f8730a);
            }
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 34) {
                J0.d.a(AbstractC0668a1.j(c3636c1.f34285Z), arrayList);
            } else if (i11 >= 29) {
                ViewStructure b10 = J0.c.b(AbstractC0668a1.j(c3636c1.f34285Z), (View) c3636c1.f34286h0);
                J0.b.a(b10).putBoolean("TREAT_AS_VIEW_TREE_APPEARING", true);
                J0.c.d(AbstractC0668a1.j(c3636c1.f34285Z), b10);
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    J0.c.d(AbstractC0668a1.j(c3636c1.f34285Z), (ViewStructure) arrayList.get(i12));
                }
                ViewStructure b11 = J0.c.b(AbstractC0668a1.j(c3636c1.f34285Z), (View) c3636c1.f34286h0);
                J0.b.a(b11).putBoolean("TREAT_AS_VIEW_TREE_APPEARED", true);
                J0.c.d(AbstractC0668a1.j(c3636c1.f34285Z), b11);
            }
            c6059f.clear();
        }
        C6060g c6060g = this.f6802F0;
        if (!c6060g.isEmpty()) {
            List K23 = kf.t.K2(c6060g);
            ArrayList arrayList2 = new ArrayList(K23.size());
            int size2 = K23.size();
            for (int i13 = 0; i13 < size2; i13++) {
                arrayList2.add(Long.valueOf(((Number) K23.get(i13)).intValue()));
            }
            long[] L22 = kf.t.L2(arrayList2);
            int i14 = Build.VERSION.SDK_INT;
            if (i14 >= 34) {
                ContentCaptureSession j6 = AbstractC0668a1.j(c3636c1.f34285Z);
                J0.a I02 = A7.b.I0((View) c3636c1.f34286h0);
                Objects.requireNonNull(I02);
                J0.c.f(j6, A7.a.f(I02.f8729Y), L22);
            } else if (i14 >= 29) {
                ViewStructure b12 = J0.c.b(AbstractC0668a1.j(c3636c1.f34285Z), (View) c3636c1.f34286h0);
                J0.b.a(b12).putBoolean("TREAT_AS_VIEW_TREE_APPEARING", true);
                J0.c.d(AbstractC0668a1.j(c3636c1.f34285Z), b12);
                ContentCaptureSession j10 = AbstractC0668a1.j(c3636c1.f34285Z);
                J0.a I03 = A7.b.I0((View) c3636c1.f34286h0);
                Objects.requireNonNull(I03);
                J0.c.f(j10, A7.a.f(I03.f8729Y), L22);
                ViewStructure b13 = J0.c.b(AbstractC0668a1.j(c3636c1.f34285Z), (View) c3636c1.f34286h0);
                J0.b.a(b13).putBoolean("TREAT_AS_VIEW_TREE_APPEARED", true);
                J0.c.d(AbstractC0668a1.j(c3636c1.f34285Z), b13);
            }
            c6060g.clear();
        }
    }

    public final void C(androidx.compose.ui.node.a aVar) {
        if (this.f6797A0.add(aVar)) {
            this.f6798B0.t(jf.y.f36177a);
        }
    }

    public final int G(int i10) {
        if (i10 == this.f6818i0.getSemanticsOwner().a().f10424g) {
            return -1;
        }
        return i10;
    }

    public final void H(L0.o oVar, H h10) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        List g10 = oVar.g(false, true);
        int size = g10.size();
        int i10 = 0;
        while (true) {
            androidx.compose.ui.node.a aVar = oVar.f10420c;
            if (i10 < size) {
                L0.o oVar2 = (L0.o) g10.get(i10);
                if (t().containsKey(Integer.valueOf(oVar2.f10424g))) {
                    LinkedHashSet linkedHashSet2 = h10.f6739c;
                    int i11 = oVar2.f10424g;
                    if (!linkedHashSet2.contains(Integer.valueOf(i11))) {
                        C(aVar);
                        return;
                    }
                    linkedHashSet.add(Integer.valueOf(i11));
                }
                i10++;
            } else {
                for (Number number : h10.f6739c) {
                    if (!linkedHashSet.contains(Integer.valueOf(number.intValue()))) {
                        C(aVar);
                        return;
                    }
                }
                List g11 = oVar.g(false, true);
                int size2 = g11.size();
                for (int i12 = 0; i12 < size2; i12++) {
                    L0.o oVar3 = (L0.o) g11.get(i12);
                    if (t().containsKey(Integer.valueOf(oVar3.f10424g))) {
                        Object obj = this.f6811O0.get(Integer.valueOf(oVar3.f10424g));
                        AbstractC3557B.Z(obj);
                        H(oVar3, (H) obj);
                    }
                }
                return;
            }
        }
    }

    public final void I(L0.o oVar, H h10) {
        List g10 = oVar.g(false, true);
        int size = g10.size();
        for (int i10 = 0; i10 < size; i10++) {
            L0.o oVar2 = (L0.o) g10.get(i10);
            if (t().containsKey(Integer.valueOf(oVar2.f10424g)) && !h10.f6739c.contains(Integer.valueOf(oVar2.f10424g))) {
                U(oVar2);
            }
        }
        LinkedHashMap linkedHashMap = this.f6811O0;
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            if (!t().containsKey(entry.getKey())) {
                int intValue = ((Number) entry.getKey()).intValue();
                Integer valueOf = Integer.valueOf(intValue);
                C6059f c6059f = this.f6801E0;
                if (c6059f.containsKey(valueOf)) {
                    c6059f.remove(Integer.valueOf(intValue));
                } else {
                    this.f6802F0.add(Integer.valueOf(intValue));
                }
            }
        }
        List g11 = oVar.g(false, true);
        int size2 = g11.size();
        for (int i11 = 0; i11 < size2; i11++) {
            L0.o oVar3 = (L0.o) g11.get(i11);
            if (t().containsKey(Integer.valueOf(oVar3.f10424g))) {
                int i12 = oVar3.f10424g;
                if (linkedHashMap.containsKey(Integer.valueOf(i12))) {
                    Object obj = linkedHashMap.get(Integer.valueOf(i12));
                    AbstractC3557B.Z(obj);
                    I(oVar3, (H) obj);
                }
            }
        }
    }

    public final void J(int i10, String str) {
        int i11;
        C3636c1 c3636c1 = this.f6800D0;
        if (c3636c1 == null || (i11 = Build.VERSION.SDK_INT) < 29) {
            return;
        }
        AutofillId o10 = c3636c1.o(i10);
        if (o10 != null) {
            if (i11 >= 29) {
                J0.c.e(AbstractC0668a1.j(c3636c1.f34285Z), o10, str);
                return;
            }
            return;
        }
        throw new IllegalStateException("Invalid content capture ID".toString());
    }

    public final boolean K(AccessibilityEvent accessibilityEvent) {
        if (!z()) {
            return false;
        }
        if (accessibilityEvent.getEventType() == 2048 || accessibilityEvent.getEventType() == 32768) {
            this.f6829t0 = true;
        }
        try {
            return ((Boolean) this.f6820k0.invoke(accessibilityEvent)).booleanValue();
        } finally {
            this.f6829t0 = false;
        }
    }

    public final boolean L(int i10, int i11, Integer num, List list) {
        if (i10 != Integer.MIN_VALUE) {
            if (z() || this.f6800D0 != null) {
                AccessibilityEvent o10 = o(i10, i11);
                if (num != null) {
                    o10.setContentChangeTypes(num.intValue());
                }
                if (list != null) {
                    o10.setContentDescription(Gi.e.w(list, Separators.COMMA, null, 62));
                }
                return K(o10);
            }
            return false;
        }
        return false;
    }

    public final void N(int i10, int i11, String str) {
        AccessibilityEvent o10 = o(G(i10), 32);
        o10.setContentChangeTypes(i11);
        if (str != null) {
            o10.getText().add(str);
        }
        K(o10);
    }

    public final void O(int i10) {
        F f6 = this.f6803G0;
        if (f6 != null) {
            L0.o oVar = f6.f6721a;
            if (i10 != oVar.f10424g) {
                return;
            }
            if (SystemClock.uptimeMillis() - f6.f6726f <= 1000) {
                AccessibilityEvent o10 = o(G(oVar.f10424g), 131072);
                o10.setFromIndex(f6.f6724d);
                o10.setToIndex(f6.f6725e);
                o10.setAction(f6.f6722b);
                o10.setMovementGranularity(f6.f6723c);
                o10.getText().add(x(oVar));
                K(o10);
            }
        }
        this.f6803G0 = null;
    }

    public final void P(androidx.compose.ui.node.a aVar, C6060g c6060g) {
        L0.j p10;
        androidx.compose.ui.node.a q10;
        if (!aVar.S() || this.f6818i0.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().containsKey(aVar)) {
            return;
        }
        C6060g c6060g2 = this.f6797A0;
        int i10 = c6060g2.f47586h0;
        for (int i11 = 0; i11 < i10; i11++) {
            if (Q.t((androidx.compose.ui.node.a) c6060g2.f47585Z[i11], aVar)) {
                return;
            }
        }
        if (!aVar.f24831B0.d(8)) {
            aVar = Q.q(aVar, C0702s.f7027k0);
        }
        if (aVar != null && (p10 = aVar.p()) != null) {
            if (!p10.f10410Z && (q10 = Q.q(aVar, C0702s.f7026j0)) != null) {
                aVar = q10;
            }
            int i12 = aVar.f24843Z;
            if (!c6060g.add(Integer.valueOf(i12))) {
                return;
            }
            M(this, G(i12), 2048, 1, 8);
        }
    }

    public final void Q(androidx.compose.ui.node.a aVar) {
        if (!aVar.S() || this.f6818i0.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().containsKey(aVar)) {
            return;
        }
        int i10 = aVar.f24843Z;
        L0.h hVar = (L0.h) this.f6830u0.get(Integer.valueOf(i10));
        L0.h hVar2 = (L0.h) this.f6831v0.get(Integer.valueOf(i10));
        if (hVar == null && hVar2 == null) {
            return;
        }
        AccessibilityEvent o10 = o(i10, 4096);
        if (hVar != null) {
            o10.setScrollX((int) ((Number) hVar.f10381a.mo122invoke()).floatValue());
            o10.setMaxScrollX((int) ((Number) hVar.f10382b.mo122invoke()).floatValue());
        }
        if (hVar2 != null) {
            o10.setScrollY((int) ((Number) hVar2.f10381a.mo122invoke()).floatValue());
            o10.setMaxScrollY((int) ((Number) hVar2.f10382b.mo122invoke()).floatValue());
        }
        K(o10);
    }

    public final boolean R(L0.o oVar, int i10, int i11, boolean z10) {
        String x10;
        Integer num;
        Integer num2;
        L0.u uVar = L0.i.f10390g;
        L0.j jVar = oVar.f10421d;
        boolean z11 = false;
        if (jVar.f10409Y.containsKey(uVar) && Q.j(oVar)) {
            wf.o oVar2 = (wf.o) ((L0.a) jVar.r(uVar)).f10369b;
            if (oVar2 == null) {
                return false;
            }
            return ((Boolean) oVar2.invoke(Integer.valueOf(i10), Integer.valueOf(i11), Boolean.valueOf(z10))).booleanValue();
        } else if ((i10 == i11 && i11 == this.f6834y0) || (x10 = x(oVar)) == null) {
            return false;
        } else {
            if (i10 < 0 || i10 != i11 || i11 > x10.length()) {
                i10 = -1;
            }
            this.f6834y0 = i10;
            if (x10.length() > 0) {
                z11 = true;
            }
            int i12 = oVar.f10424g;
            int G10 = G(i12);
            Integer num3 = null;
            if (z11) {
                num = Integer.valueOf(this.f6834y0);
            } else {
                num = null;
            }
            if (z11) {
                num2 = Integer.valueOf(this.f6834y0);
            } else {
                num2 = null;
            }
            if (z11) {
                num3 = Integer.valueOf(x10.length());
            }
            K(p(G10, num, num2, num3, x10));
            O(i12);
            return true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00ce A[LOOP:1: B:8:0x002d->B:30:0x00ce, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d2 A[EDGE_INSN: B:52:0x00d2->B:32:0x00d2 ?: BREAK  , SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ArrayList S(ArrayList arrayList, boolean z10) {
        int i10;
        Comparator comparator;
        boolean z11;
        boolean z12;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            q((L0.o) arrayList.get(i11), arrayList2, linkedHashMap);
        }
        ArrayList arrayList3 = new ArrayList();
        int u02 = AbstractC4344b.u0(arrayList2);
        if (u02 >= 0) {
            int i12 = 0;
            while (true) {
                L0.o oVar = (L0.o) arrayList2.get(i12);
                if (i12 != 0) {
                    C5252d f6 = oVar.f();
                    C5252d f10 = oVar.f();
                    float f11 = f6.f43626b;
                    float f12 = f10.f43628d;
                    if (f11 >= f12) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    int u03 = AbstractC4344b.u0(arrayList3);
                    if (u03 >= 0) {
                        int i13 = 0;
                        while (true) {
                            C5252d c5252d = (C5252d) ((C3959i) arrayList3.get(i13)).f36155Y;
                            float f13 = c5252d.f43626b;
                            float f14 = c5252d.f43628d;
                            if (f13 >= f14) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            if (!z11 && !z12 && Math.max(f11, f13) < Math.min(f12, f14)) {
                                arrayList3.set(i13, new C3959i(new C5252d(Math.max(c5252d.f43625a, 0.0f), Math.max(c5252d.f43626b, f11), Math.min(c5252d.f43627c, Float.POSITIVE_INFINITY), Math.min(f14, f12)), ((C3959i) arrayList3.get(i13)).f36156Z));
                                ((List) ((C3959i) arrayList3.get(i13)).f36156Z).add(oVar);
                                i10 = 0;
                                break;
                            } else if (i13 == u03) {
                                break;
                            } else {
                                i13++;
                            }
                        }
                        if (i12 != u02) {
                            break;
                        }
                        i12++;
                    }
                }
                i10 = 0;
                arrayList3.add(new C3959i(oVar.f(), AbstractC4344b.N0(oVar)));
                if (i12 != u02) {
                }
            }
        } else {
            i10 = 0;
        }
        kf.r.K1(arrayList3, I.f6741Y);
        ArrayList arrayList4 = new ArrayList();
        int size2 = arrayList3.size();
        for (int i14 = i10; i14 < size2; i14++) {
            C3959i c3959i = (C3959i) arrayList3.get(i14);
            List list = (List) c3959i.f36156Z;
            if (z10) {
                comparator = G.f6735Y;
            } else {
                comparator = E.f6719Y;
            }
            kf.r.K1(list, new N.b0(1, new M(comparator)));
            arrayList4.addAll((Collection) c3959i.f36156Z);
        }
        kf.r.K1(arrayList4, new N.k0(N.f6778Z, 1));
        int i15 = i10;
        while (i15 <= AbstractC4344b.u0(arrayList4)) {
            List list2 = (List) linkedHashMap.get(Integer.valueOf(((L0.o) arrayList4.get(i15)).f10424g));
            if (list2 != null) {
                if (!A((L0.o) arrayList4.get(i15))) {
                    arrayList4.remove(i15);
                } else {
                    i15++;
                }
                arrayList4.addAll(i15, list2);
                i15 += list2.size();
            } else {
                i15++;
            }
        }
        return arrayList4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x008f, code lost:
        if (r9 == null) goto L86;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void U(L0.o oVar) {
        int i10;
        J0.a I02;
        L0.o i11;
        AutofillId autofillId;
        J0.i iVar;
        G0.g0 c10;
        String n10;
        wf.k kVar;
        wf.k kVar2;
        if (this.f6800D0 == null) {
            return;
        }
        L0.j jVar = oVar.f10421d;
        Boolean bool = (Boolean) U3.f.T(jVar, L0.r.f10468x);
        int i12 = this.f6817U0;
        G0.g0 g0Var = null;
        LinkedHashMap linkedHashMap = jVar.f10409Y;
        if (i12 == 1 && AbstractC3557B.K(bool, Boolean.TRUE)) {
            Object obj = linkedHashMap.get(L0.i.f10393j);
            if (obj == null) {
                obj = null;
            }
            L0.a aVar = (L0.a) obj;
            if (aVar != null && (kVar2 = (wf.k) aVar.f10369b) != null) {
                Boolean bool2 = (Boolean) kVar2.invoke(Boolean.FALSE);
            }
        } else if (this.f6817U0 == 2 && AbstractC3557B.K(bool, Boolean.FALSE)) {
            Object obj2 = linkedHashMap.get(L0.i.f10393j);
            if (obj2 == null) {
                obj2 = null;
            }
            L0.a aVar2 = (L0.a) obj2;
            if (aVar2 != null && (kVar = (wf.k) aVar2.f10369b) != null) {
                Boolean bool3 = (Boolean) kVar.invoke(Boolean.TRUE);
            }
        }
        C3636c1 c3636c1 = this.f6800D0;
        int i13 = oVar.f10424g;
        if (c3636c1 != null && (i10 = Build.VERSION.SDK_INT) >= 29 && (I02 = A7.b.I0(this.f6818i0)) != null) {
            if (oVar.i() != null) {
                autofillId = c3636c1.o(i11.f10424g);
            } else {
                autofillId = A7.a.f(I02.f8729Y);
            }
            long j6 = i13;
            if (i10 >= 29) {
                iVar = new J0.i(J0.c.c(AbstractC0668a1.j(c3636c1.f34285Z), autofillId, j6));
            } else {
                iVar = null;
            }
            if (iVar != null) {
                L0.u uVar = L0.r.f10442D;
                L0.j jVar2 = oVar.f10421d;
                if (!jVar2.f10409Y.containsKey(uVar)) {
                    L0.u uVar2 = L0.r.f10466v;
                    LinkedHashMap linkedHashMap2 = jVar2.f10409Y;
                    Object obj3 = linkedHashMap2.get(uVar2);
                    if (obj3 == null) {
                        obj3 = null;
                    }
                    List list = (List) obj3;
                    ViewStructure viewStructure = iVar.f8730a;
                    if (list != null) {
                        J0.h.a(viewStructure, "android.widget.TextView");
                        J0.h.d(viewStructure, Gi.e.w(list, Separators.RETURN, null, 62));
                    }
                    Object obj4 = linkedHashMap2.get(L0.r.f10469y);
                    if (obj4 == null) {
                        obj4 = null;
                    }
                    C1046e c1046e = (C1046e) obj4;
                    if (c1046e != null) {
                        J0.h.a(viewStructure, "android.widget.EditText");
                        J0.h.d(viewStructure, c1046e);
                    }
                    Object obj5 = linkedHashMap2.get(L0.r.f10446b);
                    if (obj5 == null) {
                        obj5 = null;
                    }
                    List list2 = (List) obj5;
                    ViewStructure viewStructure2 = iVar.f8730a;
                    if (list2 != null) {
                        J0.h.b(viewStructure2, Gi.e.w(list2, Separators.RETURN, null, 62));
                    }
                    Object obj6 = linkedHashMap2.get(L0.r.f10464t);
                    if (obj6 == null) {
                        obj6 = null;
                    }
                    L0.g gVar = (L0.g) obj6;
                    if (gVar != null && (n10 = Q.n(gVar.f10380a)) != null) {
                        J0.h.a(viewStructure, n10);
                    }
                    N0.C y10 = y(jVar2);
                    if (y10 != null) {
                        N0.B b10 = y10.f12477a;
                        float c11 = Z0.n.c(b10.f12468b.f12487a.f12629b);
                        Z0.b bVar = b10.f12473g;
                        J0.h.e(viewStructure2, bVar.O() * bVar.b() * c11, 0, 0, 0);
                    }
                    L0.o i14 = oVar.i();
                    C5252d c5252d = C5252d.f43624e;
                    if (i14 != null && (c10 = oVar.c()) != null) {
                        if (c10.G0().f37732r0) {
                            g0Var = c10;
                        }
                        if (g0Var != null) {
                            c5252d = AbstractC0579h.z(i14.f10418a, 8).F(g0Var, true);
                        }
                    }
                    J0.h.c(viewStructure2, (int) c5252d.f43625a, (int) c5252d.f43626b, 0, 0, (int) c5252d.f(), (int) c5252d.c());
                    g0Var = iVar;
                }
            }
        }
        if (g0Var != null) {
            Integer valueOf = Integer.valueOf(i13);
            C6060g c6060g = this.f6802F0;
            if (c6060g.contains(valueOf)) {
                c6060g.remove(Integer.valueOf(i13));
            } else {
                this.f6801E0.put(Integer.valueOf(i13), g0Var);
            }
        }
        List g10 = oVar.g(false, true);
        int size = g10.size();
        for (int i15 = 0; i15 < size; i15++) {
            U((L0.o) g10.get(i15));
        }
    }

    public final void V(L0.o oVar) {
        if (this.f6800D0 == null) {
            return;
        }
        int i10 = oVar.f10424g;
        Integer valueOf = Integer.valueOf(i10);
        C6059f c6059f = this.f6801E0;
        if (c6059f.containsKey(valueOf)) {
            c6059f.remove(Integer.valueOf(i10));
        } else {
            this.f6802F0.add(Integer.valueOf(i10));
        }
        List g10 = oVar.g(false, true);
        int size = g10.size();
        for (int i11 = 0; i11 < size; i11++) {
            V((L0.o) g10.get(i11));
        }
    }

    @Override // D1.C0343c
    public final J0.a c(View view) {
        return this.f6826q0;
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x013e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k(int i10, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
        L0.o oVar;
        int i11;
        long j6;
        C5252d i12;
        C5252d e10;
        C5252d c5252d;
        RectF rectF;
        S0 s02 = (S0) t().get(Integer.valueOf(i10));
        if (s02 != null && (oVar = s02.f6878a) != null) {
            String x10 = x(oVar);
            if (AbstractC3557B.K(str, this.f6808L0)) {
                Integer num = (Integer) this.f6806J0.get(Integer.valueOf(i10));
                if (num != null) {
                    accessibilityNodeInfo.getExtras().putInt(str, num.intValue());
                }
            } else if (AbstractC3557B.K(str, this.f6809M0)) {
                Integer num2 = (Integer) this.f6807K0.get(Integer.valueOf(i10));
                if (num2 != null) {
                    accessibilityNodeInfo.getExtras().putInt(str, num2.intValue());
                }
            } else {
                L0.u uVar = L0.i.f10384a;
                L0.j jVar = oVar.f10421d;
                Object obj = null;
                if (jVar.f10409Y.containsKey(uVar) && bundle != null && AbstractC3557B.K(str, "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY")) {
                    int i13 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX", -1);
                    int i14 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH", -1);
                    if (i14 > 0 && i13 >= 0) {
                        if (x10 != null) {
                            i11 = x10.length();
                        } else {
                            i11 = Integer.MAX_VALUE;
                        }
                        if (i13 < i11) {
                            N0.C y10 = y(jVar);
                            if (y10 == null) {
                                return;
                            }
                            ArrayList arrayList = new ArrayList();
                            for (int i15 = 0; i15 < i14; i15++) {
                                int i16 = i13 + i15;
                                if (i16 >= y10.f12477a.f12467a.f12512Y.length()) {
                                    arrayList.add(null);
                                } else {
                                    C5252d b10 = y10.b(i16);
                                    G0.g0 c10 = oVar.c();
                                    if (c10 != null) {
                                        if (!c10.G0().f37732r0) {
                                            c10 = null;
                                        }
                                        if (c10 != null) {
                                            j6 = androidx.compose.ui.layout.a.l(c10);
                                            i12 = b10.i(j6);
                                            e10 = oVar.e();
                                            if (i12.f43627c <= e10.f43625a && e10.f43627c > i12.f43625a && i12.f43628d > e10.f43626b && e10.f43628d > i12.f43626b) {
                                                c5252d = i12.g(e10);
                                            } else {
                                                c5252d = null;
                                            }
                                            if (c5252d == null) {
                                                long r10 = R4.b.r(c5252d.f43625a, c5252d.f43626b);
                                                C0714y c0714y = this.f6818i0;
                                                long n10 = c0714y.n(r10);
                                                long n11 = c0714y.n(R4.b.r(c5252d.f43627c, c5252d.f43628d));
                                                rectF = new RectF(C5251c.d(n10), C5251c.e(n10), C5251c.d(n11), C5251c.e(n11));
                                            } else {
                                                rectF = null;
                                            }
                                            arrayList.add(rectF);
                                        }
                                    }
                                    j6 = C5251c.f43619b;
                                    i12 = b10.i(j6);
                                    e10 = oVar.e();
                                    if (i12.f43627c <= e10.f43625a) {
                                    }
                                    c5252d = null;
                                    if (c5252d == null) {
                                    }
                                    arrayList.add(rectF);
                                }
                            }
                            accessibilityNodeInfo.getExtras().putParcelableArray(str, (Parcelable[]) arrayList.toArray(new RectF[0]));
                            return;
                        }
                    }
                    AbstractC3612c.c("AccessibilityDelegate", "Invalid arguments for accessibility character locations");
                    return;
                }
                L0.u uVar2 = L0.r.f10465u;
                LinkedHashMap linkedHashMap = jVar.f10409Y;
                if (linkedHashMap.containsKey(uVar2) && bundle != null && AbstractC3557B.K(str, "androidx.compose.ui.semantics.testTag")) {
                    Object obj2 = linkedHashMap.get(uVar2);
                    if (obj2 != null) {
                        obj = obj2;
                    }
                    String str2 = (String) obj;
                    if (str2 != null) {
                        accessibilityNodeInfo.getExtras().putCharSequence(str, str2);
                    }
                } else if (AbstractC3557B.K(str, "androidx.compose.ui.semantics.id")) {
                    accessibilityNodeInfo.getExtras().putInt(str, oVar.f10424g);
                }
            }
        }
    }

    public final Rect l(S0 s02) {
        Rect rect = s02.f6879b;
        long r10 = R4.b.r(rect.left, rect.top);
        C0714y c0714y = this.f6818i0;
        long n10 = c0714y.n(r10);
        long n11 = c0714y.n(R4.b.r(rect.right, rect.bottom));
        return new Rect((int) Math.floor(C5251c.d(n10)), (int) Math.floor(C5251c.e(n10)), (int) Math.ceil(C5251c.d(n11)), (int) Math.ceil(C5251c.e(n11)));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0069 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0076 A[Catch: all -> 0x0033, TryCatch #0 {all -> 0x0033, blocks: (B:13:0x002d, B:19:0x0044, B:23:0x005b, B:27:0x006e, B:29:0x0076, B:32:0x007e, B:33:0x0081, B:36:0x0089, B:38:0x008e, B:39:0x009d, B:41:0x00a4, B:42:0x00ad), top: B:51:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00cb  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x00c8 -> B:14:0x0030). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m(AbstractC4825e abstractC4825e) {
        K k10;
        int i10;
        Throwable th2;
        O o10;
        C6060g c6060g;
        C1171d c1171d;
        C6060g c6060g2;
        C1171d c1171d2;
        Object a5;
        try {
            if (abstractC4825e instanceof K) {
                k10 = (K) abstractC4825e;
                int i11 = k10.f6772k0;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    k10.f6772k0 = i11 - Integer.MIN_VALUE;
                    Object obj = k10.f6770i0;
                    EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                    i10 = k10.f6772k0;
                    if (i10 == 0) {
                        if (i10 != 1) {
                            if (i10 == 2) {
                                c1171d = k10.f6769h0;
                                c6060g = k10.f6768Z;
                                o10 = k10.f6767Y;
                                com.google.android.gms.internal.play_billing.N.B0(obj);
                                c6060g2 = c6060g;
                                c1171d2 = c1171d;
                                k10.f6767Y = o10;
                                k10.f6768Z = c6060g2;
                                k10.f6769h0 = c1171d2;
                                k10.f6772k0 = 1;
                                a5 = c1171d2.a(k10);
                                if (a5 == enumC5000a) {
                                    return enumC5000a;
                                }
                                C1171d c1171d3 = c1171d2;
                                c6060g = c6060g2;
                                obj = a5;
                                c1171d = c1171d3;
                                if (!((Boolean) obj).booleanValue()) {
                                    c1171d.b();
                                    if (o10.f6800D0 != null) {
                                        o10.B();
                                    }
                                    boolean z10 = o10.z();
                                    C6060g c6060g3 = o10.f6797A0;
                                    if (z10) {
                                        int i12 = c6060g3.f47586h0;
                                        for (int i13 = 0; i13 < i12; i13++) {
                                            androidx.compose.ui.node.a aVar = (androidx.compose.ui.node.a) c6060g3.f47585Z[i13];
                                            o10.P(aVar, c6060g);
                                            o10.Q(aVar);
                                        }
                                        c6060g.clear();
                                        if (!o10.f6813Q0) {
                                            o10.f6813Q0 = true;
                                            o10.f6825p0.post(o10.f6814R0);
                                        }
                                    }
                                    c6060g3.clear();
                                    o10.f6830u0.clear();
                                    o10.f6831v0.clear();
                                    k10.f6767Y = o10;
                                    k10.f6768Z = c6060g;
                                    k10.f6769h0 = c1171d;
                                    k10.f6772k0 = 2;
                                    if (R4.b.p0(100L, k10) == enumC5000a) {
                                        return enumC5000a;
                                    }
                                    c6060g2 = c6060g;
                                    c1171d2 = c1171d;
                                    k10.f6767Y = o10;
                                    k10.f6768Z = c6060g2;
                                    k10.f6769h0 = c1171d2;
                                    k10.f6772k0 = 1;
                                    a5 = c1171d2.a(k10);
                                    if (a5 == enumC5000a) {
                                    }
                                } else {
                                    o10.f6797A0.clear();
                                    return jf.y.f36177a;
                                }
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            c1171d = k10.f6769h0;
                            c6060g = k10.f6768Z;
                            o10 = k10.f6767Y;
                            com.google.android.gms.internal.play_billing.N.B0(obj);
                            if (!((Boolean) obj).booleanValue()) {
                            }
                        }
                    } else {
                        com.google.android.gms.internal.play_billing.N.B0(obj);
                        try {
                            c6060g2 = new C6060g(0);
                            Pg.k kVar = this.f6798B0;
                            kVar.getClass();
                            c1171d2 = new C1171d(kVar);
                            o10 = this;
                            k10.f6767Y = o10;
                            k10.f6768Z = c6060g2;
                            k10.f6769h0 = c1171d2;
                            k10.f6772k0 = 1;
                            a5 = c1171d2.a(k10);
                            if (a5 == enumC5000a) {
                            }
                        } catch (Throwable th3) {
                            th2 = th3;
                            o10 = this;
                            o10.f6797A0.clear();
                            throw th2;
                        }
                    }
                }
            }
            if (i10 == 0) {
            }
        } catch (Throwable th4) {
            th2 = th4;
        }
        k10 = new K(this, abstractC4825e);
        Object obj2 = k10.f6770i0;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = k10.f6772k0;
    }

    public final boolean n(int i10, long j6, boolean z10) {
        L0.u uVar;
        L0.h hVar;
        int i11;
        if (!AbstractC3557B.K(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            return false;
        }
        Collection values = t().values();
        if (C5251c.b(j6, C5251c.f43621d)) {
            return false;
        }
        if (!Float.isNaN(C5251c.d(j6)) && !Float.isNaN(C5251c.e(j6))) {
            if (z10) {
                uVar = L0.r.f10461q;
            } else if (!z10) {
                uVar = L0.r.f10460p;
            } else {
                throw new RuntimeException();
            }
            Collection<S0> collection = values;
            if ((collection instanceof Collection) && collection.isEmpty()) {
                return false;
            }
            for (S0 s02 : collection) {
                Rect rect = s02.f6879b;
                float f6 = rect.top;
                float f10 = rect.right;
                float f11 = rect.bottom;
                if (C5251c.d(j6) >= rect.left && C5251c.d(j6) < f10 && C5251c.e(j6) >= f6 && C5251c.e(j6) < f11 && (hVar = (L0.h) U3.f.T(s02.f6878a.h(), uVar)) != null) {
                    boolean z11 = hVar.f10383c;
                    if (z11) {
                        i11 = -i10;
                    } else {
                        i11 = i10;
                    }
                    AbstractC6216a abstractC6216a = hVar.f10381a;
                    if ((i10 == 0 && z11) || i11 < 0) {
                        if (((Number) abstractC6216a.mo122invoke()).floatValue() > 0.0f) {
                            return true;
                        }
                    } else if (((Number) abstractC6216a.mo122invoke()).floatValue() < ((Number) hVar.f10382b.mo122invoke()).floatValue()) {
                        return true;
                    }
                }
            }
            return false;
        }
        throw new IllegalStateException("Offset argument contained a NaN value.".toString());
    }

    public final AccessibilityEvent o(int i10, int i11) {
        S0 s02;
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i11);
        obtain.setEnabled(true);
        obtain.setClassName("android.view.View");
        C0714y c0714y = this.f6818i0;
        obtain.setPackageName(c0714y.getContext().getPackageName());
        obtain.setSource(c0714y, i10);
        if (z() && (s02 = (S0) t().get(Integer.valueOf(i10))) != null) {
            obtain.setPassword(s02.f6878a.h().f10409Y.containsKey(L0.r.f10442D));
        }
        return obtain;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onCreate(AbstractC2086v abstractC2086v) {
        AbstractC2072g.a(this, abstractC2086v);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onDestroy(AbstractC2086v abstractC2086v) {
        AbstractC2072g.b(this, abstractC2086v);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onPause(AbstractC2086v abstractC2086v) {
        AbstractC2072g.c(this, abstractC2086v);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onResume(AbstractC2086v abstractC2086v) {
        AbstractC2072g.d(this, abstractC2086v);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStart(AbstractC2086v abstractC2086v) {
        U(this.f6818i0.getSemanticsOwner().a());
        B();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStop(AbstractC2086v abstractC2086v) {
        V(this.f6818i0.getSemanticsOwner().a());
        B();
    }

    public final AccessibilityEvent p(int i10, Integer num, Integer num2, Integer num3, CharSequence charSequence) {
        AccessibilityEvent o10 = o(i10, 8192);
        if (num != null) {
            o10.setFromIndex(num.intValue());
        }
        if (num2 != null) {
            o10.setToIndex(num2.intValue());
        }
        if (num3 != null) {
            o10.setItemCount(num3.intValue());
        }
        if (charSequence != null) {
            o10.getText().add(charSequence);
        }
        return o10;
    }

    public final void q(L0.o oVar, ArrayList arrayList, LinkedHashMap linkedHashMap) {
        boolean z10;
        if (oVar.f10420c.f24860x0 == Z0.l.f22806Z) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean booleanValue = ((Boolean) oVar.h().s(L0.r.f10457m, P.f6845Z)).booleanValue();
        int i10 = oVar.f10424g;
        if ((booleanValue || A(oVar)) && t().keySet().contains(Integer.valueOf(i10))) {
            arrayList.add(oVar);
        }
        boolean z11 = oVar.f10419b;
        if (booleanValue) {
            linkedHashMap.put(Integer.valueOf(i10), S(kf.t.M2(oVar.g(!z11, false)), z10));
            return;
        }
        List g10 = oVar.g(!z11, false);
        int size = g10.size();
        for (int i11 = 0; i11 < size; i11++) {
            q((L0.o) g10.get(i11), arrayList, linkedHashMap);
        }
    }

    public final int r(L0.o oVar) {
        L0.u uVar = L0.r.f10446b;
        L0.j jVar = oVar.f10421d;
        if (!jVar.f10409Y.containsKey(uVar)) {
            L0.u uVar2 = L0.r.f10470z;
            if (jVar.f10409Y.containsKey(uVar2)) {
                return (int) (4294967295L & ((N0.D) jVar.r(uVar2)).f12485a);
            }
        }
        return this.f6834y0;
    }

    public final int s(L0.o oVar) {
        L0.u uVar = L0.r.f10446b;
        L0.j jVar = oVar.f10421d;
        if (!jVar.f10409Y.containsKey(uVar)) {
            L0.u uVar2 = L0.r.f10470z;
            if (jVar.f10409Y.containsKey(uVar2)) {
                return (int) (((N0.D) jVar.r(uVar2)).f12485a >> 32);
            }
        }
        return this.f6834y0;
    }

    public final Map t() {
        L0.o oVar;
        boolean z10;
        if (this.f6799C0) {
            this.f6799C0 = false;
            L0.o a5 = this.f6818i0.getSemanticsOwner().a();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            androidx.compose.ui.node.a aVar = a5.f10420c;
            if (aVar.T() && aVar.S()) {
                C5252d e10 = a5.e();
                Q.r(new Region(AbstractC4344b.Y0(e10.f43625a), AbstractC4344b.Y0(e10.f43626b), AbstractC4344b.Y0(e10.f43627c), AbstractC4344b.Y0(e10.f43628d)), a5, linkedHashMap, a5, new Region());
            }
            this.f6804H0 = linkedHashMap;
            if (z()) {
                HashMap hashMap = this.f6806J0;
                hashMap.clear();
                HashMap hashMap2 = this.f6807K0;
                hashMap2.clear();
                S0 s02 = (S0) t().get(-1);
                if (s02 != null) {
                    oVar = s02.f6878a;
                } else {
                    oVar = null;
                }
                AbstractC3557B.Z(oVar);
                if (oVar.f10420c.f24860x0 == Z0.l.f22806Z) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                ArrayList S = S(AbstractC4344b.N0(oVar), z10);
                int u02 = AbstractC4344b.u0(S);
                if (1 <= u02) {
                    int i10 = 1;
                    while (true) {
                        int i11 = ((L0.o) S.get(i10 - 1)).f10424g;
                        int i12 = ((L0.o) S.get(i10)).f10424g;
                        hashMap.put(Integer.valueOf(i11), Integer.valueOf(i12));
                        hashMap2.put(Integer.valueOf(i12), Integer.valueOf(i11));
                        if (i10 == u02) {
                            break;
                        }
                        i10++;
                    }
                }
            }
        }
        return this.f6804H0;
    }

    public final String v(L0.o oVar) {
        float f6;
        int i10;
        L0.j jVar = oVar.f10421d;
        L0.r rVar = L0.r.f10445a;
        Object T = U3.f.T(jVar, L0.r.f10447c);
        L0.u uVar = L0.r.f10441C;
        L0.j jVar2 = oVar.f10421d;
        M0.a aVar = (M0.a) U3.f.T(jVar2, uVar);
        L0.g gVar = (L0.g) U3.f.T(jVar2, L0.r.f10464t);
        C0714y c0714y = this.f6818i0;
        if (aVar != null) {
            int ordinal = aVar.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal == 2 && T == null) {
                        T = c0714y.getContext().getResources().getString(R.string.indeterminate);
                    }
                } else if (gVar != null && L0.g.a(gVar.f10380a, 2) && T == null) {
                    T = c0714y.getContext().getResources().getString(R.string.off);
                }
            } else if (gVar != null && L0.g.a(gVar.f10380a, 2) && T == null) {
                T = c0714y.getContext().getResources().getString(R.string.on);
            }
        }
        Boolean bool = (Boolean) U3.f.T(jVar2, L0.r.f10440B);
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            if ((gVar == null || !L0.g.a(gVar.f10380a, 4)) && T == null) {
                if (booleanValue) {
                    T = c0714y.getContext().getResources().getString(R.string.selected);
                } else {
                    T = c0714y.getContext().getResources().getString(R.string.not_selected);
                }
            }
        }
        L0.f fVar = (L0.f) U3.f.T(jVar2, L0.r.f10448d);
        if (fVar != null) {
            L0.f fVar2 = L0.f.f10376d;
            if (fVar != L0.f.f10376d) {
                if (T == null) {
                    Cf.d dVar = fVar.f10378b;
                    float floatValue = Float.valueOf(dVar.f3105b).floatValue();
                    float f10 = dVar.f3104a;
                    if (floatValue - Float.valueOf(f10).floatValue() == 0.0f) {
                        f6 = 0.0f;
                    } else {
                        f6 = (fVar.f10377a - Float.valueOf(f10).floatValue()) / (Float.valueOf(dVar.f3105b).floatValue() - Float.valueOf(f10).floatValue());
                    }
                    float o10 = com.google.android.gms.internal.play_billing.N.o(f6, 0.0f, 1.0f);
                    if (o10 == 0.0f) {
                        i10 = 0;
                    } else {
                        i10 = 100;
                        if (o10 != 1.0f) {
                            i10 = com.google.android.gms.internal.play_billing.N.p(AbstractC4344b.Y0(o10 * 100), 1, 99);
                        }
                    }
                    T = c0714y.getContext().getResources().getString(R.string.template_percent, Integer.valueOf(i10));
                }
            } else if (T == null) {
                T = c0714y.getContext().getResources().getString(R.string.in_progress);
            }
        }
        return (String) T;
    }

    public final SpannableString w(L0.o oVar) {
        SpannableString spannableString;
        C1046e c1046e;
        C0714y c0714y = this.f6818i0;
        c0714y.getFontFamilyResolver();
        C1046e c1046e2 = (C1046e) U3.f.T(oVar.f10421d, L0.r.f10469y);
        SpannableString spannableString2 = null;
        V0.k kVar = this.f6810N0;
        if (c1046e2 != null) {
            spannableString = r9.y.Y0(c1046e2, c0714y.getDensity(), kVar);
        } else {
            spannableString = null;
        }
        SpannableString spannableString3 = (SpannableString) T(spannableString);
        List list = (List) U3.f.T(oVar.f10421d, L0.r.f10466v);
        if (list != null && (c1046e = (C1046e) kf.t.h2(list)) != null) {
            spannableString2 = r9.y.Y0(c1046e, c0714y.getDensity(), kVar);
        }
        SpannableString spannableString4 = (SpannableString) T(spannableString2);
        if (spannableString3 == null) {
            return spannableString4;
        }
        return spannableString3;
    }

    public final boolean z() {
        if (this.f6821l0.isEnabled() && (!this.f6824o0.isEmpty())) {
            return true;
        }
        return false;
    }
}
