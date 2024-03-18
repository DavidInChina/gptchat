package o4;

import android.graphics.Bitmap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class i implements l {

    /* renamed from: a  reason: collision with root package name */
    public final m f40592a;

    /* renamed from: b  reason: collision with root package name */
    public final h f40593b;

    public i(int i10, m mVar) {
        this.f40592a = mVar;
        this.f40593b = new h(i10, this);
    }

    @Override // o4.l
    public final d a(c cVar) {
        g gVar = (g) this.f40593b.b(cVar);
        if (gVar != null) {
            return new d(gVar.f40588a, gVar.f40589b);
        }
        return null;
    }

    @Override // o4.l
    public final void b(int i10) {
        int i11;
        if (i10 >= 40) {
            this.f40593b.g(-1);
        } else if (10 <= i10 && i10 < 20) {
            h hVar = this.f40593b;
            synchronized (hVar.f47604c) {
                i11 = hVar.f47605d;
            }
            hVar.g(i11 / 2);
        }
    }

    @Override // o4.l
    public final void c(c cVar, Bitmap bitmap, Map map) {
        int i10;
        int c12 = R4.b.c1(bitmap);
        h hVar = this.f40593b;
        synchronized (hVar.f47604c) {
            i10 = hVar.f47602a;
        }
        if (c12 <= i10) {
            this.f40593b.c(cVar, new g(bitmap, map, c12));
            return;
        }
        this.f40593b.d(cVar);
        this.f40592a.d(cVar, bitmap, map, c12);
    }
}
