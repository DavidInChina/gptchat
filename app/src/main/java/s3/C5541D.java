package s3;

import id.AbstractC3557B;
import java.util.Iterator;
import java.util.NoSuchElementException;
import w.AbstractC6051C;
import w.C6050B;
import xf.AbstractC6438a;

/* renamed from: s3.D  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5541D implements Iterator, AbstractC6438a {

    /* renamed from: Y  reason: collision with root package name */
    public int f45223Y = -1;

    /* renamed from: Z  reason: collision with root package name */
    public boolean f45224Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ C5542E f45225h0;

    public C5541D(C5542E c5542e) {
        this.f45225h0 = c5542e;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f45223Y + 1 < this.f45225h0.f45227o0.f()) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            this.f45224Z = true;
            C6050B c6050b = this.f45225h0.f45227o0;
            int i10 = this.f45223Y + 1;
            this.f45223Y = i10;
            Object g10 = c6050b.g(i10);
            AbstractC3557B.b0("nodes.valueAt(++index)", g10);
            return (AbstractC5540C) g10;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.f45224Z) {
            C6050B c6050b = this.f45225h0.f45227o0;
            ((AbstractC5540C) c6050b.g(this.f45223Y)).f45216Z = null;
            int i10 = this.f45223Y;
            Object[] objArr = c6050b.f47563h0;
            Object obj = objArr[i10];
            Object obj2 = AbstractC6051C.f47565a;
            if (obj != obj2) {
                objArr[i10] = obj2;
                c6050b.f47561Y = true;
            }
            this.f45223Y = i10 - 1;
            this.f45224Z = false;
            return;
        }
        throw new IllegalStateException("You must call next() before you can remove an element".toString());
    }
}
