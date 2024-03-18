package D4;

import v4.C5971a;

/* loaded from: classes2.dex */
public final class i implements b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f3382a = 1;

    /* renamed from: b  reason: collision with root package name */
    public final C4.b f3383b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f3384c;

    /* renamed from: d  reason: collision with root package name */
    public final C4.f f3385d;

    /* renamed from: e  reason: collision with root package name */
    public final Object f3386e;

    public i(String str, C4.b bVar, C4.b bVar2, C4.e eVar, boolean z10) {
        this.f3383b = bVar;
        this.f3385d = bVar2;
        this.f3386e = eVar;
        this.f3384c = z10;
    }

    @Override // D4.b
    public final x4.c a(v4.l lVar, C5971a c5971a, E4.b bVar) {
        switch (this.f3382a) {
            case 0:
                return new x4.n(lVar, bVar, this);
            default:
                return new x4.o(lVar, bVar, this);
        }
    }

    public final String toString() {
        switch (this.f3382a) {
            case 0:
                return "RectangleShape{position=" + this.f3385d + ", size=" + ((C4.f) this.f3386e) + '}';
            default:
                return super.toString();
        }
    }

    public i(String str, C4.f fVar, C4.a aVar, C4.b bVar, boolean z10) {
        this.f3385d = fVar;
        this.f3386e = aVar;
        this.f3383b = bVar;
        this.f3384c = z10;
    }
}
