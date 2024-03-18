package g;

import A.C0007a0;
import B2.C0203d;
import B2.C0206g;
import G0.o0;
import H0.C0714y;
import H0.H;
import H0.O;
import H0.Q;
import H0.R0;
import H0.S0;
import N0.C1046e;
import Ng.AbstractC1073l0;
import Ng.C1057d0;
import V1.AbstractComponentCallbacksC1480v;
import V1.S;
import a1.C1915c;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.gov.nist.core.Separators;
import android.os.Build;
import android.os.Handler;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.EnumC2081p;
import androidx.lifecycle.ProcessLifecycleOwner;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import b0.C2104h;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import id.AbstractC3557B;
import java.io.File;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.zip.ZipInputStream;
import jf.AbstractC3953c;
import l8.AbstractC4344b;
import m.C4507D;
import m.ExecutorC4519P;
import m.RunnableC4517N;
import o1.AbstractC4892g;
import o1.AbstractC4894i;
import o1.C4893h;
import o6.C4938q;
import p5.AbstractC5091c;
import p5.EnumC5090b;
import q.RunnableC5216j;
import q5.C5274d;
import r6.C5370b;
import w.C6055b;
import w.C6060g;
import z2.C6757b;

/* renamed from: g.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC3111d implements Runnable {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f30945Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Object f30946Z;

    public /* synthetic */ RunnableC3111d(int i10, Object obj) {
        this.f30945Y = i10;
        this.f30946Z = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:230:0x05c8, code lost:
        if (r4 != null) goto L233;
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x05cd, code lost:
        if (r4 == null) goto L233;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00fd, code lost:
        if (r5 == false) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:148:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x039b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:161:0x03ea A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void a() {
        L0.o oVar;
        String str;
        L0.j jVar;
        L0.o oVar2;
        C0714y c0714y;
        Iterator it;
        Map map;
        ArrayList arrayList;
        H h10;
        L0.o oVar3;
        L0.j jVar2;
        int i10;
        boolean z10;
        C1046e c1046e;
        C1046e c1046e2;
        Object obj;
        String str2;
        String str3;
        int i11;
        char c10;
        int i12;
        L0.j jVar3;
        H h11;
        boolean z11;
        boolean z12;
        AccessibilityEvent accessibilityEvent;
        String str4;
        int i13;
        boolean z13;
        C1046e c1046e3;
        O o10 = (O) this.f30946Z;
        C0714y c0714y2 = o10.f6818i0;
        int i14 = o0.f5814a;
        c0714y2.o(true);
        boolean z14 = o10.z();
        C0714y c0714y3 = o10.f6818i0;
        if (z14) {
            o10.H(c0714y3.getSemanticsOwner().a(), o10.f6812P0);
        }
        if (o10.f6800D0 != null) {
            o10.I(c0714y3.getSemanticsOwner().a(), o10.f6812P0);
        }
        Map t10 = o10.t();
        ArrayList arrayList2 = o10.f6815S0;
        ArrayList arrayList3 = new ArrayList(arrayList2);
        arrayList2.clear();
        Iterator it2 = t10.keySet().iterator();
        while (true) {
            boolean hasNext = it2.hasNext();
            LinkedHashMap linkedHashMap = o10.f6811O0;
            if (hasNext) {
                int intValue = ((Number) it2.next()).intValue();
                H h12 = (H) linkedHashMap.get(Integer.valueOf(intValue));
                S0 s02 = (S0) t10.get(Integer.valueOf(intValue));
                if (s02 != null) {
                    oVar2 = s02.f6878a;
                } else {
                    oVar2 = null;
                }
                if (oVar2 != null) {
                    int i15 = oVar2.f10424g;
                    L0.j jVar4 = oVar2.f10421d;
                    if (h12 == null) {
                        Iterator it3 = jVar4.iterator();
                        while (it3.hasNext()) {
                            Object key = ((Map.Entry) it3.next()).getKey();
                            L0.u uVar = L0.r.f10466v;
                            if (AbstractC3557B.K(key, uVar)) {
                                Object obj2 = jVar4.f10409Y.get(uVar);
                                if (obj2 == null) {
                                    obj2 = null;
                                }
                                List list = (List) obj2;
                                if (list != null) {
                                    c1046e3 = (C1046e) kf.t.h2(list);
                                } else {
                                    c1046e3 = null;
                                }
                                o10.J(i15, String.valueOf(c1046e3));
                            }
                        }
                    } else {
                        Iterator it4 = jVar4.iterator();
                        boolean z15 = false;
                        while (true) {
                            boolean hasNext2 = it4.hasNext();
                            L0.j jVar5 = h12.f6738b;
                            if (hasNext2) {
                                Map.Entry entry = (Map.Entry) it4.next();
                                Object key2 = entry.getKey();
                                L0.u uVar2 = L0.r.f10460p;
                                if (AbstractC3557B.K(key2, uVar2) || AbstractC3557B.K(entry.getKey(), L0.r.f10461q)) {
                                    R0 m10 = Q.m(intValue, arrayList3);
                                    if (m10 != null) {
                                        z13 = false;
                                    } else {
                                        m10 = new R0(intValue, arrayList2);
                                        z13 = true;
                                    }
                                    arrayList2.add(m10);
                                }
                                if (AbstractC3557B.K(entry.getValue(), U3.f.T(jVar5, (L0.u) entry.getKey()))) {
                                    h10 = h12;
                                    i10 = intValue;
                                    c0714y = c0714y3;
                                    map = t10;
                                    arrayList = arrayList3;
                                    it = it2;
                                    oVar3 = oVar2;
                                    jVar2 = jVar4;
                                    z10 = true;
                                    intValue = i10;
                                    jVar4 = jVar2;
                                    oVar2 = oVar3;
                                    h12 = h10;
                                    arrayList3 = arrayList;
                                    t10 = map;
                                    it2 = it;
                                    c0714y3 = c0714y;
                                }
                                L0.u uVar3 = (L0.u) entry.getKey();
                                L0.u uVar4 = L0.r.f10466v;
                                boolean K10 = AbstractC3557B.K(uVar3, uVar4);
                                map = t10;
                                LinkedHashMap linkedHashMap2 = jVar4.f10409Y;
                                if (K10) {
                                    List list2 = (List) U3.f.T(jVar5, uVar4);
                                    if (list2 != null) {
                                        c1046e = (C1046e) kf.t.h2(list2);
                                    } else {
                                        c1046e = null;
                                    }
                                    Object obj3 = linkedHashMap2.get(uVar4);
                                    if (obj3 == null) {
                                        obj3 = null;
                                    }
                                    List list3 = (List) obj3;
                                    if (list3 != null) {
                                        c1046e2 = (C1046e) kf.t.h2(list3);
                                    } else {
                                        c1046e2 = null;
                                    }
                                    if (!AbstractC3557B.K(c1046e, c1046e2)) {
                                        o10.J(i15, String.valueOf(c1046e2));
                                    }
                                    h10 = h12;
                                    i10 = intValue;
                                    c0714y = c0714y3;
                                    arrayList = arrayList3;
                                    it = it2;
                                    oVar3 = oVar2;
                                    jVar2 = jVar4;
                                    z10 = true;
                                    intValue = i10;
                                    jVar4 = jVar2;
                                    oVar2 = oVar3;
                                    h12 = h10;
                                    arrayList3 = arrayList;
                                    t10 = map;
                                    it2 = it;
                                    c0714y3 = c0714y;
                                } else {
                                    arrayList = arrayList3;
                                    L0.u uVar5 = L0.r.f10449e;
                                    if (AbstractC3557B.K(uVar3, uVar5)) {
                                        Object value = entry.getValue();
                                        AbstractC3557B.a0("null cannot be cast to non-null type kotlin.String", value);
                                        String str5 = (String) value;
                                        if (jVar5.f10409Y.containsKey(uVar5)) {
                                            o10.N(intValue, 8, str5);
                                        }
                                    } else if (AbstractC3557B.K(uVar3, L0.r.f10447c) || AbstractC3557B.K(uVar3, L0.r.f10441C)) {
                                        O.M(o10, o10.G(intValue), 2048, 64, 8);
                                        O.M(o10, o10.G(intValue), 2048, 0, 8);
                                    } else {
                                        it = it2;
                                        if (AbstractC3557B.K(uVar3, L0.r.f10448d)) {
                                            O.M(o10, o10.G(intValue), 2048, 64, 8);
                                            O.M(o10, o10.G(intValue), 2048, 0, 8);
                                            oVar3 = oVar2;
                                            h10 = h12;
                                            i10 = intValue;
                                            c0714y = c0714y3;
                                            z10 = true;
                                            jVar2 = jVar4;
                                        } else {
                                            L0.u uVar6 = L0.r.f10440B;
                                            boolean K11 = AbstractC3557B.K(uVar3, uVar6);
                                            c0714y = c0714y3;
                                            androidx.compose.ui.node.a aVar = oVar2.f10420c;
                                            if (K11) {
                                                L0.g gVar = (L0.g) U3.f.T(oVar2.h(), L0.r.f10464t);
                                                if (gVar == null || !L0.g.a(gVar.f10380a, 4)) {
                                                    obj = null;
                                                    O.M(o10, o10.G(intValue), 2048, 64, 8);
                                                    O.M(o10, o10.G(intValue), 2048, 0, 8);
                                                } else if (AbstractC3557B.K(U3.f.T(oVar2.h(), uVar6), Boolean.TRUE)) {
                                                    AccessibilityEvent o11 = o10.o(o10.G(intValue), 4);
                                                    L0.o oVar4 = new L0.o(oVar2.f10418a, true, aVar, jVar4);
                                                    List list4 = (List) U3.f.T(oVar4.h(), L0.r.f10446b);
                                                    obj = null;
                                                    if (list4 != null) {
                                                        str2 = Gi.e.w(list4, Separators.COMMA, null, 62);
                                                    } else {
                                                        str2 = null;
                                                    }
                                                    List list5 = (List) U3.f.T(oVar4.h(), uVar4);
                                                    if (list5 != null) {
                                                        str3 = Gi.e.w(list5, Separators.COMMA, null, 62);
                                                    } else {
                                                        str3 = null;
                                                    }
                                                    if (str2 != null) {
                                                        o11.setContentDescription(str2);
                                                    }
                                                    if (str3 != null) {
                                                        o11.getText().add(str3);
                                                    }
                                                    o10.K(o11);
                                                } else {
                                                    obj = null;
                                                    O.M(o10, o10.G(intValue), 2048, 0, 8);
                                                }
                                            } else {
                                                obj = null;
                                                if (AbstractC3557B.K(uVar3, L0.r.f10446b)) {
                                                    int G10 = o10.G(intValue);
                                                    Object value2 = entry.getValue();
                                                    AbstractC3557B.a0("null cannot be cast to non-null type kotlin.collections.List<kotlin.String>", value2);
                                                    o10.L(G10, 2048, 4, (List) value2);
                                                } else {
                                                    L0.u uVar7 = L0.r.f10469y;
                                                    String str6 = "";
                                                    if (AbstractC3557B.K(uVar3, uVar7)) {
                                                        if (linkedHashMap2.containsKey(L0.i.f10391h)) {
                                                            CharSequence charSequence = (C1046e) U3.f.T(jVar5, uVar7);
                                                            if (charSequence == null) {
                                                                charSequence = str6;
                                                            }
                                                            CharSequence charSequence2 = (C1046e) U3.f.T(jVar4, uVar7);
                                                            if (charSequence2 == null) {
                                                                charSequence2 = str6;
                                                            }
                                                            CharSequence T = O.T(charSequence2);
                                                            int length = charSequence.length();
                                                            int length2 = charSequence2.length();
                                                            if (length > length2) {
                                                                i12 = length2;
                                                            } else {
                                                                i12 = length;
                                                            }
                                                            int i16 = 0;
                                                            while (true) {
                                                                if (i16 < i12) {
                                                                    jVar3 = jVar4;
                                                                    if (charSequence.charAt(i16) != charSequence2.charAt(i16)) {
                                                                        break;
                                                                    }
                                                                    i16++;
                                                                    jVar4 = jVar3;
                                                                } else {
                                                                    jVar3 = jVar4;
                                                                    break;
                                                                }
                                                            }
                                                            int i17 = 0;
                                                            while (i17 < i12 - i16) {
                                                                int i18 = i12;
                                                                if (charSequence.charAt((length - 1) - i17) != charSequence2.charAt((length2 - 1) - i17)) {
                                                                    break;
                                                                }
                                                                i17++;
                                                                i12 = i18;
                                                            }
                                                            int i19 = (length - i17) - i16;
                                                            int i20 = (length2 - i17) - i16;
                                                            L0.o oVar5 = h12.f6737a;
                                                            L0.j jVar6 = oVar5.f10421d;
                                                            L0.u uVar8 = L0.i.f10391h;
                                                            if (jVar6.f10409Y.containsKey(uVar8)) {
                                                                L0.j h13 = oVar5.h();
                                                                h11 = h12;
                                                                L0.u uVar9 = L0.r.f10442D;
                                                                if (!h13.f10409Y.containsKey(uVar9) && oVar2.h().f10409Y.containsKey(uVar9)) {
                                                                    z11 = true;
                                                                    if (oVar5.f10421d.f10409Y.containsKey(uVar8)) {
                                                                        L0.j h14 = oVar5.h();
                                                                        L0.u uVar10 = L0.r.f10442D;
                                                                        if (h14.f10409Y.containsKey(uVar10) && !oVar2.h().f10409Y.containsKey(uVar10)) {
                                                                            z12 = true;
                                                                            if (z11 && !z12) {
                                                                                accessibilityEvent = o10.o(o10.G(intValue), 16);
                                                                                accessibilityEvent.setFromIndex(i16);
                                                                                accessibilityEvent.setRemovedCount(i19);
                                                                                accessibilityEvent.setAddedCount(i20);
                                                                                accessibilityEvent.setBeforeText(charSequence);
                                                                                accessibilityEvent.getText().add(T);
                                                                                oVar3 = oVar2;
                                                                                i11 = intValue;
                                                                                jVar2 = jVar3;
                                                                                h10 = h11;
                                                                            } else {
                                                                                int G11 = o10.G(intValue);
                                                                                Integer valueOf = Integer.valueOf(length2);
                                                                                oVar3 = oVar2;
                                                                                h10 = h11;
                                                                                i11 = intValue;
                                                                                jVar2 = jVar3;
                                                                                accessibilityEvent = o10.p(G11, 0, 0, valueOf, T);
                                                                            }
                                                                            accessibilityEvent.setClassName("android.widget.EditText");
                                                                            o10.K(accessibilityEvent);
                                                                            if (z11 && !z12) {
                                                                                i10 = i11;
                                                                                z10 = true;
                                                                            } else {
                                                                                long j6 = ((N0.D) jVar2.r(L0.r.f10470z)).f12485a;
                                                                                c10 = ' ';
                                                                                accessibilityEvent.setFromIndex((int) (j6 >> 32));
                                                                                accessibilityEvent.setToIndex((int) (j6 & 4294967295L));
                                                                                o10.K(accessibilityEvent);
                                                                            }
                                                                        }
                                                                    }
                                                                    z12 = false;
                                                                    if (z11) {
                                                                    }
                                                                    int G112 = o10.G(intValue);
                                                                    Integer valueOf2 = Integer.valueOf(length2);
                                                                    oVar3 = oVar2;
                                                                    h10 = h11;
                                                                    i11 = intValue;
                                                                    jVar2 = jVar3;
                                                                    accessibilityEvent = o10.p(G112, 0, 0, valueOf2, T);
                                                                    accessibilityEvent.setClassName("android.widget.EditText");
                                                                    o10.K(accessibilityEvent);
                                                                    if (z11) {
                                                                    }
                                                                    long j62 = ((N0.D) jVar2.r(L0.r.f10470z)).f12485a;
                                                                    c10 = ' ';
                                                                    accessibilityEvent.setFromIndex((int) (j62 >> 32));
                                                                    accessibilityEvent.setToIndex((int) (j62 & 4294967295L));
                                                                    o10.K(accessibilityEvent);
                                                                }
                                                            } else {
                                                                h11 = h12;
                                                            }
                                                            z11 = false;
                                                            if (oVar5.f10421d.f10409Y.containsKey(uVar8)) {
                                                            }
                                                            z12 = false;
                                                            if (z11) {
                                                            }
                                                            int G1122 = o10.G(intValue);
                                                            Integer valueOf22 = Integer.valueOf(length2);
                                                            oVar3 = oVar2;
                                                            h10 = h11;
                                                            i11 = intValue;
                                                            jVar2 = jVar3;
                                                            accessibilityEvent = o10.p(G1122, 0, 0, valueOf22, T);
                                                            accessibilityEvent.setClassName("android.widget.EditText");
                                                            o10.K(accessibilityEvent);
                                                            if (z11) {
                                                            }
                                                            long j622 = ((N0.D) jVar2.r(L0.r.f10470z)).f12485a;
                                                            c10 = ' ';
                                                            accessibilityEvent.setFromIndex((int) (j622 >> 32));
                                                            accessibilityEvent.setToIndex((int) (j622 & 4294967295L));
                                                            o10.K(accessibilityEvent);
                                                        } else {
                                                            oVar3 = oVar2;
                                                            h10 = h12;
                                                            i11 = intValue;
                                                            jVar2 = jVar4;
                                                            c10 = ' ';
                                                            O.M(o10, o10.G(i11), 2048, 2, 8);
                                                        }
                                                        i10 = i11;
                                                    } else {
                                                        oVar3 = oVar2;
                                                        h10 = h12;
                                                        jVar2 = jVar4;
                                                        int i21 = intValue;
                                                        L0.u uVar11 = L0.r.f10470z;
                                                        if (AbstractC3557B.K(uVar3, uVar11)) {
                                                            C1046e c1046e4 = (C1046e) U3.f.T(jVar2, uVar7);
                                                            if (c1046e4 != null && (str4 = c1046e4.f12512Y) != null) {
                                                                str6 = str4;
                                                            }
                                                            int G12 = o10.G(i21);
                                                            long j10 = ((N0.D) jVar2.r(uVar11)).f12485a;
                                                            o10.K(o10.p(G12, Integer.valueOf((int) (j10 >> 32)), Integer.valueOf((int) (j10 & 4294967295L)), Integer.valueOf(str6.length()), O.T(str6)));
                                                            o10.O(i15);
                                                            i10 = i21;
                                                        } else {
                                                            i10 = i21;
                                                            if (AbstractC3557B.K(uVar3, uVar2) || AbstractC3557B.K(uVar3, L0.r.f10461q)) {
                                                                o10.C(aVar);
                                                                R0 m11 = Q.m(i10, arrayList2);
                                                                AbstractC3557B.Z(m11);
                                                                Object obj4 = linkedHashMap2.get(uVar2);
                                                                if (obj4 == null) {
                                                                    obj4 = null;
                                                                }
                                                                m11.f6875j0 = (L0.h) obj4;
                                                                Object obj5 = linkedHashMap2.get(L0.r.f10461q);
                                                                if (obj5 == null) {
                                                                    obj5 = null;
                                                                }
                                                                m11.f6876k0 = (L0.h) obj5;
                                                                if (m11.f6872Z.contains(m11)) {
                                                                    c0714y.getSnapshotObserver().a(m11, o10.f6816T0, new C0007a0(m11, 16, o10));
                                                                }
                                                            } else if (AbstractC3557B.K(uVar3, L0.r.f10456l)) {
                                                                Object value3 = entry.getValue();
                                                                AbstractC3557B.a0("null cannot be cast to non-null type kotlin.Boolean", value3);
                                                                if (((Boolean) value3).booleanValue()) {
                                                                    i13 = 8;
                                                                    o10.K(o10.o(o10.G(i15), 8));
                                                                } else {
                                                                    i13 = 8;
                                                                }
                                                                O.M(o10, o10.G(i15), 2048, 0, i13);
                                                            } else {
                                                                L0.u uVar12 = L0.i.f10404u;
                                                                if (AbstractC3557B.K(uVar3, uVar12)) {
                                                                    List list6 = (List) jVar2.r(uVar12);
                                                                    List list7 = (List) U3.f.T(jVar5, uVar12);
                                                                    if (list7 != null) {
                                                                        LinkedHashSet linkedHashSet = new LinkedHashSet();
                                                                        if (list6.size() <= 0) {
                                                                            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                                                                            if (list7.size() <= 0) {
                                                                                if (linkedHashSet.containsAll(linkedHashSet2) && linkedHashSet2.containsAll(linkedHashSet)) {
                                                                                    z15 = false;
                                                                                } else {
                                                                                    z15 = true;
                                                                                }
                                                                                intValue = i10;
                                                                                jVar4 = jVar2;
                                                                                oVar2 = oVar3;
                                                                                h12 = h10;
                                                                                arrayList3 = arrayList;
                                                                                t10 = map;
                                                                                it2 = it;
                                                                                c0714y3 = c0714y;
                                                                            } else {
                                                                                AbstractC2469q0.p(list7.get(0));
                                                                                throw null;
                                                                            }
                                                                        } else {
                                                                            AbstractC2469q0.p(list6.get(0));
                                                                            throw null;
                                                                        }
                                                                    } else {
                                                                        z10 = true;
                                                                        if (!list6.isEmpty()) {
                                                                            z15 = true;
                                                                            intValue = i10;
                                                                            jVar4 = jVar2;
                                                                            oVar2 = oVar3;
                                                                            h12 = h10;
                                                                            arrayList3 = arrayList;
                                                                            t10 = map;
                                                                            it2 = it;
                                                                            c0714y3 = c0714y;
                                                                        }
                                                                    }
                                                                } else {
                                                                    z10 = true;
                                                                    if (entry.getValue() instanceof L0.a) {
                                                                        Object value4 = entry.getValue();
                                                                        AbstractC3557B.a0("null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>", value4);
                                                                        L0.a aVar2 = (L0.a) value4;
                                                                        Object T10 = U3.f.T(jVar5, (L0.u) entry.getKey());
                                                                        if (aVar2 != T10) {
                                                                            if (T10 instanceof L0.a) {
                                                                                L0.a aVar3 = (L0.a) T10;
                                                                                if (AbstractC3557B.K(aVar2.f10368a, aVar3.f10368a)) {
                                                                                    AbstractC3953c abstractC3953c = aVar3.f10369b;
                                                                                    AbstractC3953c abstractC3953c2 = aVar2.f10369b;
                                                                                    if (abstractC3953c2 == null) {
                                                                                    }
                                                                                    if (abstractC3953c2 != null) {
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                        z15 = false;
                                                                    }
                                                                    z15 = true;
                                                                }
                                                            }
                                                            z10 = true;
                                                        }
                                                    }
                                                    z10 = true;
                                                }
                                            }
                                            oVar3 = oVar2;
                                            h10 = h12;
                                            i10 = intValue;
                                            jVar2 = jVar4;
                                            z10 = true;
                                        }
                                        intValue = i10;
                                        jVar4 = jVar2;
                                        oVar2 = oVar3;
                                        h12 = h10;
                                        arrayList3 = arrayList;
                                        t10 = map;
                                        it2 = it;
                                        c0714y3 = c0714y;
                                    }
                                    h10 = h12;
                                    i10 = intValue;
                                    c0714y = c0714y3;
                                    it = it2;
                                    oVar3 = oVar2;
                                    jVar2 = jVar4;
                                    z10 = true;
                                    intValue = i10;
                                    jVar4 = jVar2;
                                    oVar2 = oVar3;
                                    h12 = h10;
                                    arrayList3 = arrayList;
                                    t10 = map;
                                    it2 = it;
                                    c0714y3 = c0714y;
                                }
                            } else {
                                int i22 = intValue;
                                C0714y c0714y4 = c0714y3;
                                Map map2 = t10;
                                ArrayList arrayList4 = arrayList3;
                                Iterator it5 = it2;
                                L0.o oVar6 = oVar2;
                                if (!z15) {
                                    Iterator it6 = jVar5.iterator();
                                    while (it6.hasNext()) {
                                        if (!oVar6.h().f10409Y.containsKey((L0.u) ((Map.Entry) it6.next()).getKey())) {
                                            O.M(o10, o10.G(i22), 2048, 0, 8);
                                            break;
                                        }
                                    }
                                    arrayList3 = arrayList4;
                                    t10 = map2;
                                    it2 = it5;
                                    c0714y3 = c0714y4;
                                } else {
                                    if (z15) {
                                        O.M(o10, o10.G(i22), 2048, 0, 8);
                                        break;
                                    } else {
                                        O.M(o10, o10.G(i22), 2048, 0, 8);
                                        break;
                                    }
                                    arrayList3 = arrayList4;
                                    t10 = map2;
                                    it2 = it5;
                                    c0714y3 = c0714y4;
                                }
                            }
                        }
                    }
                } else {
                    throw new IllegalStateException("no value for specified key".toString());
                }
            } else {
                C0714y c0714y5 = c0714y3;
                C6060g c6060g = new C6060g(0);
                C6060g c6060g2 = o10.f6805I0;
                c6060g2.getClass();
                C6055b c6055b = new C6055b(c6060g2);
                while (c6055b.hasNext()) {
                    int intValue2 = ((Number) c6055b.next()).intValue();
                    S0 s03 = (S0) o10.t().get(Integer.valueOf(intValue2));
                    if (s03 != null) {
                        oVar = s03.f6878a;
                    } else {
                        oVar = null;
                    }
                    if (oVar != null) {
                        if (!oVar.h().f10409Y.containsKey(L0.r.f10449e)) {
                        }
                    }
                    c6060g.add(Integer.valueOf(intValue2));
                    H h15 = (H) linkedHashMap.get(Integer.valueOf(intValue2));
                    if (h15 != null && (jVar = h15.f6738b) != null) {
                        Object obj6 = jVar.f10409Y.get(L0.r.f10449e);
                        if (obj6 == null) {
                            obj6 = null;
                        }
                        str = (String) obj6;
                    } else {
                        str = null;
                    }
                    o10.N(intValue2, 32, str);
                }
                int i23 = c6060g.f47586h0;
                for (int i24 = 0; i24 < i23; i24++) {
                    c6060g2.remove(c6060g.f47585Z[i24]);
                }
                linkedHashMap.clear();
                for (Map.Entry entry2 : o10.t().entrySet()) {
                    L0.j h16 = ((S0) entry2.getValue()).f6878a.h();
                    L0.u uVar13 = L0.r.f10449e;
                    if (h16.f10409Y.containsKey(uVar13) && c6060g2.add(entry2.getKey())) {
                        o10.N(((Number) entry2.getKey()).intValue(), 16, (String) ((S0) entry2.getValue()).f6878a.f10421d.r(uVar13));
                    }
                    linkedHashMap.put(entry2.getKey(), new H(((S0) entry2.getValue()).f6878a, o10.t()));
                }
                o10.f6812P0 = new H(c0714y5.getSemanticsOwner().a(), o10.t());
                o10.f6813Q0 = false;
                return;
            }
        }
    }

    private final void b() {
        C2.f fVar = (C2.f) this.f30946Z;
        synchronized (fVar.f2524a) {
            try {
                if (!fVar.f2535l) {
                    long j6 = fVar.f2534k - 1;
                    fVar.f2534k = j6;
                    int i10 = (j6 > 0L ? 1 : (j6 == 0L ? 0 : -1));
                    if (i10 <= 0) {
                        if (i10 < 0) {
                            fVar.b(new IllegalStateException());
                        } else {
                            fVar.a();
                        }
                    }
                }
            } finally {
            }
        }
    }

    private final void c() {
        x3.n nVar = (x3.n) this.f30946Z;
        synchronized (nVar.f48708l) {
            nVar.f48703g = false;
            nVar.f48705i.d();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Boolean bool;
        boolean z10;
        Object[] objArr;
        Object obj;
        C5274d c5274d;
        I8.u uVar;
        q5.g gVar;
        d6.e eVar;
        Boolean bool2 = null;
        String str = null;
        bool2 = null;
        switch (this.f30945Y) {
            case 0:
                ((AbstractActivityC3122o) this.f30946Z).invalidateOptionsMenu();
                return;
            case 1:
                ExecutorC3121n executorC3121n = (ExecutorC3121n) this.f30946Z;
                Runnable runnable = executorC3121n.f30963Z;
                if (runnable != null) {
                    runnable.run();
                    executorC3121n.f30963Z = null;
                    return;
                }
                return;
            case 2:
                DialogC3123p.b((DialogC3123p) this.f30946Z);
                return;
            case 3:
            case 18:
            default:
                C5370b c5370b = (C5370b) this.f30946Z;
                int i10 = C5370b.f44444k;
                AbstractC3557B.c0("this$0", c5370b);
                c5370b.d(new C4938q());
                return;
            case 4:
                V.t.a((V.t) this.f30946Z);
                return;
            case 5:
                C0714y c0714y = (C0714y) this.f30946Z;
                c0714y.f7130u1 = false;
                MotionEvent motionEvent = c0714y.f7118o1;
                AbstractC3557B.Z(motionEvent);
                if (motionEvent.getActionMasked() == 10) {
                    c0714y.y(motionEvent);
                    return;
                }
                throw new IllegalStateException("The ACTION_HOVER_EXIT event was not cleared.".toString());
            case 6:
                a();
                return;
            case 7:
                T0.D d10 = (T0.D) this.f30946Z;
                d10.f16751n = null;
                C2104h c2104h = d10.f16750m;
                int i11 = c2104h.f25569h0;
                if (i11 > 0) {
                    Object[] objArr2 = c2104h.f25567Y;
                    int i12 = 0;
                    bool = null;
                    do {
                        T0.B b10 = (T0.B) objArr2[i12];
                        int ordinal = b10.ordinal();
                        if (ordinal != 0) {
                            if (ordinal != 1) {
                                if ((ordinal == 2 || ordinal == 3) && !AbstractC3557B.K(bool2, Boolean.FALSE)) {
                                    if (b10 == T0.B.f16734h0) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    bool = Boolean.valueOf(z10);
                                }
                                i12++;
                            } else {
                                bool2 = Boolean.FALSE;
                            }
                        } else {
                            bool2 = Boolean.TRUE;
                        }
                        bool = bool2;
                        i12++;
                    } while (i12 < i11);
                } else {
                    bool = null;
                }
                c2104h.f();
                if (AbstractC3557B.K(bool2, Boolean.TRUE)) {
                    T0.q qVar = (T0.q) d10.f16739b;
                    ((InputMethodManager) qVar.f16809b.getValue()).restartInput(qVar.f16808a);
                }
                if (bool != null) {
                    boolean booleanValue = bool.booleanValue();
                    T0.p pVar = d10.f16739b;
                    if (booleanValue) {
                        ((C1915c) ((T0.q) pVar).f16810c.f5033Z).w();
                    } else {
                        ((C1915c) ((T0.q) pVar).f16810c.f5033Z).o();
                    }
                }
                if (AbstractC3557B.K(bool2, Boolean.FALSE)) {
                    T0.q qVar2 = (T0.q) d10.f16739b;
                    ((InputMethodManager) qVar2.f16809b.getValue()).restartInput(qVar2.f16808a);
                    return;
                }
                return;
            case 8:
                Activity activity = (Activity) this.f30946Z;
                int i13 = AbstractC4892g.f40451b;
                if (!activity.isFinishing()) {
                    int i14 = Build.VERSION.SDK_INT;
                    if (i14 >= 28) {
                        Class cls = AbstractC4894i.f40458a;
                        activity.recreate();
                        return;
                    }
                    Class cls2 = AbstractC4894i.f40458a;
                    if (i14 != 26 && i14 != 27) {
                        objArr = null;
                    } else {
                        objArr = 1;
                    }
                    Method method = AbstractC4894i.f40463f;
                    if ((objArr == null || method != null) && (AbstractC4894i.f40462e != null || AbstractC4894i.f40461d != null)) {
                        try {
                            Object obj2 = AbstractC4894i.f40460c.get(activity);
                            if (obj2 != null && (obj = AbstractC4894i.f40459b.get(activity)) != null) {
                                Application application = activity.getApplication();
                                C4893h c4893h = new C4893h(activity);
                                application.registerActivityLifecycleCallbacks(c4893h);
                                Handler handler = AbstractC4894i.f40464g;
                                handler.post(new RunnableC5216j(c4893h, obj2, 2));
                                if (i14 != 26 && i14 != 27) {
                                    activity.recreate();
                                } else {
                                    Boolean bool3 = Boolean.FALSE;
                                    method.invoke(obj, obj2, null, null, 0, bool3, null, null, bool3, bool3);
                                }
                                handler.post(new RunnableC5216j(application, c4893h, 3));
                                return;
                            }
                        } catch (Throwable unused) {
                        }
                    }
                    activity.recreate();
                    return;
                }
                return;
            case 9:
                View view = (View) this.f30946Z;
                ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 0);
                return;
            case 10:
                ArrayList arrayList = (ArrayList) this.f30946Z;
                AbstractC3557B.c0("$transitioningViews", arrayList);
                S.a(4, arrayList);
                return;
            case 11:
                AbstractComponentCallbacksC1480v abstractComponentCallbacksC1480v = (AbstractComponentCallbacksC1480v) this.f30946Z;
                abstractComponentCallbacksC1480v.f18279T0.f18155k0.b(abstractComponentCallbacksC1480v.f18288i0);
                abstractComponentCallbacksC1480v.f18288i0 = null;
                return;
            case 12:
                ProcessLifecycleOwner processLifecycleOwner = (ProcessLifecycleOwner) this.f30946Z;
                ProcessLifecycleOwner processLifecycleOwner2 = ProcessLifecycleOwner.f25313n0;
                AbstractC3557B.c0("this$0", processLifecycleOwner);
                if (processLifecycleOwner.f25315Z == 0) {
                    processLifecycleOwner.f25316h0 = true;
                    processLifecycleOwner.f25319k0.k(EnumC2081p.ON_PAUSE);
                }
                if (processLifecycleOwner.f25314Y == 0 && processLifecycleOwner.f25316h0) {
                    processLifecycleOwner.f25319k0.k(EnumC2081p.ON_STOP);
                    processLifecycleOwner.f25317i0 = true;
                    return;
                }
                return;
            case 13:
                AbstractC2469q0.p(this.f30946Z);
                int i15 = C4507D.f38590c;
                throw null;
            case 14:
                z2.w wVar = (z2.w) this.f30946Z;
                C6757b I10 = wVar.I();
                wVar.N(I10, 1028, new z2.r(I10, 1));
                wVar.f51541k0.k();
                return;
            case 15:
                C0206g c0206g = (C0206g) this.f30946Z;
                if (!c0206g.f1778h0) {
                    B2.k kVar = c0206g.f1777Z;
                    if (kVar != null) {
                        kVar.c(c0206g.f1776Y);
                    }
                    c0206g.f1779i0.f1795r0.remove(c0206g);
                    c0206g.f1778h0 = true;
                    return;
                }
                return;
            case 16:
                ((C0203d) this.f30946Z).c(null);
                return;
            case 17:
                b();
                return;
            case 19:
                c();
                return;
            case 20:
                CoroutineWorker coroutineWorker = (CoroutineWorker) this.f30946Z;
                AbstractC3557B.c0("this$0", coroutineWorker);
                if (coroutineWorker.f25515k0.f20718Y instanceof W3.a) {
                    coroutineWorker.f25514j0.k(null);
                    return;
                }
                return;
            case 21:
                ConstraintTrackingWorker constraintTrackingWorker = (ConstraintTrackingWorker) this.f30946Z;
                AbstractC3557B.c0("this$0", constraintTrackingWorker);
                if (!(constraintTrackingWorker.f25552m0.f20718Y instanceof W3.a)) {
                    Object obj3 = constraintTrackingWorker.f10726Z.f25520b.f10715a.get("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME");
                    if (obj3 instanceof String) {
                        str = (String) obj3;
                    }
                    L3.s d11 = L3.s.d();
                    AbstractC3557B.b0("get()", d11);
                    if (str != null && str.length() != 0) {
                        L3.E e10 = constraintTrackingWorker.f10726Z.f25524f;
                        Context context = constraintTrackingWorker.f10725Y;
                        WorkerParameters workerParameters = constraintTrackingWorker.f25549j0;
                        e10.getClass();
                        L3.r a5 = L3.E.a(context, str, workerParameters);
                        constraintTrackingWorker.f25553n0 = a5;
                        if (a5 == null) {
                            d11.a(Y3.a.f22098a, "No worker to delegate to.");
                            W3.i iVar = constraintTrackingWorker.f25552m0;
                            AbstractC3557B.b0("future", iVar);
                            iVar.j(new L3.n());
                            return;
                        }
                        M3.F g02 = M3.F.g0(constraintTrackingWorker.f10725Y);
                        U3.s u10 = g02.f11519h.u();
                        String uuid = constraintTrackingWorker.f10726Z.f25519a.toString();
                        AbstractC3557B.b0("id.toString()", uuid);
                        U3.q l10 = u10.l(uuid);
                        if (l10 == null) {
                            W3.i iVar2 = constraintTrackingWorker.f25552m0;
                            AbstractC3557B.b0("future", iVar2);
                            String str2 = Y3.a.f22098a;
                            iVar2.j(new L3.n());
                            return;
                        }
                        S3.m mVar = g02.f11526o;
                        AbstractC3557B.b0("workManagerImpl.trackers", mVar);
                        Q3.j jVar = new Q3.j(mVar);
                        C1057d0 c1057d0 = g02.f11520i.f21780b;
                        AbstractC3557B.b0("workManagerImpl.workTask\u2026r.taskCoroutineDispatcher", c1057d0);
                        constraintTrackingWorker.f25552m0.a(new RunnableC3111d(22, Q3.l.a(jVar, l10, c1057d0, constraintTrackingWorker)), new ExecutorC4519P(1));
                        if (jVar.d(l10)) {
                            d11.a(Y3.a.f22098a, "Constraints met for delegate ".concat(str));
                            try {
                                L3.r rVar = constraintTrackingWorker.f25553n0;
                                AbstractC3557B.Z(rVar);
                                W3.i c10 = rVar.c();
                                AbstractC3557B.b0("delegate!!.startWork()", c10);
                                c10.a(new RunnableC4517N(constraintTrackingWorker, 24, c10), constraintTrackingWorker.f10726Z.f25522d);
                                return;
                            } catch (Throwable th2) {
                                String str3 = Y3.a.f22098a;
                                String A10 = android.gov.nist.core.a.A("Delegated worker ", str, " threw exception in startWork.");
                                if (d11.f10731a <= 3) {
                                    Log.d(str3, A10, th2);
                                }
                                synchronized (constraintTrackingWorker.f25550k0) {
                                    try {
                                        if (constraintTrackingWorker.f25551l0) {
                                            d11.a(str3, "Constraints were unmet, Retrying.");
                                            W3.i iVar3 = constraintTrackingWorker.f25552m0;
                                            AbstractC3557B.b0("future", iVar3);
                                            iVar3.j(new Object());
                                            return;
                                        }
                                        W3.i iVar4 = constraintTrackingWorker.f25552m0;
                                        AbstractC3557B.b0("future", iVar4);
                                        iVar4.j(new L3.n());
                                        return;
                                    } catch (Throwable th3) {
                                        throw th3;
                                    }
                                }
                            }
                        }
                        d11.a(Y3.a.f22098a, "Constraints not met for delegate " + str + ". Requesting retry.");
                        W3.i iVar5 = constraintTrackingWorker.f25552m0;
                        AbstractC3557B.b0("future", iVar5);
                        iVar5.j(new Object());
                        return;
                    }
                    d11.b(Y3.a.f22098a, "No worker to delegate to.");
                    W3.i iVar6 = constraintTrackingWorker.f25552m0;
                    AbstractC3557B.b0("future", iVar6);
                    iVar6.j(new L3.n());
                    return;
                }
                return;
            case 22:
                AbstractC1073l0 abstractC1073l0 = (AbstractC1073l0) this.f30946Z;
                AbstractC3557B.c0("$job", abstractC1073l0);
                abstractC1073l0.k(null);
                return;
            case 23:
                HashMap hashMap = v4.e.f47174a;
                I4.g.b((InputStream) this.f30946Z);
                return;
            case 24:
                HashMap hashMap2 = v4.e.f47174a;
                I4.g.b((ZipInputStream) this.f30946Z);
                return;
            case 25:
                ExecutorService executorService = v4.p.f47237e;
                ((v4.p) this.f30946Z).d();
                return;
            case 26:
                V4.c cVar = (V4.c) this.f30946Z;
                AbstractC3557B.c0("this$0", cVar);
                wf.k onViewReadyListener = cVar.getOnViewReadyListener();
                if (onViewReadyListener != null) {
                    onViewReadyListener.invoke(cVar.f18394K0.f21783a);
                    return;
                }
                return;
            case 27:
                u5.f fVar = (u5.f) this.f30946Z;
                int i16 = u5.f.f46429l;
                AbstractC3557B.c0("this$0", fVar);
                fVar.t();
                return;
            case 28:
                d6.b bVar = (d6.b) this.f30946Z;
                AbstractC3557B.c0("this$0", bVar);
                File file = bVar.f28019o0;
                AbstractC5091c abstractC5091c = bVar.f28015k0;
                try {
                    if (AbstractC4344b.g0(file, abstractC5091c)) {
                        try {
                            File[] E02 = AbstractC4344b.E0(file, abstractC5091c);
                            if (E02 != null) {
                                for (File file2 : E02) {
                                    String name = file2.getName();
                                    if (name != null) {
                                        int hashCode = name.hashCode();
                                        G5.f fVar2 = bVar.f28017m0;
                                        switch (hashCode) {
                                            case -528983909:
                                                if (!name.equals("network_information")) {
                                                    break;
                                                } else {
                                                    String c11 = bVar.c(file2, fVar2);
                                                    if (c11 != null) {
                                                        c5274d = (C5274d) bVar.f28013i0.a(c11);
                                                    } else {
                                                        c5274d = null;
                                                    }
                                                    bVar.f28022r0 = c5274d;
                                                    continue;
                                                }
                                            case 75377097:
                                                if (name.equals("last_view_event")) {
                                                    String d12 = bVar.d(file2, bVar.f28016l0);
                                                    if (d12 != null) {
                                                        uVar = (I8.u) bVar.f28012h0.a(d12);
                                                    } else {
                                                        uVar = null;
                                                    }
                                                    bVar.f28020p0 = uVar;
                                                    break;
                                                } else {
                                                    continue;
                                                }
                                            case 408381112:
                                                if (name.equals("user_information")) {
                                                    String c12 = bVar.c(file2, fVar2);
                                                    if (c12 != null) {
                                                        gVar = (q5.g) bVar.f28014j0.a(c12);
                                                    } else {
                                                        gVar = null;
                                                    }
                                                    bVar.f28021q0 = gVar;
                                                    break;
                                                } else {
                                                    continue;
                                                }
                                            case 1847397036:
                                                if (name.equals("crash_log")) {
                                                    String T02 = AbstractC4344b.T0(file2, abstractC5091c);
                                                    if (T02 != null) {
                                                        eVar = (d6.e) bVar.f28011Z.a(T02);
                                                    } else {
                                                        eVar = null;
                                                    }
                                                    bVar.f28023s0 = eVar;
                                                    break;
                                                } else {
                                                    continue;
                                                }
                                        }
                                    }
                                }
                            }
                        } catch (SecurityException e11) {
                            P4.a.l0(bVar.f28015k0, 5, AbstractC4344b.G0(EnumC5090b.f42739Z, EnumC5090b.f42740h0), d6.a.f28006h0, e11, 48);
                        }
                        bVar.a();
                        return;
                    }
                    return;
                } finally {
                    bVar.a();
                }
        }
    }
}
