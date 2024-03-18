package f8;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class t {

    /* renamed from: a  reason: collision with root package name */
    public float f29753a;

    /* renamed from: b  reason: collision with root package name */
    public float f29754b;

    /* renamed from: c  reason: collision with root package name */
    public float f29755c;

    /* renamed from: d  reason: collision with root package name */
    public float f29756d;

    /* renamed from: e  reason: collision with root package name */
    public float f29757e;

    /* renamed from: f  reason: collision with root package name */
    public float f29758f;

    /* renamed from: g  reason: collision with root package name */
    public final ArrayList f29759g = new ArrayList();

    /* renamed from: h  reason: collision with root package name */
    public final ArrayList f29760h = new ArrayList();

    public t() {
        d(0.0f, 270.0f, 0.0f);
    }

    public final void a(float f6) {
        float f10 = this.f29757e;
        if (f10 == f6) {
            return;
        }
        float f11 = ((f6 - f10) + 360.0f) % 360.0f;
        if (f11 > 180.0f) {
            return;
        }
        float f12 = this.f29755c;
        float f13 = this.f29756d;
        p pVar = new p(f12, f13, f12, f13);
        pVar.f29746f = this.f29757e;
        pVar.f29747g = f11;
        this.f29760h.add(new n(pVar));
        this.f29757e = f6;
    }

    public final void b(Matrix matrix, Path path) {
        ArrayList arrayList = this.f29759g;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((r) arrayList.get(i10)).a(matrix, path);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [f8.r, f8.q, java.lang.Object] */
    public final void c(float f6, float f10) {
        ?? rVar = new r();
        rVar.f29748b = f6;
        rVar.f29749c = f10;
        this.f29759g.add(rVar);
        o oVar = new o(rVar, this.f29755c, this.f29756d);
        a(oVar.b() + 270.0f);
        this.f29760h.add(oVar);
        this.f29757e = oVar.b() + 270.0f;
        this.f29755c = f6;
        this.f29756d = f10;
    }

    public final void d(float f6, float f10, float f11) {
        this.f29753a = 0.0f;
        this.f29754b = f6;
        this.f29755c = 0.0f;
        this.f29756d = f6;
        this.f29757e = f10;
        this.f29758f = (f10 + f11) % 360.0f;
        this.f29759g.clear();
        this.f29760h.clear();
    }
}
