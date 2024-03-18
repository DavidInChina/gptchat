package C;

import B.W0;
import E0.O;
import F.A;
import F.J;
import F.x;
import F.z;
import Ng.H;
import com.google.android.gms.internal.play_billing.N;
import java.util.List;
import y.h0;
import y.i0;
import y.s0;
import z.AbstractC6652A0;
import z.C6718q;
import z.C6737z0;

/* loaded from: classes.dex */
public final class c implements o {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ J f2436a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ q f2437b;

    public c(J j6, q qVar) {
        this.f2436a = j6;
        this.f2437b = qVar;
    }

    @Override // C.o
    public final float a(float f6) {
        float f10;
        h0 h0Var = new h0(s0.f50282a, this.f2436a.f4878h);
        C6737z0 c6737z0 = AbstractC6652A0.f51116a;
        C6718q c6718q = new C6718q(0.0f);
        for (int i10 = 0; i10 < 1; i10++) {
            if (i10 == 0) {
                f10 = f6;
            } else {
                f10 = 0.0f;
            }
            double g10 = h0Var.g(f10);
            double d10 = i0.f50223a;
            c6718q.e(i10, (Math.signum(f10) * ((float) (Math.exp((d10 / (d10 - 1.0d)) * g10) * h0Var.f50219a * h0Var.f50220b))) + 0.0f);
        }
        float j6 = N.j((c() * ((float) Math.floor(Math.abs(Math.abs(c6718q.f51351a)) / c()))) - c(), 0.0f);
        if (j6 != 0.0f) {
            return j6 * Math.signum(f6);
        }
        return j6;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a3, code lost:
        if (java.lang.Math.abs(r9) <= java.lang.Math.abs(r8)) goto L27;
     */
    @Override // C.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float b(float f6) {
        long c10;
        J j6 = this.f2436a;
        List list = ((z) j6.h()).f5012g;
        int size = list.size();
        float f10 = Float.POSITIVE_INFINITY;
        float f11 = Float.NEGATIVE_INFINITY;
        for (int i10 = 0; i10 < size; i10++) {
            F.n nVar = (F.n) list.get(i10);
            z zVar = (z) j6.h();
            W0 w02 = zVar.f5016k;
            W0 w03 = W0.f1213Y;
            O o10 = zVar.f5019n;
            if (w02 == w03) {
                c10 = H.c(o10.getWidth(), o10.getHeight()) & 4294967295L;
            } else {
                c10 = H.c(o10.getWidth(), o10.getHeight()) >> 32;
            }
            A a5 = (A) nVar;
            float f02 = A7.b.f0((int) c10, -((z) j6.h()).f5013h, ((z) j6.h()).f5017l, a5.f4841p, a5.f4840o, this.f2437b);
            if (f02 <= 0.0f && f02 > f11) {
                f11 = f02;
            }
            if (f02 >= 0.0f && f02 < f10) {
                f10 = f02;
            }
        }
        int M10 = R4.b.M(f6, j6.f4878h);
        if (!L4.a.k0(M10, 0)) {
            if (!L4.a.k0(M10, 1)) {
                if (!L4.a.k0(M10, 2)) {
                    f11 = 0.0f;
                }
            }
            f11 = f10;
        }
        if (f11 == Float.POSITIVE_INFINITY || f11 == Float.NEGATIVE_INFINITY) {
            return 0.0f;
        }
        return f11;
    }

    public final float c() {
        x h10 = this.f2436a.h();
        if (!((z) h10).f5012g.isEmpty()) {
            List list = ((z) h10).f5012g;
            int size = list.size();
            int i10 = 0;
            for (int i11 = 0; i11 < size; i11++) {
                i10 += ((A) ((F.n) list.get(i11))).f4841p;
            }
            return i10 / list.size();
        }
        return 0.0f;
    }
}
