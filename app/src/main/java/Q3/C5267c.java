package q3;

import L2.C0882c;
import L2.G;
import L2.s;
import java.math.RoundingMode;
import p2.C5065s;
import p2.O;
import p2.r;
import s2.AbstractC5530A;

/* renamed from: q3.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5267c implements AbstractC5266b {

    /* renamed from: a  reason: collision with root package name */
    public final s f43725a;

    /* renamed from: b  reason: collision with root package name */
    public final G f43726b;

    /* renamed from: c  reason: collision with root package name */
    public final C0882c f43727c;

    /* renamed from: d  reason: collision with root package name */
    public final C5065s f43728d;

    /* renamed from: e  reason: collision with root package name */
    public final int f43729e;

    /* renamed from: f  reason: collision with root package name */
    public long f43730f;

    /* renamed from: g  reason: collision with root package name */
    public int f43731g;

    /* renamed from: h  reason: collision with root package name */
    public long f43732h;

    public C5267c(s sVar, G g10, C0882c c0882c, String str, int i10) {
        this.f43725a = sVar;
        this.f43726b = g10;
        this.f43727c = c0882c;
        int i11 = (c0882c.f10571c * c0882c.f10575g) / 8;
        if (c0882c.f10574f == i11) {
            int i12 = c0882c.f10572d * i11;
            int i13 = i12 * 8;
            int max = Math.max(i11, i12 / 10);
            this.f43729e = max;
            r rVar = new r();
            rVar.f42237k = str;
            rVar.f42232f = i13;
            rVar.f42233g = i13;
            rVar.f42238l = max;
            rVar.f42250x = c0882c.f10571c;
            rVar.f42251y = c0882c.f10572d;
            rVar.f42252z = i10;
            this.f43728d = new C5065s(rVar);
            return;
        }
        StringBuilder q10 = android.gov.nist.core.a.q("Expected block size: ", i11, "; got: ");
        q10.append(c0882c.f10574f);
        throw O.a(q10.toString(), null);
    }

    @Override // q3.AbstractC5266b
    public final void a(long j6) {
        this.f43730f = j6;
        this.f43731g = 0;
        this.f43732h = 0L;
    }

    @Override // q3.AbstractC5266b
    public final boolean b(L2.r rVar, long j6) {
        int i10;
        int i11;
        int i12;
        long j10 = j6;
        while (true) {
            i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
            if (i10 <= 0 || (i11 = this.f43731g) >= (i12 = this.f43729e)) {
                break;
            }
            int c10 = this.f43726b.c(rVar, (int) Math.min(i12 - i11, j10), true);
            if (c10 == -1) {
                j10 = 0;
            } else {
                this.f43731g += c10;
                j10 -= c10;
            }
        }
        C0882c c0882c = this.f43727c;
        int i13 = c0882c.f10574f;
        int i14 = this.f43731g / i13;
        if (i14 > 0) {
            long j11 = this.f43730f;
            long j12 = this.f43732h;
            long j13 = c0882c.f10572d;
            int i15 = AbstractC5530A.f45131a;
            int i16 = i14 * i13;
            int i17 = this.f43731g - i16;
            this.f43726b.e(j11 + AbstractC5530A.I(j12, 1000000L, j13, RoundingMode.FLOOR), 1, i16, i17, null);
            this.f43732h += i14;
            this.f43731g = i17;
        }
        if (i10 <= 0) {
            return true;
        }
        return false;
    }

    @Override // q3.AbstractC5266b
    public final void c(int i10, long j6) {
        this.f43725a.b(new C5269e(this.f43727c, 1, i10, j6));
        this.f43726b.b(this.f43728d);
    }
}
