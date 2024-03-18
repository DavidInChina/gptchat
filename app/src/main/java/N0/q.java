package N0;

import id.AbstractC3557B;

/* loaded from: classes.dex */
public abstract class q {

    /* renamed from: a  reason: collision with root package name */
    public static final long f12558a = Z0.n.f22810c;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ int f12559b = 0;

    static {
        Z0.o[] oVarArr = Z0.n.f22809b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0034, code lost:
        if (Z0.n.a(r12, r14.f12551c) != false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final p a(p pVar, int i10, int i11, long j6, Y0.q qVar, s sVar, Y0.g gVar, int i12, int i13, Y0.r rVar) {
        long j10;
        long j11;
        int i14 = i10;
        int i15 = i11;
        Y0.q qVar2 = qVar;
        s sVar2 = sVar;
        Y0.g gVar2 = gVar;
        int i16 = i12;
        int i17 = i13;
        Y0.r rVar2 = rVar;
        if (!Y0.i.a(i10, Integer.MIN_VALUE) && !Y0.i.a(i10, pVar.f12549a)) {
            j10 = j6;
        } else {
            if (!M3.H.a0(j6)) {
                j10 = j6;
            } else {
                j10 = j6;
            }
            if ((qVar2 == null || AbstractC3557B.K(qVar2, pVar.f12552d)) && ((Y0.k.a(i15, Integer.MIN_VALUE) || Y0.k.a(i15, pVar.f12550b)) && ((sVar2 == null || AbstractC3557B.K(sVar2, pVar.f12553e)) && ((gVar2 == null || AbstractC3557B.K(gVar2, pVar.f12554f)) && ((i16 == 0 || i16 == pVar.f12555g) && ((Y0.d.a(i17, Integer.MIN_VALUE) || Y0.d.a(i17, pVar.f12556h)) && (rVar2 == null || AbstractC3557B.K(rVar2, pVar.f12557i)))))))) {
                return pVar;
            }
        }
        if (M3.H.a0(j6)) {
            j11 = pVar.f12551c;
        } else {
            j11 = j10;
        }
        if (qVar2 == null) {
            qVar2 = pVar.f12552d;
        }
        if (Y0.i.a(i10, Integer.MIN_VALUE)) {
            i14 = pVar.f12549a;
        }
        if (Y0.k.a(i15, Integer.MIN_VALUE)) {
            i15 = pVar.f12550b;
        }
        s sVar3 = pVar.f12553e;
        if (sVar3 != null && sVar2 == null) {
            sVar2 = sVar3;
        }
        if (gVar2 == null) {
            gVar2 = pVar.f12554f;
        }
        if (i16 == 0) {
            i16 = pVar.f12555g;
        }
        if (Y0.d.a(i17, Integer.MIN_VALUE)) {
            i17 = pVar.f12556h;
        }
        if (rVar2 == null) {
            rVar2 = pVar.f12557i;
        }
        return new p(i14, i15, j11, qVar2, sVar2, gVar2, i16, i17, rVar2);
    }
}
