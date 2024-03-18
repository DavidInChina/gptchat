package dh;

import id.AbstractC3557B;
import java.util.Arrays;

/* renamed from: dh.n  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2712n extends AbstractC2708j0 {

    /* renamed from: a  reason: collision with root package name */
    public char[] f28468a;

    /* renamed from: b  reason: collision with root package name */
    public int f28469b;

    @Override // dh.AbstractC2708j0
    public final Object a() {
        char[] copyOf = Arrays.copyOf(this.f28468a, this.f28469b);
        AbstractC3557B.b0("copyOf(...)", copyOf);
        return copyOf;
    }

    @Override // dh.AbstractC2708j0
    public final void b(int i10) {
        char[] cArr = this.f28468a;
        if (cArr.length < i10) {
            int length = cArr.length * 2;
            if (i10 < length) {
                i10 = length;
            }
            char[] copyOf = Arrays.copyOf(cArr, i10);
            AbstractC3557B.b0("copyOf(...)", copyOf);
            this.f28468a = copyOf;
        }
    }

    @Override // dh.AbstractC2708j0
    public final int d() {
        return this.f28469b;
    }
}
