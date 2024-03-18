package id;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* loaded from: classes.dex */
public final class y extends Enum {

    /* renamed from: j0  reason: collision with root package name */
    public static final y f33138j0;

    /* renamed from: k0  reason: collision with root package name */
    public static final y f33139k0;

    /* renamed from: l0  reason: collision with root package name */
    public static final y f33140l0;

    /* renamed from: m0  reason: collision with root package name */
    public static final y f33141m0;

    /* renamed from: n0  reason: collision with root package name */
    public static final y f33142n0;

    /* renamed from: o0  reason: collision with root package name */
    public static final y f33143o0;

    /* renamed from: p0  reason: collision with root package name */
    public static final /* synthetic */ y[] f33144p0;

    /* renamed from: Y  reason: collision with root package name */
    public final C3561a f33145Y;

    /* renamed from: Z  reason: collision with root package name */
    public final C3561a f33146Z;

    /* renamed from: h0  reason: collision with root package name */
    public final long f33147h0;

    /* renamed from: i0  reason: collision with root package name */
    public final float f33148i0;

    static {
        long j6 = r0.r.f44254b;
        C3561a c3561a = new C3561a(j6, androidx.compose.ui.graphics.a.c(4294506486L));
        long b10 = r0.r.b(j6, 0.4f);
        long j10 = r0.r.f44258f;
        y yVar = new y("Normal", 0, c3561a, new C3561a(b10, j10), 0L, 12);
        f33138j0 = yVar;
        long j11 = z.f33149a;
        y yVar2 = new y("Highlighted", 1, new C3561a(j10, j11), new C3561a(r0.r.b(j6, 0.9f), androidx.compose.ui.graphics.a.b(436181248)), j11, 8);
        f33139k0 = yVar2;
        y yVar3 = new y("SelectedRowOrColumn", 2, new C3561a(j6, androidx.compose.ui.graphics.a.c(4290765300L)), new C3561a(androidx.compose.ui.graphics.a.c(4281545523L), androidx.compose.ui.graphics.a.b(868213236)), androidx.compose.ui.graphics.a.c(4292339439L), 8);
        f33140l0 = yVar3;
        y yVar4 = new y("SelectedCell", 3, new C3561a(j6, androidx.compose.ui.graphics.a.c(4290765300L)), new C3561a(androidx.compose.ui.graphics.a.c(4281545523L), androidx.compose.ui.graphics.a.b(868213236)), androidx.compose.ui.graphics.a.c(4292339439L), 8);
        f33141m0 = yVar4;
        C3561a c3561a2 = new C3561a(j10, androidx.compose.ui.graphics.a.c(4283262201L));
        long j12 = z.f33150b;
        y yVar5 = new y("SelectedAndHighlightedColumn", 4, c3561a2, new C3561a(j12, androidx.compose.ui.graphics.a.c(4293447335L)), androidx.compose.ui.graphics.a.c(4291869085L), 8);
        f33142n0 = yVar5;
        y yVar6 = new y("SelectedAndHighlightedCell", 5, new C3561a(j12, androidx.compose.ui.graphics.a.c(4294440952L)), new C3561a(j12, androidx.compose.ui.graphics.a.c(4294563744L)), androidx.compose.ui.graphics.a.c(4283262201L), 8);
        f33143o0 = yVar6;
        y[] yVarArr = {yVar, yVar2, yVar3, yVar4, yVar5, yVar6};
        f33144p0 = yVarArr;
        AbstractC3557B.C0(yVarArr);
    }

    public y(String str, int i10, C3561a c3561a, C3561a c3561a2, long j6, int i11) {
        j6 = (i11 & 4) != 0 ? androidx.compose.ui.graphics.a.c(4293717228L) : j6;
        this.f33145Y = c3561a;
        this.f33146Z = c3561a2;
        this.f33147h0 = j6;
        this.f33148i0 = (float) 0.3d;
    }

    public static y valueOf(String str) {
        return (y) Enum.valueOf(y.class, str);
    }

    public static y[] values() {
        return (y[]) f33144p0.clone();
    }
}
