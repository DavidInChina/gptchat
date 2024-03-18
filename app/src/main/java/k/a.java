package K;

import Ng.H;
import Z0.l;
import q0.C5251c;
import q0.C5252d;
import q0.C5253e;
import q0.C5254f;
import r0.C5336C;
import r0.D;
import r0.G;
import r0.L;

/* loaded from: classes2.dex */
public abstract class a implements L {

    /* renamed from: Y  reason: collision with root package name */
    public final b f9311Y;

    /* renamed from: Z  reason: collision with root package name */
    public final b f9312Z;

    /* renamed from: h0  reason: collision with root package name */
    public final b f9313h0;

    /* renamed from: i0  reason: collision with root package name */
    public final b f9314i0;

    public a(b bVar, b bVar2, b bVar3, b bVar4) {
        this.f9311Y = bVar;
        this.f9312Z = bVar2;
        this.f9313h0 = bVar3;
        this.f9314i0 = bVar4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [K.e, K.a] */
    /* JADX WARN: Type inference failed for: r2v2, types: [K.b] */
    /* JADX WARN: Type inference failed for: r3v2, types: [K.b] */
    public static e a(a aVar, c cVar, c cVar2, c cVar3, int i10) {
        c cVar4 = cVar;
        if ((i10 & 1) != 0) {
            cVar4 = aVar.f9311Y;
        }
        b bVar = aVar.f9312Z;
        c cVar5 = cVar2;
        if ((i10 & 4) != 0) {
            cVar5 = aVar.f9313h0;
        }
        ((e) aVar).getClass();
        return new a(cVar4, bVar, cVar5, cVar3);
    }

    @Override // r0.L
    public final G c(long j6, l lVar, Z0.b bVar) {
        float f6;
        float f10;
        float a5 = this.f9311Y.a(j6, bVar);
        float a10 = this.f9312Z.a(j6, bVar);
        float a11 = this.f9313h0.a(j6, bVar);
        float a12 = this.f9314i0.a(j6, bVar);
        float c10 = C5254f.c(j6);
        float f11 = a5 + a12;
        if (f11 > c10) {
            float f12 = c10 / f11;
            a5 *= f12;
            a12 *= f12;
        }
        float f13 = a10 + a11;
        if (f13 > c10) {
            float f14 = c10 / f13;
            a10 *= f14;
            a11 *= f14;
        }
        if (a5 >= 0.0f && a10 >= 0.0f && a11 >= 0.0f && a12 >= 0.0f) {
            if (a5 + a10 + a11 + a12 == 0.0f) {
                return new C5336C(A7.b.K(C5251c.f43619b, j6));
            }
            C5252d K10 = A7.b.K(C5251c.f43619b, j6);
            l lVar2 = l.f22805Y;
            if (lVar == lVar2) {
                f6 = a5;
            } else {
                f6 = a10;
            }
            long b10 = H.b(f6, f6);
            if (lVar == lVar2) {
                a5 = a10;
            }
            long b11 = H.b(a5, a5);
            if (lVar == lVar2) {
                f10 = a11;
            } else {
                f10 = a12;
            }
            long b12 = H.b(f10, f10);
            if (lVar != lVar2) {
                a12 = a11;
            }
            long b13 = H.b(a12, a12);
            return new D(new C5253e(K10.f43625a, K10.f43626b, K10.f43627c, K10.f43628d, b10, b11, b12, b13));
        }
        throw new IllegalArgumentException(("Corner size in Px can't be negative(topStart = " + a5 + ", topEnd = " + a10 + ", bottomEnd = " + a11 + ", bottomStart = " + a12 + ")!").toString());
    }
}
