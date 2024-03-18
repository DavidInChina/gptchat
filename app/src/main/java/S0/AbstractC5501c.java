package s0;

/* renamed from: s0.c  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC5501c {

    /* renamed from: a  reason: collision with root package name */
    public static final long f45018a;

    /* renamed from: b  reason: collision with root package name */
    public static final long f45019b;

    /* renamed from: c  reason: collision with root package name */
    public static final long f45020c;

    /* renamed from: d  reason: collision with root package name */
    public static final long f45021d;

    /* renamed from: e  reason: collision with root package name */
    public static final /* synthetic */ int f45022e = 0;

    static {
        long j6 = 3;
        long j10 = j6 << 32;
        f45018a = (0 & 4294967295L) | j10;
        f45019b = (1 & 4294967295L) | j10;
        f45020c = j10 | (2 & 4294967295L);
        f45021d = (j6 & 4294967295L) | (4 << 32);
    }

    public static final boolean a(long j6, long j10) {
        if (j6 == j10) {
            return true;
        }
        return false;
    }

    public static String b(long j6) {
        if (a(j6, f45018a)) {
            return "Rgb";
        }
        if (a(j6, f45019b)) {
            return "Xyz";
        }
        if (a(j6, f45020c)) {
            return "Lab";
        }
        if (a(j6, f45021d)) {
            return "Cmyk";
        }
        return "Unknown";
    }
}
