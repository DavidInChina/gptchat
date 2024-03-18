package D4;

import android.graphics.Path;
import v4.C5971a;
import y.AbstractC6463a;

/* loaded from: classes2.dex */
public final class l implements b {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f3391a;

    /* renamed from: b  reason: collision with root package name */
    public final Path.FillType f3392b;

    /* renamed from: c  reason: collision with root package name */
    public final C4.a f3393c;

    /* renamed from: d  reason: collision with root package name */
    public final C4.a f3394d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f3395e;

    public l(String str, boolean z10, Path.FillType fillType, C4.a aVar, C4.a aVar2, boolean z11) {
        this.f3391a = z10;
        this.f3392b = fillType;
        this.f3393c = aVar;
        this.f3394d = aVar2;
        this.f3395e = z11;
    }

    @Override // D4.b
    public final x4.c a(v4.l lVar, C5971a c5971a, E4.b bVar) {
        return new x4.g(lVar, bVar, this);
    }

    public final String toString() {
        return AbstractC6463a.l(new StringBuilder("ShapeFill{color=, fillEnabled="), this.f3391a, '}');
    }
}
