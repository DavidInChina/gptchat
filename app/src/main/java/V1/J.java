package V1;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class J implements I {

    /* renamed from: a  reason: collision with root package name */
    public final int f18027a;

    /* renamed from: b  reason: collision with root package name */
    public final int f18028b = 1;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ K f18029c;

    public J(K k10, int i10) {
        this.f18029c = k10;
        this.f18027a = i10;
    }

    @Override // V1.I
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        K k10 = this.f18029c;
        AbstractComponentCallbacksC1480v abstractComponentCallbacksC1480v = k10.f18067x;
        int i10 = this.f18027a;
        if (abstractComponentCallbacksC1480v != null && i10 < 0 && abstractComponentCallbacksC1480v.l().P(-1, 0)) {
            return false;
        }
        return k10.Q(arrayList, arrayList2, i10, this.f18028b);
    }
}
