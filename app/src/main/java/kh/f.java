package kh;

import android.content.Context;
import android.gov.nist.core.Separators;
import android.graphics.BitmapRegionDecoder;
import id.AbstractC3557B;
import java.io.InputStream;
import r0.C5341e;
import r0.z;

/* loaded from: classes.dex */
public final class f implements l {

    /* renamed from: Y  reason: collision with root package name */
    public final int f37556Y;

    /* renamed from: Z  reason: collision with root package name */
    public final z f37557Z;

    public f(int i10, C5341e c5341e) {
        this.f37556Y = i10;
        this.f37557Z = c5341e;
    }

    @Override // kh.l
    public final BitmapRegionDecoder Z(Context context) {
        AbstractC3557B.c0("context", context);
        InputStream openRawResource = context.getResources().openRawResource(this.f37556Y);
        AbstractC3557B.b0("openRawResource(...)", openRawResource);
        try {
            BitmapRegionDecoder newInstance = BitmapRegionDecoder.newInstance(openRawResource, false);
            AbstractC3557B.Z(newInstance);
            th = null;
            return newInstance;
        } finally {
        }
    }

    @Override // kh.l
    public final z e0() {
        return this.f37557Z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (this.f37556Y == fVar.f37556Y && AbstractC3557B.K(this.f37557Z, fVar.f37557Z)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11 = this.f37556Y * 31;
        z zVar = this.f37557Z;
        if (zVar == null) {
            i10 = 0;
        } else {
            i10 = zVar.hashCode();
        }
        return i11 + i10;
    }

    public final String toString() {
        return "ResourceImageSource(id=" + this.f37556Y + ", preview=" + this.f37557Z + Separators.RPAREN;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
    }
}
