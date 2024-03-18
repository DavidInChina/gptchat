package q3;

import L2.C0882c;
import L2.G;
import L2.s;
import android.gov.nist.javax.sip.parser.TokenTypes;
import java.math.RoundingMode;
import p2.C5065s;
import p2.O;
import p2.r;
import s2.AbstractC5530A;
import s2.u;

/* renamed from: q3.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5265a implements AbstractC5266b {

    /* renamed from: m  reason: collision with root package name */
    public static final int[] f43711m = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};

    /* renamed from: n  reason: collision with root package name */
    public static final int[] f43712n = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, 190, 209, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, TokenTypes.SERVER, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};

    /* renamed from: a  reason: collision with root package name */
    public final s f43713a;

    /* renamed from: b  reason: collision with root package name */
    public final G f43714b;

    /* renamed from: c  reason: collision with root package name */
    public final C0882c f43715c;

    /* renamed from: d  reason: collision with root package name */
    public final int f43716d;

    /* renamed from: e  reason: collision with root package name */
    public final byte[] f43717e;

    /* renamed from: f  reason: collision with root package name */
    public final u f43718f;

    /* renamed from: g  reason: collision with root package name */
    public final int f43719g;

    /* renamed from: h  reason: collision with root package name */
    public final C5065s f43720h;

    /* renamed from: i  reason: collision with root package name */
    public int f43721i;

    /* renamed from: j  reason: collision with root package name */
    public long f43722j;

    /* renamed from: k  reason: collision with root package name */
    public int f43723k;

    /* renamed from: l  reason: collision with root package name */
    public long f43724l;

    public C5265a(s sVar, G g10, C0882c c0882c) {
        this.f43713a = sVar;
        this.f43714b = g10;
        this.f43715c = c0882c;
        int max = Math.max(1, c0882c.f10572d / 10);
        this.f43719g = max;
        u uVar = new u((byte[]) c0882c.f10570b);
        uVar.n();
        int n10 = uVar.n();
        this.f43716d = n10;
        int i10 = c0882c.f10571c;
        int i11 = (((c0882c.f10574f - (i10 * 4)) * 8) / (c0882c.f10575g * i10)) + 1;
        if (n10 == i11) {
            int f6 = AbstractC5530A.f(max, n10);
            this.f43717e = new byte[c0882c.f10574f * f6];
            this.f43718f = new u(n10 * 2 * i10 * f6);
            int i12 = c0882c.f10572d;
            int i13 = ((c0882c.f10574f * i12) * 8) / n10;
            r rVar = new r();
            rVar.f42237k = "audio/raw";
            rVar.f42232f = i13;
            rVar.f42233g = i13;
            rVar.f42238l = max * 2 * i10;
            rVar.f42250x = c0882c.f10571c;
            rVar.f42251y = i12;
            rVar.f42252z = 2;
            this.f43720h = new C5065s(rVar);
            return;
        }
        throw O.a("Expected frames per block: " + i11 + "; got: " + n10, null);
    }

    @Override // q3.AbstractC5266b
    public final void a(long j6) {
        this.f43721i = 0;
        this.f43722j = j6;
        this.f43723k = 0;
        this.f43724l = 0L;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
        */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0045 A[ADDED_TO_REGION, EDGE_INSN: B:43:0x0045->B:13:0x0045 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x003c -> B:4:0x0020). Please submit an issue!!! */
    @Override // q3.AbstractC5266b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(L2.r r25, long r26) {
        /*
            Method dump skipped, instructions count: 349
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: q3.C5265a.b(L2.r, long):boolean");
    }

    @Override // q3.AbstractC5266b
    public final void c(int i10, long j6) {
        this.f43713a.b(new C5269e(this.f43715c, this.f43716d, i10, j6));
        this.f43714b.b(this.f43720h);
    }

    public final void d(int i10) {
        long j6 = this.f43722j;
        long j10 = this.f43724l;
        C0882c c0882c = this.f43715c;
        long j11 = c0882c.f10572d;
        int i11 = AbstractC5530A.f45131a;
        long I10 = j6 + AbstractC5530A.I(j10, 1000000L, j11, RoundingMode.FLOOR);
        int i12 = i10 * 2 * c0882c.f10571c;
        this.f43714b.e(I10, 1, i12, this.f43723k - i12, null);
        this.f43724l += i10;
        this.f43723k -= i12;
    }
}
