package Xe;

/* loaded from: classes.dex */
public enum H implements I {
    H120(new C(160, 120, 15), new F(70000, 15)),
    H180(new C(240, 180, 15), new F(125000, 15)),
    H240(new C(320, 240, 15), new F(140000, 15)),
    H360(new C(480, 360, 30), new F(330000, 30)),
    H480(new C(640, 480, 30), new F(500000, 30)),
    H540(new C(720, 540, 30), new F(600000, 30)),
    H720(new C(960, 720, 30), new F(1300000, 30)),
    H1080(new C(1440, 1080, 30), new F(2300000, 30)),
    H1440(new C(1920, 1440, 30), new F(3800000, 30));
    

    /* renamed from: Y  reason: collision with root package name */
    public final C f21879Y;

    /* renamed from: Z  reason: collision with root package name */
    public final F f21880Z;

    H(C c10, F f6) {
        this.f21879Y = c10;
        this.f21880Z = f6;
    }

    @Override // Xe.I
    public final C a() {
        return this.f21879Y;
    }

    @Override // Xe.I
    public final F b() {
        return this.f21880Z;
    }
}
