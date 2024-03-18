package Af;

import id.AbstractC3557B;
import java.util.Random;

/* loaded from: classes2.dex */
public abstract class a extends d {
    @Override // Af.d
    public final int a(int i10) {
        return ((-i10) >> 31) & (i().nextInt() >>> (32 - i10));
    }

    @Override // Af.d
    public final void b(byte[] bArr) {
        AbstractC3557B.c0("array", bArr);
        i().nextBytes(bArr);
    }

    @Override // Af.d
    public final int d() {
        return i().nextInt();
    }

    @Override // Af.d
    public final int e(int i10) {
        return i().nextInt(i10);
    }

    @Override // Af.d
    public final long g() {
        return i().nextLong();
    }

    public abstract Random i();
}
