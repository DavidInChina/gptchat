package G0;

/* renamed from: G0.s  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0589s {

    /* renamed from: a  reason: collision with root package name */
    public final r f5829a = new r();

    /* renamed from: b  reason: collision with root package name */
    public final r f5830b = new r();

    public final void a(androidx.compose.ui.node.a aVar, boolean z10) {
        r rVar = this.f5829a;
        if (z10) {
            rVar.a(aVar);
        } else if (!rVar.b(aVar)) {
            this.f5830b.a(aVar);
        }
    }

    public final boolean b() {
        boolean z10;
        if (this.f5830b.f5820c.isEmpty() && this.f5829a.f5820c.isEmpty()) {
            z10 = true;
        } else {
            z10 = false;
        }
        return !z10;
    }
}
