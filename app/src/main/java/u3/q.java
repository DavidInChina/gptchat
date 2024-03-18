package U3;

import L3.C0892d;
import android.gov.nist.javax.sip.header.ParameterNames;
import androidx.work.OverwritingInputMerger;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import id.AbstractC3557B;
import z.AbstractC6708l;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: x  reason: collision with root package name */
    public static final A9.a f17449x = new A9.a(3);

    /* renamed from: a  reason: collision with root package name */
    public final String f17450a;

    /* renamed from: b  reason: collision with root package name */
    public int f17451b;

    /* renamed from: c  reason: collision with root package name */
    public final String f17452c;

    /* renamed from: d  reason: collision with root package name */
    public final String f17453d;

    /* renamed from: e  reason: collision with root package name */
    public L3.g f17454e;

    /* renamed from: f  reason: collision with root package name */
    public final L3.g f17455f;

    /* renamed from: g  reason: collision with root package name */
    public long f17456g;

    /* renamed from: h  reason: collision with root package name */
    public final long f17457h;

    /* renamed from: i  reason: collision with root package name */
    public final long f17458i;

    /* renamed from: j  reason: collision with root package name */
    public C0892d f17459j;

    /* renamed from: k  reason: collision with root package name */
    public final int f17460k;

    /* renamed from: l  reason: collision with root package name */
    public final int f17461l;

    /* renamed from: m  reason: collision with root package name */
    public final long f17462m;

    /* renamed from: n  reason: collision with root package name */
    public long f17463n;

    /* renamed from: o  reason: collision with root package name */
    public final long f17464o;

    /* renamed from: p  reason: collision with root package name */
    public final long f17465p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f17466q;

    /* renamed from: r  reason: collision with root package name */
    public final int f17467r;

    /* renamed from: s  reason: collision with root package name */
    public final int f17468s;

    /* renamed from: t  reason: collision with root package name */
    public final int f17469t;

    /* renamed from: u  reason: collision with root package name */
    public final long f17470u;

    /* renamed from: v  reason: collision with root package name */
    public final int f17471v;

    /* renamed from: w  reason: collision with root package name */
    public final int f17472w;

    static {
        AbstractC3557B.b0("tagWithPrefix(\"WorkSpec\")", L3.s.f("WorkSpec"));
    }

    public q(String str, int i10, String str2, String str3, L3.g gVar, L3.g gVar2, long j6, long j10, long j11, C0892d c0892d, int i11, int i12, long j12, long j13, long j14, long j15, boolean z10, int i13, int i14, int i15, long j16, int i16, int i17) {
        AbstractC3557B.c0(ParameterNames.ID, str);
        AbstractC2469q0.q("state", i10);
        AbstractC3557B.c0("workerClassName", str2);
        AbstractC3557B.c0("inputMergerClassName", str3);
        AbstractC3557B.c0("input", gVar);
        AbstractC3557B.c0("output", gVar2);
        AbstractC3557B.c0("constraints", c0892d);
        AbstractC2469q0.q("backoffPolicy", i12);
        AbstractC2469q0.q("outOfQuotaPolicy", i13);
        this.f17450a = str;
        this.f17451b = i10;
        this.f17452c = str2;
        this.f17453d = str3;
        this.f17454e = gVar;
        this.f17455f = gVar2;
        this.f17456g = j6;
        this.f17457h = j10;
        this.f17458i = j11;
        this.f17459j = c0892d;
        this.f17460k = i11;
        this.f17461l = i12;
        this.f17462m = j12;
        this.f17463n = j13;
        this.f17464o = j14;
        this.f17465p = j15;
        this.f17466q = z10;
        this.f17467r = i13;
        this.f17468s = i14;
        this.f17469t = i15;
        this.f17470u = j16;
        this.f17471v = i16;
        this.f17472w = i17;
    }

    public final long a() {
        boolean z10 = true;
        if (this.f17451b != 1 || this.f17460k <= 0) {
            z10 = false;
        }
        return P5.c.s(z10, this.f17460k, this.f17461l, this.f17462m, this.f17463n, this.f17468s, c(), this.f17456g, this.f17458i, this.f17457h, this.f17470u);
    }

    public final boolean b() {
        return !AbstractC3557B.K(C0892d.f10698i, this.f17459j);
    }

    public final boolean c() {
        if (this.f17457h != 0) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        if (AbstractC3557B.K(this.f17450a, qVar.f17450a) && this.f17451b == qVar.f17451b && AbstractC3557B.K(this.f17452c, qVar.f17452c) && AbstractC3557B.K(this.f17453d, qVar.f17453d) && AbstractC3557B.K(this.f17454e, qVar.f17454e) && AbstractC3557B.K(this.f17455f, qVar.f17455f) && this.f17456g == qVar.f17456g && this.f17457h == qVar.f17457h && this.f17458i == qVar.f17458i && AbstractC3557B.K(this.f17459j, qVar.f17459j) && this.f17460k == qVar.f17460k && this.f17461l == qVar.f17461l && this.f17462m == qVar.f17462m && this.f17463n == qVar.f17463n && this.f17464o == qVar.f17464o && this.f17465p == qVar.f17465p && this.f17466q == qVar.f17466q && this.f17467r == qVar.f17467r && this.f17468s == qVar.f17468s && this.f17469t == qVar.f17469t && this.f17470u == qVar.f17470u && this.f17471v == qVar.f17471v && this.f17472w == qVar.f17472w) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int v10 = E9.f.v(this.f17453d, E9.f.v(this.f17452c, AbstractC6708l.d(this.f17451b, this.f17450a.hashCode() * 31, 31), 31), 31);
        int hashCode = this.f17455f.hashCode();
        long j6 = this.f17456g;
        long j10 = this.f17457h;
        long j11 = this.f17458i;
        int hashCode2 = this.f17459j.hashCode();
        int d10 = AbstractC6708l.d(this.f17461l, (((hashCode2 + ((((((((hashCode + ((this.f17454e.hashCode() + v10) * 31)) * 31) + ((int) (j6 ^ (j6 >>> 32)))) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31)) * 31) + this.f17460k) * 31, 31);
        long j12 = this.f17462m;
        long j13 = this.f17463n;
        long j14 = this.f17464o;
        long j15 = this.f17465p;
        int i10 = (((((((d10 + ((int) (j12 ^ (j12 >>> 32)))) * 31) + ((int) (j13 ^ (j13 >>> 32)))) * 31) + ((int) (j14 ^ (j14 >>> 32)))) * 31) + ((int) (j15 ^ (j15 >>> 32)))) * 31;
        boolean z10 = this.f17466q;
        if (z10) {
            z10 = true;
        }
        int i11 = z10 ? 1 : 0;
        int i12 = z10 ? 1 : 0;
        int i13 = this.f17467r;
        long j16 = this.f17470u;
        return ((((((((AbstractC6708l.d(i13, (i10 + i11) * 31, 31) + this.f17468s) * 31) + this.f17469t) * 31) + ((int) (j16 ^ (j16 >>> 32)))) * 31) + this.f17471v) * 31) + this.f17472w;
    }

    public final String toString() {
        return android.gov.nist.core.a.n(new StringBuilder("{WorkSpec: "), this.f17450a, '}');
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ q(String str, int i10, String str2, String str3, L3.g gVar, L3.g gVar2, long j6, long j10, long j11, C0892d c0892d, int i11, int i12, long j12, long j13, long j14, long j15, boolean z10, int i13, int i14, long j16, int i15, int i16, int i17) {
        this(str, r5, str2, r7, r8, r9, (i17 & 64) != 0 ? 0L : j6, (i17 & 128) != 0 ? 0L : j10, (i17 & 256) != 0 ? 0L : j11, (i17 & 512) != 0 ? C0892d.f10698i : c0892d, (i17 & 1024) != 0 ? 0 : i11, (i17 & 2048) != 0 ? 1 : i12, (i17 & 4096) != 0 ? 30000L : j12, (i17 & 8192) != 0 ? -1L : j13, (i17 & 16384) != 0 ? 0L : j14, (32768 & i17) != 0 ? -1L : j15, (65536 & i17) != 0 ? false : z10, (131072 & i17) == 0 ? i13 : r2, (262144 & i17) != 0 ? 0 : i14, 0, (1048576 & i17) != 0 ? Long.MAX_VALUE : j16, (2097152 & i17) != 0 ? 0 : i15, (i17 & 4194304) != 0 ? -256 : i16);
        L3.g gVar3;
        L3.g gVar4;
        int i18 = 1;
        int i19 = (i17 & 2) != 0 ? 1 : i10;
        String name = (i17 & 8) != 0 ? OverwritingInputMerger.class.getName() : str3;
        if ((i17 & 16) != 0) {
            L3.g gVar5 = L3.g.f10714c;
            AbstractC3557B.b0("EMPTY", gVar5);
            gVar3 = gVar5;
        } else {
            gVar3 = gVar;
        }
        if ((i17 & 32) != 0) {
            L3.g gVar6 = L3.g.f10714c;
            AbstractC3557B.b0("EMPTY", gVar6);
            gVar4 = gVar6;
        } else {
            gVar4 = gVar2;
        }
    }
}
