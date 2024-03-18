package fh;

import ah.AbstractC1991b;
import eh.AbstractC2904d;
import java.util.Iterator;
import kotlinx.serialization.KSerializer;
import xf.AbstractC6438a;

/* renamed from: fh.v  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3095v implements Iterator, AbstractC6438a {

    /* renamed from: Y  reason: collision with root package name */
    public final AbstractC2904d f30894Y;

    /* renamed from: Z  reason: collision with root package name */
    public final C3067J f30895Z;

    /* renamed from: h0  reason: collision with root package name */
    public final AbstractC1991b f30896h0;

    /* renamed from: i0  reason: collision with root package name */
    public boolean f30897i0 = true;

    /* renamed from: j0  reason: collision with root package name */
    public boolean f30898j0;

    public C3095v(AbstractC2904d abstractC2904d, C3067J c3067j, KSerializer kSerializer) {
        this.f30894Y = abstractC2904d;
        this.f30895Z = c3067j;
        this.f30896h0 = kSerializer;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f30898j0) {
            return false;
        }
        C3067J c3067j = this.f30895Z;
        if (c3067j.w() == 9) {
            this.f30898j0 = true;
            c3067j.g((byte) 9);
            if (c3067j.w() != 10) {
                if (c3067j.w() != 8) {
                    c3067j.p();
                } else {
                    AbstractC3074a.r(c3067j, "There is a start of the new array after the one parsed to sequence. ARRAY_WRAPPED mode doesn't merge consecutive arrays.\nIf you need to parse a stream of arrays, please use WHITESPACE_SEPARATED mode instead.", 0, null, 6);
                    throw null;
                }
            }
            return false;
        } else if (c3067j.w() != 10 || this.f30898j0) {
            return true;
        } else {
            c3067j.s((byte) 9, true);
            throw null;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f30897i0) {
            this.f30897i0 = false;
        } else {
            this.f30895Z.h(',');
        }
        EnumC3073P enumC3073P = EnumC3073P.f30847h0;
        AbstractC1991b abstractC1991b = this.f30896h0;
        return new C3068K(this.f30894Y, enumC3073P, this.f30895Z, abstractC1991b.getDescriptor(), null).g(abstractC1991b);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
