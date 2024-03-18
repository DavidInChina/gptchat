package f8;

import android.graphics.Canvas;
import android.graphics.Matrix;
import e8.C2807a;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class m extends s {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ List f29735c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Matrix f29736d;

    public m(ArrayList arrayList, Matrix matrix) {
        this.f29735c = arrayList;
        this.f29736d = matrix;
    }

    @Override // f8.s
    public final void a(Matrix matrix, C2807a c2807a, int i10, Canvas canvas) {
        for (s sVar : this.f29735c) {
            sVar.a(this.f29736d, c2807a, i10, canvas);
        }
    }
}
