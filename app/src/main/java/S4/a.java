package S4;

import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.TreeMap;

/* loaded from: classes2.dex */
public final class a extends p {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f16133f;

    /* renamed from: g  reason: collision with root package name */
    public final TreeMap f16134g;

    /* renamed from: h  reason: collision with root package name */
    public Object f16135h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, int i10) {
        super("call_site_ids", bVar, 4);
        this.f16133f = i10;
        if (i10 != 1) {
            this.f16134g = new TreeMap();
            this.f16135h = new TreeMap();
            return;
        }
        super("class_defs", bVar, 4);
        this.f16134g = new TreeMap();
        this.f16135h = null;
    }

    @Override // S4.n
    public final Collection c() {
        TreeMap treeMap = this.f16134g;
        switch (this.f16133f) {
            case 0:
                return treeMap.values();
            default:
                ArrayList arrayList = (ArrayList) this.f16135h;
                if (arrayList == null) {
                    return treeMap.values();
                }
                return arrayList;
        }
    }

    @Override // S4.p
    public final void j() {
        TreeMap treeMap = this.f16134g;
        switch (this.f16133f) {
            case 0:
                Iterator it = treeMap.values().iterator();
                if (!it.hasNext()) {
                    return;
                }
                AbstractC2469q0.p(it.next());
                throw null;
            default:
                this.f16135h = new ArrayList(treeMap.size());
                for (Object obj : treeMap.keySet()) {
                    AbstractC2469q0.p(obj);
                    AbstractC2469q0.p(treeMap.get(null));
                }
                return;
        }
    }
}
