package D4;

import java.util.Arrays;
import java.util.List;
import v4.C5971a;

/* loaded from: classes2.dex */
public final class m implements b {

    /* renamed from: a  reason: collision with root package name */
    public final String f3396a;

    /* renamed from: b  reason: collision with root package name */
    public final List f3397b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f3398c;

    public m(String str, List list, boolean z10) {
        this.f3396a = str;
        this.f3397b = list;
        this.f3398c = z10;
    }

    @Override // D4.b
    public final x4.c a(v4.l lVar, C5971a c5971a, E4.b bVar) {
        return new x4.d(lVar, bVar, this, c5971a);
    }

    public final String toString() {
        return "ShapeGroup{name='" + this.f3396a + "' Shapes: " + Arrays.toString(this.f3397b.toArray()) + '}';
    }
}
