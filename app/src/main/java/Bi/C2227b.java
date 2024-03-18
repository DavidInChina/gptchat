package bi;

import Wh.B;
import Wh.C;
import Wh.D;
import Wh.E;
import Wh.F;
import Wh.n;
import Wh.t;
import Wh.z;
import ai.C2007c;
import ai.j;
import ai.m;
import di.C2727a;
import id.AbstractC3557B;
import java.io.IOException;
import java.net.ProtocolException;
import ji.C4115D;

/* renamed from: bi.b  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2227b implements t {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f26020a;

    public C2227b(boolean z10) {
        this.f26020a = z10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01b0 A[Catch: IOException -> 0x0191, TryCatch #1 {IOException -> 0x0191, blocks: (B:92:0x017c, B:96:0x0184, B:99:0x0194, B:100:0x01a2, B:102:0x01b0, B:104:0x01ba, B:109:0x01c9, B:111:0x01cd, B:115:0x01da, B:117:0x01ef, B:119:0x01f9, B:120:0x0203), top: B:132:0x017c }] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01cd A[Catch: IOException -> 0x0191, TryCatch #1 {IOException -> 0x0191, blocks: (B:92:0x017c, B:96:0x0184, B:99:0x0194, B:100:0x01a2, B:102:0x01b0, B:104:0x01ba, B:109:0x01c9, B:111:0x01cd, B:115:0x01da, B:117:0x01ef, B:119:0x01f9, B:120:0x0203), top: B:132:0x017c }] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01da A[Catch: IOException -> 0x0191, TryCatch #1 {IOException -> 0x0191, blocks: (B:92:0x017c, B:96:0x0184, B:99:0x0194, B:100:0x01a2, B:102:0x01b0, B:104:0x01ba, B:109:0x01c9, B:111:0x01cd, B:115:0x01da, B:117:0x01ef, B:119:0x01f9, B:120:0x0203), top: B:132:0x017c }] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0159 A[Catch: IOException -> 0x0129, TryCatch #5 {IOException -> 0x0129, blocks: (B:71:0x010f, B:73:0x0118, B:78:0x012b, B:86:0x0150, B:88:0x0159, B:89:0x015f, B:90:0x0174), top: B:140:0x010f }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0180  */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21 */
    @Override // Wh.t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final D a(f fVar) {
        String str;
        C c10;
        boolean z10;
        IOException iOException;
        IOException e10;
        C c11;
        boolean z11;
        int i10;
        D d10;
        F f6;
        long j6;
        Long l10;
        boolean z12;
        IOException e11;
        IOException iOException2;
        C d11;
        boolean z13;
        boolean z14;
        B b10;
        ?? r42 = "HTTP ";
        ai.e eVar = fVar.f26027d;
        AbstractC3557B.Z(eVar);
        d dVar = eVar.f24236d;
        n nVar = eVar.f24234b;
        j jVar = eVar.f24233a;
        m mVar = eVar.f24239g;
        z zVar = fVar.f26028e;
        B b11 = zVar.f21339d;
        long currentTimeMillis = System.currentTimeMillis();
        try {
            try {
                nVar.getClass();
                AbstractC3557B.c0("call", jVar);
                dVar.e(zVar);
                try {
                    if (U3.f.i0(zVar.f21337b) && b11 != null) {
                        try {
                        } catch (IOException e12) {
                            e11 = e12;
                        }
                        try {
                            if (Lg.n.f2("100-continue", zVar.f21338c.r("Expect"))) {
                                try {
                                    dVar.f();
                                    d11 = eVar.d(true);
                                    try {
                                        nVar.getClass();
                                        AbstractC3557B.c0("call", jVar);
                                        z13 = false;
                                    } catch (IOException e13) {
                                        e11 = e13;
                                        str = r42;
                                        c10 = d11;
                                        z12 = true;
                                        if (!(e11 instanceof C2727a)) {
                                            if (eVar.f24238f) {
                                                z10 = z12;
                                                iOException = e11;
                                                if (c10 == null) {
                                                }
                                                c11 = c10;
                                                c11.d(zVar);
                                                c11.f21121e = mVar.f24281e;
                                                c11.f21127k = currentTimeMillis;
                                                z11 = z10;
                                                c11.f21128l = System.currentTimeMillis();
                                                D a5 = c11.a();
                                                i10 = a5.f21133i0;
                                                if (i10 != 100) {
                                                }
                                                C d12 = eVar.d(false);
                                                AbstractC3557B.Z(d12);
                                                if (z11) {
                                                }
                                                d12.d(zVar);
                                                d12.f21121e = mVar.f24281e;
                                                d12.f21127k = currentTimeMillis;
                                                d12.f21128l = System.currentTimeMillis();
                                                a5 = d12.a();
                                                i10 = a5.f21133i0;
                                                nVar.getClass();
                                                AbstractC3557B.c0("call", jVar);
                                                try {
                                                    if (!this.f26020a) {
                                                    }
                                                    C i11 = a5.i();
                                                    i11.f21123g = eVar.c(a5);
                                                    d10 = i11.a();
                                                    if (!Lg.n.f2("close", d10.f21130Y.f21338c.r("Connection"))) {
                                                    }
                                                    dVar.getConnection().l();
                                                    if (i10 != 204) {
                                                    }
                                                    f6 = d10.f21136l0;
                                                    if (f6 == null) {
                                                    }
                                                    if (j6 > 0) {
                                                    }
                                                    return d10;
                                                } catch (IOException e14) {
                                                    e10 = e14;
                                                    if (iOException == null) {
                                                        P4.a.m(iOException, e10);
                                                        throw iOException;
                                                    }
                                                    throw e10;
                                                }
                                            }
                                            throw e11;
                                        }
                                        throw e11;
                                    }
                                } catch (IOException e15) {
                                    nVar.getClass();
                                    AbstractC3557B.c0("call", jVar);
                                    eVar.e(e15);
                                    throw e15;
                                }
                            } else {
                                z13 = true;
                                d11 = null;
                            }
                            try {
                                if (d11 == null) {
                                    try {
                                        eVar.f24237e = false;
                                        b10 = zVar.f21339d;
                                        AbstractC3557B.Z(b10);
                                        z14 = z13;
                                        c10 = d11;
                                    } catch (IOException e16) {
                                        e11 = e16;
                                        str = r42;
                                        z14 = z13;
                                        c10 = d11;
                                    }
                                    try {
                                        long a10 = b10.a();
                                        nVar.getClass();
                                        AbstractC3557B.c0("call", jVar);
                                        str = r42;
                                        C4115D I10 = R4.b.I(new C2007c(eVar, dVar.g(zVar, a10), a10));
                                        b11.c(I10);
                                        I10.close();
                                    } catch (IOException e17) {
                                        e11 = e17;
                                        str = r42;
                                        z12 = z14;
                                        if (!(e11 instanceof C2727a)) {
                                        }
                                    }
                                } else {
                                    str = r42;
                                    z14 = z13;
                                    c10 = d11;
                                    jVar.i(eVar, true, false, null);
                                    if (mVar.f24283g == null) {
                                        dVar.getConnection().l();
                                    }
                                }
                                z12 = z14;
                                iOException2 = null;
                            } catch (IOException e18) {
                                e11 = e18;
                            }
                        } catch (IOException e19) {
                            e11 = e19;
                            str = r42;
                            z12 = true;
                            c10 = null;
                            if (!(e11 instanceof C2727a)) {
                            }
                        }
                    } else {
                        str = r42;
                        iOException2 = null;
                        jVar.i(eVar, true, false, null);
                        z12 = true;
                        c10 = null;
                    }
                } catch (IOException e20) {
                    e11 = e20;
                    str = r42;
                    r42 = 1;
                    z12 = r42;
                    c10 = null;
                    if (!(e11 instanceof C2727a)) {
                    }
                }
            } catch (IOException e21) {
                nVar.getClass();
                AbstractC3557B.c0("call", jVar);
                eVar.e(e21);
                throw e21;
            }
        } catch (IOException e22) {
            e11 = e22;
        }
        try {
            dVar.a();
            z10 = z12;
            iOException = iOException2;
            if (c10 == null) {
                try {
                    c10 = eVar.d(false);
                    AbstractC3557B.Z(c10);
                    if (z10) {
                        nVar.getClass();
                        AbstractC3557B.c0("call", jVar);
                        c11 = c10;
                        z10 = false;
                        c11.d(zVar);
                        c11.f21121e = mVar.f24281e;
                        c11.f21127k = currentTimeMillis;
                        z11 = z10;
                        c11.f21128l = System.currentTimeMillis();
                        D a52 = c11.a();
                        i10 = a52.f21133i0;
                        if (i10 != 100) {
                            if (102 <= i10 && i10 < 200) {
                            }
                            nVar.getClass();
                            AbstractC3557B.c0("call", jVar);
                            if (!this.f26020a && i10 == 101) {
                                C i12 = a52.i();
                                i12.f21123g = Xh.b.f21998c;
                                d10 = i12.a();
                            } else {
                                C i112 = a52.i();
                                i112.f21123g = eVar.c(a52);
                                d10 = i112.a();
                            }
                            if (!Lg.n.f2("close", d10.f21130Y.f21338c.r("Connection")) || Lg.n.f2("close", D.h(d10, "Connection"))) {
                                dVar.getConnection().l();
                            }
                            if (i10 != 204 || i10 == 205) {
                                f6 = d10.f21136l0;
                                if (f6 == null) {
                                    j6 = ((E) f6).f21145Z;
                                } else {
                                    j6 = -1;
                                }
                                if (j6 > 0) {
                                    StringBuilder sb2 = new StringBuilder(str);
                                    sb2.append(i10);
                                    sb2.append(" had non-zero Content-Length: ");
                                    F f10 = d10.f21136l0;
                                    if (f10 != null) {
                                        l10 = Long.valueOf(((E) f10).f21145Z);
                                    } else {
                                        l10 = null;
                                    }
                                    sb2.append(l10);
                                    throw new ProtocolException(sb2.toString());
                                }
                            }
                            return d10;
                        }
                        C d122 = eVar.d(false);
                        AbstractC3557B.Z(d122);
                        if (z11) {
                            nVar.getClass();
                            AbstractC3557B.c0("call", jVar);
                        }
                        d122.d(zVar);
                        d122.f21121e = mVar.f24281e;
                        d122.f21127k = currentTimeMillis;
                        d122.f21128l = System.currentTimeMillis();
                        a52 = d122.a();
                        i10 = a52.f21133i0;
                        nVar.getClass();
                        AbstractC3557B.c0("call", jVar);
                        if (!this.f26020a) {
                        }
                        C i1122 = a52.i();
                        i1122.f21123g = eVar.c(a52);
                        d10 = i1122.a();
                        if (!Lg.n.f2("close", d10.f21130Y.f21338c.r("Connection"))) {
                        }
                        dVar.getConnection().l();
                        if (i10 != 204) {
                        }
                        f6 = d10.f21136l0;
                        if (f6 == null) {
                        }
                        if (j6 > 0) {
                        }
                        return d10;
                    }
                } catch (IOException e23) {
                    e10 = e23;
                    if (iOException == null) {
                    }
                }
            }
            c11 = c10;
            c11.d(zVar);
            c11.f21121e = mVar.f24281e;
            c11.f21127k = currentTimeMillis;
            z11 = z10;
            c11.f21128l = System.currentTimeMillis();
            D a522 = c11.a();
            i10 = a522.f21133i0;
            if (i10 != 100) {
            }
            C d1222 = eVar.d(false);
            AbstractC3557B.Z(d1222);
            if (z11) {
            }
            d1222.d(zVar);
            d1222.f21121e = mVar.f24281e;
            d1222.f21127k = currentTimeMillis;
            d1222.f21128l = System.currentTimeMillis();
            a522 = d1222.a();
            i10 = a522.f21133i0;
            nVar.getClass();
            AbstractC3557B.c0("call", jVar);
            if (!this.f26020a) {
            }
            C i11222 = a522.i();
            i11222.f21123g = eVar.c(a522);
            d10 = i11222.a();
            if (!Lg.n.f2("close", d10.f21130Y.f21338c.r("Connection"))) {
            }
            dVar.getConnection().l();
            if (i10 != 204) {
            }
            f6 = d10.f21136l0;
            if (f6 == null) {
            }
            if (j6 > 0) {
            }
            return d10;
        } catch (IOException e24) {
            try {
                eVar.e(e24);
                throw e24;
            } catch (IOException e25) {
                e11 = e25;
                if (!(e11 instanceof C2727a)) {
                }
            }
        }
    }
}
