package v2;

import android.content.Context;
import android.content.res.AssetManager;
import android.gov.nist.core.Separators;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import s2.AbstractC5530A;

/* renamed from: v2.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5963b extends AbstractC5964c {

    /* renamed from: e  reason: collision with root package name */
    public final AssetManager f47058e;

    /* renamed from: f  reason: collision with root package name */
    public Uri f47059f;

    /* renamed from: g  reason: collision with root package name */
    public InputStream f47060g;

    /* renamed from: h  reason: collision with root package name */
    public long f47061h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f47062i;

    public C5963b(Context context) {
        super(false);
        this.f47058e = context.getAssets();
    }

    @Override // v2.AbstractC5969h
    public final long a(l lVar) {
        int i10;
        try {
            Uri uri = lVar.f47095a;
            long j6 = lVar.f47100f;
            this.f47059f = uri;
            String path = uri.getPath();
            path.getClass();
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith(Separators.SLASH)) {
                path = path.substring(1);
            }
            r();
            InputStream open = this.f47058e.open(path, 1);
            this.f47060g = open;
            if (open.skip(j6) >= j6) {
                long j10 = lVar.f47101g;
                if (j10 != -1) {
                    this.f47061h = j10;
                } else {
                    long available = this.f47060g.available();
                    this.f47061h = available;
                    if (available == 2147483647L) {
                        this.f47061h = -1L;
                    }
                }
                this.f47062i = true;
                s(lVar);
                return this.f47061h;
            }
            throw new i(2008, (Throwable) null);
        } catch (C5962a e10) {
            throw e10;
        } catch (IOException e11) {
            if (e11 instanceof FileNotFoundException) {
                i10 = 2005;
            } else {
                i10 = 2000;
            }
            throw new i(i10, e11);
        }
    }

    @Override // v2.AbstractC5969h
    public final void close() {
        this.f47059f = null;
        try {
            try {
                InputStream inputStream = this.f47060g;
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e10) {
                throw new i(2000, e10);
            }
        } finally {
            this.f47060g = null;
            if (this.f47062i) {
                this.f47062i = false;
                q();
            }
        }
    }

    @Override // v2.AbstractC5969h
    public final Uri getUri() {
        return this.f47059f;
    }

    @Override // p2.AbstractC5060m
    public final int read(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        long j6 = this.f47061h;
        if (j6 == 0) {
            return -1;
        }
        if (j6 != -1) {
            try {
                i11 = (int) Math.min(j6, i11);
            } catch (IOException e10) {
                throw new i(2000, e10);
            }
        }
        InputStream inputStream = this.f47060g;
        int i12 = AbstractC5530A.f45131a;
        int read = inputStream.read(bArr, i10, i11);
        if (read == -1) {
            return -1;
        }
        long j10 = this.f47061h;
        if (j10 != -1) {
            this.f47061h = j10 - read;
        }
        p(read);
        return read;
    }
}
