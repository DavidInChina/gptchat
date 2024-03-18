package kf;

import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import w.C6053E;

/* renamed from: kf.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4278c extends C6053E implements ListIterator {

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ AbstractC4280e f37467i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4278c(AbstractC4280e abstractC4280e, int i10) {
        super(6, abstractC4280e);
        this.f37467i0 = abstractC4280e;
        int r10 = abstractC4280e.r();
        if (i10 >= 0 && i10 <= r10) {
            this.f47569Z = i10;
            return;
        }
        throw new IndexOutOfBoundsException(AbstractC2469q0.i("index: ", i10, ", size: ", r10));
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        if (this.f47569Z > 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f47569Z;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (hasPrevious()) {
            int i10 = this.f47569Z - 1;
            this.f47569Z = i10;
            return this.f37467i0.get(i10);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f47569Z - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
