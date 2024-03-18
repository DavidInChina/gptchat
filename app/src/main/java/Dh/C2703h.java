package dh;

import id.AbstractC3557B;
import java.util.Arrays;

/* renamed from: dh.h  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2703h extends AbstractC2708j0 {

    /* renamed from: a  reason: collision with root package name */
    public byte[] f28453a;

    /* renamed from: b  reason: collision with root package name */
    public int f28454b;

    @Override // dh.AbstractC2708j0
    public final Object a() {
        byte[] copyOf = Arrays.copyOf(this.f28453a, this.f28454b);
        AbstractC3557B.b0("copyOf(...)", copyOf);
        return copyOf;
    }

    @Override // dh.AbstractC2708j0
    public final void b(int i10) {
        byte[] bArr = this.f28453a;
        if (bArr.length < i10) {
            int length = bArr.length * 2;
            if (i10 < length) {
                i10 = length;
            }
            byte[] copyOf = Arrays.copyOf(bArr, i10);
            AbstractC3557B.b0("copyOf(...)", copyOf);
            this.f28453a = copyOf;
        }
    }

    @Override // dh.AbstractC2708j0
    public final int d() {
        return this.f28454b;
    }
}
