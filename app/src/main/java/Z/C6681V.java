package z;

import w.C6070q;

/* renamed from: z.V  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6681V extends AbstractC6683X {
    /* JADX WARN: Code restructure failed: missing block: B:10:0x007b, code lost:
        if (((((~r8) << 6) & r8) & (-9187201950435737472L)) == 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x007d, code lost:
        r1 = r5.b(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0085, code lost:
        if (r5.f47619f != 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0097, code lost:
        if (((r5.f47614a[r1 >> 3] >> ((r1 & 7) << 3)) & 255) != 254) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x009a, code lost:
        r1 = r5.f47617d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x009c, code lost:
        if (r1 <= 8) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00b0, code lost:
        if (java.lang.Long.compare((r5.f47618e * 32) ^ Long.MIN_VALUE, (r1 * 25) ^ Long.MIN_VALUE) > 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00b2, code lost:
        r5.f(w.AbstractC6076w.b(r5.f47617d));
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00bc, code lost:
        r5.f(w.AbstractC6076w.b(r5.f47617d));
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00c5, code lost:
        r1 = r5.b(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00c9, code lost:
        r17 = r1;
        r2 = 1;
        r5.f47618e++;
        r1 = r5.f47619f;
        r3 = r5.f47614a;
        r6 = r17 >> 3;
        r12 = r3[r6];
        r9 = (r17 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00e4, code lost:
        if (((r12 >> r9) & 255) != 128) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00e7, code lost:
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00e8, code lost:
        r5.f47619f = r1 - r2;
        r3[r6] = ((~(255 << r9)) & r12) | (r10 << r9);
        r1 = r5.f47617d;
        r2 = ((r17 - 7) & r1) + (r1 & 7);
        r1 = r2 >> 3;
        r2 = (r2 & 7) << 3;
        r3[r1] = ((~(255 << r2)) & r3[r1]) | (r10 << r2);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C6680U a(int i10, Float f6) {
        C6680U c6680u;
        int i11;
        AbstractC6679T abstractC6679T = new AbstractC6679T(f6, AbstractC6657D.f51128d);
        int i12 = (-862048943) * i10;
        int i13 = i12 ^ (i12 << 16);
        int i14 = i13 >>> 7;
        int i15 = i13 & 127;
        C6070q c6070q = this.f51195b;
        int i16 = c6070q.f47617d;
        int i17 = i14 & i16;
        int i18 = 0;
        loop0: while (true) {
            long[] jArr = c6070q.f47614a;
            int i19 = i17 >> 3;
            int i20 = (i17 & 7) << 3;
            int i21 = i18;
            long j6 = (((-i20) >> 63) & (jArr[i19 + 1] << (64 - i20))) | (jArr[i19] >>> i20);
            long j10 = i15;
            c6680u = abstractC6679T;
            int i22 = i15;
            long j11 = j6 ^ (j10 * 72340172838076673L);
            long j12 = (~j11) & (j11 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j12 == 0) {
                    break;
                }
                i11 = (i17 + (Long.numberOfTrailingZeros(j12) >> 3)) & i16;
                if (c6070q.f47615b[i11] == i10) {
                    break loop0;
                }
                j12 &= j12 - 1;
            }
            i18 = i21 + 8;
            i17 = (i17 + i18) & i16;
            abstractC6679T = c6680u;
            i15 = i22;
        }
        c6070q.f47615b[i11] = i10;
        c6070q.f47616c[i11] = c6680u;
        return c6680u;
    }
}
