package C4;

import java.util.List;
import y4.h;
import y4.o;

/* loaded from: classes2.dex */
public final class d implements f {

    /* renamed from: Y  reason: collision with root package name */
    public final b f2668Y;

    /* renamed from: Z  reason: collision with root package name */
    public final b f2669Z;

    public d(b bVar, b bVar2) {
        this.f2668Y = bVar;
        this.f2669Z = bVar2;
    }

    @Override // C4.f
    public final boolean r() {
        if (this.f2668Y.r() && this.f2669Z.r()) {
            return true;
        }
        return false;
    }

    @Override // C4.f
    public final y4.e s() {
        return new o((h) this.f2668Y.s(), (h) this.f2669Z.s());
    }

    @Override // C4.f
    public final List t() {
        throw new UnsupportedOperationException("Cannot call getKeyframes on AnimatableSplitDimensionPathValue.");
    }
}
