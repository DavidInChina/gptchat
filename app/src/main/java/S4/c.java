package S4;

import java.util.Collection;
import java.util.TreeMap;

/* loaded from: classes2.dex */
public final class c extends i {

    /* renamed from: f  reason: collision with root package name */
    public final TreeMap f16154f = new TreeMap();

    public c(b bVar) {
        super("field_ids", bVar, 4);
    }

    @Override // S4.n
    public final Collection c() {
        return this.f16154f.values();
    }
}
