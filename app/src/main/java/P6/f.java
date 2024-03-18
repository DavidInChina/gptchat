package P6;

import g6.C3201a;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class f implements h {

    /* renamed from: a  reason: collision with root package name */
    public final List f13833a;

    public f(ArrayList arrayList) {
        this.f13833a = arrayList;
    }

    @Override // P6.h
    public final void a(M6.b bVar, C3201a c3201a) {
        for (h hVar : this.f13833a) {
            hVar.a(bVar, c3201a);
        }
    }
}
