package E4;

import D4.m;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import java.util.Collections;
import s3.z;
import v4.C5971a;
import v4.l;

/* loaded from: classes.dex */
public final class g extends b {

    /* renamed from: C  reason: collision with root package name */
    public final x4.d f4495C;

    /* renamed from: D  reason: collision with root package name */
    public final c f4496D;

    public g(C5971a c5971a, l lVar, c cVar, e eVar) {
        super(lVar, eVar);
        this.f4496D = cVar;
        x4.d dVar = new x4.d(lVar, this, new m("__container", eVar.f4470a, false), c5971a);
        this.f4495C = dVar;
        dVar.b(Collections.emptyList(), Collections.emptyList());
    }

    @Override // E4.b, x4.e
    public final void c(RectF rectF, Matrix matrix, boolean z10) {
        super.c(rectF, matrix, z10);
        this.f4495C.c(rectF, this.f4446n, z10);
    }

    @Override // E4.b
    public final void i(Canvas canvas, Matrix matrix, int i10) {
        this.f4495C.e(canvas, matrix, i10);
    }

    @Override // E4.b
    public final J0.a j() {
        J0.a aVar = this.f4448p.f4492w;
        if (aVar != null) {
            return aVar;
        }
        return this.f4496D.f4448p.f4492w;
    }

    @Override // E4.b
    public final z k() {
        z zVar = this.f4448p.f4493x;
        if (zVar != null) {
            return zVar;
        }
        return this.f4496D.f4448p.f4493x;
    }
}
