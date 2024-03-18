package dh;

import id.AbstractC3557B;
import java.util.Arrays;

/* renamed from: dh.J  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2684J extends AbstractC2708j0 {

    /* renamed from: a  reason: collision with root package name */
    public int[] f28401a;

    /* renamed from: b  reason: collision with root package name */
    public int f28402b;

    @Override // dh.AbstractC2708j0
    public final Object a() {
        int[] copyOf = Arrays.copyOf(this.f28401a, this.f28402b);
        AbstractC3557B.b0("copyOf(...)", copyOf);
        return copyOf;
    }

    @Override // dh.AbstractC2708j0
    public final void b(int i10) {
        int[] iArr = this.f28401a;
        if (iArr.length < i10) {
            int length = iArr.length * 2;
            if (i10 < length) {
                i10 = length;
            }
            int[] copyOf = Arrays.copyOf(iArr, i10);
            AbstractC3557B.b0("copyOf(...)", copyOf);
            this.f28401a = copyOf;
        }
    }

    @Override // dh.AbstractC2708j0
    public final int d() {
        return this.f28402b;
    }
}
