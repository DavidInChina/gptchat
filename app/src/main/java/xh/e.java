package xh;

/* loaded from: classes2.dex */
public enum e implements AbstractC6459b, AbstractC6458a, c {
    PUBLIC(1),
    PACKAGE_PRIVATE(0),
    PROTECTED(4),
    PRIVATE(2);
    

    /* renamed from: Y  reason: collision with root package name */
    public final int f50067Y;

    e(int i10) {
        this.f50067Y = i10;
    }

    @Override // xh.c
    public final int a() {
        return this.f50067Y;
    }

    @Override // xh.c
    public final int b() {
        return 7;
    }

    public final e c(e eVar) {
        int ordinal = eVar.ordinal();
        e eVar2 = PUBLIC;
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        return this;
                    }
                    throw new IllegalStateException("Unexpected visibility: " + eVar);
                } else if (this == eVar2) {
                    return eVar2;
                } else {
                    return eVar;
                }
            } else if (this == PRIVATE) {
                return PACKAGE_PRIVATE;
            } else {
                return this;
            }
        }
        return eVar2;
    }
}
