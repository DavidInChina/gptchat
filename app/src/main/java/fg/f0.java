package fg;

/* loaded from: classes2.dex */
public enum f0 implements lg.q {
    INTERNAL(0),
    PRIVATE(1),
    PROTECTED(2),
    PUBLIC(3),
    PRIVATE_TO_THIS(4),
    LOCAL(5);
    

    /* renamed from: Y  reason: collision with root package name */
    public final int f30589Y;

    f0(int i10) {
        this.f30589Y = i10;
    }

    @Override // lg.q
    public final int a() {
        return this.f30589Y;
    }
}
