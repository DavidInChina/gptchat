package G4;

/* loaded from: classes.dex */
public final class C implements J {

    /* renamed from: Y  reason: collision with root package name */
    public static final C f5986Y = new Object();

    @Override // G4.J
    public final Object c(H4.a aVar, float f6) {
        boolean z10 = true;
        if (aVar.P() != 1) {
            z10 = false;
        }
        if (z10) {
            aVar.a();
        }
        float r10 = (float) aVar.r();
        float r11 = (float) aVar.r();
        while (aVar.m()) {
            aVar.d0();
        }
        if (z10) {
            aVar.i();
        }
        return new J4.b((r10 / 100.0f) * f6, (r11 / 100.0f) * f6);
    }
}
