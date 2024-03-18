package v2;

import android.net.Uri;
import android.text.TextUtils;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import s2.AbstractC5530A;

/* loaded from: classes.dex */
public final class u extends AbstractC5964c {

    /* renamed from: e  reason: collision with root package name */
    public RandomAccessFile f47138e;

    /* renamed from: f  reason: collision with root package name */
    public Uri f47139f;

    /* renamed from: g  reason: collision with root package name */
    public long f47140g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f47141h;

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0088, code lost:
        if (r1 != false) goto L35;
     */
    @Override // v2.AbstractC5969h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long a(l lVar) {
        boolean b10;
        Uri uri = lVar.f47095a;
        long j6 = lVar.f47100f;
        this.f47139f = uri;
        r();
        int i10 = 2006;
        try {
            String path = uri.getPath();
            path.getClass();
            RandomAccessFile randomAccessFile = new RandomAccessFile(path, "r");
            this.f47138e = randomAccessFile;
            try {
                randomAccessFile.seek(j6);
                long j10 = lVar.f47101g;
                if (j10 == -1) {
                    j10 = this.f47138e.length() - j6;
                }
                this.f47140g = j10;
                if (j10 >= 0) {
                    this.f47141h = true;
                    s(lVar);
                    return this.f47140g;
                }
                throw new i(2008, null, null);
            } catch (IOException e10) {
                throw new i(2000, e10);
            }
        } catch (FileNotFoundException e11) {
            if (TextUtils.isEmpty(uri.getQuery()) && TextUtils.isEmpty(uri.getFragment())) {
                if (AbstractC5530A.f45131a >= 21) {
                    b10 = s.b(e11.getCause());
                }
                i10 = 2005;
                throw new i(i10, e11);
            }
            String path2 = uri.getPath();
            String query = uri.getQuery();
            String fragment = uri.getFragment();
            StringBuilder t10 = android.gov.nist.core.a.t("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=", path2, ",query=", query, ",fragment=");
            t10.append(fragment);
            throw new i(1004, t10.toString(), e11);
        } catch (SecurityException e12) {
            throw new i(2006, e12);
        } catch (RuntimeException e13) {
            throw new i(2000, e13);
        }
    }

    @Override // v2.AbstractC5969h
    public final void close() {
        this.f47139f = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.f47138e;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
            } catch (IOException e10) {
                throw new i(2000, e10);
            }
        } finally {
            this.f47138e = null;
            if (this.f47141h) {
                this.f47141h = false;
                q();
            }
        }
    }

    @Override // v2.AbstractC5969h
    public final Uri getUri() {
        return this.f47139f;
    }

    @Override // p2.AbstractC5060m
    public final int read(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        long j6 = this.f47140g;
        if (j6 == 0) {
            return -1;
        }
        try {
            RandomAccessFile randomAccessFile = this.f47138e;
            int i12 = AbstractC5530A.f45131a;
            int read = randomAccessFile.read(bArr, i10, (int) Math.min(j6, i11));
            if (read > 0) {
                this.f47140g -= read;
                p(read);
            }
            return read;
        } catch (IOException e10) {
            throw new i(2000, e10);
        }
    }
}
