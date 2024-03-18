package s2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: s2.f  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5536f implements Iterable {

    /* renamed from: Y  reason: collision with root package name */
    public final Object f45153Y = new Object();

    /* renamed from: Z  reason: collision with root package name */
    public final HashMap f45154Z = new HashMap();

    /* renamed from: h0  reason: collision with root package name */
    public Set f45155h0 = Collections.emptySet();

    /* renamed from: i0  reason: collision with root package name */
    public List f45156i0 = Collections.emptyList();

    public final int f(Object obj) {
        int i10;
        synchronized (this.f45153Y) {
            try {
                if (this.f45154Z.containsKey(obj)) {
                    i10 = ((Integer) this.f45154Z.get(obj)).intValue();
                } else {
                    i10 = 0;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return i10;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        Iterator it;
        synchronized (this.f45153Y) {
            it = this.f45156i0.iterator();
        }
        return it;
    }

    public final void r(Object obj) {
        synchronized (this.f45153Y) {
            try {
                Integer num = (Integer) this.f45154Z.get(obj);
                if (num == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList(this.f45156i0);
                arrayList.remove(obj);
                this.f45156i0 = Collections.unmodifiableList(arrayList);
                if (num.intValue() == 1) {
                    this.f45154Z.remove(obj);
                    HashSet hashSet = new HashSet(this.f45155h0);
                    hashSet.remove(obj);
                    this.f45155h0 = Collections.unmodifiableSet(hashSet);
                } else {
                    this.f45154Z.put(obj, Integer.valueOf(num.intValue() - 1));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
