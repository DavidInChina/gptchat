package h;

import F.B;
import F.C0535i;
import G0.J;
import Kb.q;
import L.A0;
import L.P0;
import L.Q0;
import Lg.n;
import N0.C;
import N0.D;
import T0.s;
import T0.z;
import Z.AbstractC1710f0;
import Z.M;
import Z.N;
import Z.l1;
import android.os.Bundle;
import d1.C2584s;
import d1.C2587v;
import h0.C3288a;
import id.AbstractC3557B;
import j0.C3885a;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import jf.y;
import kf.v;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.x;
import me.AbstractC4635h;
import me.C4633f;
import me.C4634g;
import me.P;
import na.C4751f0;
import oe.C4999h;
import pe.AbstractC5152d;
import q0.C5252d;
import q0.C5254f;
import qe.C5320l;
import r0.AbstractC5350n;
import s3.AbstractC5568s;
import s3.C5562l;
import t0.AbstractC5646e;
import t0.AbstractC5648g;
import wa.C6154f;
import wf.AbstractC6216a;
import y.AbstractC6482u;
import y.C6460A;
import y.O;
import y.d0;
import y.e0;
import z.C6694e;
import zc.C6821H;

/* renamed from: h.d  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3278d extends o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f31650Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Object f31651Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Object f31652h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ Object f31653i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ Object f31654j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ Object f31655k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3278d(C2584s c2584s, AbstractC6216a abstractC6216a, C2587v c2587v, String str, Z0.l lVar) {
        super(1);
        this.f31650Y = 2;
        this.f31651Z = c2584s;
        this.f31652h0 = abstractC6216a;
        this.f31654j0 = c2587v;
        this.f31653i0 = str;
        this.f31655k0 = lVar;
    }

    public final M a(N n10) {
        int i10 = this.f31650Y;
        Object obj = this.f31655k0;
        Object obj2 = this.f31653i0;
        Object obj3 = this.f31654j0;
        Object obj4 = this.f31652h0;
        Object obj5 = this.f31651Z;
        switch (i10) {
            case 0:
                C3275a c3275a = (C3275a) obj5;
                c3275a.f31645a = ((j.h) obj4).c((String) obj2, (P4.a) obj3, new C3276b(0, (l1) obj));
                return new C3277c(0, c3275a);
            default:
                C2584s c2584s = (C2584s) obj5;
                c2584s.f27911u0.addView(c2584s, c2584s.f27912v0);
                c2584s.j((AbstractC6216a) obj4, (C2587v) obj3, (String) obj2, (Z0.l) obj);
                return new C3277c(9, c2584s);
        }
    }

    /* JADX WARN: Type inference failed for: r4v20, types: [kotlin.jvm.internal.o, wf.k] */
    @Override // wf.k
    public final Object invoke(Object obj) {
        C5252d c5252d;
        C c10;
        List list;
        String str;
        String str2;
        y yVar = y.f36177a;
        int i10 = this.f31650Y;
        float f6 = 0.0f;
        Object obj2 = this.f31655k0;
        Object obj3 = this.f31654j0;
        Object obj4 = this.f31653i0;
        Object obj5 = this.f31652h0;
        Object obj6 = this.f31651Z;
        switch (i10) {
            case 0:
                return a((N) obj);
            case 1:
                J j6 = (J) ((AbstractC5646e) obj);
                j6.a();
                float o10 = com.google.android.gms.internal.play_billing.N.o(((Number) ((C6694e) obj6).e()).floatValue(), 0.0f, 1.0f);
                if (o10 != 0.0f) {
                    long j10 = ((z) obj4).f16831b;
                    int i11 = D.f12484c;
                    int b10 = ((s) obj5).b((int) (j10 >> 32));
                    Q0 d10 = ((P0) obj3).d();
                    if (d10 != null && (c10 = d10.f10054a) != null) {
                        c5252d = c10.c(b10);
                    } else {
                        c5252d = new C5252d(0.0f, 0.0f, 0.0f, 0.0f);
                    }
                    float R10 = j6.R(A0.f9857b);
                    float f10 = R10 / 2;
                    float j11 = com.google.android.gms.internal.play_billing.N.j(com.google.android.gms.internal.play_billing.N.l(c5252d.f43625a + f10, C5254f.d(j6.f5596Y.g()) - f10), f10);
                    AbstractC5648g.f(j6, (AbstractC5350n) obj2, R4.b.r(j11, c5252d.f43626b), R4.b.r(j11, c5252d.f43628d), R10, o10, 432);
                }
                return yVar;
            case 2:
                return a((N) obj);
            case 3:
                C5562l c5562l = (C5562l) obj;
                AbstractC3557B.c0("entry", c5562l);
                ((x) obj6).f37645Y = true;
                List list2 = (List) obj5;
                int indexOf = list2.indexOf(c5562l);
                if (indexOf != -1) {
                    kotlin.jvm.internal.z zVar = (kotlin.jvm.internal.z) obj4;
                    int i12 = indexOf + 1;
                    list = list2.subList(zVar.f37647Y, i12);
                    zVar.f37647Y = i12;
                } else {
                    list = v.f37483Y;
                }
                ((AbstractC5568s) obj3).a(c5562l.f45306Z, (Bundle) obj2, c5562l, list);
                return yVar;
            case 4:
                C6460A c6460a = (C6460A) ((AbstractC6482u) obj);
                if (((List) ((l1) obj2).getValue()).contains(c6460a.a())) {
                    Map map = (Map) obj6;
                    Float f11 = (Float) map.get(((C5562l) c6460a.a()).f45310k0);
                    if (f11 != null) {
                        f6 = f11.floatValue();
                    } else {
                        map.put(((C5562l) c6460a.a()).f45310k0, Float.valueOf(0.0f));
                    }
                    if (!AbstractC3557B.K(((C5562l) c6460a.c()).f45310k0, ((C5562l) c6460a.a()).f45310k0)) {
                        if (((Boolean) ((t3.i) obj5).f45689c.getValue()).booleanValue()) {
                            f6 -= 1.0f;
                        } else {
                            f6 += 1.0f;
                        }
                    }
                    float f12 = f6;
                    map.put(((C5562l) c6460a.c()).f45310k0, Float.valueOf(f12));
                    return new O((d0) ((wf.k) obj4).invoke(c6460a), (e0) ((wf.k) obj3).invoke(c6460a), f12, null, 8);
                }
                return new O(d0.f50196b, e0.f50199b, 0.0f, null, 12);
            case 5:
                B b11 = (B) obj;
                AbstractC3557B.c0("$this$LazyColumn", b11);
                AbstractC1710f0 abstractC1710f0 = (AbstractC1710f0) obj5;
                ArrayList arrayList = new ArrayList();
                for (Object obj7 : (List) obj6) {
                    Fb.f fVar = (Fb.f) obj7;
                    float f13 = q.f9624a;
                    String obj8 = n.U2((String) abstractC1710f0.getValue()).toString();
                    if (n.Z1(fVar.f5145a, obj8, true) || n.Z1(fVar.f5146b, obj8, true) || (((str = fVar.f5148d) != null && n.Z1(str, obj8, true)) || ((str2 = fVar.f5147c) != null && n.Z1(str2, obj8, true)))) {
                        arrayList.add(obj7);
                    }
                }
                C0535i c0535i = (C0535i) b11;
                c0535i.l0(arrayList.size(), null, new C4751f0(Kb.e.f9598i0, arrayList, 14), new C3288a(new C6154f((List) arrayList, (Object) ((Fb.f) obj4), (wf.k) obj3, (Object) ((AbstractC6216a) obj2), 3), true, -632812321));
                return yVar;
            default:
                ge.f fVar2 = (ge.f) obj;
                AbstractC3557B.c0("$this$HttpClient", fVar2);
                fVar2.f31609d = new C3885a(fVar2.f31609d, new C6.a((Set) obj6, (Set) obj5, (Set) obj4, 21), 4);
                fVar2.a(pe.l.f43127i0, new C6821H(3, (AbstractC5152d) obj3));
                fVar2.a(C4999h.f41320c, Zc.d.f23673Z);
                fVar2.a(C5320l.f44112e, Zc.d.f23675i0);
                fVar2.a(P.f39182d, Zc.d.f23676j0);
                C6821H c6821h = new C6821H(4, (Vc.y) obj2);
                Ei.a aVar = AbstractC4635h.f39204a;
                fVar2.a(C4633f.f39199b, new C4634g(0, c6821h));
                fVar2.f31612g = true;
                return yVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3278d(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        super(1);
        this.f31650Y = i10;
        this.f31651Z = obj;
        this.f31652h0 = obj2;
        this.f31653i0 = obj3;
        this.f31654j0 = obj4;
        this.f31655k0 = obj5;
    }
}
