package K8;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public abstract class k implements Iterator {

    /* renamed from: Y  reason: collision with root package name */
    public l f9555Y;

    /* renamed from: Z  reason: collision with root package name */
    public l f9556Z = null;

    /* renamed from: h0  reason: collision with root package name */
    public int f9557h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ m f9558i0;

    public k(m mVar) {
        this.f9558i0 = mVar;
        this.f9555Y = mVar.f9574k0.f9562i0;
        this.f9557h0 = mVar.f9573j0;
    }

    public final l a() {
        l lVar = this.f9555Y;
        m mVar = this.f9558i0;
        if (lVar != mVar.f9574k0) {
            if (mVar.f9573j0 == this.f9557h0) {
                this.f9555Y = lVar.f9562i0;
                this.f9556Z = lVar;
                return lVar;
            }
            throw new ConcurrentModificationException();
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f9555Y != this.f9558i0.f9574k0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final void remove() {
        l lVar = this.f9556Z;
        if (lVar != null) {
            m mVar = this.f9558i0;
            mVar.c(lVar, true);
            this.f9556Z = null;
            this.f9557h0 = mVar.f9573j0;
            return;
        }
        throw new IllegalStateException();
    }
}
