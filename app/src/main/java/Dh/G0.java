package dh;

import id.AbstractC3557B;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class G0 extends AbstractC2708j0 {

    /* renamed from: a  reason: collision with root package name */
    public short[] f28393a;

    /* renamed from: b  reason: collision with root package name */
    public int f28394b;

    @Override // dh.AbstractC2708j0
    public final Object a() {
        short[] copyOf = Arrays.copyOf(this.f28393a, this.f28394b);
        AbstractC3557B.b0("copyOf(...)", copyOf);
        return new jf.x(copyOf);
    }

    @Override // dh.AbstractC2708j0
    public final void b(int i10) {
        short[] sArr = this.f28393a;
        if (sArr.length < i10) {
            int length = sArr.length * 2;
            if (i10 < length) {
                i10 = length;
            }
            short[] copyOf = Arrays.copyOf(sArr, i10);
            AbstractC3557B.b0("copyOf(...)", copyOf);
            this.f28393a = copyOf;
        }
    }

    @Override // dh.AbstractC2708j0
    public final int d() {
        return this.f28394b;
    }
}
