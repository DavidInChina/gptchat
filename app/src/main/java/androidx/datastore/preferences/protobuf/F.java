package androidx.datastore.preferences.protobuf;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class F implements Iterator {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f24973Y;

    /* renamed from: Z  reason: collision with root package name */
    public final Iterator f24974Z;

    public /* synthetic */ F(Iterator it, int i10) {
        this.f24973Y = i10;
        this.f24974Z = it;
    }

    public final Map.Entry a() {
        Iterator it = this.f24974Z;
        switch (this.f24973Y) {
            case 0:
                Map.Entry entry = (Map.Entry) it.next();
                entry.getValue();
                return entry;
            case 1:
                Map.Entry entry2 = (Map.Entry) it.next();
                entry2.getValue();
                return entry2;
            case 2:
                Map.Entry entry3 = (Map.Entry) it.next();
                entry3.getValue();
                return entry3;
            default:
                Map.Entry entry4 = (Map.Entry) it.next();
                entry4.getValue();
                return entry4;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        Iterator it = this.f24974Z;
        switch (this.f24973Y) {
            case 0:
                return it.hasNext();
            case 1:
                return it.hasNext();
            case 2:
                return it.hasNext();
            default:
                return it.hasNext();
        }
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        switch (this.f24973Y) {
            case 0:
                return a();
            case 1:
                return a();
            case 2:
                return a();
            default:
                return a();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        Iterator it = this.f24974Z;
        switch (this.f24973Y) {
            case 0:
                it.remove();
                return;
            case 1:
                it.remove();
                return;
            case 2:
                it.remove();
                return;
            default:
                it.remove();
                return;
        }
    }
}
