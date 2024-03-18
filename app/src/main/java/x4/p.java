package x4;

import java.util.List;
import y4.AbstractC6541a;

/* loaded from: classes.dex */
public final class p implements AbstractC6541a, c {

    /* renamed from: a  reason: collision with root package name */
    public final v4.l f48877a;

    /* renamed from: b  reason: collision with root package name */
    public final y4.e f48878b;

    /* renamed from: c  reason: collision with root package name */
    public D4.k f48879c;

    public p(v4.l lVar, E4.b bVar, D4.j jVar) {
        this.f48877a = lVar;
        jVar.getClass();
        y4.e s10 = jVar.f3387a.s();
        this.f48878b = s10;
        bVar.d(s10);
        s10.a(this);
    }

    public static int d(int i10, int i11) {
        int i12 = i10 / i11;
        if ((i10 ^ i11) < 0 && i12 * i11 != i10) {
            i12--;
        }
        return i10 - (i12 * i11);
    }

    @Override // y4.AbstractC6541a
    public final void a() {
        this.f48877a.invalidateSelf();
    }

    @Override // x4.c
    public final void b(List list, List list2) {
    }
}
