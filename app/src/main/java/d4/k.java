package D4;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;
import y.AbstractC6463a;

/* loaded from: classes2.dex */
public final class k {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f3388a;

    /* renamed from: b  reason: collision with root package name */
    public PointF f3389b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f3390c;

    public k(PointF pointF, boolean z10, List list) {
        this.f3389b = pointF;
        this.f3390c = z10;
        this.f3388a = new ArrayList(list);
    }

    public final void a(float f6, float f10) {
        if (this.f3389b == null) {
            this.f3389b = new PointF();
        }
        this.f3389b.set(f6, f10);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ShapeData{numCurves=");
        sb2.append(this.f3388a.size());
        sb2.append("closed=");
        return AbstractC6463a.l(sb2, this.f3390c, '}');
    }

    public k() {
        this.f3388a = new ArrayList();
    }
}
