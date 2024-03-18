package com.google.protobuf;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.google.protobuf.l  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2520l implements Iterator {
    @Override // java.util.Iterator
    public final Object next() {
        C2517k c2517k = (C2517k) this;
        int i10 = c2517k.f27563Y;
        if (i10 < c2517k.f27564Z) {
            c2517k.f27563Y = i10 + 1;
            return Byte.valueOf(c2517k.f27565h0.M(i10));
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
