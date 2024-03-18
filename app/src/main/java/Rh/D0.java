package Rh;

import Qh.AbstractC1235m;
import Qh.AbstractC1239q;
import android.gov.nist.core.Separators;
import java.util.List;
import java.util.ListIterator;
import th.AbstractC5802j;
import th.AbstractC5809q;
import th.C5785Q;
import th.C5787T;
import th.C5788U;
import th.C5790W;
import uh.AbstractC5929a;
import uh.C5931c;

/* loaded from: classes.dex */
public final class D0 extends F0 {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f15610b;

    /* renamed from: c  reason: collision with root package name */
    public final p1 f15611c;

    /* renamed from: d  reason: collision with root package name */
    public transient /* synthetic */ AbstractC5809q f15612d;

    /* renamed from: e  reason: collision with root package name */
    public final Object f15613e;

    /* renamed from: f  reason: collision with root package name */
    public final Object f15614f;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ D0(j1 j1Var, AbstractC1291b abstractC1291b, List list) {
        this(j1Var, abstractC1291b, list, 0);
        this.f15610b = 0;
    }

    @Override // th.h0
    public final int c() {
        switch (this.f15610b) {
            case 0:
                return 13;
            default:
                return 11;
        }
    }

    @Override // Rh.F0
    public final AbstractC5809q e() {
        int i10 = this.f15610b;
        Object obj = this.f15614f;
        Object obj2 = this.f15613e;
        p1 p1Var = this.f15611c;
        AbstractC5809q abstractC5809q = null;
        switch (i10) {
            case 0:
                if (this.f15612d == null) {
                    String a5 = ((AbstractC1291b) obj2).a();
                    if (a5 != null) {
                        o1 a10 = p1Var.a(a5);
                        if (!a10.b()) {
                            abstractC5809q = new C5790W(a5);
                        } else if (a10.a().q0()) {
                            abstractC5809q = new C5785Q(AbstractC5929a.class, a10.a(), (List) obj);
                        } else if (a10.a().M0()) {
                            abstractC5809q = new C5785Q(AbstractC5802j.class, a10.a(), (List) obj);
                        } else if (a10.a().H(Class.class)) {
                            abstractC5809q = new C5785Q(yh.l1.class, a10.a(), (List) obj);
                        } else if (a10.a().H(String.class)) {
                            abstractC5809q = new C5785Q(String.class, a10.a(), (List) obj);
                        } else {
                            yh.l1 a11 = a10.a();
                            Class cls = Boolean.TYPE;
                            if (a11.H(cls)) {
                                abstractC5809q = new C5785Q(cls, a10.a(), (List) obj);
                            } else {
                                yh.l1 a12 = a10.a();
                                Class cls2 = Byte.TYPE;
                                if (a12.H(cls2)) {
                                    abstractC5809q = new C5785Q(cls2, a10.a(), (List) obj);
                                } else {
                                    yh.l1 a13 = a10.a();
                                    Class cls3 = Short.TYPE;
                                    if (a13.H(cls3)) {
                                        abstractC5809q = new C5785Q(cls3, a10.a(), (List) obj);
                                    } else {
                                        yh.l1 a14 = a10.a();
                                        Class cls4 = Character.TYPE;
                                        if (a14.H(cls4)) {
                                            abstractC5809q = new C5785Q(cls4, a10.a(), (List) obj);
                                        } else {
                                            yh.l1 a15 = a10.a();
                                            Class cls5 = Integer.TYPE;
                                            if (a15.H(cls5)) {
                                                abstractC5809q = new C5785Q(cls5, a10.a(), (List) obj);
                                            } else {
                                                yh.l1 a16 = a10.a();
                                                Class cls6 = Long.TYPE;
                                                if (a16.H(cls6)) {
                                                    abstractC5809q = new C5785Q(cls6, a10.a(), (List) obj);
                                                } else {
                                                    yh.l1 a17 = a10.a();
                                                    Class cls7 = Float.TYPE;
                                                    if (a17.H(cls7)) {
                                                        abstractC5809q = new C5785Q(cls7, a10.a(), (List) obj);
                                                    } else {
                                                        yh.l1 a18 = a10.a();
                                                        Class cls8 = Double.TYPE;
                                                        if (a18.H(cls8)) {
                                                            abstractC5809q = new C5785Q(cls8, a10.a(), (List) obj);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    List list = (List) obj;
                    ListIterator listIterator = list.listIterator(list.size());
                    int i11 = 14;
                    while (listIterator.hasPrevious() && i11 == 14) {
                        i11 = ((th.h0) listIterator.previous()).c();
                    }
                    abstractC5809q = new E0(th.g0.JAVA_19_CAPABLE_VM.a(i11), i11);
                }
                if (abstractC5809q == null) {
                    return this.f15612d;
                }
                this.f15612d = abstractC5809q;
                return abstractC5809q;
            default:
                if (this.f15612d == null) {
                    String str = (String) obj2;
                    o1 a19 = p1Var.a(str);
                    if (!a19.b()) {
                        abstractC5809q = new C5790W(str);
                    } else if (!a19.a().q0()) {
                        StringBuilder r10 = android.gov.nist.core.a.r(str, Separators.DOT);
                        r10.append((String) obj);
                        abstractC5809q = new E0(r10.toString(), 11);
                    } else {
                        String str2 = (String) obj;
                        if (((vh.l) ((AbstractC1239q) a19.a().U0()).f(AbstractC1235m.c(str2))).isEmpty()) {
                            abstractC5809q = new C5787T(0, a19.a(), str2);
                        } else {
                            abstractC5809q = new C5788U(new C5931c(str2, a19.a()));
                        }
                    }
                }
                if (abstractC5809q == null) {
                    return this.f15612d;
                }
                this.f15612d = abstractC5809q;
                return abstractC5809q;
        }
    }

    public D0(j1 j1Var, Object obj, Object obj2, int i10) {
        this.f15610b = i10;
        this.f15611c = j1Var;
        this.f15613e = obj;
        this.f15614f = obj2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ D0(j1 j1Var, String str, String str2) {
        this(j1Var, str, str2, 1);
        this.f15610b = 1;
    }
}
