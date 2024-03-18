package E2;

import java.util.Arrays;
import java.util.Random;

/* loaded from: classes2.dex */
public final class a0 {

    /* renamed from: a  reason: collision with root package name */
    public final Random f4282a;

    /* renamed from: b  reason: collision with root package name */
    public final int[] f4283b;

    /* renamed from: c  reason: collision with root package name */
    public final int[] f4284c;

    public a0(Random random) {
        this(new int[0], random);
    }

    public final a0 a(int i10) {
        int[] iArr;
        Random random;
        int[] iArr2 = new int[i10];
        int[] iArr3 = new int[i10];
        int i11 = 0;
        while (true) {
            iArr = this.f4283b;
            random = this.f4282a;
            if (i11 >= i10) {
                break;
            }
            iArr2[i11] = random.nextInt(iArr.length + 1);
            int i12 = i11 + 1;
            int nextInt = random.nextInt(i12);
            iArr3[i11] = iArr3[nextInt];
            iArr3[nextInt] = i11;
            i11 = i12;
        }
        Arrays.sort(iArr2);
        int[] iArr4 = new int[iArr.length + i10];
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 0; i15 < iArr.length + i10; i15++) {
            if (i13 < i10 && i14 == iArr2[i13]) {
                iArr4[i15] = iArr3[i13];
                i13++;
            } else {
                int i16 = i14 + 1;
                int i17 = iArr[i14];
                iArr4[i15] = i17;
                if (i17 >= 0) {
                    iArr4[i15] = i17 + i10;
                }
                i14 = i16;
            }
        }
        return new a0(iArr4, new Random(random.nextLong()));
    }

    public a0() {
        this(new Random());
    }

    public a0(int[] iArr, Random random) {
        this.f4283b = iArr;
        this.f4282a = random;
        this.f4284c = new int[iArr.length];
        for (int i10 = 0; i10 < iArr.length; i10++) {
            this.f4284c[iArr[i10]] = i10;
        }
    }
}
