package dh;

import id.AbstractC3557B;
import java.util.Arrays;
import jf.C3967q;

/* loaded from: classes.dex */
public final class x0 extends AbstractC2708j0 {

    /* renamed from: a  reason: collision with root package name */
    public byte[] f28503a;

    /* renamed from: b  reason: collision with root package name */
    public int f28504b;

    @Override // dh.AbstractC2708j0
    public final Object a() {
        byte[] copyOf = Arrays.copyOf(this.f28503a, this.f28504b);
        AbstractC3557B.b0("copyOf(...)", copyOf);
        return new C3967q(copyOf);
    }

    @Override // dh.AbstractC2708j0
    public final void b(int i10) {
        byte[] bArr = this.f28503a;
        if (bArr.length < i10) {
            int length = bArr.length * 2;
            if (i10 < length) {
                i10 = length;
            }
            byte[] copyOf = Arrays.copyOf(bArr, i10);
            AbstractC3557B.b0("copyOf(...)", copyOf);
            this.f28503a = copyOf;
        }
    }

    @Override // dh.AbstractC2708j0
    public final int d() {
        return this.f28504b;
    }
}
