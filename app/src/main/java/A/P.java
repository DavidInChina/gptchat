package A;

import B.X1;
import B.Z1;
import nf.AbstractC4825e;
import of.EnumC5000a;
import wf.AbstractC6216a;

/* loaded from: classes2.dex */
public final class P extends AbstractC0016f {

    /* renamed from: A0  reason: collision with root package name */
    public AbstractC6216a f100A0;

    /* renamed from: B0  reason: collision with root package name */
    public AbstractC6216a f101B0;

    @Override // A.AbstractC0016f
    public final Object C0(B0.A a5, AbstractC4825e abstractC4825e) {
        O o10;
        O o11;
        long j6 = ((B0.P) a5).f1623y0;
        long c10 = kotlin.jvm.internal.m.c(((int) (j6 >> 32)) / 2, ((int) (j6 & 4294967295L)) / 2);
        int i10 = Z0.i.f22798c;
        this.f196x0.f161c = R4.b.r((int) (c10 >> 32), (int) (c10 & 4294967295L));
        boolean z10 = this.f193u0;
        if (z10 && this.f101B0 != null) {
            o10 = new O(this, 0);
        } else {
            o10 = null;
        }
        if (z10 && this.f100A0 != null) {
            o11 = new O(this, 1);
        } else {
            o11 = null;
        }
        H h10 = new H(this, null, 1);
        O o12 = new O(this, 2);
        B.B0 b02 = Z1.f1251a;
        Object e02 = Ad.l.e0(new X1(a5, null, o11, o10, o12, h10), abstractC4825e);
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        jf.y yVar = jf.y.f36177a;
        if (e02 != enumC5000a) {
            e02 = yVar;
        }
        if (e02 == enumC5000a) {
            return e02;
        }
        return yVar;
    }
}
