package y4;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes2.dex */
public final class o extends e {

    /* renamed from: h  reason: collision with root package name */
    public final PointF f50746h = new PointF();

    /* renamed from: i  reason: collision with root package name */
    public final PointF f50747i = new PointF();

    /* renamed from: j  reason: collision with root package name */
    public final e f50748j;

    /* renamed from: k  reason: collision with root package name */
    public final e f50749k;

    public o(h hVar, h hVar2) {
        super(Collections.emptyList());
        this.f50748j = hVar;
        this.f50749k = hVar2;
        g(this.f50723d);
    }

    @Override // y4.e
    public final Object d() {
        PointF pointF = this.f50746h;
        float f6 = pointF.x;
        PointF pointF2 = this.f50747i;
        pointF2.set(f6, 0.0f);
        pointF2.set(pointF2.x, pointF.y);
        return pointF2;
    }

    @Override // y4.e
    public final Object e(J4.a aVar, float f6) {
        PointF pointF = this.f50746h;
        float f10 = pointF.x;
        PointF pointF2 = this.f50747i;
        pointF2.set(f10, 0.0f);
        pointF2.set(pointF2.x, pointF.y);
        return pointF2;
    }

    @Override // y4.e
    public final void g(float f6) {
        e eVar = this.f50748j;
        eVar.g(f6);
        e eVar2 = this.f50749k;
        eVar2.g(f6);
        this.f50746h.set(((Float) eVar.d()).floatValue(), ((Float) eVar2.d()).floatValue());
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f50720a;
            if (i10 < arrayList.size()) {
                ((AbstractC6541a) arrayList.get(i10)).a();
                i10++;
            } else {
                return;
            }
        }
    }
}
