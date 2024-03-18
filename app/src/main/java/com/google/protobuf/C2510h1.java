package com.google.protobuf;

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

/* renamed from: com.google.protobuf.h1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2510h1 extends AbstractMap {

    /* renamed from: l0  reason: collision with root package name */
    public static final /* synthetic */ int f27553l0 = 0;

    /* renamed from: Y  reason: collision with root package name */
    public final int f27554Y;

    /* renamed from: i0  reason: collision with root package name */
    public boolean f27557i0;

    /* renamed from: j0  reason: collision with root package name */
    public volatile C6054a f27558j0;

    /* renamed from: Z  reason: collision with root package name */
    public List f27555Z = Collections.emptyList();

    /* renamed from: h0  reason: collision with root package name */
    public Map f27556h0 = Collections.emptyMap();

    /* renamed from: k0  reason: collision with root package name */
    public Map f27559k0 = Collections.emptyMap();

    public C2510h1(int i10) {
        this.f27554Y = i10;
    }

    public final int a(Comparable comparable) {
        int i10;
        int size = this.f27555Z.size();
        int i11 = size - 1;
        if (i11 >= 0) {
            int compareTo = comparable.compareTo(((C2519k1) this.f27555Z.get(i11)).f27566Y);
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
            int compareTo2 = comparable.compareTo(((C2519k1) this.f27555Z.get(i13)).f27566Y);
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
        if (!this.f27557i0) {
            return;
        }
        throw new UnsupportedOperationException();
    }

    /* renamed from: c */
    public final void clear() {
        b();
        if (!this.f27555Z.isEmpty()) {
            this.f27555Z.clear();
        }
        if (!this.f27556h0.isEmpty()) {
            this.f27556h0.clear();
        }
    }

    /* renamed from: d */
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        if (a(comparable) < 0 && !this.f27556h0.containsKey(comparable)) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public final Set entrySet() {
        if (this.f27558j0 == null) {
            this.f27558j0 = new C6054a(this);
        }
        return this.f27558j0;
    }

    /* renamed from: g */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2510h1)) {
            return super.equals(obj);
        }
        C2510h1 c2510h1 = (C2510h1) obj;
        int size = size();
        if (size != c2510h1.size()) {
            return false;
        }
        int size2 = this.f27555Z.size();
        if (size2 != c2510h1.f27555Z.size()) {
            return entrySet().equals(c2510h1.entrySet());
        }
        for (int i10 = 0; i10 < size2; i10++) {
            if (!i(i10).equals(c2510h1.i(i10))) {
                return false;
            }
        }
        if (size2 == size) {
            return true;
        }
        return this.f27556h0.equals(c2510h1.f27556h0);
    }

    /* renamed from: h */
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int a5 = a(comparable);
        if (a5 >= 0) {
            return ((C2519k1) this.f27555Z.get(a5)).f27567Z;
        }
        return this.f27556h0.get(comparable);
    }

    public final Map.Entry i(int i10) {
        return (Map.Entry) this.f27555Z.get(i10);
    }

    public final Iterable j() {
        if (this.f27556h0.isEmpty()) {
            return AbstractC2508h.f27552b;
        }
        return this.f27556h0.entrySet();
    }

    public final SortedMap k() {
        b();
        if (this.f27556h0.isEmpty() && !(this.f27556h0 instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f27556h0 = treeMap;
            this.f27559k0 = treeMap.descendingMap();
        }
        return (SortedMap) this.f27556h0;
    }

    /* renamed from: l */
    public final int hashCode() {
        int size = this.f27555Z.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            i10 += ((C2519k1) this.f27555Z.get(i11)).hashCode();
        }
        if (this.f27556h0.size() > 0) {
            return i10 + this.f27556h0.hashCode();
        }
        return i10;
    }

    /* renamed from: m */
    public final Object put(Comparable comparable, Object obj) {
        b();
        int a5 = a(comparable);
        if (a5 >= 0) {
            return ((C2519k1) this.f27555Z.get(a5)).setValue(obj);
        }
        b();
        boolean isEmpty = this.f27555Z.isEmpty();
        int i10 = this.f27554Y;
        if (isEmpty && !(this.f27555Z instanceof ArrayList)) {
            this.f27555Z = new ArrayList(i10);
        }
        int i11 = -(a5 + 1);
        if (i11 >= i10) {
            return k().put(comparable, obj);
        }
        if (this.f27555Z.size() == i10) {
            C2519k1 c2519k1 = (C2519k1) this.f27555Z.remove(i10 - 1);
            k().put(c2519k1.f27566Y, c2519k1.f27567Z);
        }
        this.f27555Z.add(i11, new C2519k1(this, comparable, obj));
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
        if (this.f27556h0.isEmpty()) {
            return null;
        }
        return this.f27556h0.remove(comparable);
    }

    public final Object o(int i10) {
        b();
        Object obj = ((C2519k1) this.f27555Z.remove(i10)).f27567Z;
        if (!this.f27556h0.isEmpty()) {
            Iterator it = k().entrySet().iterator();
            List list = this.f27555Z;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new C2519k1(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return obj;
    }

    /* renamed from: p */
    public final int size() {
        return this.f27556h0.size() + this.f27555Z.size();
    }
}
