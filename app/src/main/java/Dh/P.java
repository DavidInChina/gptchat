package dh;

import id.AbstractC3557B;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class P extends AbstractC2708j0 {

    /* renamed from: a  reason: collision with root package name */
    public long[] f28414a;

    /* renamed from: b  reason: collision with root package name */
    public int f28415b;

    @Override // dh.AbstractC2708j0
    public final Object a() {
        long[] copyOf = Arrays.copyOf(this.f28414a, this.f28415b);
        AbstractC3557B.b0("copyOf(...)", copyOf);
        return copyOf;
    }

    @Override // dh.AbstractC2708j0
    public final void b(int i10) {
        long[] jArr = this.f28414a;
        if (jArr.length < i10) {
            int length = jArr.length * 2;
            if (i10 < length) {
                i10 = length;
            }
            long[] copyOf = Arrays.copyOf(jArr, i10);
            AbstractC3557B.b0("copyOf(...)", copyOf);
            this.f28414a = copyOf;
        }
    }

    @Override // dh.AbstractC2708j0
    public final int d() {
        return this.f28415b;
    }
}
