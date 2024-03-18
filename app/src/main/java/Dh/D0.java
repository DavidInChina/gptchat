package dh;

import id.AbstractC3557B;
import java.util.Arrays;
import jf.C3971u;

/* loaded from: classes2.dex */
public final class D0 extends AbstractC2708j0 {

    /* renamed from: a  reason: collision with root package name */
    public long[] f28386a;

    /* renamed from: b  reason: collision with root package name */
    public int f28387b;

    @Override // dh.AbstractC2708j0
    public final Object a() {
        long[] copyOf = Arrays.copyOf(this.f28386a, this.f28387b);
        AbstractC3557B.b0("copyOf(...)", copyOf);
        return new C3971u(copyOf);
    }

    @Override // dh.AbstractC2708j0
    public final void b(int i10) {
        long[] jArr = this.f28386a;
        if (jArr.length < i10) {
            int length = jArr.length * 2;
            if (i10 < length) {
                i10 = length;
            }
            long[] copyOf = Arrays.copyOf(jArr, i10);
            AbstractC3557B.b0("copyOf(...)", copyOf);
            this.f28386a = copyOf;
        }
    }

    @Override // dh.AbstractC2708j0
    public final int d() {
        return this.f28387b;
    }
}
