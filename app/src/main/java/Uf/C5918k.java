package uf;

import id.AbstractC3557B;
import java.io.BufferedReader;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kf.p;
import xf.AbstractC6438a;

/* renamed from: uf.k  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5918k implements Iterator, AbstractC6438a {

    /* renamed from: Y  reason: collision with root package name */
    public String f46762Y;

    /* renamed from: Z  reason: collision with root package name */
    public boolean f46763Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ p f46764h0;

    public C5918k(p pVar) {
        this.f46764h0 = pVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f46762Y == null && !this.f46763Z) {
            String readLine = ((BufferedReader) this.f46764h0.f37481b).readLine();
            this.f46762Y = readLine;
            if (readLine == null) {
                this.f46763Z = true;
            }
        }
        if (this.f46762Y != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            String str = this.f46762Y;
            this.f46762Y = null;
            AbstractC3557B.Z(str);
            return str;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
