package B;

import W.C1645z;
import id.AbstractC3557B;
import java.util.List;
import java.util.Map;
import k6.AbstractC4194d;
import l8.AbstractC4344b;
import lf.C4436a;
import me.AbstractC4635h;
import me.C4628a;
import me.C4632e;
import me.C4633f;
import nf.AbstractC4825e;
import oe.C4999h;
import of.EnumC5000a;
import pf.AbstractC5163j;
import qe.AbstractC5321m;
import qe.C5320l;
import te.C5760d;
import xe.AbstractC6402G;
import xe.C6403H;
import xe.C6405J;
import xe.C6408M;
import xe.C6410O;
import xe.C6411P;
import xe.C6433v;
import ze.AbstractC6848g;

/* loaded from: classes.dex */
public final class D extends AbstractC5163j implements wf.o {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f1045Y;

    /* renamed from: Z  reason: collision with root package name */
    public int f1046Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Object f1047h0;

    /* renamed from: i0  reason: collision with root package name */
    public /* synthetic */ Object f1048i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ D(K0 k02, wf.n nVar, AbstractC4825e abstractC4825e, int i10) {
        super(3, abstractC4825e);
        this.f1045Y = i10;
        this.f1048i0 = k02;
        this.f1047h0 = nVar;
    }

    @Override // wf.o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        jf.y yVar = jf.y.f36177a;
        int i10 = this.f1045Y;
        Object obj4 = this.f1047h0;
        switch (i10) {
            case 0:
                C c10 = (C) obj;
                P0 p02 = (P0) obj2;
                return new D((F) this.f1048i0, (wf.n) obj4, (AbstractC4825e) obj3, 0).invokeSuspend(yVar);
            case 1:
                C1645z c1645z = (C1645z) obj;
                W.F1 f12 = (W.F1) obj2;
                return new D((F) this.f1048i0, (wf.n) obj4, (AbstractC4825e) obj3, 1).invokeSuspend(yVar);
            case 2:
                return p((Ie.e) obj, obj2, (AbstractC4825e) obj3);
            case 3:
                return p((Ie.e) obj, obj2, (AbstractC4825e) obj3);
            case 4:
                return p((Ie.e) obj, obj2, (AbstractC4825e) obj3);
            default:
                return p((Ie.e) obj, obj2, (AbstractC4825e) obj3);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0086, code lost:
        if (r14 != r1) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0109, code lost:
        if (r14 == r1) goto L51;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b1  */
    /* JADX WARN: Type inference failed for: r3v40 */
    /* JADX WARN: Type inference failed for: r3v41, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v42, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v43 */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v22, types: [Ie.e, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r4v29 */
    @Override // pf.AbstractC5154a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i10;
        Ie.e eVar;
        Throwable th2;
        Ie.e eVar2;
        C5320l c5320l;
        jf.y yVar = jf.y.f36177a;
        int i11 = this.f1045Y;
        Integer num = 0;
        ?? r42 = "call to 'resume' before 'invoke' with coroutine";
        Object obj2 = this.f1047h0;
        switch (i11) {
            case 0:
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                int i12 = this.f1046Z;
                if (i12 != 0) {
                    if (i12 == 1) {
                        com.google.android.gms.internal.play_billing.N.B0(obj);
                        return yVar;
                    }
                    throw new IllegalStateException((String) r42);
                }
                com.google.android.gms.internal.play_billing.N.B0(obj);
                E e10 = ((F) this.f1048i0).f1069b;
                this.f1046Z = 1;
                if (((wf.n) obj2).invoke(e10, this) == enumC5000a) {
                    return enumC5000a;
                }
                return yVar;
            case 1:
                EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
                int i13 = this.f1046Z;
                if (i13 != 0) {
                    if (i13 == 1) {
                        com.google.android.gms.internal.play_billing.N.B0(obj);
                        return yVar;
                    }
                    throw new IllegalStateException((String) r42);
                }
                com.google.android.gms.internal.play_billing.N.B0(obj);
                E e11 = ((F) this.f1048i0).f1069b;
                this.f1046Z = 1;
                if (((wf.n) obj2).invoke(e11, this) == enumC5000a2) {
                    return enumC5000a2;
                }
                return yVar;
            case 2:
                EnumC5000a enumC5000a3 = EnumC5000a.f41328Y;
                if (this.f1046Z == 0) {
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                    Ie.e eVar3 = (Ie.e) this.f1048i0;
                    String c6405j = ((C5760d) eVar3.f8578Y).f46125a.toString();
                    C4632e c4632e = new C4632e();
                    C5760d c5760d = (C5760d) eVar3.f8578Y;
                    C6433v c6433v = c5760d.f46127c;
                    C6433v c6433v2 = c4632e.f39196a;
                    Df.H.n(c6433v2, c6433v);
                    ((C4633f) obj2).f39201a.invoke(c4632e);
                    C6410O b10 = c4632e.f39197b.b();
                    C4628a c4628a = C4633f.f39199b;
                    C6405J c6405j2 = c5760d.f46125a;
                    boolean K10 = AbstractC3557B.K(c6405j2.f49839a, C6408M.f49850c);
                    C6408M c6408m = b10.f49858a;
                    if (K10) {
                        c6405j2.e(c6408m);
                    }
                    if (c6405j2.f49840b.length() <= 0) {
                        C6405J c6405j3 = new C6405J();
                        c6405j3.e(c6408m);
                        c6405j3.d(b10.f49859b);
                        int i14 = b10.f49860c;
                        Integer valueOf = Integer.valueOf(i14);
                        if (i14 != 0) {
                            num = valueOf;
                        }
                        if (num != null) {
                            i10 = num.intValue();
                        } else {
                            i10 = c6408m.f49855b;
                        }
                        c6405j3.f49841c = i10;
                        P4.a.H0(c6405j3, (String) b10.f49866i.getValue());
                        c6405j3.f49843e = (String) b10.f49868k.getValue();
                        c6405j3.f49844f = (String) b10.f49869l.getValue();
                        C6403H s10 = Ad.l.s();
                        s10.g(AbstractC4344b.P0((String) b10.f49867j.getValue()));
                        c6405j3.f49847i = s10;
                        c6405j3.f49848j = new C6411P(s10);
                        String str = (String) b10.f49870m.getValue();
                        AbstractC3557B.c0("<set-?>", str);
                        c6405j3.f49845g = str;
                        c6405j3.f49842d = b10.f49864g;
                        c6405j3.e(c6405j2.f49839a);
                        int i15 = c6405j2.f49841c;
                        if (i15 != 0) {
                            c6405j3.f49841c = i15;
                        }
                        List list = c6405j3.f49846h;
                        List list2 = c6405j2.f49846h;
                        if (!list2.isEmpty()) {
                            if (list.isEmpty() || ((CharSequence) kf.t.f2(list2)).length() == 0) {
                                list = list2;
                            } else {
                                C4436a c4436a = new C4436a((list2.size() + list.size()) - 1);
                                int size = list.size() - 1;
                                for (int i16 = 0; i16 < size; i16++) {
                                    c4436a.add(list.get(i16));
                                }
                                c4436a.addAll(list2);
                                list = AbstractC4344b.Q(c4436a);
                            }
                        }
                        c6405j3.c(list);
                        if (c6405j2.f49845g.length() > 0) {
                            String str2 = c6405j2.f49845g;
                            AbstractC3557B.c0("<set-?>", str2);
                            c6405j3.f49845g = str2;
                        }
                        C6403H s11 = Ad.l.s();
                        Df.H.n(s11, c6405j3.f49847i);
                        AbstractC6402G abstractC6402G = c6405j2.f49847i;
                        AbstractC3557B.c0("value", abstractC6402G);
                        c6405j3.f49847i = abstractC6402G;
                        c6405j3.f49848j = new C6411P(abstractC6402G);
                        for (Map.Entry entry : s11.a()) {
                            String str3 = (String) entry.getKey();
                            List list3 = (List) entry.getValue();
                            if (!c6405j3.f49847i.d(str3)) {
                                c6405j3.f49847i.e(str3, list3);
                            }
                        }
                        com.google.android.gms.internal.play_billing.N.A0(c6405j2, c6405j3);
                    }
                    Fe.l lVar = c4632e.f39198c;
                    for (Fe.a aVar : kf.t.K2(lVar.c().keySet())) {
                        Fe.l lVar2 = c5760d.f46130f;
                        if (!lVar2.a(aVar)) {
                            lVar2.e(aVar, lVar.b(aVar));
                        }
                    }
                    C6433v c6433v3 = c5760d.f46127c;
                    c6433v3.clear();
                    c6433v3.g(c6433v2.n());
                    Ei.a aVar2 = AbstractC4635h.f39204a;
                    aVar2.c("Applied DefaultRequest to " + c6405j + ". New url: " + c6405j2);
                    return yVar;
                }
                throw new IllegalStateException((String) r42);
            case 3:
                EnumC5000a enumC5000a4 = EnumC5000a.f41328Y;
                int i17 = this.f1046Z;
                if (i17 != 0) {
                    if (i17 == 1) {
                        com.google.android.gms.internal.play_billing.N.B0(obj);
                        return yVar;
                    }
                    throw new IllegalStateException((String) r42);
                }
                com.google.android.gms.internal.play_billing.N.B0(obj);
                Ie.e eVar4 = (Ie.e) this.f1048i0;
                Object obj3 = new Object();
                Object obj4 = eVar4.f8578Y;
                Object b11 = eVar4.b();
                this.f1046Z = 1;
                if (((wf.p) obj2).h(obj3, obj4, b11, this) == enumC5000a4) {
                    return enumC5000a4;
                }
                return yVar;
            case 4:
                EnumC5000a enumC5000a5 = EnumC5000a.f41328Y;
                int i18 = this.f1046Z;
                if (i18 != 0) {
                    if (i18 != 1) {
                        if (i18 == 2) {
                            com.google.android.gms.internal.play_billing.N.B0(obj);
                            return yVar;
                        }
                        throw new IllegalStateException((String) r42);
                    }
                    eVar = (Ie.e) this.f1048i0;
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                } else {
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                    eVar = (Ie.e) this.f1048i0;
                    Object b12 = eVar.b();
                    this.f1048i0 = eVar;
                    this.f1046Z = 1;
                    obj = ((C4999h) obj2).a((C5760d) eVar.f8578Y, b12, this);
                    break;
                }
                if (obj != null) {
                    this.f1048i0 = null;
                    this.f1046Z = 2;
                    if (eVar.d(obj, this) != enumC5000a5) {
                        return yVar;
                    }
                    return enumC5000a5;
                }
                return yVar;
            default:
                EnumC5000a enumC5000a6 = EnumC5000a.f41328Y;
                int i19 = this.f1046Z;
                try {
                    if (i19 != 0) {
                        if (i19 != 1) {
                            if (i19 == 2) {
                                eVar2 = (Ie.e) this.f1048i0;
                                try {
                                    com.google.android.gms.internal.play_billing.N.B0(obj);
                                    return yVar;
                                } catch (Throwable th3) {
                                    th2 = th3;
                                    c5320l = (C5320l) obj2;
                                    C5760d c5760d2 = (C5760d) eVar2.f8578Y;
                                    if (AbstractC4194d.m(c5320l.f44115b)) {
                                        c5320l.f44114a.c("REQUEST " + com.google.android.gms.internal.play_billing.N.c(c5760d2.f46125a) + " failed with exception: " + th2);
                                    }
                                    throw th2;
                                }
                            }
                            throw new IllegalStateException((String) r42);
                        }
                        Ie.e eVar5 = (Ie.e) this.f1048i0;
                        com.google.android.gms.internal.play_billing.N.B0(obj);
                        r42 = eVar5;
                    } else {
                        com.google.android.gms.internal.play_billing.N.B0(obj);
                        Ie.e eVar6 = (Ie.e) this.f1048i0;
                        C5760d c5760d3 = (C5760d) eVar6.f8578Y;
                        List<wf.k> list4 = ((C5320l) obj2).f44116c;
                        boolean isEmpty = list4.isEmpty();
                        Object obj5 = eVar6.f8578Y;
                        if (!isEmpty) {
                            if (!list4.isEmpty()) {
                                for (wf.k kVar : list4) {
                                    if (((Boolean) kVar.invoke(c5760d3)).booleanValue()) {
                                        this.f1048i0 = eVar6;
                                        this.f1046Z = 1;
                                        obj = C5320l.a((C5320l) obj2, (C5760d) obj5, this);
                                        r42 = eVar6;
                                    }
                                }
                            }
                            ((C5760d) obj5).f46130f.e(AbstractC5321m.f44119b, yVar);
                            return yVar;
                        }
                        this.f1048i0 = eVar6;
                        this.f1046Z = 1;
                        obj = C5320l.a((C5320l) obj2, (C5760d) obj5, this);
                        r42 = eVar6;
                        break;
                    }
                    num = (AbstractC6848g) obj;
                } catch (Throwable unused) {
                }
                if (num == 0) {
                    try {
                        num = r42.b();
                    } catch (Throwable th4) {
                        th2 = th4;
                        eVar2 = r42;
                        c5320l = (C5320l) obj2;
                        C5760d c5760d22 = (C5760d) eVar2.f8578Y;
                        if (AbstractC4194d.m(c5320l.f44115b)) {
                        }
                        throw th2;
                    }
                }
                this.f1048i0 = r42;
                this.f1046Z = 2;
                if (r42.d(num, this) != enumC5000a6) {
                    return yVar;
                }
                return enumC5000a6;
        }
    }

    public final Object p(Ie.e eVar, Object obj, AbstractC4825e abstractC4825e) {
        jf.y yVar = jf.y.f36177a;
        int i10 = this.f1045Y;
        Object obj2 = this.f1047h0;
        switch (i10) {
            case 2:
                D d10 = new D((C4633f) obj2, abstractC4825e, 2);
                d10.f1048i0 = eVar;
                return d10.invokeSuspend(yVar);
            case 3:
                D d11 = new D((wf.p) obj2, abstractC4825e, 3);
                d11.f1048i0 = eVar;
                return d11.invokeSuspend(yVar);
            case 4:
                D d12 = new D((C4999h) obj2, abstractC4825e, 4);
                d12.f1048i0 = eVar;
                return d12.invokeSuspend(yVar);
            default:
                D d13 = new D((C5320l) obj2, abstractC4825e, 5);
                d13.f1048i0 = eVar;
                return d13.invokeSuspend(yVar);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ D(Object obj, AbstractC4825e abstractC4825e, int i10) {
        super(3, abstractC4825e);
        this.f1045Y = i10;
        this.f1047h0 = obj;
    }
}
