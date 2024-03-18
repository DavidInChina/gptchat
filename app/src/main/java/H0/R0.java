package H0;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class R0 implements G0.q0 {

    /* renamed from: Y  reason: collision with root package name */
    public final int f6871Y;

    /* renamed from: Z  reason: collision with root package name */
    public final List f6872Z;

    /* renamed from: h0  reason: collision with root package name */
    public Float f6873h0 = null;

    /* renamed from: i0  reason: collision with root package name */
    public Float f6874i0 = null;

    /* renamed from: j0  reason: collision with root package name */
    public L0.h f6875j0 = null;

    /* renamed from: k0  reason: collision with root package name */
    public L0.h f6876k0 = null;

    public R0(int i10, ArrayList arrayList) {
        this.f6871Y = i10;
        this.f6872Z = arrayList;
    }

    @Override // G0.q0
    public final boolean q() {
        return this.f6872Z.contains(this);
    }
}
