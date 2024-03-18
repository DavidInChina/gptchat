package Q2;

import B1.m;
import E2.j0;
import L2.C0883d;
import L2.G;
import p2.C5065s;
import p2.r;
import s2.u;
import t2.g;

/* loaded from: classes.dex */
public final class d extends m {

    /* renamed from: b  reason: collision with root package name */
    public final u f14396b = new u(g.f45670a);

    /* renamed from: c  reason: collision with root package name */
    public final u f14397c = new u(4);

    /* renamed from: d  reason: collision with root package name */
    public int f14398d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f14399e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f14400f;

    /* renamed from: g  reason: collision with root package name */
    public int f14401g;

    public d(G g10) {
        super(g10);
    }

    public final boolean c(u uVar) {
        int u10 = uVar.u();
        int i10 = (u10 >> 4) & 15;
        int i11 = u10 & 15;
        if (i11 == 7) {
            this.f14401g = i10;
            if (i10 != 5) {
                return true;
            }
            return false;
        }
        throw new j0(android.gov.nist.core.a.e("Video format not supported: ", i11));
    }

    public final boolean d(long j6, u uVar) {
        int i10;
        int u10 = uVar.u();
        byte[] bArr = uVar.f45193a;
        int i11 = uVar.f45194b;
        int i12 = (bArr[i11 + 1] & 255) << 8;
        uVar.f45194b = i11 + 3;
        long j10 = (((bArr[i11 + 2] & 255) | i12 | (((bArr[i11] & 255) << 24) >> 8)) * 1000) + j6;
        Object obj = this.f1725a;
        if (u10 == 0 && !this.f14399e) {
            byte[] bArr2 = new byte[uVar.a()];
            u uVar2 = new u(bArr2);
            uVar.e(bArr2, 0, uVar.a());
            C0883d a5 = C0883d.a(uVar2);
            this.f14398d = a5.f10577b;
            r rVar = new r();
            rVar.f42237k = "video/avc";
            rVar.f42234h = a5.f10586k;
            rVar.f42242p = a5.f10578c;
            rVar.f42243q = a5.f10579d;
            rVar.f42246t = a5.f10585j;
            rVar.f42239m = a5.f10576a;
            ((G) obj).b(new C5065s(rVar));
            this.f14399e = true;
            return false;
        } else if (u10 != 1 || !this.f14399e) {
            return false;
        } else {
            if (this.f14401g == 1) {
                i10 = 1;
            } else {
                i10 = 0;
            }
            if (!this.f14400f && i10 == 0) {
                return false;
            }
            u uVar3 = this.f14397c;
            byte[] bArr3 = uVar3.f45193a;
            bArr3[0] = 0;
            bArr3[1] = 0;
            bArr3[2] = 0;
            int i13 = 4 - this.f14398d;
            int i14 = 0;
            while (uVar.a() > 0) {
                uVar.e(uVar3.f45193a, i13, this.f14398d);
                uVar3.F(0);
                int x10 = uVar3.x();
                u uVar4 = this.f14396b;
                uVar4.F(0);
                G g10 = (G) obj;
                g10.a(4, uVar4);
                g10.a(x10, uVar);
                i14 = i14 + 4 + x10;
            }
            ((G) obj).e(j10, i10, i14, 0, null);
            this.f14400f = true;
            return true;
        }
    }
}
