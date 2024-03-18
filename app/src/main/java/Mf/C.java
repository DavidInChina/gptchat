package Mf;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kf.AbstractC4268D;
import kg.C4294f;

/* loaded from: classes2.dex */
public final class C extends f0 {

    /* renamed from: a  reason: collision with root package name */
    public final List f12056a;

    /* renamed from: b  reason: collision with root package name */
    public final Map f12057b;

    public C(ArrayList arrayList) {
        this.f12056a = arrayList;
        Map k12 = AbstractC4268D.k1(arrayList);
        if (k12.size() == arrayList.size()) {
            this.f12057b = k12;
            return;
        }
        throw new IllegalArgumentException("Some properties have the same names".toString());
    }

    @Override // Mf.f0
    public final boolean a(C4294f c4294f) {
        return this.f12057b.containsKey(c4294f);
    }

    @Override // Mf.f0
    public final List b() {
        return this.f12056a;
    }

    public final String toString() {
        return "MultiFieldValueClassRepresentation(underlyingPropertyNamesToTypes=" + this.f12056a + ')';
    }
}
