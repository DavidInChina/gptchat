package dh;

import id.AbstractC3557B;
import java.util.Arrays;

/* renamed from: dh.v  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2719v extends AbstractC2708j0 {

    /* renamed from: a  reason: collision with root package name */
    public double[] f28493a;

    /* renamed from: b  reason: collision with root package name */
    public int f28494b;

    @Override // dh.AbstractC2708j0
    public final Object a() {
        double[] copyOf = Arrays.copyOf(this.f28493a, this.f28494b);
        AbstractC3557B.b0("copyOf(...)", copyOf);
        return copyOf;
    }

    @Override // dh.AbstractC2708j0
    public final void b(int i10) {
        double[] dArr = this.f28493a;
        if (dArr.length < i10) {
            int length = dArr.length * 2;
            if (i10 < length) {
                i10 = length;
            }
            double[] copyOf = Arrays.copyOf(dArr, i10);
            AbstractC3557B.b0("copyOf(...)", copyOf);
            this.f28493a = copyOf;
        }
    }

    @Override // dh.AbstractC2708j0
    public final int d() {
        return this.f28494b;
    }
}
