package c8;

import android.graphics.Typeface;

/* renamed from: c8.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2304a extends P4.a {

    /* renamed from: h  reason: collision with root package name */
    public final Typeface f26345h;

    /* renamed from: i  reason: collision with root package name */
    public final y7.b f26346i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f26347j;

    public C2304a(y7.b bVar, Typeface typeface) {
        this.f26345h = typeface;
        this.f26346i = bVar;
    }

    @Override // P4.a
    public final void r0(int i10) {
        if (!this.f26347j) {
            a8.b bVar = (a8.b) this.f26346i.f50831Z;
            if (bVar.j(this.f26345h)) {
                bVar.h(false);
            }
        }
    }

    @Override // P4.a
    public final void s0(Typeface typeface, boolean z10) {
        if (!this.f26347j) {
            a8.b bVar = (a8.b) this.f26346i.f50831Z;
            if (bVar.j(typeface)) {
                bVar.h(false);
            }
        }
    }
}
