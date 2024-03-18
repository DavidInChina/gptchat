package dh;

import id.AbstractC3557B;
import java.util.Arrays;
import jf.C3969s;

/* loaded from: classes2.dex */
public final class A0 extends AbstractC2708j0 {

    /* renamed from: a  reason: collision with root package name */
    public int[] f28374a;

    /* renamed from: b  reason: collision with root package name */
    public int f28375b;

    @Override // dh.AbstractC2708j0
    public final Object a() {
        int[] copyOf = Arrays.copyOf(this.f28374a, this.f28375b);
        AbstractC3557B.b0("copyOf(...)", copyOf);
        return new C3969s(copyOf);
    }

    @Override // dh.AbstractC2708j0
    public final void b(int i10) {
        int[] iArr = this.f28374a;
        if (iArr.length < i10) {
            int length = iArr.length * 2;
            if (i10 < length) {
                i10 = length;
            }
            int[] copyOf = Arrays.copyOf(iArr, i10);
            AbstractC3557B.b0("copyOf(...)", copyOf);
            this.f28374a = copyOf;
        }
    }

    @Override // dh.AbstractC2708j0
    public final int d() {
        return this.f28375b;
    }
}
