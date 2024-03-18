package Xe;

/* loaded from: classes.dex */
public enum G implements I {
    H90(new C(160, 90, 15), new F(90000, 15)),
    H180(new C(320, 180, 15), new F(160000, 15)),
    H216(new C(384, 216, 15), new F(180000, 15)),
    H360(new C(640, 360, 30), new F(450000, 30)),
    H540(new C(960, 540, 30), new F(800000, 30)),
    H720(new C(1280, 720, 30), new F(1700000, 30)),
    H1080(new C(1920, 1080, 30), new F(3000000, 30)),
    H1440(new C(2560, 1440, 30), new F(5000000, 30)),
    H2160(new C(3840, 2160, 30), new F(8000000, 30));
    

    /* renamed from: Y  reason: collision with root package name */
    public final C f21867Y;

    /* renamed from: Z  reason: collision with root package name */
    public final F f21868Z;

    G(C c10, F f6) {
        this.f21867Y = c10;
        this.f21868Z = f6;
    }

    @Override // Xe.I
    public final C a() {
        return this.f21867Y;
    }

    @Override // Xe.I
    public final F b() {
        return this.f21868Z;
    }
}
