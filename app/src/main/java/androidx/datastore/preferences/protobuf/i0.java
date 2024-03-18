package androidx.datastore.preferences.protobuf;

import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import w.C6054a;

/* loaded from: classes.dex */
public final class i0 extends AbstractMap {

    /* renamed from: l0  reason: collision with root package name */
    public static final /* synthetic */ int f25059l0 = 0;

    /* renamed from: Y  reason: collision with root package name */
    public final int f25060Y;

    /* renamed from: i0  reason: collision with root package name */
    public boolean f25063i0;

    /* renamed from: j0  reason: collision with root package name */
    public volatile C6054a f25064j0;

    /* renamed from: Z  reason: collision with root package name */
    public List f25061Z = Collections.emptyList();

    /* renamed from: h0  reason: collision with root package name */
    public Map f25062h0 = Collections.emptyMap();

    /* renamed from: k0  reason: collision with root package name */
    public Map f25065k0 = Collections.emptyMap();

    public i0(int i10) {
        this.f25060Y = i10;
    }

    public final int a(Comparable comparable) {
        int i10;
        int size = this.f25061Z.size();
        int i11 = size - 1;
        if (i11 >= 0) {
            int compareTo = comparable.compareTo(((l0) this.f25061Z.get(i11)).f25078Y);
            if (compareTo > 0) {
                i10 = size + 1;
                return -i10;
            } else if (compareTo == 0) {
                return i11;
            }
        }
        int i12 = 0;
        while (i12 <= i11) {
            int i13 = (i12 + i11) / 2;
            int compareTo2 = comparable.compareTo(((l0) this.f25061Z.get(i13)).f25078Y);
            if (compareTo2 < 0) {
                i11 = i13 - 1;
            } else if (compareTo2 > 0) {
                i12 = i13 + 1;
            } else {
                return i13;
            }
        }
        i10 = i12 + 1;
        return -i10;
    }

    public final void b() {
        if (!this.f25063i0) {
            return;
        }
        throw new UnsupportedOperationException();
    }

    /* renamed from: c */
    public final void clear() {
        b();
        if (!this.f25061Z.isEmpty()) {
            this.f25061Z.clear();
        }
        if (!this.f25062h0.isEmpty()) {
            this.f25062h0.clear();
        }
    }

    /* renamed from: d */
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        if (a(comparable) < 0 && !this.f25062h0.containsKey(comparable)) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public final Set entrySet() {
        if (this.f25064j0 == null) {
            this.f25064j0 = new C6054a(this);
        }
        return this.f25064j0;
    }

    /* renamed from: g */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i0)) {
            return super.equals(obj);
        }
        i0 i0Var = (i0) obj;
        int size = size();
        if (size != i0Var.size()) {
            return false;
        }
        int size2 = this.f25061Z.size();
        if (size2 != i0Var.f25061Z.size()) {
            return entrySet().equals(i0Var.entrySet());
        }
        for (int i10 = 0; i10 < size2; i10++) {
            if (!i(i10).equals(i0Var.i(i10))) {
                return false;
            }
        }
        if (size2 == size) {
            return true;
        }
        return this.f25062h0.equals(i0Var.f25062h0);
    }

    /* renamed from: h */
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int a5 = a(comparable);
        if (a5 >= 0) {
            return ((l0) this.f25061Z.get(a5)).f25079Z;
        }
        return this.f25062h0.get(comparable);
    }

    public final Map.Entry i(int i10) {
        return (Map.Entry) this.f25061Z.get(i10);
    }

    public final Iterable j() {
        if (this.f25062h0.isEmpty()) {
            return V.f25007b;
        }
        return this.f25062h0.entrySet();
    }

    public final SortedMap k() {
        b();
        if (this.f25062h0.isEmpty() && !(this.f25062h0 instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f25062h0 = treeMap;
            this.f25065k0 = treeMap.descendingMap();
        }
        return (SortedMap) this.f25062h0;
    }

    /* renamed from: l */
    public final int hashCode() {
        int size = this.f25061Z.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            i10 += ((l0) this.f25061Z.get(i11)).hashCode();
        }
        if (this.f25062h0.size() > 0) {
            return i10 + this.f25062h0.hashCode();
        }
        return i10;
    }

    public final Object m(Comparable comparable, Object obj) {
        b();
        int a5 = a(comparable);
        if (a5 >= 0) {
            return ((l0) this.f25061Z.get(a5)).setValue(obj);
        }
        b();
        boolean isEmpty = this.f25061Z.isEmpty();
        int i10 = this.f25060Y;
        if (isEmpty && !(this.f25061Z instanceof ArrayList)) {
            this.f25061Z = new ArrayList(i10);
        }
        int i11 = -(a5 + 1);
        if (i11 >= i10) {
            return k().put(comparable, obj);
        }
        if (this.f25061Z.size() == i10) {
            l0 l0Var = (l0) this.f25061Z.remove(i10 - 1);
            k().put(l0Var.f25078Y, l0Var.f25079Z);
        }
        this.f25061Z.add(i11, new l0(this, comparable, obj));
        return null;
    }

    /* renamed from: n */
    public final Object remove(Object obj) {
        b();
        Comparable comparable = (Comparable) obj;
        int a5 = a(comparable);
        if (a5 >= 0) {
            return o(a5);
        }
        if (this.f25062h0.isEmpty()) {
            return null;
        }
        return this.f25062h0.remove(comparable);
    }

    public final Object o(int i10) {
        b();
        Object obj = ((l0) this.f25061Z.remove(i10)).f25079Z;
        if (!this.f25062h0.isEmpty()) {
            Iterator it = k().entrySet().iterator();
            List list = this.f25061Z;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new l0(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return obj;
    }

    /* renamed from: p */
    public final int size() {
        return this.f25062h0.size() + this.f25061Z.size();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        AbstractC2469q0.p(obj);
        return m(null, obj2);
    }
}
