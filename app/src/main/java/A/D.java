package A;

import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kf.AbstractC4268D;
import l8.AbstractC4344b;
import m6.C4562a;
import o6.C4932k;
import q5.C5271a;
import q5.C5272b;
import x6.C6285c0;
import x6.C6297g0;
import x6.C6300h0;
import x6.C6303i0;
import x6.C6309k0;
import x6.EnumC6288d0;
import yf.AbstractC6583a;
import z.AbstractC6708l;

/* loaded from: classes.dex */
public final class D extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ String f27Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ boolean f28Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ String f29h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ Object f30i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ Object f31j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ Object f32k0;

    /* renamed from: l0  reason: collision with root package name */
    public final /* synthetic */ Object f33l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(o6.a0 a0Var, C4562a c4562a, C4932k c4932k, String str, boolean z10, String str2, LinkedHashMap linkedHashMap) {
        super(1);
        this.f30i0 = a0Var;
        this.f31j0 = c4562a;
        this.f32k0 = c4932k;
        this.f27Y = str;
        this.f28Z = z10;
        this.f29h0 = str2;
        this.f33l0 = linkedHashMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00bd A[LOOP:0: B:43:0x00b7->B:45:0x00bd, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0149  */
    @Override // wf.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        C6297g0 c6297g0;
        int i10;
        String str;
        int f6;
        int i11;
        ArrayList arrayList;
        ArrayList arrayList2;
        String str2;
        x6.H h10;
        String str3;
        String str4;
        String str5;
        String str6;
        q5.g gVar;
        C6303i0 c6303i0;
        String str7;
        C5271a c5271a = (C5271a) obj;
        AbstractC3557B.c0("datadogContext", c5271a);
        o6.a0 a0Var = (o6.a0) this.f30i0;
        k5.F f10 = a0Var.f40785f;
        C4562a c4562a = (C4562a) this.f31j0;
        String str8 = c4562a.f38948d;
        String str9 = "";
        if (str8 == null) {
            str8 = str9;
        }
        f10.getClass();
        boolean d02 = k5.F.d0(c5271a, str8);
        String str10 = c4562a.f38955k;
        if (str10 != null && !Lg.n.n2(str10) && (str7 = c4562a.f38956l) != null && !Lg.n.n2(str7)) {
            c6297g0 = new C6297g0(str10, str7, null);
        } else {
            c6297g0 = null;
        }
        int i12 = 2;
        int i13 = 1;
        if (c6297g0 == null) {
            i10 = 1;
        } else {
            i10 = 2;
        }
        C4932k c4932k = (C4932k) this.f32k0;
        long j6 = c4932k.f40879p.f38961a + a0Var.f40795p;
        x6.S s10 = new x6.S(a0Var.f40773G);
        int m12 = AbstractC4344b.m1(c4932k.f40874k);
        String str11 = c4932k.f40876m;
        if (str11 == null) {
            Throwable th2 = c4932k.f40875l;
            if (th2 != null) {
                str11 = AbstractC4344b.J0(th2);
            } else {
                str = null;
                Boolean valueOf = Boolean.valueOf(this.f28Z);
                int i14 = c4932k.f40881r;
                AbstractC2469q0.q("<this>", i14);
                f6 = AbstractC6708l.f(i14);
                if (f6 != 0) {
                    if (f6 != 1) {
                        i13 = 4;
                        if (f6 != 2) {
                            if (f6 != 3) {
                                if (f6 != 4) {
                                    if (f6 == 5) {
                                        i12 = 9;
                                    } else {
                                        throw new RuntimeException();
                                    }
                                } else {
                                    i12 = 7;
                                }
                            } else {
                                i11 = 5;
                                List<x5.c> list = c4932k.f40882s;
                                arrayList = new ArrayList(AbstractC6583a.H1(list, 10));
                                for (x5.c cVar : list) {
                                    arrayList.add(new C6300h0(cVar.f48903a, cVar.f48905c, cVar.f48906d, cVar.f48904b));
                                    str9 = str9;
                                }
                                String str12 = str9;
                                if (!arrayList.isEmpty()) {
                                    arrayList2 = null;
                                } else {
                                    arrayList2 = arrayList;
                                }
                                x6.X x10 = new x6.X(this.f27Y, m12, str, valueOf, this.f29h0, i11, null, arrayList2, 60241);
                                str2 = c4562a.f38951g;
                                if (str2 == null) {
                                    h10 = new x6.H(AbstractC4344b.F0(str2));
                                } else {
                                    h10 = null;
                                }
                                str3 = c4562a.f38948d;
                                if (str3 != null) {
                                    str4 = str12;
                                } else {
                                    str4 = str3;
                                }
                                str5 = c4562a.f38950f;
                                if (str5 != null) {
                                    str6 = str12;
                                } else {
                                    str6 = str5;
                                }
                                x6.Z z10 = new x6.Z(str4, (String) null, str6, c4562a.f38949e, 18);
                                gVar = c5271a.f43907m;
                                if (!M3.H.Y(gVar)) {
                                    c6303i0 = new C6303i0(gVar.f43937a, gVar.f43938b, gVar.f43939c, AbstractC4268D.m1(gVar.f43940d));
                                } else {
                                    c6303i0 = null;
                                }
                                x6.O h12 = AbstractC4344b.h1(c5271a.f43905k);
                                x6.I i15 = new x6.I(c4562a.f38945a);
                                x6.Y y10 = new x6.Y(c4562a.f38946b, i10, Boolean.valueOf(d02));
                                int q12 = AbstractC4344b.q1(c5271a.f43901g, a0Var.f40781b.l());
                                C5272b c5272b = c5271a.f43906l;
                                return new C6309k0(j6, i15, c5271a.f43897c, c5271a.f43899e, y10, q12, z10, c6303i0, h12, c6297g0, new C6285c0(c5272b.f43915f, c5272b.f43917h, null, c5272b.f43916g), new x6.V(AbstractC4344b.i1(c5272b.f43913d), c5272b.f43910a, c5272b.f43912c, c5272b.f43911b, c5272b.f43918i), new x6.T(new x6.U(EnumC6288d0.PLAN_1, AbstractC4344b.j1(c4562a.f38953i)), new x6.N(Float.valueOf(a0Var.f40787h), null), null), new x6.S((Map) this.f33l0), h10, x10, s10, 267280);
                            }
                        }
                    }
                    i11 = i12;
                    List<x5.c> list2 = c4932k.f40882s;
                    arrayList = new ArrayList(AbstractC6583a.H1(list2, 10));
                    while (r8.hasNext()) {
                    }
                    String str122 = str9;
                    if (!arrayList.isEmpty()) {
                    }
                    x6.X x102 = new x6.X(this.f27Y, m12, str, valueOf, this.f29h0, i11, null, arrayList2, 60241);
                    str2 = c4562a.f38951g;
                    if (str2 == null) {
                    }
                    str3 = c4562a.f38948d;
                    if (str3 != null) {
                    }
                    str5 = c4562a.f38950f;
                    if (str5 != null) {
                    }
                    x6.Z z102 = new x6.Z(str4, (String) null, str6, c4562a.f38949e, 18);
                    gVar = c5271a.f43907m;
                    if (!M3.H.Y(gVar)) {
                    }
                    x6.O h122 = AbstractC4344b.h1(c5271a.f43905k);
                    x6.I i152 = new x6.I(c4562a.f38945a);
                    x6.Y y102 = new x6.Y(c4562a.f38946b, i10, Boolean.valueOf(d02));
                    int q122 = AbstractC4344b.q1(c5271a.f43901g, a0Var.f40781b.l());
                    C5272b c5272b2 = c5271a.f43906l;
                    return new C6309k0(j6, i152, c5271a.f43897c, c5271a.f43899e, y102, q122, z102, c6303i0, h122, c6297g0, new C6285c0(c5272b2.f43915f, c5272b2.f43917h, null, c5272b2.f43916g), new x6.V(AbstractC4344b.i1(c5272b2.f43913d), c5272b2.f43910a, c5272b2.f43912c, c5272b2.f43911b, c5272b2.f43918i), new x6.T(new x6.U(EnumC6288d0.PLAN_1, AbstractC4344b.j1(c4562a.f38953i)), new x6.N(Float.valueOf(a0Var.f40787h), null), null), new x6.S((Map) this.f33l0), h10, x102, s10, 267280);
                }
                i11 = i13;
                List<x5.c> list22 = c4932k.f40882s;
                arrayList = new ArrayList(AbstractC6583a.H1(list22, 10));
                while (r8.hasNext()) {
                }
                String str1222 = str9;
                if (!arrayList.isEmpty()) {
                }
                x6.X x1022 = new x6.X(this.f27Y, m12, str, valueOf, this.f29h0, i11, null, arrayList2, 60241);
                str2 = c4562a.f38951g;
                if (str2 == null) {
                }
                str3 = c4562a.f38948d;
                if (str3 != null) {
                }
                str5 = c4562a.f38950f;
                if (str5 != null) {
                }
                x6.Z z1022 = new x6.Z(str4, (String) null, str6, c4562a.f38949e, 18);
                gVar = c5271a.f43907m;
                if (!M3.H.Y(gVar)) {
                }
                x6.O h1222 = AbstractC4344b.h1(c5271a.f43905k);
                x6.I i1522 = new x6.I(c4562a.f38945a);
                x6.Y y1022 = new x6.Y(c4562a.f38946b, i10, Boolean.valueOf(d02));
                int q1222 = AbstractC4344b.q1(c5271a.f43901g, a0Var.f40781b.l());
                C5272b c5272b22 = c5271a.f43906l;
                return new C6309k0(j6, i1522, c5271a.f43897c, c5271a.f43899e, y1022, q1222, z1022, c6303i0, h1222, c6297g0, new C6285c0(c5272b22.f43915f, c5272b22.f43917h, null, c5272b22.f43916g), new x6.V(AbstractC4344b.i1(c5272b22.f43913d), c5272b22.f43910a, c5272b22.f43912c, c5272b22.f43911b, c5272b22.f43918i), new x6.T(new x6.U(EnumC6288d0.PLAN_1, AbstractC4344b.j1(c4562a.f38953i)), new x6.N(Float.valueOf(a0Var.f40787h), null), null), new x6.S((Map) this.f33l0), h10, x1022, s10, 267280);
            }
        }
        str = str11;
        Boolean valueOf2 = Boolean.valueOf(this.f28Z);
        int i142 = c4932k.f40881r;
        AbstractC2469q0.q("<this>", i142);
        f6 = AbstractC6708l.f(i142);
        if (f6 != 0) {
        }
        i11 = i13;
        List<x5.c> list222 = c4932k.f40882s;
        arrayList = new ArrayList(AbstractC6583a.H1(list222, 10));
        while (r8.hasNext()) {
        }
        String str12222 = str9;
        if (!arrayList.isEmpty()) {
        }
        x6.X x10222 = new x6.X(this.f27Y, m12, str, valueOf2, this.f29h0, i11, null, arrayList2, 60241);
        str2 = c4562a.f38951g;
        if (str2 == null) {
        }
        str3 = c4562a.f38948d;
        if (str3 != null) {
        }
        str5 = c4562a.f38950f;
        if (str5 != null) {
        }
        x6.Z z10222 = new x6.Z(str4, (String) null, str6, c4562a.f38949e, 18);
        gVar = c5271a.f43907m;
        if (!M3.H.Y(gVar)) {
        }
        x6.O h12222 = AbstractC4344b.h1(c5271a.f43905k);
        x6.I i15222 = new x6.I(c4562a.f38945a);
        x6.Y y10222 = new x6.Y(c4562a.f38946b, i10, Boolean.valueOf(d02));
        int q12222 = AbstractC4344b.q1(c5271a.f43901g, a0Var.f40781b.l());
        C5272b c5272b222 = c5271a.f43906l;
        return new C6309k0(j6, i15222, c5271a.f43897c, c5271a.f43899e, y10222, q12222, z10222, c6303i0, h12222, c6297g0, new C6285c0(c5272b222.f43915f, c5272b222.f43917h, null, c5272b222.f43916g), new x6.V(AbstractC4344b.i1(c5272b222.f43913d), c5272b222.f43910a, c5272b222.f43912c, c5272b222.f43911b, c5272b222.f43918i), new x6.T(new x6.U(EnumC6288d0.PLAN_1, AbstractC4344b.j1(c4562a.f38953i)), new x6.N(Float.valueOf(a0Var.f40787h), null), null), new x6.S((Map) this.f33l0), h10, x10222, s10, 267280);
    }
}
