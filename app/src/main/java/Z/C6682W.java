package z;

import java.util.LinkedHashMap;
import jf.C3959i;
import w.C6070q;

/* renamed from: z.W  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6682W implements AbstractC6651A {

    /* renamed from: a  reason: collision with root package name */
    public final C6681V f51193a;

    public C6682W(C6681V c6681v) {
        this.f51193a = c6681v;
    }

    /* renamed from: f */
    public final C6664G0 mo121a(C6737z0 c6737z0) {
        int i10;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C6681V c6681v = this.f51193a;
        C6070q c6070q = c6681v.f51195b;
        int[] iArr = c6070q.f47615b;
        Object[] objArr = c6070q.f47616c;
        long[] jArr = c6070q.f47614a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i11 = 0;
            while (true) {
                long j6 = jArr[i11];
                if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i12 = 8;
                    int i13 = 8 - ((~(i11 - length)) >>> 31);
                    int i14 = 0;
                    while (i14 < i13) {
                        if ((255 & j6) < 128) {
                            int i15 = (i11 << 3) + i14;
                            int i16 = iArr[i15];
                            C6680U c6680u = (C6680U) objArr[i15];
                            linkedHashMap.put(Integer.valueOf(i16), new C3959i(c6737z0.f51416a.invoke(c6680u.f51191a), c6680u.f51192b));
                            i10 = 8;
                        } else {
                            i10 = i12;
                        }
                        j6 >>= i10;
                        i14++;
                        i12 = i10;
                    }
                    if (i13 != i12) {
                        break;
                    }
                }
                if (i11 == length) {
                    break;
                }
                i11++;
            }
        }
        return new C6664G0(c6681v.f51194a, linkedHashMap);
    }
}
