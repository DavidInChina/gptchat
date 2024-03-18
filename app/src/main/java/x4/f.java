package x4;

import android.graphics.Path;
import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;
import y4.AbstractC6541a;

/* loaded from: classes.dex */
public final class f implements l, AbstractC6541a, c {

    /* renamed from: b  reason: collision with root package name */
    public final v4.l f48793b;

    /* renamed from: c  reason: collision with root package name */
    public final y4.e f48794c;

    /* renamed from: d  reason: collision with root package name */
    public final y4.e f48795d;

    /* renamed from: e  reason: collision with root package name */
    public final D4.a f48796e;

    /* renamed from: g  reason: collision with root package name */
    public boolean f48798g;

    /* renamed from: a  reason: collision with root package name */
    public final Path f48792a = new Path();

    /* renamed from: f  reason: collision with root package name */
    public final Q3.j f48797f = new Q3.j(1);

    public f(v4.l lVar, E4.b bVar, D4.a aVar) {
        aVar.getClass();
        this.f48793b = lVar;
        y4.e s10 = aVar.f3342b.s();
        this.f48794c = s10;
        y4.e s11 = aVar.f3341a.s();
        this.f48795d = s11;
        this.f48796e = aVar;
        bVar.d(s10);
        bVar.d(s11);
        s10.a(this);
        s11.a(this);
    }

    @Override // y4.AbstractC6541a
    public final void a() {
        this.f48798g = false;
        this.f48793b.invalidateSelf();
    }

    @Override // x4.c
    public final void b(List list, List list2) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) list;
            if (i10 < arrayList.size()) {
                c cVar = (c) arrayList.get(i10);
                if (cVar instanceof s) {
                    s sVar = (s) cVar;
                    if (sVar.f48890c == 1) {
                        this.f48797f.f14418b.add(sVar);
                        sVar.d(this);
                    }
                }
                i10++;
            } else {
                return;
            }
        }
    }

    @Override // x4.l
    public final Path f() {
        boolean z10 = this.f48798g;
        Path path = this.f48792a;
        if (z10) {
            return path;
        }
        path.reset();
        D4.a aVar = this.f48796e;
        if (aVar.f3344d) {
            this.f48798g = true;
            return path;
        }
        PointF pointF = (PointF) this.f48794c.d();
        float f6 = pointF.x / 2.0f;
        float f10 = pointF.y / 2.0f;
        float f11 = f6 * 0.55228f;
        float f12 = f10 * 0.55228f;
        path.reset();
        if (aVar.f3343c) {
            float f13 = -f10;
            path.moveTo(0.0f, f13);
            float f14 = 0.0f - f11;
            float f15 = -f6;
            float f16 = 0.0f - f12;
            path.cubicTo(f14, f13, f15, f16, f15, 0.0f);
            float f17 = f12 + 0.0f;
            path.cubicTo(f15, f17, f14, f10, 0.0f, f10);
            float f18 = f11 + 0.0f;
            path.cubicTo(f18, f10, f6, f17, f6, 0.0f);
            path.cubicTo(f6, f16, f18, f13, 0.0f, f13);
        } else {
            float f19 = -f10;
            path.moveTo(0.0f, f19);
            float f20 = f11 + 0.0f;
            float f21 = 0.0f - f12;
            path.cubicTo(f20, f19, f6, f21, f6, 0.0f);
            float f22 = f12 + 0.0f;
            path.cubicTo(f6, f22, f20, f10, 0.0f, f10);
            float f23 = 0.0f - f11;
            float f24 = -f6;
            path.cubicTo(f23, f10, f24, f22, f24, 0.0f);
            path.cubicTo(f24, f21, f23, f19, 0.0f, f19);
        }
        PointF pointF2 = (PointF) this.f48795d.d();
        path.offset(pointF2.x, pointF2.y);
        path.close();
        this.f48797f.c(path);
        this.f48798g = true;
        return path;
    }
}
