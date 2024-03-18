package dh;

import id.AbstractC3557B;
import java.util.Arrays;

/* renamed from: dh.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2697e extends AbstractC2708j0 {

    /* renamed from: a  reason: collision with root package name */
    public boolean[] f28442a;

    /* renamed from: b  reason: collision with root package name */
    public int f28443b;

    @Override // dh.AbstractC2708j0
    public final Object a() {
        boolean[] copyOf = Arrays.copyOf(this.f28442a, this.f28443b);
        AbstractC3557B.b0("copyOf(...)", copyOf);
        return copyOf;
    }

    @Override // dh.AbstractC2708j0
    public final void b(int i10) {
        boolean[] zArr = this.f28442a;
        if (zArr.length < i10) {
            int length = zArr.length * 2;
            if (i10 < length) {
                i10 = length;
            }
            boolean[] copyOf = Arrays.copyOf(zArr, i10);
            AbstractC3557B.b0("copyOf(...)", copyOf);
            this.f28442a = copyOf;
        }
    }

    @Override // dh.AbstractC2708j0
    public final int d() {
        return this.f28443b;
    }
}
