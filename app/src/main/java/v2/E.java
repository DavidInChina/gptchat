package v2;

import android.net.Uri;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Map;
import s2.AbstractC5530A;

/* loaded from: classes.dex */
public final class E implements AbstractC5969h {

    /* renamed from: a  reason: collision with root package name */
    public final AbstractC5969h f47045a;

    /* renamed from: b  reason: collision with root package name */
    public final w2.d f47046b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f47047c;

    /* renamed from: d  reason: collision with root package name */
    public long f47048d;

    public E(AbstractC5969h abstractC5969h, w2.d dVar) {
        abstractC5969h.getClass();
        this.f47045a = abstractC5969h;
        dVar.getClass();
        this.f47046b = dVar;
    }

    @Override // v2.AbstractC5969h
    public final long a(l lVar) {
        long j6;
        l lVar2 = lVar;
        long a5 = this.f47045a.a(lVar2);
        this.f47048d = a5;
        if (a5 == 0) {
            return 0L;
        }
        long j10 = lVar2.f47101g;
        if (j10 == -1 && a5 != -1 && j10 != a5) {
            lVar2 = new l(lVar2.f47095a, lVar2.f47096b, lVar2.f47097c, lVar2.f47098d, lVar2.f47099e, lVar2.f47100f, a5, lVar2.f47102h, lVar2.f47103i, lVar2.f47104j);
        }
        this.f47047c = true;
        w2.d dVar = this.f47046b;
        dVar.getClass();
        lVar2.f47102h.getClass();
        int i10 = (lVar2.f47101g > (-1L) ? 1 : (lVar2.f47101g == (-1L) ? 0 : -1));
        int i11 = lVar2.f47103i;
        if (i10 == 0 && (i11 & 2) == 2) {
            dVar.f47656d = null;
        } else {
            dVar.f47656d = lVar2;
            if ((i11 & 4) == 4) {
                j6 = dVar.f47654b;
            } else {
                j6 = Long.MAX_VALUE;
            }
            dVar.f47657e = j6;
            dVar.f47661i = 0L;
            try {
                dVar.b(lVar2);
            } catch (IOException e10) {
                throw new IOException(e10);
            }
        }
        return this.f47048d;
    }

    @Override // v2.AbstractC5969h
    public final void close() {
        w2.d dVar = this.f47046b;
        try {
            this.f47045a.close();
            if (this.f47047c) {
                this.f47047c = false;
                if (dVar.f47656d != null) {
                    try {
                        dVar.a();
                    } catch (IOException e10) {
                        throw new IOException(e10);
                    }
                }
            }
        } catch (Throwable th2) {
            if (this.f47047c) {
                this.f47047c = false;
                if (dVar.f47656d != null) {
                    try {
                        dVar.a();
                    } catch (IOException e11) {
                        throw new IOException(e11);
                    }
                }
            }
            throw th2;
        }
    }

    @Override // v2.AbstractC5969h
    public final void g(F f6) {
        f6.getClass();
        this.f47045a.g(f6);
    }

    @Override // v2.AbstractC5969h
    public final Uri getUri() {
        return this.f47045a.getUri();
    }

    @Override // v2.AbstractC5969h
    public final Map j() {
        return this.f47045a.j();
    }

    @Override // p2.AbstractC5060m
    public final int read(byte[] bArr, int i10, int i11) {
        if (this.f47048d == 0) {
            return -1;
        }
        int read = this.f47045a.read(bArr, i10, i11);
        if (read > 0) {
            w2.d dVar = this.f47046b;
            l lVar = dVar.f47656d;
            if (lVar != null) {
                int i12 = 0;
                while (i12 < read) {
                    try {
                        if (dVar.f47660h == dVar.f47657e) {
                            dVar.a();
                            dVar.b(lVar);
                        }
                        int min = (int) Math.min(read - i12, dVar.f47657e - dVar.f47660h);
                        OutputStream outputStream = dVar.f47659g;
                        int i13 = AbstractC5530A.f45131a;
                        outputStream.write(bArr, i10 + i12, min);
                        i12 += min;
                        long j6 = min;
                        dVar.f47660h += j6;
                        dVar.f47661i += j6;
                    } catch (IOException e10) {
                        throw new IOException(e10);
                    }
                }
            }
            long j10 = this.f47048d;
            if (j10 != -1) {
                this.f47048d = j10 - read;
            }
        }
        return read;
    }
}
