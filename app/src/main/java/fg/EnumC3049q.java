package fg;

/* renamed from: fg.q  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC3049q implements lg.q {
    AT_MOST_ONCE(0),
    EXACTLY_ONCE(1),
    AT_LEAST_ONCE(2);
    

    /* renamed from: Y  reason: collision with root package name */
    public final int f30704Y;

    EnumC3049q(int i10) {
        this.f30704Y = i10;
    }

    @Override // lg.q
    public final int a() {
        return this.f30704Y;
    }
}
