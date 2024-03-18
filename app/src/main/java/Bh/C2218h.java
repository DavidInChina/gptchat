package bh;

import java.util.Iterator;
import kotlinx.serialization.descriptors.SerialDescriptor;
import xf.AbstractC6438a;

/* renamed from: bh.h  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2218h implements Iterator, AbstractC6438a {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f26007Y;

    /* renamed from: Z  reason: collision with root package name */
    public int f26008Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ SerialDescriptor f26009h0;

    public C2218h(SerialDescriptor serialDescriptor, int i10) {
        this.f26007Y = i10;
        if (i10 != 1) {
            this.f26009h0 = serialDescriptor;
            this.f26008Z = serialDescriptor.f();
            return;
        }
        this.f26009h0 = serialDescriptor;
        this.f26008Z = serialDescriptor.f();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f26007Y) {
            case 0:
                if (this.f26008Z <= 0) {
                    return false;
                }
                return true;
            default:
                if (this.f26008Z <= 0) {
                    return false;
                }
                return true;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i10 = this.f26007Y;
        SerialDescriptor serialDescriptor = this.f26009h0;
        switch (i10) {
            case 0:
                int f6 = serialDescriptor.f();
                int i11 = this.f26008Z;
                this.f26008Z = i11 - 1;
                return serialDescriptor.i(f6 - i11);
            default:
                int f10 = serialDescriptor.f();
                int i12 = this.f26008Z;
                this.f26008Z = i12 - 1;
                return serialDescriptor.g(f10 - i12);
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f26007Y) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }
}
