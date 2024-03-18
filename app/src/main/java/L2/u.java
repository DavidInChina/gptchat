package L2;

import s2.AbstractC5530A;

/* loaded from: classes2.dex */
public class u implements B {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f10639a;

    /* renamed from: b  reason: collision with root package name */
    public final long f10640b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f10641c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public u(long j6) {
        this(j6, 0L);
        this.f10639a = 1;
    }

    @Override // L2.B
    public final boolean e() {
        switch (this.f10639a) {
            case 1:
                return false;
            default:
                return true;
        }
    }

    @Override // L2.B
    public final A i(long j6) {
        long j10;
        int i10 = this.f10639a;
        int i11 = 1;
        Object obj = this.f10641c;
        switch (i10) {
            case 0:
                v vVar = (v) obj;
                Gi.e.o(vVar.f10652k);
                U3.c cVar = vVar.f10652k;
                long[] jArr = (long[]) cVar.f17396Z;
                long[] jArr2 = (long[]) cVar.f17397h0;
                int e10 = AbstractC5530A.e(jArr, AbstractC5530A.j((vVar.f10646e * j6) / 1000000, 0L, vVar.f10651j - 1), false);
                long j11 = 0;
                if (e10 == -1) {
                    j10 = 0;
                } else {
                    j10 = jArr[e10];
                }
                if (e10 != -1) {
                    j11 = jArr2[e10];
                }
                long j12 = (j10 * 1000000) / ((v) obj).f10646e;
                long j13 = this.f10640b;
                C c10 = new C(j12, j11 + j13);
                if (j12 != j6 && e10 != jArr.length - 1) {
                    int i12 = e10 + 1;
                    return new A(c10, new C((jArr[i12] * 1000000) / ((v) obj).f10646e, j13 + jArr2[i12]));
                }
                return new A(c10, c10);
            case 1:
                return (A) obj;
            default:
                N2.b bVar = (N2.b) obj;
                A b10 = bVar.f12651g[0].b(j6);
                while (true) {
                    N2.e[] eVarArr = bVar.f12651g;
                    if (i11 < eVarArr.length) {
                        A b11 = eVarArr[i11].b(j6);
                        if (b11.f10517a.f10521b < b10.f10517a.f10521b) {
                            b10 = b11;
                        }
                        i11++;
                    } else {
                        return b10;
                    }
                }
        }
    }

    @Override // L2.B
    public final long j() {
        switch (this.f10639a) {
            case 0:
                return ((v) this.f10641c).b();
            default:
                return this.f10640b;
        }
    }

    public /* synthetic */ u(Object obj, long j6, int i10) {
        this.f10639a = i10;
        this.f10641c = obj;
        this.f10640b = j6;
    }

    public u(long j6, long j10) {
        this.f10639a = 1;
        this.f10640b = j6;
        C c10 = j10 == 0 ? C.f10519c : new C(0L, j10);
        this.f10641c = new A(c10, c10);
    }
}
