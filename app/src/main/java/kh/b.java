package kh;

import android.content.Context;
import android.gov.nist.core.Separators;
import android.graphics.BitmapRegionDecoder;
import android.os.ParcelFileDescriptor;
import id.AbstractC3557B;
import java.io.Closeable;
import ji.C4113B;
import r0.z;

/* loaded from: classes.dex */
public final class b implements l {

    /* renamed from: Y  reason: collision with root package name */
    public final C4113B f37544Y;

    /* renamed from: Z  reason: collision with root package name */
    public final z f37545Z;

    /* renamed from: h0  reason: collision with root package name */
    public final Closeable f37546h0;

    public b(C4113B c4113b, z zVar, Closeable closeable) {
        this.f37544Y = c4113b;
        this.f37545Z = zVar;
        this.f37546h0 = closeable;
        if (ki.c.a(c4113b) != -1) {
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* JADX WARN: Finally extract failed */
    @Override // kh.l
    public final BitmapRegionDecoder Z(Context context) {
        ParcelFileDescriptor open = ParcelFileDescriptor.open(this.f37544Y.e(), 268435456);
        try {
            BitmapRegionDecoder newInstance = BitmapRegionDecoder.newInstance(open.getFileDescriptor(), false);
            Ad.l.S(open, null);
            AbstractC3557B.b0("use(...)", newInstance);
            return newInstance;
        } finally {
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Closeable closeable = this.f37546h0;
        if (closeable != null) {
            closeable.close();
        }
    }

    @Override // kh.l
    public final z e0() {
        return this.f37545Z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (AbstractC3557B.K(this.f37544Y, bVar.f37544Y) && AbstractC3557B.K(this.f37545Z, bVar.f37545Z) && AbstractC3557B.K(this.f37546h0, bVar.f37546h0)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = this.f37544Y.f36661Y.hashCode() * 31;
        int i11 = 0;
        z zVar = this.f37545Z;
        if (zVar == null) {
            i10 = 0;
        } else {
            i10 = zVar.hashCode();
        }
        int i12 = (hashCode + i10) * 31;
        Closeable closeable = this.f37546h0;
        if (closeable != null) {
            i11 = closeable.hashCode();
        }
        return i12 + i11;
    }

    public final String toString() {
        return "FileImageSource(path=" + this.f37544Y + ", preview=" + this.f37545Z + ", onClose=" + this.f37546h0 + Separators.RPAREN;
    }
}
