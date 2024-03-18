package w;

/* renamed from: w.k  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC6064k {

    /* renamed from: a  reason: collision with root package name */
    public static final int[] f47595a;

    static {
        int i10;
        long[] jArr = AbstractC6076w.f47639a;
        int d10 = AbstractC6076w.d(0);
        if (d10 > 0) {
            i10 = Math.max(7, AbstractC6076w.c(d10));
        } else {
            i10 = 0;
        }
        if (i10 != 0) {
            jArr = new long[((i10 + 15) & (-8)) >> 3];
            kf.q.f3(jArr);
        }
        int i11 = i10 >> 3;
        long j6 = 255 << ((i10 & 7) << 3);
        jArr[i11] = (jArr[i11] & (~j6)) | j6;
        int[] iArr = new int[i10];
        f47595a = new int[0];
    }
}
