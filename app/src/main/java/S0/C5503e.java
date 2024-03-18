package s0;

/* renamed from: s0.e  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5503e {

    /* renamed from: a  reason: collision with root package name */
    public static final float[] f45026a;

    /* renamed from: b  reason: collision with root package name */
    public static final float[] f45027b;

    /* renamed from: c  reason: collision with root package name */
    public static final C5515q f45028c;

    /* renamed from: d  reason: collision with root package name */
    public static final C5515q f45029d;

    /* renamed from: e  reason: collision with root package name */
    public static final C5515q f45030e;

    /* renamed from: f  reason: collision with root package name */
    public static final C5515q f45031f;

    /* renamed from: g  reason: collision with root package name */
    public static final C5515q f45032g;

    /* renamed from: h  reason: collision with root package name */
    public static final C5515q f45033h;

    /* renamed from: i  reason: collision with root package name */
    public static final C5515q f45034i;

    /* renamed from: j  reason: collision with root package name */
    public static final C5515q f45035j;

    /* renamed from: k  reason: collision with root package name */
    public static final C5515q f45036k;

    /* renamed from: l  reason: collision with root package name */
    public static final C5515q f45037l;

    /* renamed from: m  reason: collision with root package name */
    public static final C5515q f45038m;

    /* renamed from: n  reason: collision with root package name */
    public static final C5515q f45039n;

    /* renamed from: o  reason: collision with root package name */
    public static final C5515q f45040o;

    /* renamed from: p  reason: collision with root package name */
    public static final C5515q f45041p;

    /* renamed from: q  reason: collision with root package name */
    public static final C5518t f45042q;

    /* renamed from: r  reason: collision with root package name */
    public static final C5509k f45043r;

    /* renamed from: s  reason: collision with root package name */
    public static final C5515q f45044s;

    /* renamed from: t  reason: collision with root package name */
    public static final C5510l f45045t;

    /* renamed from: u  reason: collision with root package name */
    public static final AbstractC5502d[] f45046u;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v9, types: [s0.d, s0.k] */
    /* JADX WARN: Type inference failed for: r11v7, types: [s0.d, s0.t] */
    /* JADX WARN: Type inference failed for: r6v17, types: [s0.d, s0.l] */
    static {
        float[] fArr = {0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f};
        f45026a = fArr;
        float[] fArr2 = {0.67f, 0.33f, 0.21f, 0.71f, 0.14f, 0.08f};
        f45027b = fArr2;
        C5516r c5516r = new C5516r(2.4d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d);
        C5516r c5516r2 = new C5516r(2.2d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d);
        C5517s c5517s = AbstractC5508j.f45060d;
        C5515q c5515q = new C5515q("sRGB IEC61966-2.1", fArr, c5517s, c5516r, 0);
        f45028c = c5515q;
        C5515q c5515q2 = new C5515q("sRGB IEC61966-2.1 (Linear)", fArr, c5517s, 1.0d, 0.0f, 1.0f, 1);
        f45029d = c5515q2;
        C5515q c5515q3 = new C5515q("scRGB-nl IEC 61966-2-2:2003", fArr, c5517s, null, new A9.a(2), new A9.a(3), -0.799f, 2.399f, c5516r, 2);
        f45030e = c5515q3;
        C5515q c5515q4 = new C5515q("scRGB IEC 61966-2-2:2003", fArr, c5517s, 1.0d, -0.5f, 7.499f, 3);
        f45031f = c5515q4;
        C5515q c5515q5 = new C5515q("Rec. ITU-R BT.709-5", new float[]{0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f}, c5517s, new C5516r(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 4);
        f45032g = c5515q5;
        C5515q c5515q6 = new C5515q("Rec. ITU-R BT.2020-1", new float[]{0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f}, c5517s, new C5516r(2.2222222222222223d, 0.9096697898662786d, 0.09033021013372146d, 0.2222222222222222d, 0.08145d), 5);
        f45033h = c5515q6;
        C5515q c5515q7 = new C5515q("SMPTE RP 431-2-2007 DCI (P3)", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, new C5517s(0.314f, 0.351f), 2.6d, 0.0f, 1.0f, 6);
        f45034i = c5515q7;
        C5515q c5515q8 = new C5515q("Display P3", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, c5517s, c5516r, 7);
        f45035j = c5515q8;
        C5515q c5515q9 = new C5515q("NTSC (1953)", fArr2, AbstractC5508j.f45057a, new C5516r(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 8);
        f45036k = c5515q9;
        C5515q c5515q10 = new C5515q("SMPTE-C RGB", new float[]{0.63f, 0.34f, 0.31f, 0.595f, 0.155f, 0.07f}, c5517s, new C5516r(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 9);
        f45037l = c5515q10;
        C5515q c5515q11 = new C5515q("Adobe RGB (1998)", new float[]{0.64f, 0.33f, 0.21f, 0.71f, 0.15f, 0.06f}, c5517s, 2.2d, 0.0f, 1.0f, 10);
        f45038m = c5515q11;
        C5515q c5515q12 = new C5515q("ROMM RGB ISO 22028-2:2013", new float[]{0.7347f, 0.2653f, 0.1596f, 0.8404f, 0.0366f, 1.0E-4f}, AbstractC5508j.f45058b, new C5516r(1.8d, 1.0d, 0.0d, 0.0625d, 0.031248d), 11);
        f45039n = c5515q12;
        C5517s c5517s2 = AbstractC5508j.f45059c;
        C5515q c5515q13 = new C5515q("SMPTE ST 2065-1:2012 ACES", new float[]{0.7347f, 0.2653f, 0.0f, 1.0f, 1.0E-4f, -0.077f}, c5517s2, 1.0d, -65504.0f, 65504.0f, 12);
        f45040o = c5515q13;
        C5515q c5515q14 = new C5515q("Academy S-2014-004 ACEScg", new float[]{0.713f, 0.293f, 0.165f, 0.83f, 0.128f, 0.044f}, c5517s2, 1.0d, -65504.0f, 65504.0f, 13);
        f45041p = c5515q14;
        ?? abstractC5502d = new AbstractC5502d("Generic XYZ", AbstractC5501c.f45019b, 14);
        f45042q = abstractC5502d;
        long j6 = AbstractC5501c.f45020c;
        ?? abstractC5502d2 = new AbstractC5502d("Generic L*a*b*", j6, 15);
        f45043r = abstractC5502d2;
        C5515q c5515q15 = new C5515q("None", fArr, c5517s, c5516r2, 16);
        f45044s = c5515q15;
        ?? abstractC5502d3 = new AbstractC5502d("Oklab", j6, 17);
        f45045t = abstractC5502d3;
        f45046u = new AbstractC5502d[]{c5515q, c5515q2, c5515q3, c5515q4, c5515q5, c5515q6, c5515q7, c5515q8, c5515q9, c5515q10, c5515q11, c5515q12, c5515q13, c5515q14, abstractC5502d, abstractC5502d2, c5515q15, abstractC5502d3};
    }
}
