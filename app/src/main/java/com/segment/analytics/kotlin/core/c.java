package com.segment.analytics.kotlin.core;

import Qd.A;
import Qd.E;
import Qd.H;
import Qd.y;
import Qd.z;
import com.google.android.gms.internal.play_billing.N;
import eh.AbstractC2904d;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5156c;

/* loaded from: classes2.dex */
public abstract class c {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARN: Type inference failed for: r0v2, types: [pf.c] */
    /* JADX WARN: Type inference failed for: r5v0, types: [Qd.A] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object a(A a5, E e10, AbstractC4825e abstractC4825e) {
        y yVar;
        int i10;
        if (abstractC4825e instanceof y) {
            y yVar2 = (y) abstractC4825e;
            int i11 = yVar2.f14673Z;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                yVar2.f14673Z = i11 - Integer.MIN_VALUE;
                yVar = yVar2;
                Object obj = yVar.f14672Y;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = yVar.f14673Z;
                if (i10 == 0) {
                    if (i10 == 1) {
                        N.B0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    N.B0(obj);
                    Settings settings = e10.f14576b;
                    if (settings != null) {
                        String d10 = AbstractC2904d.f29415d.d(Settings.Companion.serializer(), settings);
                        yVar.getClass();
                        yVar.f14673Z = 1;
                        if (a5.e(4, d10, yVar) == enumC5000a) {
                            return enumC5000a;
                        }
                    } else {
                        a5.remove(4);
                    }
                }
                return jf.y.f36177a;
            }
        }
        yVar = new AbstractC5156c(abstractC4825e);
        Object obj2 = yVar.f14672Y;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = yVar.f14673Z;
        if (i10 == 0) {
        }
        return jf.y.f36177a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0091  */
    /* JADX WARN: Type inference failed for: r0v2, types: [pf.c] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object b(A a5, H h10, AbstractC4825e abstractC4825e) {
        z zVar;
        int i10;
        A a10;
        kotlinx.serialization.json.c cVar;
        A a11;
        H h11;
        A a12;
        String str;
        if (abstractC4825e instanceof z) {
            z zVar2 = (z) abstractC4825e;
            int i11 = zVar2.f14677i0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                zVar2.f14677i0 = i11 - Integer.MIN_VALUE;
                zVar = zVar2;
                Object obj = zVar.f14676h0;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = zVar.f14677i0;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 == 3) {
                                N.B0(obj);
                                return jf.y.f36177a;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        h11 = zVar.f14675Z;
                        a11 = zVar.f14674Y;
                        N.B0(obj);
                        A a13 = a11;
                        h10 = h11;
                        a10 = a13;
                        cVar = h10.f14584c;
                        if (cVar != null) {
                            String d10 = AbstractC2904d.f29415d.d(kotlinx.serialization.json.c.Companion.serializer(), cVar);
                            zVar.f14674Y = a10;
                            zVar.f14675Z = null;
                            zVar.f14677i0 = 3;
                            if (a10.e(2, d10, zVar) == enumC5000a) {
                                return enumC5000a;
                            }
                        } else {
                            a10.remove(2);
                        }
                        return jf.y.f36177a;
                    }
                    h10 = zVar.f14675Z;
                    A a14 = zVar.f14674Y;
                    N.B0(obj);
                    a12 = a14;
                } else {
                    N.B0(obj);
                    String str2 = h10.f14582a;
                    zVar.f14674Y = a5;
                    zVar.f14675Z = h10;
                    zVar.f14677i0 = 1;
                    Object e10 = a5.e(3, str2, zVar);
                    a12 = a5;
                    if (e10 == enumC5000a) {
                        return enumC5000a;
                    }
                }
                str = h10.f14583b;
                if (str == null) {
                    zVar.f14674Y = a12;
                    zVar.f14675Z = h10;
                    zVar.f14677i0 = 2;
                    if (a12.e(1, str, zVar) == enumC5000a) {
                        return enumC5000a;
                    }
                    H h12 = h10;
                    a11 = a12;
                    h11 = h12;
                    A a132 = a11;
                    h10 = h11;
                    a10 = a132;
                    cVar = h10.f14584c;
                    if (cVar != null) {
                    }
                    return jf.y.f36177a;
                }
                a12.remove(1);
                a10 = a12;
                cVar = h10.f14584c;
                if (cVar != null) {
                }
                return jf.y.f36177a;
            }
        }
        zVar = new AbstractC5156c(abstractC4825e);
        Object obj2 = zVar.f14676h0;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = zVar.f14677i0;
        if (i10 == 0) {
        }
        str = h10.f14583b;
        if (str == null) {
        }
    }
}
