package W;

import Ng.C1072l;
import Z.C1724m0;
import nf.AbstractC4825e;
import nf.AbstractC4828h;
import of.EnumC5000a;
import q1.AbstractC5260f;

/* renamed from: W.p3  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1600p3 {

    /* renamed from: a  reason: collision with root package name */
    public final Wg.d f20298a = Wg.e.a();

    /* renamed from: b  reason: collision with root package name */
    public final C1724m0 f20299b = AbstractC4828h.Z(null, Z.o1.f22665a);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0083 A[Catch: all -> 0x0087, TRY_LEAVE, TryCatch #2 {all -> 0x0087, blocks: (B:22:0x005c, B:24:0x0083), top: B:41:0x005c }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0090  */
    /* JADX WARN: Type inference failed for: r9v10, types: [Wg.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(B3 b32, AbstractC4825e abstractC4825e) {
        C1595o3 c1595o3;
        EnumC5000a enumC5000a;
        int i10;
        Wg.d dVar;
        C1600p3 c1600p3;
        C1600p3 c1600p32;
        Throwable th2;
        Object t10;
        Wg.a aVar;
        try {
            try {
                if (abstractC4825e instanceof C1595o3) {
                    c1595o3 = (C1595o3) abstractC4825e;
                    int i11 = c1595o3.f20264k0;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        c1595o3.f20264k0 = i11 - Integer.MIN_VALUE;
                        Object obj = c1595o3.f20262i0;
                        enumC5000a = EnumC5000a.f41328Y;
                        i10 = c1595o3.f20264k0;
                        if (i10 == 0) {
                            if (i10 != 1) {
                                if (i10 == 2) {
                                    aVar = c1595o3.f20261h0;
                                    c1600p32 = c1595o3.f20259Y;
                                    try {
                                        com.google.android.gms.internal.play_billing.N.B0(obj);
                                        c1600p32.f20299b.setValue(null);
                                        return obj;
                                    } catch (Throwable th3) {
                                        th2 = th3;
                                        c1600p32.f20299b.setValue(null);
                                        throw th2;
                                    }
                                }
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ?? r92 = c1595o3.f20261h0;
                            B3 b33 = c1595o3.f20260Z;
                            c1600p3 = c1595o3.f20259Y;
                            com.google.android.gms.internal.play_billing.N.B0(obj);
                            dVar = r92;
                            b32 = b33;
                        } else {
                            com.google.android.gms.internal.play_billing.N.B0(obj);
                            c1595o3.f20259Y = this;
                            c1595o3.f20260Z = b32;
                            dVar = this.f20298a;
                            c1595o3.f20261h0 = dVar;
                            c1595o3.f20264k0 = 1;
                            if (dVar.e(null, c1595o3) == enumC5000a) {
                                return enumC5000a;
                            }
                            c1600p3 = this;
                        }
                        c1595o3.f20259Y = c1600p3;
                        c1595o3.f20260Z = b32;
                        c1595o3.f20261h0 = dVar;
                        c1595o3.getClass();
                        c1595o3.f20264k0 = 2;
                        C1072l c1072l = new C1072l(1, AbstractC5260f.z(c1595o3));
                        c1072l.u();
                        c1600p3.f20299b.setValue(new C1585m3(b32, c1072l));
                        t10 = c1072l.t();
                        if (t10 == enumC5000a) {
                            com.google.android.gms.internal.play_billing.N.k0(c1595o3);
                        }
                        if (t10 != enumC5000a) {
                            return enumC5000a;
                        }
                        c1600p32 = c1600p3;
                        Wg.d dVar2 = dVar;
                        obj = t10;
                        aVar = dVar2;
                        c1600p32.f20299b.setValue(null);
                        return obj;
                    }
                }
                c1595o3.f20259Y = c1600p3;
                c1595o3.f20260Z = b32;
                c1595o3.f20261h0 = dVar;
                c1595o3.getClass();
                c1595o3.f20264k0 = 2;
                C1072l c1072l2 = new C1072l(1, AbstractC5260f.z(c1595o3));
                c1072l2.u();
                c1600p3.f20299b.setValue(new C1585m3(b32, c1072l2));
                t10 = c1072l2.t();
                if (t10 == enumC5000a) {
                }
                if (t10 != enumC5000a) {
                }
            } catch (Throwable th4) {
                c1600p32 = c1600p3;
                th2 = th4;
                c1600p32.f20299b.setValue(null);
                throw th2;
            }
            if (i10 == 0) {
            }
        } finally {
            ((Wg.d) b32).g(null);
        }
        c1595o3 = new C1595o3(this, abstractC4825e);
        Object obj2 = c1595o3.f20262i0;
        enumC5000a = EnumC5000a.f41328Y;
        i10 = c1595o3.f20264k0;
    }
}
