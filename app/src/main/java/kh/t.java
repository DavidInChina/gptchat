package kh;

import android.content.ContentResolver;
import android.content.Context;
import android.gov.nist.core.Separators;
import android.graphics.BitmapRegionDecoder;
import android.net.Uri;
import id.AbstractC3557B;
import java.io.InputStream;
import r0.C5341e;
import r0.z;

/* loaded from: classes.dex */
public final class t implements l {

    /* renamed from: Y  reason: collision with root package name */
    public final Uri f37591Y;

    /* renamed from: Z  reason: collision with root package name */
    public final z f37592Z;

    public t(Uri uri, C5341e c5341e) {
        this.f37591Y = uri;
        this.f37592Z = c5341e;
    }

    @Override // kh.l
    public final BitmapRegionDecoder Z(Context context) {
        InputStream a5;
        try {
            BitmapRegionDecoder newInstance = BitmapRegionDecoder.newInstance(a(context), false);
            AbstractC3557B.Z(newInstance);
            th = null;
            return newInstance;
        } finally {
        }
    }

    public final InputStream a(Context context) {
        AbstractC3557B.c0("context", context);
        ContentResolver contentResolver = context.getContentResolver();
        Uri uri = this.f37591Y;
        InputStream openInputStream = contentResolver.openInputStream(uri);
        if (openInputStream != null) {
            return openInputStream;
        }
        throw new IllegalStateException(("Failed to read uri: " + uri).toString());
    }

    @Override // kh.l
    public final z e0() {
        return this.f37592Z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        if (AbstractC3557B.K(this.f37591Y, tVar.f37591Y) && AbstractC3557B.K(this.f37592Z, tVar.f37592Z)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = this.f37591Y.hashCode() * 31;
        z zVar = this.f37592Z;
        if (zVar == null) {
            i10 = 0;
        } else {
            i10 = zVar.hashCode();
        }
        return hashCode + i10;
    }

    public final String toString() {
        return "UriImageSource(uri=" + this.f37591Y + ", preview=" + this.f37592Z + Separators.RPAREN;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
    }
}
