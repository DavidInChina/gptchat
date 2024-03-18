package Bf;

import id.AbstractC3557B;
import j$.util.concurrent.ThreadLocalRandom;
import java.util.Random;

/* loaded from: classes2.dex */
public final class a extends Af.a {
    @Override // Af.d
    public final int f(int i10) {
        return ThreadLocalRandom.current().nextInt(0, i10);
    }

    @Override // Af.d
    public final long h(long j6, long j10) {
        return ThreadLocalRandom.current().nextLong(j6, j10);
    }

    @Override // Af.a
    public final Random i() {
        ThreadLocalRandom current = ThreadLocalRandom.current();
        AbstractC3557B.b0("current(...)", current);
        return current;
    }
}
