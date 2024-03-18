package lg;

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

/* renamed from: lg.B  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4444B extends AbstractMap {

    /* renamed from: k0  reason: collision with root package name */
    public static final /* synthetic */ int f38337k0 = 0;

    /* renamed from: Y  reason: collision with root package name */
    public final int f38338Y;

    /* renamed from: Z  reason: collision with root package name */
    public List f38339Z = Collections.emptyList();

    /* renamed from: h0  reason: collision with root package name */
    public Map f38340h0 = Collections.emptyMap();

    /* renamed from: i0  reason: collision with root package name */
    public boolean f38341i0;

    /* renamed from: j0  reason: collision with root package name */
    public volatile C6054a f38342j0;

    public C4444B(int i10) {
        this.f38338Y = i10;
    }

    public final int a(Comparable comparable) {
        int i10;
        int size = this.f38339Z.size();
        int i11 = size - 1;
        if (i11 >= 0) {
            int compareTo = comparable.compareTo(((C4448F) this.f38339Z.get(i11)).f38345Y);
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
            int compareTo2 = comparable.compareTo(((C4448F) this.f38339Z.get(i13)).f38345Y);
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
        if (!this.f38341i0) {
            return;
        }
        throw new UnsupportedOperationException();
    }

    /* renamed from: c */
    public final void clear() {
        b();
        if (!this.f38339Z.isEmpty()) {
            this.f38339Z.clear();
        }
        if (!this.f38340h0.isEmpty()) {
            this.f38340h0.clear();
        }
    }

    /* renamed from: d */
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        if (a(comparable) < 0 && !this.f38340h0.containsKey(comparable)) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public final Set entrySet() {
        if (this.f38342j0 == null) {
            this.f38342j0 = new C6054a(this);
        }
        return this.f38342j0;
    }

    /* renamed from: g */
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int a5 = a(comparable);
        if (a5 >= 0) {
            return ((C4448F) this.f38339Z.get(a5)).f38346Z;
        }
        return this.f38340h0.get(comparable);
    }

    public final Iterable h() {
        if (this.f38340h0.isEmpty()) {
            return AbstractC4447E.f38344b;
        }
        return this.f38340h0.entrySet();
    }

    public final SortedMap i() {
        b();
        if (this.f38340h0.isEmpty() && !(this.f38340h0 instanceof TreeMap)) {
            this.f38340h0 = new TreeMap();
        }
        return (SortedMap) this.f38340h0;
    }

    /* renamed from: j */
    public final Object put(Comparable comparable, Object obj) {
        b();
        int a5 = a(comparable);
        if (a5 >= 0) {
            return ((C4448F) this.f38339Z.get(a5)).setValue(obj);
        }
        b();
        boolean isEmpty = this.f38339Z.isEmpty();
        int i10 = this.f38338Y;
        if (isEmpty && !(this.f38339Z instanceof ArrayList)) {
            this.f38339Z = new ArrayList(i10);
        }
        int i11 = -(a5 + 1);
        if (i11 >= i10) {
            return i().put(comparable, obj);
        }
        if (this.f38339Z.size() == i10) {
            C4448F c4448f = (C4448F) this.f38339Z.remove(i10 - 1);
            i().put(c4448f.f38345Y, c4448f.f38346Z);
        }
        this.f38339Z.add(i11, new C4448F(this, comparable, obj));
        return null;
    }

    /* renamed from: k */
    public final Object remove(Object obj) {
        b();
        Comparable comparable = (Comparable) obj;
        int a5 = a(comparable);
        if (a5 >= 0) {
            return l(a5);
        }
        if (this.f38340h0.isEmpty()) {
            return null;
        }
        return this.f38340h0.remove(comparable);
    }

    public final Object l(int i10) {
        b();
        Object obj = ((C4448F) this.f38339Z.remove(i10)).f38346Z;
        if (!this.f38340h0.isEmpty()) {
            Iterator it = i().entrySet().iterator();
            List list = this.f38339Z;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new C4448F(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return obj;
    }

    /* renamed from: m */
    public final int size() {
        return this.f38340h0.size() + this.f38339Z.size();
    }
}
