package kh;

import android.content.Context;
import android.content.res.AssetManager;
import android.gov.nist.core.Separators;
import android.graphics.BitmapRegionDecoder;
import id.AbstractC3557B;
import java.io.InputStream;
import r0.C5341e;
import r0.z;

/* renamed from: kh.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4300a implements l {

    /* renamed from: Y  reason: collision with root package name */
    public final String f37542Y;

    /* renamed from: Z  reason: collision with root package name */
    public final z f37543Z;

    public C4300a(String str, C5341e c5341e) {
        this.f37542Y = str;
        this.f37543Z = c5341e;
    }

    @Override // kh.l
    public final BitmapRegionDecoder Z(Context context) {
        InputStream a5 = a(context);
        try {
            if (a5 instanceof AssetManager.AssetInputStream) {
                BitmapRegionDecoder newInstance = BitmapRegionDecoder.newInstance(a5, false);
                AbstractC3557B.Z(newInstance);
                th = null;
                return newInstance;
            }
            throw new IllegalStateException("BitmapRegionDecoder won't be able to optimize reading of this asset".toString());
        } catch (Throwable th2) {
            try {
                throw th2;
            } finally {
                Ad.l.S(a5, th2);
            }
        }
    }

    public final InputStream a(Context context) {
        AbstractC3557B.c0("context", context);
        InputStream open = context.getAssets().open(this.f37542Y, 1);
        AbstractC3557B.b0("open(...)", open);
        return open;
    }

    @Override // kh.l
    public final z e0() {
        return this.f37543Z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4300a)) {
            return false;
        }
        C4300a c4300a = (C4300a) obj;
        if (AbstractC3557B.K(this.f37542Y, c4300a.f37542Y) && AbstractC3557B.K(this.f37543Z, c4300a.f37543Z)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = this.f37542Y.hashCode() * 31;
        z zVar = this.f37543Z;
        if (zVar == null) {
            i10 = 0;
        } else {
            i10 = zVar.hashCode();
        }
        return hashCode + i10;
    }

    public final String toString() {
        StringBuilder s10 = android.gov.nist.core.a.s("AssetImageSource(asset=", R.a.t(new StringBuilder("AssetPath(path="), this.f37542Y, Separators.RPAREN), ", preview=");
        s10.append(this.f37543Z);
        s10.append(Separators.RPAREN);
        return s10.toString();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
    }
}
