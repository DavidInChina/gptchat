package v2;

import android.gov.nist.core.Separators;
import android.net.Uri;
import android.util.Base64;
import java.net.URLDecoder;
import p2.O;
import s2.AbstractC5530A;

/* renamed from: v2.f  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5967f extends AbstractC5964c {

    /* renamed from: e  reason: collision with root package name */
    public l f47073e;

    /* renamed from: f  reason: collision with root package name */
    public byte[] f47074f;

    /* renamed from: g  reason: collision with root package name */
    public int f47075g;

    /* renamed from: h  reason: collision with root package name */
    public int f47076h;

    @Override // v2.AbstractC5969h
    public final long a(l lVar) {
        r();
        this.f47073e = lVar;
        Uri normalizeScheme = lVar.f47095a.normalizeScheme();
        String scheme = normalizeScheme.getScheme();
        boolean equals = "data".equals(scheme);
        Gi.e.k("Unsupported scheme: " + scheme, equals);
        String schemeSpecificPart = normalizeScheme.getSchemeSpecificPart();
        int i10 = AbstractC5530A.f45131a;
        String[] split = schemeSpecificPart.split(Separators.COMMA, -1);
        if (split.length == 2) {
            String str = split[1];
            if (split[0].contains(";base64")) {
                try {
                    this.f47074f = Base64.decode(str, 0);
                } catch (IllegalArgumentException e10) {
                    throw new O(R.a.r("Error while parsing Base64 encoded string: ", str), e10, true, 0);
                }
            } else {
                this.f47074f = URLDecoder.decode(str, w8.e.f48219a.name()).getBytes(w8.e.f48221c);
            }
            byte[] bArr = this.f47074f;
            long j6 = lVar.f47100f;
            if (j6 <= bArr.length) {
                int i11 = (int) j6;
                this.f47075g = i11;
                int length = bArr.length - i11;
                this.f47076h = length;
                long j10 = lVar.f47101g;
                int i12 = (j10 > (-1L) ? 1 : (j10 == (-1L) ? 0 : -1));
                if (i12 != 0) {
                    this.f47076h = (int) Math.min(length, j10);
                }
                s(lVar);
                if (i12 == 0) {
                    return this.f47076h;
                }
                return j10;
            }
            this.f47074f = null;
            throw new i(2008);
        }
        throw new O("Unexpected URI format: " + normalizeScheme, null, true, 0);
    }

    @Override // v2.AbstractC5969h
    public final void close() {
        if (this.f47074f != null) {
            this.f47074f = null;
            q();
        }
        this.f47073e = null;
    }

    @Override // v2.AbstractC5969h
    public final Uri getUri() {
        l lVar = this.f47073e;
        if (lVar != null) {
            return lVar.f47095a;
        }
        return null;
    }

    @Override // p2.AbstractC5060m
    public final int read(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        int i12 = this.f47076h;
        if (i12 == 0) {
            return -1;
        }
        int min = Math.min(i11, i12);
        byte[] bArr2 = this.f47074f;
        int i13 = AbstractC5530A.f45131a;
        System.arraycopy(bArr2, this.f47075g, bArr, i10, min);
        this.f47075g += min;
        this.f47076h -= min;
        p(min);
        return min;
    }
}
