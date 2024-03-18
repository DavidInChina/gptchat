package lg;

import java.io.UnsupportedEncodingException;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
public final class u extends AbstractList implements RandomAccess, v {

    /* renamed from: Z  reason: collision with root package name */
    public static final C4449G f38416Z = new C4449G(new u());

    /* renamed from: Y  reason: collision with root package name */
    public final ArrayList f38417Y;

    public u() {
        this.f38417Y = new ArrayList();
    }

    @Override // lg.v
    public final AbstractC4460e G0(int i10) {
        AbstractC4460e abstractC4460e;
        ArrayList arrayList = this.f38417Y;
        Object obj = arrayList.get(i10);
        if (obj instanceof AbstractC4460e) {
            abstractC4460e = (AbstractC4460e) obj;
        } else if (obj instanceof String) {
            try {
                abstractC4460e = new w(((String) obj).getBytes("UTF-8"));
            } catch (UnsupportedEncodingException e10) {
                throw new RuntimeException("UTF-8 not supported?", e10);
            }
        } else {
            byte[] bArr = (byte[]) obj;
            int length = bArr.length;
            byte[] bArr2 = new byte[length];
            System.arraycopy(bArr, 0, bArr2, 0, length);
            abstractC4460e = new w(bArr2);
        }
        if (abstractC4460e != obj) {
            arrayList.set(i10, abstractC4460e);
        }
        return abstractC4460e;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        this.f38417Y.add(i10, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(this.f38417Y.size(), collection);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.f38417Y.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // lg.v
    public final List d() {
        return Collections.unmodifiableList(this.f38417Y);
    }

    @Override // lg.v
    public final C4449G e() {
        return new C4449G(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        String str;
        ArrayList arrayList = this.f38417Y;
        Object obj = arrayList.get(i10);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof AbstractC4460e) {
            AbstractC4460e abstractC4460e = (AbstractC4460e) obj;
            str = abstractC4460e.r0();
            if (abstractC4460e.T()) {
                arrayList.set(i10, str);
            }
        } else {
            byte[] bArr = (byte[]) obj;
            byte[] bArr2 = s.f38414a;
            try {
                str = new String(bArr, "UTF-8");
                if (K4.J.P(bArr, 0, bArr.length) == 0) {
                    arrayList.set(i10, str);
                }
            } catch (UnsupportedEncodingException e10) {
                throw new RuntimeException("UTF-8 not supported?", e10);
            }
        }
        return str;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        Object remove = this.f38417Y.remove(i10);
        ((AbstractList) this).modCount++;
        if (remove instanceof String) {
            return (String) remove;
        }
        if (remove instanceof AbstractC4460e) {
            return ((AbstractC4460e) remove).r0();
        }
        byte[] bArr = (byte[]) remove;
        byte[] bArr2 = s.f38414a;
        try {
            return new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException e10) {
            throw new RuntimeException("UTF-8 not supported?", e10);
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        Object obj2 = this.f38417Y.set(i10, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (obj2 instanceof AbstractC4460e) {
            return ((AbstractC4460e) obj2).r0();
        }
        byte[] bArr = (byte[]) obj2;
        byte[] bArr2 = s.f38414a;
        try {
            return new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException e10) {
            throw new RuntimeException("UTF-8 not supported?", e10);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f38417Y.size();
    }

    @Override // lg.v
    public final void w(w wVar) {
        this.f38417Y.add(wVar);
        ((AbstractList) this).modCount++;
    }

    public u(v vVar) {
        this.f38417Y = new ArrayList(vVar.size());
        addAll(vVar);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i10, Collection collection) {
        if (collection instanceof v) {
            collection = ((v) collection).d();
        }
        boolean addAll = this.f38417Y.addAll(i10, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }
}
