package k4;

import Ng.C1072l;
import Wh.AbstractC1659d;
import Wh.C;
import Wh.C1658c;
import Wh.D;
import Wh.E;
import Wh.F;
import Wh.u;
import Wh.w;
import Wh.y;
import Wh.z;
import android.content.Context;
import android.gov.nist.core.Separators;
import android.graphics.Bitmap;
import android.os.Looper;
import android.os.NetworkOnMainThreadException;
import android.webkit.MimeTypeMap;
import com.google.android.gms.internal.play_billing.N;
import h4.o;
import h4.q;
import i4.AbstractC3469b;
import i4.AbstractC3470c;
import i4.C3473f;
import id.AbstractC3557B;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import jf.AbstractC3957g;
import ji.AbstractC4141p;
import ji.C4113B;
import ji.C4115D;
import ji.C4116E;
import ji.C4138m;
import nf.AbstractC4825e;
import of.EnumC5000a;
import q1.AbstractC5260f;

/* renamed from: k4.l  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4170l implements AbstractC4165g {

    /* renamed from: f  reason: collision with root package name */
    public static final C1658c f37021f = new C1658c(true, true, -1, -1, false, false, false, -1, -1, false, false, false, null);

    /* renamed from: g  reason: collision with root package name */
    public static final C1658c f37022g = new C1658c(true, false, -1, -1, false, false, false, -1, -1, true, false, false, null);

    /* renamed from: a  reason: collision with root package name */
    public final String f37023a;

    /* renamed from: b  reason: collision with root package name */
    public final q4.n f37024b;

    /* renamed from: c  reason: collision with root package name */
    public final AbstractC3957g f37025c;

    /* renamed from: d  reason: collision with root package name */
    public final AbstractC3957g f37026d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f37027e;

    public C4170l(String str, q4.n nVar, AbstractC3957g abstractC3957g, AbstractC3957g abstractC3957g2, boolean z10) {
        this.f37023a = str;
        this.f37024b = nVar;
        this.f37025c = abstractC3957g;
        this.f37026d = abstractC3957g2;
        this.f37027e = z10;
    }

    public static String d(String str, u uVar) {
        String str2;
        String b10;
        if (uVar != null) {
            str2 = uVar.f21261a;
        } else {
            str2 = null;
        }
        if ((str2 == null || Lg.n.I2(str2, "text/plain", false)) && (b10 = u4.e.b(MimeTypeMap.getSingleton(), str)) != null) {
            return b10;
        }
        if (str2 == null) {
            return null;
        }
        return Lg.n.R2(str2, ';');
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0213 A[Catch: Exception -> 0x00cc, TryCatch #1 {Exception -> 0x00cc, blocks: (B:33:0x0095, B:35:0x00a0, B:38:0x00b4, B:40:0x00bc, B:44:0x00d0, B:46:0x00d4, B:50:0x00ed, B:52:0x0105, B:54:0x0111, B:55:0x011a, B:57:0x0124, B:58:0x012f, B:59:0x0130, B:60:0x013d, B:64:0x0155, B:100:0x020f, B:101:0x0212, B:102:0x0213, B:103:0x021c), top: B:108:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x015d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0095 A[Catch: Exception -> 0x00cc, TRY_ENTER, TryCatch #1 {Exception -> 0x00cc, blocks: (B:33:0x0095, B:35:0x00a0, B:38:0x00b4, B:40:0x00bc, B:44:0x00d0, B:46:0x00d4, B:50:0x00ed, B:52:0x0105, B:54:0x0111, B:55:0x011a, B:57:0x0124, B:58:0x012f, B:59:0x0130, B:60:0x013d, B:64:0x0155, B:100:0x020f, B:101:0x0212, B:102:0x0213, B:103:0x021c), top: B:108:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0130 A[Catch: Exception -> 0x00cc, TryCatch #1 {Exception -> 0x00cc, blocks: (B:33:0x0095, B:35:0x00a0, B:38:0x00b4, B:40:0x00bc, B:44:0x00d0, B:46:0x00d4, B:50:0x00ed, B:52:0x0105, B:54:0x0111, B:55:0x011a, B:57:0x0124, B:58:0x012f, B:59:0x0130, B:60:0x013d, B:64:0x0155, B:100:0x020f, B:101:0x0212, B:102:0x0213, B:103:0x021c), top: B:108:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0150 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01de A[Catch: Exception -> 0x018d, TryCatch #0 {Exception -> 0x018d, blocks: (B:66:0x015d, B:69:0x0169, B:71:0x0175, B:73:0x0183, B:77:0x018f, B:79:0x0198, B:81:0x01b4, B:82:0x01b7, B:83:0x01b9, B:85:0x01bd, B:90:0x01d8, B:92:0x01de, B:94:0x01fc, B:95:0x01ff, B:96:0x0201, B:98:0x0205, B:99:0x020e), top: B:107:0x015d }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0205 A[Catch: Exception -> 0x018d, TryCatch #0 {Exception -> 0x018d, blocks: (B:66:0x015d, B:69:0x0169, B:71:0x0175, B:73:0x0183, B:77:0x018f, B:79:0x0198, B:81:0x01b4, B:82:0x01b7, B:83:0x01b9, B:85:0x01bd, B:90:0x01d8, B:92:0x01de, B:94:0x01fc, B:95:0x01ff, B:96:0x0201, B:98:0x0205, B:99:0x020e), top: B:107:0x015d }] */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    @Override // k4.AbstractC4165g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(AbstractC4825e abstractC4825e) {
        C4169k c4169k;
        ?? r22;
        Exception e10;
        i4.m mVar;
        Exception e11;
        D d10;
        C4170l c4170l;
        F f6;
        h4.f fVar;
        C4170l c4170l2;
        p4.d dVar;
        i4.m mVar2;
        F f10;
        h4.f fVar2;
        p4.d dVar2;
        Object b10;
        p4.b bVar;
        AbstractC3470c abstractC3470c;
        try {
            if (abstractC4825e instanceof C4169k) {
                c4169k = (C4169k) abstractC4825e;
                int i10 = c4169k.f37020k0;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    c4169k.f37020k0 = i10 - Integer.MIN_VALUE;
                    Object obj = c4169k.f37018i0;
                    EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                    r22 = c4169k.f37020k0;
                    u uVar = null;
                    if (r22 == 0) {
                        if (r22 != 1) {
                            if (r22 == 2) {
                                d10 = (D) c4169k.f37017h0;
                                i4.m mVar3 = c4169k.f37016Z;
                                c4170l = c4169k.f37015Y;
                                try {
                                    N.B0(obj);
                                    D d11 = (D) obj;
                                    Bitmap.Config[] configArr = u4.e.f46388a;
                                    f6 = d11.f21136l0;
                                    if (f6 == null) {
                                        Context context = c4170l.f37024b.f43869a;
                                        q qVar = new q(((E) f6).f21146h0, null);
                                        String d12 = d(c4170l.f37023a, f6.a());
                                        if (d11.f21137m0 != null) {
                                            fVar = h4.f.f31882i0;
                                        } else {
                                            fVar = h4.f.f31881h0;
                                        }
                                        return new C4172n(qVar, d12, fVar);
                                    }
                                    throw new IllegalStateException("response body == null".toString());
                                } catch (Exception e12) {
                                    e11 = e12;
                                    u4.e.a(d10);
                                    throw e11;
                                }
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        p4.d dVar3 = (p4.d) c4169k.f37017h0;
                        mVar = c4169k.f37016Z;
                        c4170l2 = c4169k.f37015Y;
                        try {
                            N.B0(obj);
                            dVar = dVar3;
                            mVar2 = mVar;
                        } catch (Exception e13) {
                            e10 = e13;
                            if (mVar != null) {
                                u4.e.a(mVar);
                            }
                            throw e10;
                        }
                    } else {
                        N.B0(obj);
                        q4.n nVar = this.f37024b;
                        boolean z10 = nVar.f43882n.f43751Y;
                        String str = this.f37023a;
                        if (z10 && (abstractC3470c = (AbstractC3470c) this.f37026d.getValue()) != null) {
                            String str2 = nVar.f43877i;
                            if (str2 == null) {
                                str2 = str;
                            }
                            C4138m c4138m = C4138m.f36722i0;
                            C3473f j6 = ((i4.n) abstractC3470c).f32704b.j(ei.l.g(str2).c("SHA-256").e());
                            if (j6 != null) {
                                mVar2 = new i4.m(j6);
                                if (mVar2 == null) {
                                    AbstractC4141p c10 = c();
                                    C3473f c3473f = mVar2.f32702Y;
                                    if (!c3473f.f32677Z) {
                                        Long l10 = c10.h((C4113B) c3473f.f32676Y.f32669c.get(0)).f36732d;
                                        if (l10 != null && l10.longValue() == 0) {
                                            return new C4172n(g(mVar2), d(str, null), h4.f.f31881h0);
                                        }
                                        if (this.f37027e) {
                                            dVar2 = new p4.c(e(), f(mVar2)).a();
                                            if (dVar2.f42731a == null && (bVar = dVar2.f42732b) != null) {
                                                return new C4172n(g(mVar2), d(str, (u) bVar.f42715b.getValue()), h4.f.f31881h0);
                                            }
                                        } else {
                                            o g10 = g(mVar2);
                                            p4.b f11 = f(mVar2);
                                            if (f11 != null) {
                                                uVar = (u) f11.f42715b.getValue();
                                            }
                                            return new C4172n(g10, d(str, uVar), h4.f.f31881h0);
                                        }
                                    } else {
                                        throw new IllegalStateException("snapshot is closed".toString());
                                    }
                                } else {
                                    dVar2 = new p4.c(e(), null).a();
                                }
                                z zVar = dVar2.f42731a;
                                AbstractC3557B.Z(zVar);
                                c4169k.f37015Y = this;
                                c4169k.f37016Z = mVar2;
                                c4169k.f37017h0 = dVar2;
                                c4169k.f37020k0 = 1;
                                b10 = b(zVar, c4169k);
                                if (b10 != enumC5000a) {
                                    return enumC5000a;
                                }
                                c4170l2 = this;
                                dVar = dVar2;
                                obj = b10;
                            }
                        }
                        mVar2 = null;
                        if (mVar2 == null) {
                        }
                        z zVar2 = dVar2.f42731a;
                        AbstractC3557B.Z(zVar2);
                        c4169k.f37015Y = this;
                        c4169k.f37016Z = mVar2;
                        c4169k.f37017h0 = dVar2;
                        c4169k.f37020k0 = 1;
                        b10 = b(zVar2, c4169k);
                        if (b10 != enumC5000a) {
                        }
                    }
                    D d13 = (D) obj;
                    Bitmap.Config[] configArr2 = u4.e.f46388a;
                    f10 = d13.f21136l0;
                    if (f10 == null) {
                        try {
                            i4.m h10 = c4170l2.h(mVar2, dVar.f42731a, d13, dVar.f42732b);
                            String str3 = c4170l2.f37023a;
                            if (h10 != null) {
                                o g11 = c4170l2.g(h10);
                                p4.b f12 = c4170l2.f(h10);
                                if (f12 != null) {
                                    uVar = (u) f12.f42715b.getValue();
                                }
                                return new C4172n(g11, d(str3, uVar), h4.f.f31882i0);
                            } else if (((E) f10).f21145Z > 0) {
                                Context context2 = c4170l2.f37024b.f43869a;
                                q qVar2 = new q(((E) f10).f21146h0, null);
                                String d14 = d(str3, f10.a());
                                if (d13.f21137m0 != null) {
                                    fVar2 = h4.f.f31882i0;
                                } else {
                                    fVar2 = h4.f.f31881h0;
                                }
                                return new C4172n(qVar2, d14, fVar2);
                            } else {
                                u4.e.a(d13);
                                z e14 = c4170l2.e();
                                c4169k.f37015Y = c4170l2;
                                c4169k.f37016Z = h10;
                                c4169k.f37017h0 = d13;
                                c4169k.f37020k0 = 2;
                                Object b11 = c4170l2.b(e14, c4169k);
                                if (b11 == enumC5000a) {
                                    return enumC5000a;
                                }
                                d10 = d13;
                                obj = b11;
                                c4170l = c4170l2;
                                D d112 = (D) obj;
                                Bitmap.Config[] configArr3 = u4.e.f46388a;
                                f6 = d112.f21136l0;
                                if (f6 == null) {
                                }
                            }
                        } catch (Exception e15) {
                            d10 = d13;
                            e11 = e15;
                            u4.e.a(d10);
                            throw e11;
                        }
                    } else {
                        throw new IllegalStateException("response body == null".toString());
                    }
                }
            }
            if (r22 == 0) {
            }
            D d132 = (D) obj;
            Bitmap.Config[] configArr22 = u4.e.f46388a;
            f10 = d132.f21136l0;
            if (f10 == null) {
            }
        } catch (Exception e16) {
            e10 = e16;
            mVar = r22;
        }
        c4169k = new C4169k(this, abstractC4825e);
        Object obj2 = c4169k.f37018i0;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        r22 = c4169k.f37020k0;
        u uVar2 = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(z zVar, AbstractC4825e abstractC4825e) {
        C4168j c4168j;
        int i10;
        D d10;
        int i11;
        F f6;
        if (abstractC4825e instanceof C4168j) {
            c4168j = (C4168j) abstractC4825e;
            int i12 = c4168j.f37014h0;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                c4168j.f37014h0 = i12 - Integer.MIN_VALUE;
                Object obj = c4168j.f37012Y;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = c4168j.f37014h0;
                if (i10 == 0) {
                    if (i10 == 1) {
                        N.B0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    N.B0(obj);
                    Bitmap.Config[] configArr = u4.e.f46388a;
                    boolean K10 = AbstractC3557B.K(Looper.myLooper(), Looper.getMainLooper());
                    AbstractC3957g abstractC3957g = this.f37025c;
                    if (K10) {
                        if (!this.f37024b.f43883o.f43751Y) {
                            d10 = ((w) ((AbstractC1659d) abstractC3957g.getValue())).b(zVar).f();
                            i11 = d10.f21133i0;
                            if ((200 <= i11 || i11 >= 300) && i11 != 304) {
                                f6 = d10.f21136l0;
                                if (f6 != null) {
                                    u4.e.a(f6);
                                }
                                StringBuilder q10 = android.gov.nist.core.a.q("HTTP ", i11, ": ");
                                q10.append(d10.f21132h0);
                                throw new RuntimeException(q10.toString());
                            }
                            return d10;
                        }
                        throw new NetworkOnMainThreadException();
                    }
                    ai.j b10 = ((w) ((AbstractC1659d) abstractC3957g.getValue())).b(zVar);
                    c4168j.f37014h0 = 1;
                    C1072l c1072l = new C1072l(1, AbstractC5260f.z(c4168j));
                    c1072l.u();
                    u4.f fVar = new u4.f(b10, c1072l);
                    b10.e(fVar);
                    c1072l.w(fVar);
                    obj = c1072l.t();
                    if (obj == enumC5000a) {
                        N.k0(c4168j);
                    }
                    if (obj == enumC5000a) {
                        return enumC5000a;
                    }
                }
                d10 = (D) obj;
                i11 = d10.f21133i0;
                if (200 <= i11) {
                }
                f6 = d10.f21136l0;
                if (f6 != null) {
                }
                StringBuilder q102 = android.gov.nist.core.a.q("HTTP ", i11, ": ");
                q102.append(d10.f21132h0);
                throw new RuntimeException(q102.toString());
            }
        }
        c4168j = new C4168j(this, abstractC4825e);
        Object obj2 = c4168j.f37012Y;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = c4168j.f37014h0;
        if (i10 == 0) {
        }
        d10 = (D) obj2;
        i11 = d10.f21133i0;
        if (200 <= i11) {
        }
        f6 = d10.f21136l0;
        if (f6 != null) {
        }
        StringBuilder q1022 = android.gov.nist.core.a.q("HTTP ", i11, ": ");
        q1022.append(d10.f21132h0);
        throw new RuntimeException(q1022.toString());
    }

    public final AbstractC4141p c() {
        Object value = this.f37026d.getValue();
        AbstractC3557B.Z(value);
        return ((i4.n) ((AbstractC3470c) value)).f32703a;
    }

    public final z e() {
        y yVar = new y();
        yVar.g(this.f37023a);
        q4.n nVar = this.f37024b;
        Wh.q qVar = nVar.f43878j;
        AbstractC3557B.c0("headers", qVar);
        yVar.f21333c = qVar.I();
        for (Map.Entry entry : nVar.f43879k.f43894a.entrySet()) {
            Object key = entry.getKey();
            AbstractC3557B.a0("null cannot be cast to non-null type java.lang.Class<kotlin.Any>", key);
            Class cls = (Class) key;
            Object value = entry.getValue();
            if (value == null) {
                yVar.f21335e.remove(cls);
            } else {
                if (yVar.f21335e.isEmpty()) {
                    yVar.f21335e = new LinkedHashMap();
                }
                LinkedHashMap linkedHashMap = yVar.f21335e;
                Object cast = cls.cast(value);
                AbstractC3557B.Z(cast);
                linkedHashMap.put(cls, cast);
            }
        }
        q4.b bVar = nVar.f43882n;
        boolean z10 = bVar.f43751Y;
        boolean z11 = nVar.f43883o.f43751Y;
        if (!z11 && z10) {
            yVar.c(C1658c.f21171o);
        } else if (z11 && !z10) {
            if (bVar.f43752Z) {
                yVar.c(C1658c.f21170n);
            } else {
                yVar.c(f37021f);
            }
        } else if (!z11 && !z10) {
            yVar.c(f37022g);
        }
        return yVar.b();
    }

    public final p4.b f(i4.m mVar) {
        Throwable th2;
        try {
            AbstractC4141p c10 = c();
            C3473f c3473f = mVar.f32702Y;
            if (!c3473f.f32677Z) {
                C4116E J10 = R4.b.J(c10.l((C4113B) c3473f.f32676Y.f32669c.get(0)));
                p4.b bVar = new p4.b(J10);
                try {
                    J10.close();
                    th2 = null;
                } catch (Throwable th3) {
                    th2 = th3;
                }
                if (th2 == null) {
                    AbstractC3557B.Z(bVar);
                    return bVar;
                }
                throw th2;
            }
            throw new IllegalStateException("snapshot is closed".toString());
        } catch (IOException unused) {
            return null;
        }
    }

    public final o g(i4.m mVar) {
        C3473f c3473f = mVar.f32702Y;
        if (!c3473f.f32677Z) {
            C4113B c4113b = (C4113B) c3473f.f32676Y.f32669c.get(1);
            AbstractC4141p c10 = c();
            String str = this.f37024b.f43877i;
            if (str == null) {
                str = this.f37023a;
            }
            return new o(c4113b, c10, str, mVar);
        }
        throw new IllegalStateException("snapshot is closed".toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0082 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final i4.m h(AbstractC3469b abstractC3469b, z zVar, D d10, p4.b bVar) {
        i4.l lVar;
        Throwable th2;
        jf.y yVar;
        Long l10;
        jf.y yVar2;
        B2.E i10;
        Throwable th3 = null;
        if (this.f37024b.f43882n.f43752Z && (!this.f37027e || (!zVar.a().f21173b && !d10.a().f21173b && !AbstractC3557B.K(d10.f21135k0.r("Vary"), Separators.STAR)))) {
            if (abstractC3469b != null) {
                C3473f c3473f = ((i4.m) abstractC3469b).f32702Y;
                i4.i iVar = c3473f.f32678h0;
                synchronized (iVar) {
                    c3473f.close();
                    i10 = iVar.i(c3473f.f32676Y.f32667a);
                }
                if (i10 != null) {
                    lVar = new i4.l(i10);
                    if (lVar != null) {
                        return null;
                    }
                    try {
                        try {
                            if (d10.f21133i0 == 304 && bVar != null) {
                                C i11 = d10.i();
                                i11.c(i4.k.g(bVar.f42719f, d10.f21135k0));
                                D a5 = i11.a();
                                C4115D I10 = R4.b.I(c().k(lVar.f32701a.g(0)));
                                try {
                                    new p4.b(a5).a(I10);
                                    yVar2 = jf.y.f36177a;
                                    try {
                                        I10.close();
                                    } catch (Throwable th4) {
                                        th3 = th4;
                                    }
                                } catch (Throwable th5) {
                                    try {
                                        I10.close();
                                    } catch (Throwable th6) {
                                        P4.a.m(th5, th6);
                                    }
                                    th3 = th5;
                                    yVar2 = null;
                                }
                                if (th3 == null) {
                                    AbstractC3557B.Z(yVar2);
                                } else {
                                    throw th3;
                                }
                            } else {
                                C4115D I11 = R4.b.I(c().k(lVar.f32701a.g(0)));
                                try {
                                    new p4.b(d10).a(I11);
                                    yVar = jf.y.f36177a;
                                    try {
                                        I11.close();
                                        th2 = null;
                                    } catch (Throwable th7) {
                                        th2 = th7;
                                    }
                                } catch (Throwable th8) {
                                    try {
                                        I11.close();
                                    } catch (Throwable th9) {
                                        P4.a.m(th8, th9);
                                    }
                                    th2 = th8;
                                    yVar = null;
                                }
                                if (th2 == null) {
                                    AbstractC3557B.Z(yVar);
                                    C4115D I12 = R4.b.I(c().k(lVar.f32701a.g(1)));
                                    try {
                                        F f6 = d10.f21136l0;
                                        AbstractC3557B.Z(f6);
                                        l10 = Long.valueOf(((E) f6).f21146h0.A(I12));
                                        try {
                                            I12.close();
                                        } catch (Throwable th10) {
                                            th3 = th10;
                                        }
                                    } catch (Throwable th11) {
                                        try {
                                            I12.close();
                                        } catch (Throwable th12) {
                                            P4.a.m(th11, th12);
                                        }
                                        th3 = th11;
                                        l10 = null;
                                    }
                                    if (th3 == null) {
                                        AbstractC3557B.Z(l10);
                                    } else {
                                        throw th3;
                                    }
                                } else {
                                    throw th2;
                                }
                            }
                            i4.m a10 = lVar.a();
                            u4.e.a(d10);
                            return a10;
                        } catch (Exception e10) {
                            Bitmap.Config[] configArr = u4.e.f46388a;
                            try {
                                lVar.f32701a.b(false);
                            } catch (Exception unused) {
                            }
                            throw e10;
                        }
                    } catch (Throwable th13) {
                        u4.e.a(d10);
                        throw th13;
                    }
                }
                lVar = null;
                if (lVar != null) {
                }
            } else {
                AbstractC3470c abstractC3470c = (AbstractC3470c) this.f37026d.getValue();
                if (abstractC3470c != null) {
                    String str = this.f37024b.f43877i;
                    if (str == null) {
                        str = this.f37023a;
                    }
                    i4.i iVar2 = ((i4.n) abstractC3470c).f32704b;
                    C4138m c4138m = C4138m.f36722i0;
                    B2.E i12 = iVar2.i(ei.l.g(str).c("SHA-256").e());
                    if (i12 != null) {
                        lVar = new i4.l(i12);
                        if (lVar != null) {
                        }
                    }
                }
                lVar = null;
                if (lVar != null) {
                }
            }
        } else {
            if (abstractC3469b != null) {
                u4.e.a(abstractC3469b);
            }
            return null;
        }
    }
}
