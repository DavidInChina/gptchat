package L;

import A.C0036p;
import android.gov.nist.javax.sip.header.ParameterNames;
import id.AbstractC3557B;
import java.io.File;
import n0.C4707f;
import o0.C4869d;
import q0.C5254f;
import r0.C5347k;
import xe.C6419h;

/* renamed from: L.c  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0840c extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f10102Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ long f10103Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0840c(long j6, int i10) {
        super(1);
        this.f10102Y = i10;
        this.f10103Z = j6;
    }

    public final Boolean a(C6419h c6419h) {
        int i10 = this.f10102Y;
        boolean z10 = false;
        long j6 = this.f10103Z;
        switch (i10) {
            case 5:
                AbstractC3557B.c0(ParameterNames.COOKIE, c6419h);
                He.b bVar = c6419h.f49892e;
                if (bVar != null) {
                    if (bVar.f7676n0 < j6) {
                        z10 = true;
                    }
                    return Boolean.valueOf(z10);
                }
                return Boolean.FALSE;
            default:
                AbstractC3557B.c0(ParameterNames.COOKIE, c6419h);
                He.b bVar2 = c6419h.f49892e;
                if (bVar2 != null) {
                    if (bVar2.f7676n0 < j6) {
                        z10 = true;
                    }
                    return Boolean.valueOf(z10);
                }
                return Boolean.FALSE;
        }
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        boolean z10;
        long j6 = 0;
        int i10 = this.f10102Y;
        long j10 = this.f10103Z;
        switch (i10) {
            case 0:
                C4869d c4869d = (C4869d) obj;
                float d10 = C5254f.d(c4869d.f40415Y.g()) / 2.0f;
                r0.z K10 = M3.H.K(c4869d, d10);
                int i11 = C5347k.f44246d;
                return c4869d.a(new C0036p(d10, K10, C4707f.a(5, this.f10103Z), 3));
            case 1:
                ((L0.j) ((L0.v) obj)).y(N.P.f12239c, new N.O(Y.f10081Y, j10, 2, true));
                return jf.y.f36177a;
            case 2:
                Long l10 = (Long) obj;
                if (l10 != null) {
                    Mg.a aVar = Mg.b.f12127Z;
                    if (j10 > 0) {
                        return Long.valueOf(Mg.b.e(j10) + l10.longValue());
                    }
                    throw new IllegalArgumentException("Cannot call addTime with a negative duration".toString());
                }
                throw new IllegalStateException("Start the timer with startTimer before calling addTime".toString());
            case 3:
                File file = (File) obj;
                AbstractC3557B.c0("it", file);
                String name = file.getName();
                AbstractC3557B.b0("it.name", name);
                Long X12 = Lg.m.X1(name);
                if (X12 != null) {
                    j6 = X12.longValue();
                }
                if (j6 < j10) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            case 4:
                E0.M m10 = (E0.M) obj;
                AbstractC3557B.c0("item", m10);
                return m10.o(j10);
            case 5:
                return a((C6419h) obj);
            case 6:
                return a((C6419h) obj);
            default:
                return Long.valueOf(j10);
        }
    }
}
