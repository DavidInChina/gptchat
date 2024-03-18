package me;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.SIPHeaderNames;
import e9.C2813f;
import he.C3418c;
import id.AbstractC3557B;
import java.util.List;
import nf.AbstractC4825e;
import of.EnumC5000a;
import te.C5760d;
import xe.AbstractC6407L;
import xe.AbstractC6432u;
import xe.AbstractC6435x;
import xe.C6405J;
import xe.C6408M;
import xe.C6410O;

/* renamed from: me.D  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4621D implements x {
    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01fd  */
    /* JADX WARN: Type inference failed for: r0v19, types: [kotlin.jvm.internal.B, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v2, types: [kotlin.jvm.internal.B, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x01dd -> B:53:0x01e6). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(C4621D c4621d, U u10, C5760d c5760d, C3418c c3418c, boolean z10, ge.d dVar, AbstractC4825e abstractC4825e) {
        C4621D c4621d2;
        C4620C c4620c;
        int i10;
        String str;
        kotlin.jvm.internal.B b10;
        C5760d c5760d2;
        C4620C c4620c2;
        boolean z11;
        ge.d dVar2;
        C6408M c6408m;
        U u11;
        kotlin.jvm.internal.B b11;
        String e10;
        C5760d c5760d3;
        C6405J c6405j;
        Object a5;
        int i11;
        c4621d.getClass();
        if (abstractC4825e instanceof C4620C) {
            c4620c = (C4620C) abstractC4825e;
            int i12 = c4620c.f39151r0;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                c4620c.f39151r0 = i12 - Integer.MIN_VALUE;
                c4621d2 = c4621d;
                Object obj = c4620c.f39149p0;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = c4620c.f39151r0;
                if (i10 == 0) {
                    if (i10 == 1) {
                        boolean z12 = c4620c.f39148o0;
                        kotlin.jvm.internal.B b12 = c4620c.f39147n0;
                        String str2 = c4620c.f39146m0;
                        C6408M c6408m2 = c4620c.f39145l0;
                        kotlin.jvm.internal.B b13 = c4620c.f39144k0;
                        kotlin.jvm.internal.B b14 = c4620c.f39143j0;
                        ge.d dVar3 = c4620c.f39142i0;
                        C5760d c5760d4 = c4620c.f39141h0;
                        U u12 = c4620c.f39140Z;
                        C4621D c4621d3 = c4620c.f39139Y;
                        com.google.android.gms.internal.play_billing.N.B0(obj);
                        c4620c2 = c4620c;
                        z11 = z12;
                        c4621d2 = c4621d3;
                        kotlin.jvm.internal.B b15 = b13;
                        b10 = b14;
                        str = str2;
                        C6408M c6408m3 = c6408m2;
                        c5760d2 = c5760d4;
                        b12.f37622Y = obj;
                        if (AbstractC4623F.a(((C3418c) b10.f37622Y).d().f())) {
                            return b10.f37622Y;
                        }
                        dVar2 = dVar3;
                        c6408m = c6408m3;
                        u11 = u12;
                        b11 = b15;
                        y7.b bVar = dVar2.f31603p0;
                        c4621d2.getClass();
                        Ii.q qVar = C4622E.f39154d;
                        ((C3418c) b10.f37622Y).d();
                        bVar.q(qVar);
                        AbstractC6432u a10 = ((C3418c) b10.f37622Y).d().a();
                        List list = AbstractC6435x.f49956a;
                        e10 = a10.e("Location");
                        Ei.a aVar = AbstractC4623F.f39157b;
                        StringBuilder s10 = android.gov.nist.core.a.s("Received redirect response to ", e10, " for request ");
                        s10.append(c5760d2.f46125a);
                        aVar.c(s10.toString());
                        c5760d3 = new C5760d();
                        c5760d3.d((C5760d) b11.f37622Y);
                        c6405j = c5760d3.f46125a;
                        c6405j.f49848j.clear();
                        if (e10 != null) {
                            AbstractC6407L.b(c6405j, e10);
                        }
                        C6405J c6405j2 = c5760d2.f46125a;
                        if (z11 && R4.b.y1(c6408m) && !R4.b.y1(c6405j.f49839a)) {
                            aVar.c("Can not redirect " + c6405j2 + " because of security downgrade");
                            return b10.f37622Y;
                        }
                        if (!AbstractC3557B.K(str, P4.a.N(c6405j))) {
                            c5760d3.f46127c.j(SIPHeaderNames.AUTHORIZATION);
                            aVar.c("Removing Authorization header from redirect for " + c6405j2);
                        }
                        b11.f37622Y = c5760d3;
                        c4620c2.f39139Y = c4621d2;
                        c4620c2.f39140Z = u11;
                        c4620c2.f39141h0 = c5760d2;
                        c4620c2.f39142i0 = dVar2;
                        c4620c2.f39143j0 = b10;
                        c4620c2.f39144k0 = b11;
                        c4620c2.f39145l0 = c6408m;
                        c4620c2.f39146m0 = str;
                        c4620c2.f39147n0 = b10;
                        c4620c2.f39148o0 = z11;
                        c4620c2.f39151r0 = 1;
                        a5 = u11.a(c5760d3, c4620c2);
                        if (a5 == enumC5000a) {
                            return enumC5000a;
                        }
                        b15 = b11;
                        c6408m3 = c6408m;
                        dVar3 = dVar2;
                        b12 = b10;
                        u12 = u11;
                        obj = a5;
                        b12.f37622Y = obj;
                        if (AbstractC4623F.a(((C3418c) b10.f37622Y).d().f())) {
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                    if (!AbstractC4623F.a(c3418c.d().f())) {
                        return c3418c;
                    }
                    ?? obj2 = new Object();
                    obj2.f37622Y = c3418c;
                    ?? obj3 = new Object();
                    c5760d2 = c5760d;
                    obj3.f37622Y = c5760d2;
                    C6408M c6408m4 = c3418c.c().O().f49858a;
                    C6410O O10 = c3418c.c().O();
                    AbstractC3557B.c0("<this>", O10);
                    StringBuilder sb2 = new StringBuilder();
                    StringBuilder sb3 = new StringBuilder();
                    String str3 = (String) O10.f49868k.getValue();
                    String str4 = (String) O10.f49869l.getValue();
                    if (str3 != null) {
                        sb3.append(str3);
                        if (str4 != null) {
                            sb3.append(':');
                            sb3.append(str4);
                        }
                        sb3.append(Separators.AT);
                    }
                    String sb4 = sb3.toString();
                    AbstractC3557B.b0("StringBuilder().apply(builderAction).toString()", sb4);
                    sb2.append(sb4);
                    int i13 = O10.f49860c;
                    String str5 = O10.f49859b;
                    if (i13 != 0) {
                        C6408M c6408m5 = O10.f49858a;
                        if (i13 != c6408m5.f49855b) {
                            StringBuilder sb5 = new StringBuilder();
                            sb5.append(str5);
                            sb5.append(':');
                            Integer valueOf = Integer.valueOf(i13);
                            if (i13 == 0) {
                                valueOf = null;
                            }
                            if (valueOf != null) {
                                i11 = valueOf.intValue();
                            } else {
                                i11 = c6408m5.f49855b;
                            }
                            sb5.append(i11);
                            sb2.append(sb5.toString());
                            String sb6 = sb2.toString();
                            AbstractC3557B.b0("StringBuilder().apply(builderAction).toString()", sb6);
                            str = sb6;
                            b11 = obj3;
                            c6408m = c6408m4;
                            dVar2 = dVar;
                            b10 = obj2;
                            c4620c2 = c4620c;
                            u11 = u10;
                            z11 = z10;
                            y7.b bVar2 = dVar2.f31603p0;
                            c4621d2.getClass();
                            Ii.q qVar2 = C4622E.f39154d;
                            ((C3418c) b10.f37622Y).d();
                            bVar2.q(qVar2);
                            AbstractC6432u a102 = ((C3418c) b10.f37622Y).d().a();
                            List list2 = AbstractC6435x.f49956a;
                            e10 = a102.e("Location");
                            Ei.a aVar2 = AbstractC4623F.f39157b;
                            StringBuilder s102 = android.gov.nist.core.a.s("Received redirect response to ", e10, " for request ");
                            s102.append(c5760d2.f46125a);
                            aVar2.c(s102.toString());
                            c5760d3 = new C5760d();
                            c5760d3.d((C5760d) b11.f37622Y);
                            c6405j = c5760d3.f46125a;
                            c6405j.f49848j.clear();
                            if (e10 != null) {
                            }
                            C6405J c6405j22 = c5760d2.f46125a;
                            if (z11) {
                            }
                            if (!AbstractC3557B.K(str, P4.a.N(c6405j))) {
                            }
                            b11.f37622Y = c5760d3;
                            c4620c2.f39139Y = c4621d2;
                            c4620c2.f39140Z = u11;
                            c4620c2.f39141h0 = c5760d2;
                            c4620c2.f39142i0 = dVar2;
                            c4620c2.f39143j0 = b10;
                            c4620c2.f39144k0 = b11;
                            c4620c2.f39145l0 = c6408m;
                            c4620c2.f39146m0 = str;
                            c4620c2.f39147n0 = b10;
                            c4620c2.f39148o0 = z11;
                            c4620c2.f39151r0 = 1;
                            a5 = u11.a(c5760d3, c4620c2);
                            if (a5 == enumC5000a) {
                            }
                        }
                    }
                    sb2.append(str5);
                    String sb62 = sb2.toString();
                    AbstractC3557B.b0("StringBuilder().apply(builderAction).toString()", sb62);
                    str = sb62;
                    b11 = obj3;
                    c6408m = c6408m4;
                    dVar2 = dVar;
                    b10 = obj2;
                    c4620c2 = c4620c;
                    u11 = u10;
                    z11 = z10;
                    y7.b bVar22 = dVar2.f31603p0;
                    c4621d2.getClass();
                    Ii.q qVar22 = C4622E.f39154d;
                    ((C3418c) b10.f37622Y).d();
                    bVar22.q(qVar22);
                    AbstractC6432u a1022 = ((C3418c) b10.f37622Y).d().a();
                    List list22 = AbstractC6435x.f49956a;
                    e10 = a1022.e("Location");
                    Ei.a aVar22 = AbstractC4623F.f39157b;
                    StringBuilder s1022 = android.gov.nist.core.a.s("Received redirect response to ", e10, " for request ");
                    s1022.append(c5760d2.f46125a);
                    aVar22.c(s1022.toString());
                    c5760d3 = new C5760d();
                    c5760d3.d((C5760d) b11.f37622Y);
                    c6405j = c5760d3.f46125a;
                    c6405j.f49848j.clear();
                    if (e10 != null) {
                    }
                    C6405J c6405j222 = c5760d2.f46125a;
                    if (z11) {
                    }
                    if (!AbstractC3557B.K(str, P4.a.N(c6405j))) {
                    }
                    b11.f37622Y = c5760d3;
                    c4620c2.f39139Y = c4621d2;
                    c4620c2.f39140Z = u11;
                    c4620c2.f39141h0 = c5760d2;
                    c4620c2.f39142i0 = dVar2;
                    c4620c2.f39143j0 = b10;
                    c4620c2.f39144k0 = b11;
                    c4620c2.f39145l0 = c6408m;
                    c4620c2.f39146m0 = str;
                    c4620c2.f39147n0 = b10;
                    c4620c2.f39148o0 = z11;
                    c4620c2.f39151r0 = 1;
                    a5 = u11.a(c5760d3, c4620c2);
                    if (a5 == enumC5000a) {
                    }
                }
            }
        }
        c4621d2 = c4621d;
        c4620c = new C4620C(c4621d2, abstractC4825e);
        Object obj4 = c4620c.f39149p0;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = c4620c.f39151r0;
        if (i10 == 0) {
        }
    }

    @Override // me.x
    public final void a(ge.d dVar, Object obj) {
        C4622E c4622e = (C4622E) obj;
        AbstractC3557B.c0("plugin", c4622e);
        AbstractC3557B.c0("scope", dVar);
        ((L) y.a(dVar, L.f39171c)).f39174b.add(new C2813f(c4622e, dVar, null, 3));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, B0.c] */
    @Override // me.x
    public final Object c(wf.k kVar) {
        ?? obj = new Object();
        obj.f1626a = true;
        kVar.invoke(obj);
        return new C4622E(obj.f1627b);
    }

    @Override // me.x
    public final Fe.a getKey() {
        return C4622E.f39153c;
    }
}
