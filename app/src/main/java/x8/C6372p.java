package x8;

import java.util.List;
import java.util.ListIterator;

/* renamed from: x8.p  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6372p extends C6362f implements ListIterator {

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ C6373q f49594j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6372p(C6373q c6373q) {
        super(c6373q);
        this.f49594j0 = c6373q;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        C6373q c6373q = this.f49594j0;
        boolean isEmpty = c6373q.isEmpty();
        b().add(obj);
        c6373q.f49599k0.f49546j0++;
        if (isEmpty) {
            c6373q.f();
        }
    }

    public final ListIterator b() {
        a();
        return (ListIterator) this.f49553Z;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return b().hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return b().nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return b().previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return b().previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        b().set(obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6372p(C6373q c6373q, int i10) {
        super(c6373q, ((List) c6373q.f49587Z).listIterator(i10));
        this.f49594j0 = c6373q;
    }
}
