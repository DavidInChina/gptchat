package dh;

import id.AbstractC3557B;
import java.util.Arrays;

/* renamed from: dh.C  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2677C extends AbstractC2708j0 {

    /* renamed from: a  reason: collision with root package name */
    public float[] f28381a;

    /* renamed from: b  reason: collision with root package name */
    public int f28382b;

    @Override // dh.AbstractC2708j0
    public final Object a() {
        float[] copyOf = Arrays.copyOf(this.f28381a, this.f28382b);
        AbstractC3557B.b0("copyOf(...)", copyOf);
        return copyOf;
    }

    @Override // dh.AbstractC2708j0
    public final void b(int i10) {
        float[] fArr = this.f28381a;
        if (fArr.length < i10) {
            int length = fArr.length * 2;
            if (i10 < length) {
                i10 = length;
            }
            float[] copyOf = Arrays.copyOf(fArr, i10);
            AbstractC3557B.b0("copyOf(...)", copyOf);
            this.f28381a = copyOf;
        }
    }

    @Override // dh.AbstractC2708j0
    public final int d() {
        return this.f28382b;
    }
}
