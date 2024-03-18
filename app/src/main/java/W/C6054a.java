package w;

import androidx.datastore.preferences.protobuf.i0;
import androidx.datastore.preferences.protobuf.m0;
import androidx.glance.appwidget.protobuf.d0;
import com.google.protobuf.C2510h1;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import lg.C4444B;

/* renamed from: w.a  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C6054a extends AbstractSet {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f47571Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Map f47572Z;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6054a(i0 i0Var) {
        this(i0Var, 1);
        this.f47571Y = 1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        switch (this.f47571Y) {
            case 1:
                return f((Map.Entry) obj);
            case 2:
                return f((Map.Entry) obj);
            case 3:
                return f((Map.Entry) obj);
            case 4:
                return f((Map.Entry) obj);
            default:
                return super.add(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        int i10 = this.f47571Y;
        Map map = this.f47572Z;
        switch (i10) {
            case 1:
                ((i0) map).clear();
                return;
            case 2:
                ((d0) map).b();
                return;
            case 3:
                ((C2510h1) map).clear();
                return;
            case 4:
                ((C4444B) map).clear();
                return;
            default:
                super.clear();
                return;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        int i10 = this.f47571Y;
        Map map = this.f47572Z;
        switch (i10) {
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                Object obj2 = ((i0) map).get(entry.getKey());
                Object value = entry.getValue();
                if (obj2 == value) {
                    return true;
                }
                if (obj2 != null && obj2.equals(value)) {
                    return true;
                }
                return false;
            case 2:
                Map.Entry entry2 = (Map.Entry) obj;
                Object c10 = ((d0) map).c(entry2.getKey());
                Object value2 = entry2.getValue();
                if (c10 == value2) {
                    return true;
                }
                if (c10 != null && c10.equals(value2)) {
                    return true;
                }
                return false;
            case 3:
                Map.Entry entry3 = (Map.Entry) obj;
                Object obj3 = ((C2510h1) map).get(entry3.getKey());
                Object value3 = entry3.getValue();
                if (obj3 == value3) {
                    return true;
                }
                if (obj3 != null && obj3.equals(value3)) {
                    return true;
                }
                return false;
            case 4:
                Map.Entry entry4 = (Map.Entry) obj;
                Object obj4 = ((C4444B) map).get(entry4.getKey());
                Object value4 = entry4.getValue();
                if (obj4 == value4) {
                    return true;
                }
                if (obj4 != null && obj4.equals(value4)) {
                    return true;
                }
                return false;
            default:
                return super.contains(obj);
        }
    }

    public final boolean f(Map.Entry entry) {
        int i10 = this.f47571Y;
        Map map = this.f47572Z;
        switch (i10) {
            case 1:
                if (contains(entry)) {
                    return false;
                }
                ((i0) map).m((Comparable) entry.getKey(), entry.getValue());
                return true;
            case 2:
                if (contains(entry)) {
                    return false;
                }
                ((d0) map).d((Comparable) entry.getKey(), entry.getValue());
                return true;
            case 3:
                if (contains(entry)) {
                    return false;
                }
                ((C2510h1) map).put((Comparable) entry.getKey(), entry.getValue());
                return true;
            default:
                if (contains(entry)) {
                    return false;
                }
                ((C4444B) map).put((Comparable) entry.getKey(), entry.getValue());
                return true;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        int i10 = this.f47571Y;
        Map map = this.f47572Z;
        switch (i10) {
            case 0:
                return new C6057d((C6059f) map);
            case 1:
                return new m0((i0) map);
            case 2:
                return new m0((d0) map);
            case 3:
                return new m0((C2510h1) map);
            default:
                return new m0((C4444B) map);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int i10 = this.f47571Y;
        Map map = this.f47572Z;
        switch (i10) {
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                if (!contains(entry)) {
                    return false;
                }
                ((i0) map).remove(entry.getKey());
                return true;
            case 2:
                Map.Entry entry2 = (Map.Entry) obj;
                if (!contains(entry2)) {
                    return false;
                }
                ((d0) map).e(entry2.getKey());
                return true;
            case 3:
                Map.Entry entry3 = (Map.Entry) obj;
                if (!contains(entry3)) {
                    return false;
                }
                ((C2510h1) map).remove(entry3.getKey());
                return true;
            case 4:
                Map.Entry entry4 = (Map.Entry) obj;
                if (!contains(entry4)) {
                    return false;
                }
                ((C4444B) map).remove(entry4.getKey());
                return true;
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        int i10 = this.f47571Y;
        Map map = this.f47572Z;
        switch (i10) {
            case 0:
                return ((C6059f) map).f47560h0;
            case 1:
                return ((i0) map).size();
            case 2:
                return ((d0) map).h();
            case 3:
                return ((C2510h1) map).size();
            default:
                return ((C4444B) map).size();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6054a(C2510h1 c2510h1) {
        this(c2510h1, 3);
        this.f47571Y = 3;
    }

    public /* synthetic */ C6054a(Map map, int i10) {
        this.f47571Y = i10;
        this.f47572Z = map;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6054a(C4444B c4444b) {
        this(c4444b, 4);
        this.f47571Y = 4;
    }
}
