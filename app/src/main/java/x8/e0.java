package x8;

import java.io.Serializable;
import java.util.ArrayList;
import l8.AbstractC4344b;

/* loaded from: classes.dex */
public final class e0 implements w8.l, Serializable {

    /* renamed from: Y  reason: collision with root package name */
    public final int f49551Y;

    public e0(int i10) {
        AbstractC4344b.T(i10, "expectedValuesPerKey");
        this.f49551Y = i10;
    }

    @Override // w8.l
    public final Object get() {
        return new ArrayList(this.f49551Y);
    }
}
