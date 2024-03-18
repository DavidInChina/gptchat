package x8;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: x8.q  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6373q extends AbstractC6371o implements List {

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ AbstractC6359c f49599k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6373q(AbstractC6359c abstractC6359c, Object obj, List list, AbstractC6371o abstractC6371o) {
        super(abstractC6359c, obj, list, abstractC6371o);
        this.f49599k0 = abstractC6359c;
    }

    @Override // java.util.List
    public final void add(int i10, Object obj) {
        r();
        boolean isEmpty = this.f49587Z.isEmpty();
        ((List) this.f49587Z).add(i10, obj);
        this.f49599k0.f49546j0++;
        if (isEmpty) {
            f();
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i10, Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = ((List) this.f49587Z).addAll(i10, collection);
        if (addAll) {
            this.f49599k0.f49546j0 += this.f49587Z.size() - size;
            if (size == 0) {
                f();
            }
        }
        return addAll;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        r();
        return ((List) this.f49587Z).get(i10);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        r();
        return ((List) this.f49587Z).indexOf(obj);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        r();
        return ((List) this.f49587Z).lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        r();
        return new C6372p(this);
    }

    @Override // java.util.List
    public final Object remove(int i10) {
        r();
        Object remove = ((List) this.f49587Z).remove(i10);
        AbstractC6359c abstractC6359c = this.f49599k0;
        abstractC6359c.f49546j0--;
        s();
        return remove;
    }

    @Override // java.util.List
    public final Object set(int i10, Object obj) {
        r();
        return ((List) this.f49587Z).set(i10, obj);
    }

    @Override // java.util.List
    public final List subList(int i10, int i11) {
        r();
        List subList = ((List) this.f49587Z).subList(i10, i11);
        AbstractC6371o abstractC6371o = this.f49588h0;
        if (abstractC6371o == null) {
            abstractC6371o = this;
        }
        AbstractC6359c abstractC6359c = this.f49599k0;
        abstractC6359c.getClass();
        boolean z10 = subList instanceof RandomAccess;
        Object obj = this.f49586Y;
        if (z10) {
            return new C6373q(abstractC6359c, obj, subList, abstractC6371o);
        }
        return new C6373q(abstractC6359c, obj, subList, abstractC6371o);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i10) {
        r();
        return new C6372p(this, i10);
    }
}
