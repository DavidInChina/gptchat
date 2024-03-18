package Hg;

import id.AbstractC3557B;
import java.util.Arrays;
import java.util.Iterator;

/* renamed from: Hg.c  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0730c extends AbstractC0728a {

    /* renamed from: Y  reason: collision with root package name */
    public Object[] f7769Y;

    /* renamed from: Z  reason: collision with root package name */
    public int f7770Z;

    @Override // Hg.AbstractC0728a
    public final Object get(int i10) {
        return kf.q.n3(i10, this.f7769Y);
    }

    @Override // Hg.AbstractC0728a, java.lang.Iterable
    public final Iterator iterator() {
        return new C0729b(this);
    }

    @Override // Hg.AbstractC0728a
    public final int r() {
        return this.f7770Z;
    }

    @Override // Hg.AbstractC0728a
    public final void s(int i10, Object obj) {
        AbstractC3557B.c0("value", obj);
        Object[] objArr = this.f7769Y;
        if (objArr.length <= i10) {
            int length = objArr.length;
            do {
                length *= 2;
            } while (length <= i10);
            Object[] copyOf = Arrays.copyOf(this.f7769Y, length);
            AbstractC3557B.b0("copyOf(...)", copyOf);
            this.f7769Y = copyOf;
        }
        Object[] objArr2 = this.f7769Y;
        if (objArr2[i10] == null) {
            this.f7770Z++;
        }
        objArr2[i10] = obj;
    }
}
